package at.ac.tuwien.big.me12.csv.gen

import org.eclipse.xtext.generator.IFileSystemAccess
import at.ac.tuwien.big.me12.csv.csvmm.FileDefinition
import at.ac.tuwien.big.me12.csv.csvmm.StaticField 

class CSVAPIGeneratorWriter {
	String PACKAGE_PATH = CSVAPIGenerator::PACKAGE_PATH;
	
	String packageName = CSVAPIGenerator::packageName;
	
	String csvWriter = CSVAPIGenerator::csvWriter;
	String csvFile = CSVAPIGenerator::csvFile;
	String csvLine = CSVAPIGenerator::csvLine;
	
	def generateWriterClassFile(IFileSystemAccess fileSystemAccess, FileDefinition fileDefinition){
   		fileSystemAccess.generateFile('''«PACKAGE_PATH»«fileDefinition.name.toFirstUpper»«csvWriter».java''', fileDefinition.generateWriterCode);
	}
	
	def CharSequence generateWriterCode(FileDefinition fileDefinition) {
		var name = fileDefinition.name.toFirstUpper;
		var className = name+csvWriter;
		var csvLineName = name+csvLine;
		var csvFileName = name+csvFile;
		'''
		package «packageName»;
		
		import java.io.FileWriter;
		import java.io.IOException;
		import java.lang.StringBuilder;
		import java.util.List;
		import «packageName».«csvFileName»;
		
		public class «className» {
			
			private static final String FIELD_SEPARATOR = ",";
			private FileWriter fileWriter;
			
			public «className»(FileWriter fileWriter){
				this.fileWriter = fileWriter;
			}
			
			«var csvFileObject = csvFileName.toFirstLower»
			public void writeFile(«csvFileName» «csvFileObject», boolean writeDerived){
				List<«csvLineName»> lines = «csvFileObject».getLines();
				
				for(«csvLineName» line : lines){
					StringBuilder outputLine = new StringBuilder();
					«FOR fieldDefinition : fileDefinition.fields»
						«IF fieldDefinition instanceof StaticField»
						outputLine.append(line.getField«fieldDefinition.index»());
				 		«ELSE»
						if(writeDerived){
							outputLine.append(line.getField«fieldDefinition.index»());
						}else{
							outputLine.append("");
						}
						«ENDIF»
						outputLine.append(FIELD_SEPARATOR);
					«ENDFOR»
					outputLine.append("\n");
					
					try {
						this.fileWriter.append(outputLine.toString());
						this.fileWriter.flush();
					} catch (IOException e) {
						throw new RuntimeException("Could not append to fileWriter", e);
					}
				}

				try {
					this.fileWriter.close();
				} catch (IOException e) {
					throw new RuntimeException("Could not close fileWriter", e);
				}
			}
		}
		'''		
	}
}