/*
* generated by Xtext
*/
grammar InternalGSMLDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package at.ac.tuwien.big.me12.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package at.ac.tuwien.big.me12.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.tuwien.big.me12.services.GSMLDslGrammarAccess;

}

@parser::members {

 	private GSMLDslGrammarAccess grammarAccess;
 	
    public InternalGSMLDslParser(TokenStream input, GSMLDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "GradingSystem";	
   	}
   	
   	@Override
   	protected GSMLDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleGradingSystem
entryRuleGradingSystem returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGradingSystemRule()); }
	 iv_ruleGradingSystem=ruleGradingSystem 
	 { $current=$iv_ruleGradingSystem.current; } 
	 EOF 
;

// Rule GradingSystem
ruleGradingSystem returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getGradingSystemAccess().getCoursesCourseParserRuleCall_0()); 
	    }
		lv_courses_0_0=ruleCourse		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGradingSystemRule());
	        }
       		add(
       			$current, 
       			"courses",
        		lv_courses_0_0, 
        		"Course");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleCourse
entryRuleCourse returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCourseRule()); }
	 iv_ruleCourse=ruleCourse 
	 { $current=$iv_ruleCourse.current; } 
	 EOF 
;

// Rule Course
ruleCourse returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='course' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getCourseAccess().getCourseKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getCourseAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCourseRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCourseAccess().getGradingsGradingParserRuleCall_3_0()); 
	    }
		lv_gradings_3_0=ruleGrading		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCourseRule());
	        }
       		add(
       			$current, 
       			"gradings",
        		lv_gradings_3_0, 
        		"Grading");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleGrading
entryRuleGrading returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGradingRule()); }
	 iv_ruleGrading=ruleGrading 
	 { $current=$iv_ruleGrading.current; } 
	 EOF 
;

// Rule Grading
ruleGrading returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='semester' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getGradingAccess().getSemesterKeyword_0());
    }
(
(
		lv_semester_1_0=RULE_ID
		{
			newLeafNode(lv_semester_1_0, grammarAccess.getGradingAccess().getSemesterIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGradingRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"semester",
        		lv_semester_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getGradingAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getGradingAccess().getGradingSchemeGradingSchemeParserRuleCall_3_0()); 
	    }
		lv_gradingScheme_3_0=ruleGradingScheme		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGradingRule());
	        }
       		set(
       			$current, 
       			"gradingScheme",
        		lv_gradingScheme_3_0, 
        		"GradingScheme");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getGradingAccess().getTasksTaskParserRuleCall_4_0()); 
	    }
		lv_tasks_4_0=ruleTask		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGradingRule());
	        }
       		add(
       			$current, 
       			"tasks",
        		lv_tasks_4_0, 
        		"Task");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getGradingAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleGradingScheme
entryRuleGradingScheme returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGradingSchemeRule()); }
	 iv_ruleGradingScheme=ruleGradingScheme 
	 { $current=$iv_ruleGradingScheme.current; } 
	 EOF 
;

// Rule GradingScheme
ruleGradingScheme returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='grading scheme' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getGradingSchemeAccess().getGradingSchemeKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getGradingSchemeAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getGradingSchemeRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getGradingSchemeAccess().getMinRequirementNotFulfilledGradeGradeCrossReference_2_0()); 
	}

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getGradingSchemeAccess().getRightParenthesisKeyword_3());
    }
	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getGradingSchemeAccess().getLeftCurlyBracketKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getGradingSchemeAccess().getGradesGradeParserRuleCall_5_0()); 
	    }
		lv_grades_5_0=ruleGrade		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGradingSchemeRule());
	        }
       		add(
       			$current, 
       			"grades",
        		lv_grades_5_0, 
        		"Grade");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getGradingSchemeAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleGrade
entryRuleGrade returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGradeRule()); }
	 iv_ruleGrade=ruleGrade 
	 { $current=$iv_ruleGrade.current; } 
	 EOF 
;

// Rule Grade
ruleGrade returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getGradeAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGradeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)	otherlv_1=':' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getGradeAccess().getColonKeyword_1());
    }
(
(
		lv_requiredPoints_2_0=RULE_INT
		{
			newLeafNode(lv_requiredPoints_2_0, grammarAccess.getGradeAccess().getRequiredPointsINTTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGradeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"requiredPoints",
        		lv_requiredPoints_2_0, 
        		"INT");
	    }

)
)	otherlv_3=';' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getGradeAccess().getSemicolonKeyword_3());
    }
)
;





