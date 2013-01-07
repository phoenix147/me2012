package at.ac.tuwien.big.me12.csv.gen;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

public class CSVAPIGeneratorModule extends
		AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return "at.ac.tuwien.big.me12.csv.csvmm.CSVPackage";
	}

	@Override
	protected String getFileExtensions() {
		return "csvmodel";
	}

	public Class<? extends IGenerator> bindIGenerator() {
		return CSVAPIGenerator.class;
	}

	public Class<? extends ResourceSet> bindResourceSet() {
		return ResourceSetImpl.class;
	}

}
