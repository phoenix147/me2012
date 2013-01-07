package at.ac.tuwien.big.me12.csv.gen

import org.eclipse.xtext.generator.IFileSystemAccess
import at.ac.tuwien.big.me12.csv.csvmm.FileDefinition
import at.ac.tuwien.big.me12.csv.csvmm.StaticField
import at.ac.tuwien.big.me12.csv.csvmm.FieldType
import at.ac.tuwien.big.me12.csv.csvmm.DerivedField

class CSVAPIGeneratorLine {
	String PACKAGE_PATH = CSVAPIGenerator::PACKAGE_PATH;
	
	String packageName = CSVAPIGenerator::packageName;

	String csvLine = CSVAPIGenerator::csvLine;
	
	def generateLineClassFile(IFileSystemAccess fileSystemAccess, FileDefinition fileDefinition){
   		fileSystemAccess.generateFile('''«PACKAGE_PATH»«fileDefinition.name.toFirstUpper»«csvLine».java''', fileDefinition.generateLineCode);
	}
	
		def CharSequence generateLineCode(FileDefinition fileDefinition) { 
		var name = fileDefinition.name.toFirstUpper;
		var className = name+csvLine;
		'''
		package «packageName»;
		
		public class «className» {
			
			«FOR fieldDefinition : fileDefinition.fields»
				«IF fieldDefinition instanceof StaticField»
					private «fieldDefinition.fieldType.getName» «fieldDefinition.name.toFirstLower»;
				«ENDIF»
			«ENDFOR»
			
			«FOR fieldDefinition : fileDefinition.fields»
				«var returnType = fieldDefinition.fieldType.toPrimitive»
				public «returnType» «IF returnType.equals("boolean")»is«ELSE»get«ENDIF»«fieldDefinition.name.toFirstUpper»(){
					«createGetterBody(fieldDefinition, returnType)»
				}
				«IF fieldDefinition instanceof StaticField»
				«var fieldName = fieldDefinition.name.toFirstLower»
				public void set«fieldDefinition.name.toFirstUpper»(«fieldDefinition.fieldType.getName» «fieldName»){
					this.«fieldName» = «fieldName»;
				}
				«ENDIF»
			«ENDFOR»
			
		}
		'''
	}
	def toPrimitive(FieldType type) { 
		switch type.getName {
			case "Integer" : return "int"
			case "Boolean" : return "boolean"
			case "String" : return "String"
		}
	}

	
	def dispatch createGetterBody(StaticField staticField, String returnType) { 
		'''
			return this.«staticField.name.toFirstLower»;
		'''
	}
	
	def dispatch createGetterBody(DerivedField derivedField, String returnType){
		switch returnType {
			case "int" :  '''//TODO Auto-generated method stub 
return -1;'''
			case "boolean" :  '''//TODO Auto-generated method stub 
return false;'''
			case "String" :  '''//TODO Auto-generated method stub 
return "";'''
		}
	}
}