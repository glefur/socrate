package fr.sc.crator.application;

import java.io.File;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.eef.runtime.context.EditingContextFactoryProvider;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

import fr.sc.crator.application.ui.dialog.CRAConfiguringDialog;
import fr.sc.crator.logging.CRAtorLogger;
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
	private ServiceTracker<EditingContextFactoryProvider, EditingContextFactoryProvider> contextFactoryProviderTracker;
	private ServiceTracker<CRAtorLogger, CRAtorLogger> cratorLoggerTracker;

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
		CRAtorLogger logger = cratorLoggerTracker.getService();
		List<CRA> craToFillIn = reportingScheduler.craToFillIn(crator);
		if (craToFillIn.size() > 0) {
			for (CRA cra : craToFillIn) {
				populatingPolicy.populateCRA(cra);
			}
			adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
			CRAConfiguringDialog dialog = new CRAConfiguringDialog(new Shell(), adapterFactory) {

				/**
				 * {@inheritDoc}
				 * @see fr.sc.crator.application.ui.dialog.CRAConfiguringDialog#createEditingContext(org.eclipse.emf.ecore.EObject)
				 */
				@Override
				public PropertiesEditingContext createEditingContext(EObject source) {
					EditingContextFactoryProvider editingContextFactoryProvider = contextFactoryProviderTracker.getService();
					return editingContextFactoryProvider.getEditingContextFactory(source).createPropertiesEditingContext(adapterFactory, source);
				}
				
			};
			dialog.setInput(crator.getCras());
			logger.log(CRAtorLogger.LOG_DEBUG, "Opening configuring dialog");
			if (dialog.open() == Window.OK) {
				logger.log(CRAtorLogger.LOG_DEBUG, "Configuration updated and validated");
				for (CRA cra : craToFillIn) {
					storageHandler.writeCRA(cra);
				}
			} else {
				logger.log(CRAtorLogger.LOG_DEBUG, "Configuration refused. Exiting.");
			}
		} else {
			logger.log(CRAtorLogger.LOG_DEBUG, "Nothing to do");
		}
		crator.eResource().save(Collections.EMPTY_MAP);
		return IApplication.EXIT_OK;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#stop()
	 */
	public void stop() {
		schedulerTracker.close();
		storageHandlerTracker.close();
		populatingPolicyTracker.close();
		contextFactoryProviderTracker.close();
		cratorLoggerTracker.close();
	}


	private void initTrackers(BundleContext bundleContext) {
		schedulerTracker = new ServiceTracker<ReportingScheduler, ReportingScheduler>(bundleContext, ReportingScheduler.class, null);
		schedulerTracker.open();
		storageHandlerTracker = new ServiceTracker<CRAStorageHandler, CRAStorageHandler>(bundleContext, CRAStorageHandler.class, null);
		storageHandlerTracker.open();
		populatingPolicyTracker = new ServiceTracker<CRAPopulatingPolicy, CRAPopulatingPolicy>(bundleContext, CRAPopulatingPolicy.class, null);
		populatingPolicyTracker.open();
		contextFactoryProviderTracker = new ServiceTracker<EditingContextFactoryProvider, EditingContextFactoryProvider>(bundleContext, EditingContextFactoryProvider.class, null);
		contextFactoryProviderTracker.open();
		cratorLoggerTracker = new ServiceTracker<CRAtorLogger, CRAtorLogger>(bundleContext, CRAtorLogger.class, null);
		cratorLoggerTracker.open();
	}

	private CRAtor loadCRAtor() {
		String cratorModelPath = System.getProperty("user.dir") + "/data/model.crator";
		File file = new File(cratorModelPath);
		URI uri = URI.createFileURI(cratorModelPath);
		ResourceSet rset = new ResourceSetImpl();
		rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		(Resource.Factory.Registry.DEFAULT_EXTENSION, 
		 new XMIResourceFactoryImpl());
		Resource resource;
		CRAtor crator;
		if (file.exists()) {
			resource = rset.getResource(uri, true);
			crator = (CRAtor) resource.getContents().get(0);
		} else {
			resource = rset.createResource(uri);
			crator = CratorFactory.eINSTANCE.createCRAtor();
			resource.getContents().add(crator);
			
		}
		return crator;
	}
	
}
