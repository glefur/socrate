package fr.sc.crator.application;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.eef.runtime.context.EditingContextFactoryProvider;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.swt.widgets.Shell;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

import fr.sc.crator.application.ui.dialog.CRAConfiguringDialog;
import fr.sc.crator.model.CRA;
import fr.sc.crator.model.CRAtor;
import fr.sc.crator.model.CratorFactory;
import fr.sc.crator.populating.CRAPopulatingPolicy;
import fr.sc.crator.scheduling.ReportingScheduler;
import fr.sc.crator.storage.CRAStorageHandler;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {

	private ServiceTracker<ReportingScheduler, ReportingScheduler> schedulerTracker;
	private ServiceTracker<CRAStorageHandler, CRAStorageHandler> storageHandlerTracker;
	private ServiceTracker<CRAPopulatingPolicy, CRAPopulatingPolicy> populatingPolicyTracker;
	private ServiceTracker<EditingContextFactoryProvider, EditingContextFactoryProvider> contextFactoryProvider;
	private ComposedAdapterFactory adapterFactory;

	/* (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.IApplicationContext)
	 */
	public Object start(IApplicationContext context) throws Exception {
		BundleContext bundleContext = FrameworkUtil.getBundle(getClass()).getBundleContext();
		initTrackers(bundleContext);
		CRAtor crator = loadCRAtor();
		ReportingScheduler reportingScheduler = schedulerTracker.getService();
		CRAStorageHandler storageHandler = storageHandlerTracker.getService();
		CRAPopulatingPolicy populatingPolicy = populatingPolicyTracker.getService();
		
		List<CRA> craToFillIn = reportingScheduler.craToFillIn(crator);
		if (craToFillIn.size() > 0) {
			adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
			CRAConfiguringDialog dialog = new CRAConfiguringDialog(new Shell(), adapterFactory) {

				/**
				 * {@inheritDoc}
				 * @see fr.sc.crator.application.ui.dialog.CRAConfiguringDialog#createEditingContext(org.eclipse.emf.ecore.EObject)
				 */
				@Override
				public PropertiesEditingContext createEditingContext(EObject source) {
					EditingContextFactoryProvider editingContextFactoryProvider = contextFactoryProvider.getService();
					return editingContextFactoryProvider.getEditingContextFactory(source).createPropertiesEditingContext(adapterFactory, source);
				}
				
			};
			dialog.setInput(crator.getCras());
			dialog.open();
		}

		for (CRA cra : craToFillIn) {
			populatingPolicy.populateCRA(cra);
			storageHandler.writeCRA(cra);			
		}
		return IApplication.EXIT_OK;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#stop()
	 */
	public void stop() {
		schedulerTracker.close();
		storageHandlerTracker.close();
		populatingPolicyTracker.close();
	}


	private void initTrackers(BundleContext bundleContext) {
		schedulerTracker = new ServiceTracker<ReportingScheduler, ReportingScheduler>(bundleContext, ReportingScheduler.class, null);
		schedulerTracker.open();
		storageHandlerTracker = new ServiceTracker<CRAStorageHandler, CRAStorageHandler>(bundleContext, CRAStorageHandler.class, null);
		storageHandlerTracker.open();
		populatingPolicyTracker = new ServiceTracker<CRAPopulatingPolicy, CRAPopulatingPolicy>(bundleContext, CRAPopulatingPolicy.class, null);
		populatingPolicyTracker.open();
		contextFactoryProvider = new ServiceTracker<EditingContextFactoryProvider, EditingContextFactoryProvider>(bundleContext, EditingContextFactoryProvider.class, null);
		contextFactoryProvider.open();
	}

	private CRAtor loadCRAtor() {
		return CratorFactory.eINSTANCE.createCRAtor();
	}
	
}