// Entry rule entryRuleTask
entryRuleTask returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTaskRule()); }
	 iv_ruleTask=ruleTask 
	 { $current=$iv_ruleTask.current; } 
	 EOF 
;

// Rule Task
ruleTask returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getTaskAccess().getConcreteTaskParserRuleCall_0()); 
    }
    this_ConcreteTask_0=ruleConcreteTask
    { 
        $current = $this_ConcreteTask_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getTaskAccess().getTaskGroupParserRuleCall_1()); 
    }
    this_TaskGroup_1=ruleTaskGroup
    { 
        $current = $this_TaskGroup_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleConcreteTask
entryRuleConcreteTask returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConcreteTaskRule()); }
	 iv_ruleConcreteTask=ruleConcreteTask 
	 { $current=$iv_ruleConcreteTask.current; } 
	 EOF 
;

// Rule ConcreteTask
ruleConcreteTask returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getConcreteTaskAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConcreteTaskRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getConcreteTaskAccess().getLeftParenthesisKeyword_1());
    }
(
(
		lv_maxPoints_2_0=RULE_INT
		{
			newLeafNode(lv_maxPoints_2_0, grammarAccess.getConcreteTaskAccess().getMaxPointsINTTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConcreteTaskRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"maxPoints",
        		lv_maxPoints_2_0, 
        		"INT");
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getConcreteTaskAccess().getRightParenthesisKeyword_3());
    }
(	otherlv_4=':' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getConcreteTaskAccess().getColonKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConcreteTaskAccess().getMinRequirementMinRequirementParserRuleCall_4_1_0()); 
	    }
		lv_minRequirement_5_0=ruleMinRequirement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConcreteTaskRule());
	        }
       		set(
       			$current, 
       			"minRequirement",
        		lv_minRequirement_5_0, 
        		"MinRequirement");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getConcreteTaskAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRuleTaskGroup
entryRuleTaskGroup returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTaskGroupRule()); }
	 iv_ruleTaskGroup=ruleTaskGroup 
	 { $current=$iv_ruleTaskGroup.current; } 
	 EOF 
;

// Rule TaskGroup
ruleTaskGroup returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getTaskGroupAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTaskGroupRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getTaskGroupAccess().getLeftCurlyBracketKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTaskGroupAccess().getContainsTaskParserRuleCall_2_0()); 
	    }
		lv_contains_2_0=ruleTask		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTaskGroupRule());
	        }
       		add(
       			$current, 
       			"contains",
        		lv_contains_2_0, 
        		"Task");
	        afterParserOrEnumRuleCall();
	    }

)
)+(	otherlv_3='@all' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getTaskGroupAccess().getAllKeyword_3_0());
    }
	otherlv_4=':' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getTaskGroupAccess().getColonKeyword_3_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTaskGroupAccess().getMinRequirementMinRequirementParserRuleCall_3_2_0()); 
	    }
		lv_minRequirement_5_0=ruleMinRequirement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTaskGroupRule());
	        }
       		set(
       			$current, 
       			"minRequirement",
        		lv_minRequirement_5_0, 
        		"MinRequirement");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getTaskGroupAccess().getSemicolonKeyword_3_3());
    }
)?	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getTaskGroupAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleMinRequirement
entryRuleMinRequirement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMinRequirementRule()); }
	 iv_ruleMinRequirement=ruleMinRequirement 
	 { $current=$iv_ruleMinRequirement.current; } 
	 EOF 
;

// Rule MinRequirement
ruleMinRequirement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='min' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMinRequirementAccess().getMinKeyword_0());
    }
(
(
		lv_value_1_0=RULE_INT
		{
			newLeafNode(lv_value_1_0, grammarAccess.getMinRequirementAccess().getValueINTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMinRequirementRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"INT");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMinRequirementAccess().getTypeMinRequirementsTypeEnumRuleCall_2_0()); 
	    }
		lv_type_2_0=ruleMinRequirementsType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMinRequirementRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_2_0, 
        		"MinRequirementsType");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Rule MinRequirementsType
ruleMinRequirementsType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='point(s)' 
	{
        $current = grammarAccess.getMinRequirementsTypeAccess().getAbsoluteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getMinRequirementsTypeAccess().getAbsoluteEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='%' 
	{
        $current = grammarAccess.getMinRequirementsTypeAccess().getPercentageEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getMinRequirementsTypeAccess().getPercentageEnumLiteralDeclaration_1()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

