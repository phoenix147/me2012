package at.ac.tuwien.big.me12.csv.gen

import org.eclipse.xtext.generator.IFileSystemAccess
import at.ac.tuwien.big.me12.csv.csvmm.FileDefinition 

class CSVAPIGeneratorWriter {
	String PACKAGE_PATH = CSVAPIGenerator::PACKAGE_PATH;
	
	String packageName = CSVAPIGenerator::packageName;
	
	String csvWriter = CSVAPIGenerator::csvWriter;
	String csvFile = CSVAPIGenerator::csvFile;
	
	def generateWriterClassFile(IFileSystemAccess fileSystemAccess, FileDefinition fileDefinition){
   		fileSystemAccess.generateFile('''«PACKAGE_PATH»«fileDefinition.name.toFirstUpper»«csvWriter».java''', fileDefinition.generateWriterCode);
	}
	
	def CharSequence generateWriterCode(FileDefinition fileDefinition) {
		var name = fileDefinition.name.toFirstUpper;
		var className = name+csvWriter;
		var csvFileName = name+csvFile;
		'''
		package «packageName»;
		
		import java.io.FileWriter;
		import «packageName».«csvFileName»;
		
		public class «className» {
			
			private FileWriter fileWriter;
			
			public «className»(FileWriter fileWriter){
				this.fileWriter = fileWriter;
			}
			
			public void writeFile(«csvFileName» «csvFileName.toFirstLower», boolean writeDerived){
				
			}
			
		}
		'''		
	}
}