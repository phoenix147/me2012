package at.ac.tuwien.big.me12.csv.gen

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.EObject
import at.ac.tuwien.big.me12.csv.csvmm.FileDefinition 
import at.ac.tuwien.big.me12.csv.csvmm.impl.FileDefinitionSetImpl

class CSVAPIGenerator implements IGenerator {
	
	public static String PACKAGE_PATH = "at/ac/tuwien/big/me12/csv/me/";
	public static String packageName = "at.ac.tuwien.big.me12.csv.me";
	public static String csvLine = "CSVLine";
	public static String csvFile = "CSVFile";
	public static String csvWriter = "CSVWriter";
	public static String csvReader = "CSVReader";

	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(EObject object : resource.contents) {

			if(object instanceof FileDefinitionSetImpl){
				var fileDefinitionSet = object as FileDefinitionSetImpl

				var csvAPIGeneratorReader = new CSVAPIGeneratorReader()
				var csvAPIGeneratorWriter = new CSVAPIGeneratorWriter()
				var csvAPIGeneratorFile = new CSVAPIGeneratorFile()
				var csvAPIGeneratorLine = new CSVAPIGeneratorLine()
								
				for(FileDefinition fileDefinition : fileDefinitionSet.fileDefinitions) {
	   				csvAPIGeneratorReader.generateReaderClassFile(fsa, fileDefinition);
	   				csvAPIGeneratorWriter.generateWriterClassFile(fsa, fileDefinition);
	   				csvAPIGeneratorFile.generateFileClassFile(fsa, fileDefinition);
	   				csvAPIGeneratorLine.generateLineClassFile(fsa, fileDefinition);
	   			}
			}
			
		}
	}

}