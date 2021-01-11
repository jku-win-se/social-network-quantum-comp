package jku.se.social.network.generate.networkx.menu;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.service.AbstractGenericModule;
import org.eclipse.xtext.util.CancelIndicator;

import com.google.inject.Guice;

import jku.se.social.network.generate.networkx.gen.NetworkXGenerator;

public class GenerateNetworkX implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// Do nothing
	}

	@Override
	public void dispose() {
		// Do nothing
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			Object fileObj = ((IStructuredSelection) selection).getFirstElement();
			if (fileObj instanceof IFile) {
				IFile snFile = (IFile) fileObj;
				URI fileUri = URI.createPlatformResourceURI(snFile.getFullPath().toString(), true);
				ResourceSet reset = new ResourceSetImpl();
				Resource snResource = reset.getResource(fileUri, true);
				GeneratorContext context = new GeneratorContext();
				context.setCancelIndicator(CancelIndicator.NullImpl);
				String outputPath = URI.createURI(snFile.getLocationURI().getPath().toString()).trimSegments(1).toString();
				//setup the file system access
		        final JavaIoFileSystemAccess jfsa = new JavaIoFileSystemAccess();
		        jfsa.setOutputPath(outputPath);
		        Guice.createInjector(new AbstractGenericModule() {
		            @SuppressWarnings("unused")
					public Class<? extends IEncodingProvider> bindIEncodingProvider() {
		                return IEncodingProvider.Runtime.class;
		            }
		        }).injectMembers(jfsa);				
				new NetworkXGenerator().doGenerate(snResource, jfsa , context);
				try {
					snFile.getProject().refreshLocal(1, new NullProgressMonitor());
				} catch (CoreException e) {
					e.printStackTrace();
				}
				System.out.println("Finish Generation!");
			}			
		}		
		return null;
	}

	@Override
	public boolean isEnabled() {		
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// Do nothing
	}

}
