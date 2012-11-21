/*
* generated by Xtext
*/

package at.ac.tuwien.big.me12.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class GSMLDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class GradingSystemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "GradingSystem");
		private final Assignment cCoursesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cCoursesCourseParserRuleCall_0 = (RuleCall)cCoursesAssignment.eContents().get(0);
		
		//GradingSystem:
		//	courses+=Course+;
		public ParserRule getRule() { return rule; }

		//courses+=Course+
		public Assignment getCoursesAssignment() { return cCoursesAssignment; }

		//Course
		public RuleCall getCoursesCourseParserRuleCall_0() { return cCoursesCourseParserRuleCall_0; }
	}

	public class CourseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Course");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cCourseAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cCourseKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cGradingsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cGradingsGradingParserRuleCall_4_0 = (RuleCall)cGradingsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Course:
		//	{Course} "course" name=ID "{" gradings+=Grading+ "}";
		public ParserRule getRule() { return rule; }

		//{Course} "course" name=ID "{" gradings+=Grading+ "}"
		public Group getGroup() { return cGroup; }

		//{Course}
		public Action getCourseAction_0() { return cCourseAction_0; }

		//"course"
		public Keyword getCourseKeyword_1() { return cCourseKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//gradings+=Grading+
		public Assignment getGradingsAssignment_4() { return cGradingsAssignment_4; }

		//Grading
		public RuleCall getGradingsGradingParserRuleCall_4_0() { return cGradingsGradingParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class GradingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Grading");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSemesterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSemesterAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSemesterIDTerminalRuleCall_1_0 = (RuleCall)cSemesterAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cGradingSchemeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cGradingSchemeGradingSchemeParserRuleCall_3_0 = (RuleCall)cGradingSchemeAssignment_3.eContents().get(0);
		private final Assignment cTasksAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTasksTaskParserRuleCall_4_0 = (RuleCall)cTasksAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Grading:
		//	"semester" semester=ID "{" gradingScheme=GradingScheme tasks+=Task* "}";
		public ParserRule getRule() { return rule; }

		//"semester" semester=ID "{" gradingScheme=GradingScheme tasks+=Task* "}"
		public Group getGroup() { return cGroup; }

		//"semester"
		public Keyword getSemesterKeyword_0() { return cSemesterKeyword_0; }

		//semester=ID
		public Assignment getSemesterAssignment_1() { return cSemesterAssignment_1; }

		//ID
		public RuleCall getSemesterIDTerminalRuleCall_1_0() { return cSemesterIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//gradingScheme=GradingScheme
		public Assignment getGradingSchemeAssignment_3() { return cGradingSchemeAssignment_3; }

		//GradingScheme
		public RuleCall getGradingSchemeGradingSchemeParserRuleCall_3_0() { return cGradingSchemeGradingSchemeParserRuleCall_3_0; }

		//tasks+=Task*
		public Assignment getTasksAssignment_4() { return cTasksAssignment_4; }

		//Task
		public RuleCall getTasksTaskParserRuleCall_4_0() { return cTasksTaskParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class GradingSchemeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "GradingScheme");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGradingSchemeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMinRequirementNotFulfilledGradeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cMinRequirementNotFulfilledGradeGradeCrossReference_2_0 = (CrossReference)cMinRequirementNotFulfilledGradeAssignment_2.eContents().get(0);
		private final RuleCall cMinRequirementNotFulfilledGradeGradeIDTerminalRuleCall_2_0_1 = (RuleCall)cMinRequirementNotFulfilledGradeGradeCrossReference_2_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cGradesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cGradesGradeParserRuleCall_5_0 = (RuleCall)cGradesAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//GradingScheme:
		//	"grading scheme" "(" minRequirementNotFulfilledGrade=[Grade] ")" "{" grades+=Grade+ "}";
		public ParserRule getRule() { return rule; }

		//"grading scheme" "(" minRequirementNotFulfilledGrade=[Grade] ")" "{" grades+=Grade+ "}"
		public Group getGroup() { return cGroup; }

		//"grading scheme"
		public Keyword getGradingSchemeKeyword_0() { return cGradingSchemeKeyword_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//minRequirementNotFulfilledGrade=[Grade]
		public Assignment getMinRequirementNotFulfilledGradeAssignment_2() { return cMinRequirementNotFulfilledGradeAssignment_2; }

		//[Grade]
		public CrossReference getMinRequirementNotFulfilledGradeGradeCrossReference_2_0() { return cMinRequirementNotFulfilledGradeGradeCrossReference_2_0; }

		//ID
		public RuleCall getMinRequirementNotFulfilledGradeGradeIDTerminalRuleCall_2_0_1() { return cMinRequirementNotFulfilledGradeGradeIDTerminalRuleCall_2_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//grades+=Grade+
		public Assignment getGradesAssignment_5() { return cGradesAssignment_5; }

		//Grade
		public RuleCall getGradesGradeParserRuleCall_5_0() { return cGradesGradeParserRuleCall_5_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class GradeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Grade");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cRequiredPointsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRequiredPointsINTTerminalRuleCall_2_0 = (RuleCall)cRequiredPointsAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Grade:
		//	name=ID ":" requiredPoints=INT ";";
		public ParserRule getRule() { return rule; }

		//name=ID ":" requiredPoints=INT ";"
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//requiredPoints=INT
		public Assignment getRequiredPointsAssignment_2() { return cRequiredPointsAssignment_2; }

		//INT
		public RuleCall getRequiredPointsINTTerminalRuleCall_2_0() { return cRequiredPointsINTTerminalRuleCall_2_0; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class TaskElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Task");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cConcreteTaskParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTaskGroupParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Task:
		//	ConcreteTask | TaskGroup;
		public ParserRule getRule() { return rule; }

		//ConcreteTask | TaskGroup
		public Alternatives getAlternatives() { return cAlternatives; }

		//ConcreteTask
		public RuleCall getConcreteTaskParserRuleCall_0() { return cConcreteTaskParserRuleCall_0; }

		//TaskGroup
		public RuleCall getTaskGroupParserRuleCall_1() { return cTaskGroupParserRuleCall_1; }
	}

	public class TaskGroupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TaskGroup");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cContainsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cContainsTaskParserRuleCall_2_0 = (RuleCall)cContainsAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cAllKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cColonKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cMinRequirementAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cMinRequirementMinRequirementParserRuleCall_3_2_0 = (RuleCall)cMinRequirementAssignment_3_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//TaskGroup:
		//	name=ID "{" contains+=Task* ("@all" ":" minRequirement=MinRequirement ";")? "}";
		public ParserRule getRule() { return rule; }

		//name=ID "{" contains+=Task* ("@all" ":" minRequirement=MinRequirement ";")? "}"
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//contains+=Task*
		public Assignment getContainsAssignment_2() { return cContainsAssignment_2; }

		//Task
		public RuleCall getContainsTaskParserRuleCall_2_0() { return cContainsTaskParserRuleCall_2_0; }

		//("@all" ":" minRequirement=MinRequirement ";")?
		public Group getGroup_3() { return cGroup_3; }

		//"@all"
		public Keyword getAllKeyword_3_0() { return cAllKeyword_3_0; }

		//":"
		public Keyword getColonKeyword_3_1() { return cColonKeyword_3_1; }

		//minRequirement=MinRequirement
		public Assignment getMinRequirementAssignment_3_2() { return cMinRequirementAssignment_3_2; }

		//MinRequirement
		public RuleCall getMinRequirementMinRequirementParserRuleCall_3_2_0() { return cMinRequirementMinRequirementParserRuleCall_3_2_0; }

		//";"
		public Keyword getSemicolonKeyword_3_3() { return cSemicolonKeyword_3_3; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class ConcreteTaskElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ConcreteTask");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMaxPointsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMaxPointsINTTerminalRuleCall_2_0 = (RuleCall)cMaxPointsAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cColonKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cMinRequirementAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cMinRequirementMinRequirementParserRuleCall_4_1_0 = (RuleCall)cMinRequirementAssignment_4_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ConcreteTask:
		//	name=ID "(" maxPoints=INT ")" (":" minRequirement=MinRequirement)? ";";
		public ParserRule getRule() { return rule; }

		//name=ID "(" maxPoints=INT ")" (":" minRequirement=MinRequirement)? ";"
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//maxPoints=INT
		public Assignment getMaxPointsAssignment_2() { return cMaxPointsAssignment_2; }

		//INT
		public RuleCall getMaxPointsINTTerminalRuleCall_2_0() { return cMaxPointsINTTerminalRuleCall_2_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }

		//(":" minRequirement=MinRequirement)?
		public Group getGroup_4() { return cGroup_4; }

		//":"
		public Keyword getColonKeyword_4_0() { return cColonKeyword_4_0; }

		//minRequirement=MinRequirement
		public Assignment getMinRequirementAssignment_4_1() { return cMinRequirementAssignment_4_1; }

		//MinRequirement
		public RuleCall getMinRequirementMinRequirementParserRuleCall_4_1_0() { return cMinRequirementMinRequirementParserRuleCall_4_1_0; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class MinRequirementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MinRequirement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMinKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeMinRequirementsTypeEnumRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		
		//MinRequirement:
		//	"min" value=INT type=MinRequirementsType;
		public ParserRule getRule() { return rule; }

		//"min" value=INT type=MinRequirementsType
		public Group getGroup() { return cGroup; }

		//"min"
		public Keyword getMinKeyword_0() { return cMinKeyword_0; }

		//value=INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }

		//type=MinRequirementsType
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//MinRequirementsType
		public RuleCall getTypeMinRequirementsTypeEnumRuleCall_2_0() { return cTypeMinRequirementsTypeEnumRuleCall_2_0; }
	}
	
	
	public class MinRequirementsTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "MinRequirementsType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cAbsoluteEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cAbsolutePointSKeyword_0_0 = (Keyword)cAbsoluteEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cPercentageEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cPercentagePercentSignKeyword_1_0 = (Keyword)cPercentageEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum MinRequirementsType:
		//	Absolute="point(s)" | Percentage="%";
		public EnumRule getRule() { return rule; }

		//Absolute="point(s)" | Percentage="%"
		public Alternatives getAlternatives() { return cAlternatives; }

		//Absolute="point(s)"
		public EnumLiteralDeclaration getAbsoluteEnumLiteralDeclaration_0() { return cAbsoluteEnumLiteralDeclaration_0; }

		//"point(s)"
		public Keyword getAbsolutePointSKeyword_0_0() { return cAbsolutePointSKeyword_0_0; }

		//Percentage="%"
		public EnumLiteralDeclaration getPercentageEnumLiteralDeclaration_1() { return cPercentageEnumLiteralDeclaration_1; }

		//"%"
		public Keyword getPercentagePercentSignKeyword_1_0() { return cPercentagePercentSignKeyword_1_0; }
	}
	
	private GradingSystemElements pGradingSystem;
	private CourseElements pCourse;
	private GradingElements pGrading;
	private GradingSchemeElements pGradingScheme;
	private GradeElements pGrade;
	private TaskElements pTask;
	private TaskGroupElements pTaskGroup;
	private ConcreteTaskElements pConcreteTask;
	private MinRequirementElements pMinRequirement;
	private MinRequirementsTypeElements unknownRuleMinRequirementsType;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public GSMLDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("at.ac.tuwien.big.me12.GSMLDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//GradingSystem:
	//	courses+=Course+;
	public GradingSystemElements getGradingSystemAccess() {
		return (pGradingSystem != null) ? pGradingSystem : (pGradingSystem = new GradingSystemElements());
	}
	
	public ParserRule getGradingSystemRule() {
		return getGradingSystemAccess().getRule();
	}

	//Course:
	//	{Course} "course" name=ID "{" gradings+=Grading+ "}";
	public CourseElements getCourseAccess() {
		return (pCourse != null) ? pCourse : (pCourse = new CourseElements());
	}
	
	public ParserRule getCourseRule() {
		return getCourseAccess().getRule();
	}

	//Grading:
	//	"semester" semester=ID "{" gradingScheme=GradingScheme tasks+=Task* "}";
	public GradingElements getGradingAccess() {
		return (pGrading != null) ? pGrading : (pGrading = new GradingElements());
	}
	
	public ParserRule getGradingRule() {
		return getGradingAccess().getRule();
	}

	//GradingScheme:
	//	"grading scheme" "(" minRequirementNotFulfilledGrade=[Grade] ")" "{" grades+=Grade+ "}";
	public GradingSchemeElements getGradingSchemeAccess() {
		return (pGradingScheme != null) ? pGradingScheme : (pGradingScheme = new GradingSchemeElements());
	}
	
	public ParserRule getGradingSchemeRule() {
		return getGradingSchemeAccess().getRule();
	}

	//Grade:
	//	name=ID ":" requiredPoints=INT ";";
	public GradeElements getGradeAccess() {
		return (pGrade != null) ? pGrade : (pGrade = new GradeElements());
	}
	
	public ParserRule getGradeRule() {
		return getGradeAccess().getRule();
	}

	//Task:
	//	ConcreteTask | TaskGroup;
	public TaskElements getTaskAccess() {
		return (pTask != null) ? pTask : (pTask = new TaskElements());
	}
	
	public ParserRule getTaskRule() {
		return getTaskAccess().getRule();
	}

	//TaskGroup:
	//	name=ID "{" contains+=Task* ("@all" ":" minRequirement=MinRequirement ";")? "}";
	public TaskGroupElements getTaskGroupAccess() {
		return (pTaskGroup != null) ? pTaskGroup : (pTaskGroup = new TaskGroupElements());
	}
	
	public ParserRule getTaskGroupRule() {
		return getTaskGroupAccess().getRule();
	}

	//ConcreteTask:
	//	name=ID "(" maxPoints=INT ")" (":" minRequirement=MinRequirement)? ";";
	public ConcreteTaskElements getConcreteTaskAccess() {
		return (pConcreteTask != null) ? pConcreteTask : (pConcreteTask = new ConcreteTaskElements());
	}
	
	public ParserRule getConcreteTaskRule() {
		return getConcreteTaskAccess().getRule();
	}

	//MinRequirement:
	//	"min" value=INT type=MinRequirementsType;
	public MinRequirementElements getMinRequirementAccess() {
		return (pMinRequirement != null) ? pMinRequirement : (pMinRequirement = new MinRequirementElements());
	}
	
	public ParserRule getMinRequirementRule() {
		return getMinRequirementAccess().getRule();
	}

	//enum MinRequirementsType:
	//	Absolute="point(s)" | Percentage="%";
	public MinRequirementsTypeElements getMinRequirementsTypeAccess() {
		return (unknownRuleMinRequirementsType != null) ? unknownRuleMinRequirementsType : (unknownRuleMinRequirementsType = new MinRequirementsTypeElements());
	}
	
	public EnumRule getMinRequirementsTypeRule() {
		return getMinRequirementsTypeAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
