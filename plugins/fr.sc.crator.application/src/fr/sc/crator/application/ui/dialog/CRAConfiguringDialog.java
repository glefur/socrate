/*
 * Copyright (c) 2014 Goulwen Le Fur <goulwen .lefur at gmail.com>. 
 * 
 * This file is part of the Crator application.
 * 
 * Crator is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Crator is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Crator.  If not, see <http ://www.gnu.org/licenses/>.
 */
package fr.sc.crator.application.ui.dialog;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.ui.swt.viewer.EEFContentProvider;
import org.eclipse.emf.eef.runtime.ui.swt.viewer.EEFViewer;
import org.eclipse.jface.dialogs.TrayDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import com.google.common.collect.Lists;

import fr.sc.crator.model.CRA;

/**
 *
 * @author <a href="mailto:goulwen.lefur@gmail.com">Goulwen Le Fur</a>
 */
public abstract class CRAConfiguringDialog extends TrayDialog {

	private EEFViewer viewer;
	private ComboViewer craSelector;
	private ISelectionChangedListener viewerSynchronizer;
	private ListViewer daySelector;
	private AdapterFactory adapterFactory;
	private List<CRA> input;

	/**
	 * @param shell
	 */
	public CRAConfiguringDialog(Shell shell, AdapterFactory adapterFactory) {
		super(shell);
		this.adapterFactory = adapterFactory;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.jface.window.Window#configureShell(org.eclipse.swt.widgets.Shell)
	 */
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		setShellStyle(SWT.CLOSE | SWT.TITLE | SWT.BORDER | SWT.APPLICATION_MODAL);
		newShell.setText("Correct the predefined input values");
	}
	

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.jface.dialogs.Dialog#getInitialSize()
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(650, 450);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.jface.dialogs.Dialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(2, true));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		/* selector */
		Composite selector = new Composite(container, SWT.NONE);
		selector.setLayout(new GridLayout(1, false));
		selector.setLayoutData(new GridData(GridData.FILL_BOTH));
		craSelector = new ComboViewer(selector, SWT.DROP_DOWN);
		craSelector.getControl().setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		craSelector.setContentProvider(new ArrayContentProvider());
		craSelector.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		craSelector.setInput(input);
		craSelector.addSelectionChangedListener(getViewerSynchronizer());
		daySelector = new ListViewer(selector);
		daySelector.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
		daySelector.setContentProvider(new ArrayContentProvider());
		daySelector.setLabelProvider(new LabelProvider() {

			/**
			 * {@inheritDoc}
			 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
			 */
			@Override
			public String getText(Object element) {
				if (element.equals(2)) {
					return "Monday";
				} else if (element.equals(3)) {
					return "Tuesday";
				} else if (element.equals(4)) {
					return "Wednesday";
				} else if (element.equals(5)) {
					return "Thursday";
				} else if (element.equals(6)) {
					return "Friday";
				}
				return super.getText(element);
			}
			
		});
		List<Integer> days = Lists.newArrayList(2, 3, 4, 5, 6);
		daySelector.setInput(days);
		daySelector.addSelectionChangedListener(getViewerSynchronizer());
		
		/* EEF Viewer */
		viewer = new EEFViewer(container, SWT.NONE);
		viewer.setLayoutData(new GridData(GridData.FILL_BOTH));
		viewer.setContentProvider(new EEFContentProvider());
		return container;
	}
	

	/**
	 * @param input the input to set
	 */
	public void setInput(List<CRA> input) {
		this.input = input;
	}

	public abstract PropertiesEditingContext createEditingContext(EObject source);

	private ISelectionChangedListener getViewerSynchronizer() {
		if (viewerSynchronizer == null) {
			viewerSynchronizer = new ViewerSynchronizer();
		}
		return viewerSynchronizer;
	}
	
	public EObject getSelectedCRA() {
		if (craSelector.getSelection() instanceof StructuredSelection) {
			return (EObject) ((StructuredSelection)craSelector.getSelection()).getFirstElement();
		}
		return null;
	}
	
	public Integer getSelectedDay() {
		if (!daySelector.getSelection().isEmpty() && daySelector.getSelection() instanceof StructuredSelection) {
			return (Integer) ((StructuredSelection)daySelector.getSelection()).getFirstElement();
		}
		return -1;
	}
	

	private class ViewerSynchronizer implements  ISelectionChangedListener {

		/**
		 * {@inheritDoc}
		 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
		 */
		@Override
		public void selectionChanged(SelectionChangedEvent event) {
			EObject cra = getSelectedCRA();
			Integer day = getSelectedDay();
			if (cra instanceof CRA && day > 0) {
				viewer.setInput(createEditingContext(((CRA)cra).getWeek().getDay(day)));
			}
		}
		
	}

}
