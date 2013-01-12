package at.ac.tuwien.big.me12.csv.gen

import at.ac.tuwien.big.me12.csv.csvmm.AggregationField
import at.ac.tuwien.big.me12.csv.csvmm.AggregationType
import at.ac.tuwien.big.me12.csv.csvmm.ComparisonOperator
import at.ac.tuwien.big.me12.csv.csvmm.ComparisonRule
import at.ac.tuwien.big.me12.csv.csvmm.CompositeRule
import at.ac.tuwien.big.me12.csv.csvmm.FieldType
import at.ac.tuwien.big.me12.csv.csvmm.FileDefinition
import at.ac.tuwien.big.me12.csv.csvmm.Rule
import at.ac.tuwien.big.me12.csv.csvmm.RuleBasedField
import at.ac.tuwien.big.me12.csv.csvmm.StaticField
import org.eclipse.xtext.generator.IFileSystemAccess
import at.ac.tuwien.big.me12.csv.csvmm.LogicalOperator
import java.util.List
import java.util.ArrayList

class CSVAPIGeneratorLine extends CSVAPIGenerator {
	var ruleMethods = new StringBuilder
	var compositeRuleNr = 1
	
	
	def generateLineClassFile(IFileSystemAccess fileSystemAccess, FileDefinition fileDefinition){
   		fileSystemAccess.generateFile('''«PACKAGE_PATH»«fileDefinition.name.toFirstUpper»«csvLine».java''', fileDefinition.generateLineCode);
	}
	
		def CharSequence generateLineCode(FileDefinition fileDefinition) { 
		var name = fileDefinition.name.toFirstUpper;
		var className = name+csvLine;
		ruleMethods = new StringBuilder;
		
		'''
		package «packageName»;
		
		public class «className» {
			
			«FOR fieldDefinition : fileDefinition.fields»
				«var returnType = fieldDefinition.fieldType.toPrimitive»
				«IF fieldDefinition instanceof StaticField»
					private «returnType» «fieldDefinition.name.toFirstLower»;
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
			«ruleMethods»
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
	
	def dispatch createGetterBody(AggregationField aggregationField, String returnType){
		'''
		int computedValue = 0;
		int[] values = new int[] {
			«FOR field:aggregationField.aggregatedFields SEPARATOR ","»
				get«field.name.toFirstUpper»()
			«ENDFOR»
		};
		
		«IF aggregationField.aggType==AggregationType::SUM ||aggregationField.aggType==AggregationType::AVERAGE»
		for(int i : values){
		 	computedValue+=i;
		}
		«ENDIF»
		«IF aggregationField.aggType==AggregationType::AVERAGE»
		computedValue = (int)(Math.round((double)computedValue/values.length));
		«ENDIF»
		«IF aggregationField.aggType==AggregationType::MIN»
		java.util.Arrays.sort(values);
		computedValue = values[0];

		«ENDIF»		
		«IF aggregationField.aggType==AggregationType::MAX»
		java.util.Arrays.sort(values);
		computedValue = values[values.length-1];
		«ENDIF»			
		return computedValue;'''	
	}
	
	def dispatch createGetterBody(RuleBasedField ruleBasedField, String returnType){
		var ifStatements = new StringBuilder
		var ruleNr = 1
		
		for(rule : ruleBasedField.rules){
			var ruleName = ""+'''is«ruleBasedField.name.toFirstUpper»Rule_«ruleNr»_Fulfilled'''
			ifStatements.append(createIfStatement(rule,ruleName,ruleBasedField))
			ruleMethods.append(createRuleMethod(rule,ruleName))
			
			ruleNr = ruleNr+1
		}
		'''
		«ifStatements»
		
		«IF ruleBasedField.fieldType==FieldType::BOOLEAN»
			«IF ruleBasedField.defaultValue == null»
				return false;
			«ELSE»
				return Boolean.valueOf("«ruleBasedField.defaultValue»");
			«ENDIF»
		«ELSEIF ruleBasedField.fieldType==FieldType::INTEGER »	
				return Integer.parseInt("«ruleBasedField.defaultValue»"); 		
		«ELSEIF ruleBasedField.fieldType==FieldType::STRING »	
			return "«ruleBasedField.defaultValue»";		
		«ENDIF»
		'''				
	}
	
	def createIfStatement(Rule rule,String ruleName,RuleBasedField ruleBasedField){
		'''
		if(«ruleName»()){
			«IF ruleBasedField.fieldType==FieldType::BOOLEAN»
				return Boolean.valueOf("«rule.resultValue»");
			«ELSEIF ruleBasedField.fieldType==FieldType::INTEGER »	
				return Integer.parseInt("«rule.resultValue»"); 		
			«ELSEIF ruleBasedField.fieldType==FieldType::STRING »	
			 	return "«rule.resultValue»";		
			«ENDIF»
		}		
		'''
	}
	
	def dispatch createRuleMethod(ComparisonRule comparisonRule ,String ruleName){
		'''
		private boolean «ruleName»(){
			return «IF comparisonRule.inputField.fieldType==FieldType::BOOLEAN»is«ELSE»get«ENDIF»«comparisonRule.inputField.name.toFirstUpper»()«comparisonOperator(comparisonRule.operator)»«comparisonRule.comparisonValue»;
		}	
		
		'''
	}
	
	def dispatch createRuleMethod(CompositeRule compositeRule,String ruleName){
		var List<String> ruleNames = new ArrayList<String>()
		
		for(rule:compositeRule.rules){
			var cRuleName = "CompositeRule_"+compositeRuleNr
			compositeRuleNr=compositeRuleNr+1
			ruleNames.add(cRuleName);
			
			var r = createRuleMethod(rule,cRuleName).toString
			ruleMethods.append(""+r)
			
		}
		
		'''
		private boolean «ruleName»(){
			«IF compositeRule.operator==LogicalOperator::NOT»
				return !«compositeRule.rules.get(0)»;
			«ELSE»
				return «FOR rule:ruleNames SEPARATOR logicalOperator(compositeRule.operator)»«rule»()«ENDFOR»;
			«ENDIF»
		}
		
		'''
	}
	
		
	def comparisonOperator(ComparisonOperator operator){
		switch operator {
			case ComparisonOperator::GREATER:return ' > '
			case ComparisonOperator::GREATER_OR_EQUALS:return ' >= '
			case ComparisonOperator::LOWER:return ' < '
			case ComparisonOperator::LOWER_OR_EQUALS:return ' <= '
			case ComparisonOperator::UNEQUALS:return ' != '
			case ComparisonOperator::EQUALS:return ' == '
		}
	}
	
	def logicalOperator(LogicalOperator operator){
		switch operator {
			case LogicalOperator::AND:return ' && '
			case LogicalOperator::OR:return ' || '
		}
	}
}