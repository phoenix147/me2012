package at.ac.tuwien.big.me12.csv.gen

import org.eclipse.xtext.generator.IFileSystemAccess
import at.ac.tuwien.big.me12.csv.csvmm.FileDefinition 

class CSVAPIGeneratorFile {
	String PACKAGE_PATH = CSVAPIGenerator::PACKAGE_PATH;
	
	String packageName = CSVAPIGenerator::packageName;
	
	String csvLine = CSVAPIGenerator::csvLine;
	String csvFile = CSVAPIGenerator::csvFile;
	
	def generateFileClassFile(IFileSystemAccess fileSystemAccess, FileDefinition fileDefinition){
   		fileSystemAccess.generateFile('''«PACKAGE_PATH»«fileDefinition.name.toFirstUpper»«csvFile».java''', fileDefinition.generateFileCode);
	}
	
	def CharSequence generateFileCode(FileDefinition fileDefinition) { 
		var name = fileDefinition.name.toFirstUpper;
		var csvLineName = name+csvLine;
		var className = name+csvFile;
		'''
		package «packageName»;
		
		import java.util.List;
		import java.util.ArrayList;
		
		import «packageName».«csvLineName»;
		
		public class «className» {
			
			private List<«csvLineName»> «name»Lines = new ArrayList<«csvLineName»>();
			
			public List<«csvLineName»> getLines(){
				return «name»Lines;
			}
		}
		'''
	}
}