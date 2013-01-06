package at.ac.tuwien.big.me12.csv.gen

import org.eclipse.xtext.generator.IFileSystemAccess
import at.ac.tuwien.big.me12.csv.csvmm.FileDefinition 

class CSVAPIGeneratorReader {
	String PACKAGE_PATH = CSVAPIGenerator::PACKAGE_PATH;
	
	String packageName = CSVAPIGenerator::packageName;
	
	String csvLine = CSVAPIGenerator::csvLine;
	String csvFile = CSVAPIGenerator::csvFile;
	String csvReader = CSVAPIGenerator::csvReader;
	
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
					while(true){
						line = bufferedReader.readLine();

						if(line == null){
							break;
						}

						«csvLineName» csvline  = create«csvLineName»(line);
						lines.add(csvline);
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

			//TODO Dynamic reading
			private «csvLineName» create«csvLineName»(String line) {
				String[] strings = line.split(",");
		
				«csvLineName» csvline = new «csvLineName»();				
				csvline.setStudentRegistrationNumber(strings[0]);
				csvline.setStudentFirstName(strings[1]);
				csvline.setStudentLastName(strings[2]);
				csvline.setLab1Points(Integer.valueOf(strings[3]));
				csvline.setLab2Points(Integer.valueOf(strings[4]));
				csvline.setExam1Points(Integer.valueOf(strings[5]));
				csvline.setExam2Points(Integer.valueOf(strings[6]));
			
				return csvline;
			}
		}
		'''
	}
}