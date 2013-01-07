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
		for(EObject object : resource.contents)
			object.generateClassFiles(fsa)
	}
	
	def generateClassFiles(EObject object, IFileSystemAccess fileSystemAccess){
		var csvAPIGeneratorWriter = new CSVAPIGeneratorWriter()
		var csvAPIGeneratorReader = new CSVAPIGeneratorReader()
		var csvAPIGeneratorFile = new CSVAPIGeneratorFile()
		var csvAPIGeneratorLine = new CSVAPIGeneratorLine()

		if(object instanceof FileDefinitionSetImpl){
			var fileDefinitionSet = object as FileDefinitionSetImpl
			
			for(FileDefinition fileDefinition : fileDefinitionSet.fileDefinitions) {
   				csvAPIGeneratorReader.generateReaderClassFile(fileSystemAccess, fileDefinition);
   				csvAPIGeneratorWriter.generateWriterClassFile(fileSystemAccess, fileDefinition);
   				csvAPIGeneratorFile.generateFileClassFile(fileSystemAccess, fileDefinition);
   				csvAPIGeneratorLine.generateLineClassFile(fileSystemAccess, fileDefinition);
   			}
		}
	}
}