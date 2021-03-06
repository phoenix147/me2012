/*
* generated by Xtext
*/
package at.ac.tuwien.big.me12.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import at.ac.tuwien.big.me12.services.GSMLDslGrammarAccess;

public class GSMLDslParser extends AbstractContentAssistParser {
	
	@Inject
	private GSMLDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected at.ac.tuwien.big.me12.ui.contentassist.antlr.internal.InternalGSMLDslParser createParser() {
		at.ac.tuwien.big.me12.ui.contentassist.antlr.internal.InternalGSMLDslParser result = new at.ac.tuwien.big.me12.ui.contentassist.antlr.internal.InternalGSMLDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTaskAccess().getAlternatives(), "rule__Task__Alternatives");
					put(grammarAccess.getMinRequirementsTypeAccess().getAlternatives(), "rule__MinRequirementsType__Alternatives");
					put(grammarAccess.getCourseAccess().getGroup(), "rule__Course__Group__0");
					put(grammarAccess.getGradingAccess().getGroup(), "rule__Grading__Group__0");
					put(grammarAccess.getGradingSchemeAccess().getGroup(), "rule__GradingScheme__Group__0");
					put(grammarAccess.getGradeAccess().getGroup(), "rule__Grade__Group__0");
					put(grammarAccess.getConcreteTaskAccess().getGroup(), "rule__ConcreteTask__Group__0");
					put(grammarAccess.getConcreteTaskAccess().getGroup_4(), "rule__ConcreteTask__Group_4__0");
					put(grammarAccess.getTaskGroupAccess().getGroup(), "rule__TaskGroup__Group__0");
					put(grammarAccess.getTaskGroupAccess().getGroup_3(), "rule__TaskGroup__Group_3__0");
					put(grammarAccess.getMinRequirementAccess().getGroup(), "rule__MinRequirement__Group__0");
					put(grammarAccess.getGradingSystemAccess().getCoursesAssignment(), "rule__GradingSystem__CoursesAssignment");
					put(grammarAccess.getCourseAccess().getNameAssignment_1(), "rule__Course__NameAssignment_1");
					put(grammarAccess.getCourseAccess().getGradingsAssignment_3(), "rule__Course__GradingsAssignment_3");
					put(grammarAccess.getGradingAccess().getSemesterAssignment_1(), "rule__Grading__SemesterAssignment_1");
					put(grammarAccess.getGradingAccess().getGradingSchemeAssignment_3(), "rule__Grading__GradingSchemeAssignment_3");
					put(grammarAccess.getGradingAccess().getTasksAssignment_4(), "rule__Grading__TasksAssignment_4");
					put(grammarAccess.getGradingSchemeAccess().getMinRequirementNotFulfilledGradeAssignment_2(), "rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2");
					put(grammarAccess.getGradingSchemeAccess().getGradesAssignment_5(), "rule__GradingScheme__GradesAssignment_5");
					put(grammarAccess.getGradeAccess().getNameAssignment_0(), "rule__Grade__NameAssignment_0");
					put(grammarAccess.getGradeAccess().getRequiredPointsAssignment_2(), "rule__Grade__RequiredPointsAssignment_2");
					put(grammarAccess.getConcreteTaskAccess().getNameAssignment_0(), "rule__ConcreteTask__NameAssignment_0");
					put(grammarAccess.getConcreteTaskAccess().getMaxPointsAssignment_2(), "rule__ConcreteTask__MaxPointsAssignment_2");
					put(grammarAccess.getConcreteTaskAccess().getMinRequirementAssignment_4_1(), "rule__ConcreteTask__MinRequirementAssignment_4_1");
					put(grammarAccess.getTaskGroupAccess().getNameAssignment_0(), "rule__TaskGroup__NameAssignment_0");
					put(grammarAccess.getTaskGroupAccess().getContainsAssignment_2(), "rule__TaskGroup__ContainsAssignment_2");
					put(grammarAccess.getTaskGroupAccess().getMinRequirementAssignment_3_2(), "rule__TaskGroup__MinRequirementAssignment_3_2");
					put(grammarAccess.getMinRequirementAccess().getValueAssignment_1(), "rule__MinRequirement__ValueAssignment_1");
					put(grammarAccess.getMinRequirementAccess().getTypeAssignment_2(), "rule__MinRequirement__TypeAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			at.ac.tuwien.big.me12.ui.contentassist.antlr.internal.InternalGSMLDslParser typedParser = (at.ac.tuwien.big.me12.ui.contentassist.antlr.internal.InternalGSMLDslParser) parser;
			typedParser.entryRuleGradingSystem();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public GSMLDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(GSMLDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
