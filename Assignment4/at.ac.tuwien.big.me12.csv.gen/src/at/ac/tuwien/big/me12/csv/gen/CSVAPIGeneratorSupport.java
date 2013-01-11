package at.ac.tuwien.big.me12.csv.gen;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;
import com.google.inject.Module;

public class CSVAPIGeneratorSupport extends
		AbstractGenericResourceSupport {
	@Override
	protected Module createGuiceModule() {
		return new CSVAPIGeneratorModule();
	}
}
