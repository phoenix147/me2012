package at.ac.tuwien.big.me12.csv.gen;

import org.eclipse.xtext.ISetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class CSVAPIGeneratorSetup implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		return Guice.createInjector(new CSVAPIGeneratorModule());
	}

}
