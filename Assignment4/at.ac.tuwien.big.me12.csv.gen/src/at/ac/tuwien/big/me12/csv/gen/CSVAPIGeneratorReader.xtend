package at.ac.tuwien.big.me12.csv.gen

import org.eclipse.xtext.generator.IFileSystemAccess
import at.ac.tuwien.big.me12.csv.csvmm.FileDefinition
import at.ac.tuwien.big.me12.csv.csvmm.StaticField 

class CSVAPIGeneratorReader extends CSVAPIGenerator {
	
	def generateReaderClassFile(IFileSystemAccess fileSystemAccess, FileDefinition fileDefinition){
   		fileSystemAccess.generateFile('''«PACKAGE_PATH»«fileDefinition.name.toFirstUpper»«csvReader».java''', fileDefinition.generateReaderCode);
	}
	
	def CharSequence generateReaderCode(FileDefinition fileDefinition) {
		var name = fileDefinition.name.toFirstUpper;
		var className = name+csvReader;
		var csvFileName = name+csvFile;
		var csvLineName = name+csvLine;
		'''
		package «packageName»;
		
		import java.io.BufferedReader;
		import java.io.FileReader;
		import java.io.IOException;
		import java.util.ArrayList;
		import java.util.List;
		
		import «packageName».«csvFileName»;
		
		
		public class «className» {
			
			private static final String FIELD_SEPARATOR = ",";
			private FileReader fileReader;
			
			public «className»(FileReader fileReader){
				this.fileReader = fileReader;
			}
			
			public «csvFileName» readFile(){
				«csvFileName» csvFile = new «csvFileName»();
				csvFile.getLines().addAll(readLines());
				
				return csvFile;
			}
			
			private List<«csvLineName»> readLines() {
				BufferedReader bufferedReader = new BufferedReader(this.fileReader);

				List<«csvLineName»> lines = new ArrayList<«csvLineName»>();

				String line = null;
				try {
					while((line=bufferedReader.readLine()) != null){
						«csvLineName» csvLine = parseLine(line);
						lines.add(csvLine);
					}
				} catch (IOException e) {
						e.printStackTrace();
				}finally{
					try {
						bufferedReader.close();
					} catch (IOException e) {
					}
				}
		
				return lines;
			}

			private «csvLineName» parseLine(String line) {
				String[] fields = line.split(FIELD_SEPARATOR);
		
				«csvLineName» csvLine = new «csvLineName»();
				
				«FOR fieldDefinition : fileDefinition.fields»
					«IF fieldDefinition instanceof StaticField»
					  csvLine.set«fieldDefinition.name»(«fieldDefinition.fieldType.getName».valueOf(fields[«fieldDefinition.index»]));
					«ENDIF»
				«ENDFOR»
						
				return csvLine;
			}
		}
		'''
	}
}