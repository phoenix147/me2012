package at.ac.tuwien.big.me12.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import at.ac.tuwien.big.me12.services.GSMLDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGSMLDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'point(s)'", "'%'", "'course'", "'{'", "'}'", "'semester'", "'grading scheme'", "'('", "')'", "':'", "';'", "'@all'", "'min'"
    };
    public static final int RULE_ID=4;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalGSMLDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGSMLDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGSMLDslParser.tokenNames; }
    public String getGrammarFileName() { return "../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g"; }


     
     	private GSMLDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(GSMLDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleGradingSystem"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:60:1: entryRuleGradingSystem : ruleGradingSystem EOF ;
    public final void entryRuleGradingSystem() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:61:1: ( ruleGradingSystem EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:62:1: ruleGradingSystem EOF
            {
             before(grammarAccess.getGradingSystemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGradingSystem_in_entryRuleGradingSystem61);
            ruleGradingSystem();

            state._fsp--;

             after(grammarAccess.getGradingSystemRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGradingSystem68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGradingSystem"


    // $ANTLR start "ruleGradingSystem"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:69:1: ruleGradingSystem : ( ( rule__GradingSystem__CoursesAssignment )* ) ;
    public final void ruleGradingSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:73:2: ( ( ( rule__GradingSystem__CoursesAssignment )* ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:74:1: ( ( rule__GradingSystem__CoursesAssignment )* )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:74:1: ( ( rule__GradingSystem__CoursesAssignment )* )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:75:1: ( rule__GradingSystem__CoursesAssignment )*
            {
             before(grammarAccess.getGradingSystemAccess().getCoursesAssignment()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:76:1: ( rule__GradingSystem__CoursesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:76:2: rule__GradingSystem__CoursesAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__GradingSystem__CoursesAssignment_in_ruleGradingSystem94);
            	    rule__GradingSystem__CoursesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getGradingSystemAccess().getCoursesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGradingSystem"


    // $ANTLR start "entryRuleCourse"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:88:1: entryRuleCourse : ruleCourse EOF ;
    public final void entryRuleCourse() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:89:1: ( ruleCourse EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:90:1: ruleCourse EOF
            {
             before(grammarAccess.getCourseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourse_in_entryRuleCourse122);
            ruleCourse();

            state._fsp--;

             after(grammarAccess.getCourseRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCourse129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCourse"


    // $ANTLR start "ruleCourse"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:97:1: ruleCourse : ( ( rule__Course__Group__0 ) ) ;
    public final void ruleCourse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:101:2: ( ( ( rule__Course__Group__0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:102:1: ( ( rule__Course__Group__0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:102:1: ( ( rule__Course__Group__0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:103:1: ( rule__Course__Group__0 )
            {
             before(grammarAccess.getCourseAccess().getGroup()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:104:1: ( rule__Course__Group__0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:104:2: rule__Course__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__0_in_ruleCourse155);
            rule__Course__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCourse"


    // $ANTLR start "entryRuleGrading"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:116:1: entryRuleGrading : ruleGrading EOF ;
    public final void entryRuleGrading() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:117:1: ( ruleGrading EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:118:1: ruleGrading EOF
            {
             before(grammarAccess.getGradingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrading_in_entryRuleGrading182);
            ruleGrading();

            state._fsp--;

             after(grammarAccess.getGradingRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGrading189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrading"


    // $ANTLR start "ruleGrading"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:125:1: ruleGrading : ( ( rule__Grading__Group__0 ) ) ;
    public final void ruleGrading() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:129:2: ( ( ( rule__Grading__Group__0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:130:1: ( ( rule__Grading__Group__0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:130:1: ( ( rule__Grading__Group__0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:131:1: ( rule__Grading__Group__0 )
            {
             before(grammarAccess.getGradingAccess().getGroup()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:132:1: ( rule__Grading__Group__0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:132:2: rule__Grading__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__0_in_ruleGrading215);
            rule__Grading__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGradingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrading"


    // $ANTLR start "entryRuleGradingScheme"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:144:1: entryRuleGradingScheme : ruleGradingScheme EOF ;
    public final void entryRuleGradingScheme() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:145:1: ( ruleGradingScheme EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:146:1: ruleGradingScheme EOF
            {
             before(grammarAccess.getGradingSchemeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGradingScheme_in_entryRuleGradingScheme242);
            ruleGradingScheme();

            state._fsp--;

             after(grammarAccess.getGradingSchemeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGradingScheme249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGradingScheme"


    // $ANTLR start "ruleGradingScheme"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:153:1: ruleGradingScheme : ( ( rule__GradingScheme__Group__0 ) ) ;
    public final void ruleGradingScheme() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:157:2: ( ( ( rule__GradingScheme__Group__0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:158:1: ( ( rule__GradingScheme__Group__0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:158:1: ( ( rule__GradingScheme__Group__0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:159:1: ( rule__GradingScheme__Group__0 )
            {
             before(grammarAccess.getGradingSchemeAccess().getGroup()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:160:1: ( rule__GradingScheme__Group__0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:160:2: rule__GradingScheme__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__0_in_ruleGradingScheme275);
            rule__GradingScheme__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGradingSchemeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGradingScheme"


    // $ANTLR start "entryRuleGrade"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:172:1: entryRuleGrade : ruleGrade EOF ;
    public final void entryRuleGrade() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:173:1: ( ruleGrade EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:174:1: ruleGrade EOF
            {
             before(grammarAccess.getGradeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrade_in_entryRuleGrade302);
            ruleGrade();

            state._fsp--;

             after(grammarAccess.getGradeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGrade309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrade"


    // $ANTLR start "ruleGrade"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:181:1: ruleGrade : ( ( rule__Grade__Group__0 ) ) ;
    public final void ruleGrade() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:185:2: ( ( ( rule__Grade__Group__0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:186:1: ( ( rule__Grade__Group__0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:186:1: ( ( rule__Grade__Group__0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:187:1: ( rule__Grade__Group__0 )
            {
             before(grammarAccess.getGradeAccess().getGroup()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:188:1: ( rule__Grade__Group__0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:188:2: rule__Grade__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grade__Group__0_in_ruleGrade335);
            rule__Grade__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGradeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrade"


    // $ANTLR start "entryRuleTask"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:200:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:201:1: ( ruleTask EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:202:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTask_in_entryRuleTask362);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTask369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:209:1: ruleTask : ( ( rule__Task__Alternatives ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:213:2: ( ( ( rule__Task__Alternatives ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:214:1: ( ( rule__Task__Alternatives ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:214:1: ( ( rule__Task__Alternatives ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:215:1: ( rule__Task__Alternatives )
            {
             before(grammarAccess.getTaskAccess().getAlternatives()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:216:1: ( rule__Task__Alternatives )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:216:2: rule__Task__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Task__Alternatives_in_ruleTask395);
            rule__Task__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleConcreteTask"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:228:1: entryRuleConcreteTask : ruleConcreteTask EOF ;
    public final void entryRuleConcreteTask() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:229:1: ( ruleConcreteTask EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:230:1: ruleConcreteTask EOF
            {
             before(grammarAccess.getConcreteTaskRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConcreteTask_in_entryRuleConcreteTask422);
            ruleConcreteTask();

            state._fsp--;

             after(grammarAccess.getConcreteTaskRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConcreteTask429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConcreteTask"


    // $ANTLR start "ruleConcreteTask"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:237:1: ruleConcreteTask : ( ( rule__ConcreteTask__Group__0 ) ) ;
    public final void ruleConcreteTask() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:241:2: ( ( ( rule__ConcreteTask__Group__0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:242:1: ( ( rule__ConcreteTask__Group__0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:242:1: ( ( rule__ConcreteTask__Group__0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:243:1: ( rule__ConcreteTask__Group__0 )
            {
             before(grammarAccess.getConcreteTaskAccess().getGroup()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:244:1: ( rule__ConcreteTask__Group__0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:244:2: rule__ConcreteTask__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__0_in_ruleConcreteTask455);
            rule__ConcreteTask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConcreteTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConcreteTask"


    // $ANTLR start "entryRuleTaskGroup"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:256:1: entryRuleTaskGroup : ruleTaskGroup EOF ;
    public final void entryRuleTaskGroup() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:257:1: ( ruleTaskGroup EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:258:1: ruleTaskGroup EOF
            {
             before(grammarAccess.getTaskGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTaskGroup_in_entryRuleTaskGroup482);
            ruleTaskGroup();

            state._fsp--;

             after(grammarAccess.getTaskGroupRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTaskGroup489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTaskGroup"


    // $ANTLR start "ruleTaskGroup"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:265:1: ruleTaskGroup : ( ( rule__TaskGroup__Group__0 ) ) ;
    public final void ruleTaskGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:269:2: ( ( ( rule__TaskGroup__Group__0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:270:1: ( ( rule__TaskGroup__Group__0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:270:1: ( ( rule__TaskGroup__Group__0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:271:1: ( rule__TaskGroup__Group__0 )
            {
             before(grammarAccess.getTaskGroupAccess().getGroup()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:272:1: ( rule__TaskGroup__Group__0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:272:2: rule__TaskGroup__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__0_in_ruleTaskGroup515);
            rule__TaskGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaskGroup"


    // $ANTLR start "entryRuleMinRequirement"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:284:1: entryRuleMinRequirement : ruleMinRequirement EOF ;
    public final void entryRuleMinRequirement() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:285:1: ( ruleMinRequirement EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:286:1: ruleMinRequirement EOF
            {
             before(grammarAccess.getMinRequirementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMinRequirement_in_entryRuleMinRequirement542);
            ruleMinRequirement();

            state._fsp--;

             after(grammarAccess.getMinRequirementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMinRequirement549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMinRequirement"


    // $ANTLR start "ruleMinRequirement"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:293:1: ruleMinRequirement : ( ( rule__MinRequirement__Group__0 ) ) ;
    public final void ruleMinRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:297:2: ( ( ( rule__MinRequirement__Group__0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:298:1: ( ( rule__MinRequirement__Group__0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:298:1: ( ( rule__MinRequirement__Group__0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:299:1: ( rule__MinRequirement__Group__0 )
            {
             before(grammarAccess.getMinRequirementAccess().getGroup()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:300:1: ( rule__MinRequirement__Group__0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:300:2: rule__MinRequirement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__Group__0_in_ruleMinRequirement575);
            rule__MinRequirement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMinRequirementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMinRequirement"


    // $ANTLR start "ruleMinRequirementsType"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:313:1: ruleMinRequirementsType : ( ( rule__MinRequirementsType__Alternatives ) ) ;
    public final void ruleMinRequirementsType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:317:1: ( ( ( rule__MinRequirementsType__Alternatives ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:318:1: ( ( rule__MinRequirementsType__Alternatives ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:318:1: ( ( rule__MinRequirementsType__Alternatives ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:319:1: ( rule__MinRequirementsType__Alternatives )
            {
             before(grammarAccess.getMinRequirementsTypeAccess().getAlternatives()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:320:1: ( rule__MinRequirementsType__Alternatives )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:320:2: rule__MinRequirementsType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__MinRequirementsType__Alternatives_in_ruleMinRequirementsType612);
            rule__MinRequirementsType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMinRequirementsTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMinRequirementsType"


    // $ANTLR start "rule__Task__Alternatives"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:331:1: rule__Task__Alternatives : ( ( ruleConcreteTask ) | ( ruleTaskGroup ) );
    public final void rule__Task__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:335:1: ( ( ruleConcreteTask ) | ( ruleTaskGroup ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==14) ) {
                    alt2=2;
                }
                else if ( (LA2_1==18) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:336:1: ( ruleConcreteTask )
                    {
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:336:1: ( ruleConcreteTask )
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:337:1: ruleConcreteTask
                    {
                     before(grammarAccess.getTaskAccess().getConcreteTaskParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleConcreteTask_in_rule__Task__Alternatives647);
                    ruleConcreteTask();

                    state._fsp--;

                     after(grammarAccess.getTaskAccess().getConcreteTaskParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:342:6: ( ruleTaskGroup )
                    {
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:342:6: ( ruleTaskGroup )
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:343:1: ruleTaskGroup
                    {
                     before(grammarAccess.getTaskAccess().getTaskGroupParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTaskGroup_in_rule__Task__Alternatives664);
                    ruleTaskGroup();

                    state._fsp--;

                     after(grammarAccess.getTaskAccess().getTaskGroupParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Alternatives"


    // $ANTLR start "rule__MinRequirementsType__Alternatives"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:353:1: rule__MinRequirementsType__Alternatives : ( ( ( 'point(s)' ) ) | ( ( '%' ) ) );
    public final void rule__MinRequirementsType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:357:1: ( ( ( 'point(s)' ) ) | ( ( '%' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:358:1: ( ( 'point(s)' ) )
                    {
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:358:1: ( ( 'point(s)' ) )
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:359:1: ( 'point(s)' )
                    {
                     before(grammarAccess.getMinRequirementsTypeAccess().getAbsoluteEnumLiteralDeclaration_0()); 
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:360:1: ( 'point(s)' )
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:360:3: 'point(s)'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__MinRequirementsType__Alternatives697); 

                    }

                     after(grammarAccess.getMinRequirementsTypeAccess().getAbsoluteEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:365:6: ( ( '%' ) )
                    {
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:365:6: ( ( '%' ) )
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:366:1: ( '%' )
                    {
                     before(grammarAccess.getMinRequirementsTypeAccess().getPercentageEnumLiteralDeclaration_1()); 
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:367:1: ( '%' )
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:367:3: '%'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__MinRequirementsType__Alternatives718); 

                    }

                     after(grammarAccess.getMinRequirementsTypeAccess().getPercentageEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinRequirementsType__Alternatives"


    // $ANTLR start "rule__Course__Group__0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:379:1: rule__Course__Group__0 : rule__Course__Group__0__Impl rule__Course__Group__1 ;
    public final void rule__Course__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:383:1: ( rule__Course__Group__0__Impl rule__Course__Group__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:384:2: rule__Course__Group__0__Impl rule__Course__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__0__Impl_in_rule__Course__Group__0751);
            rule__Course__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__1_in_rule__Course__Group__0754);
            rule__Course__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__0"


    // $ANTLR start "rule__Course__Group__0__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:391:1: rule__Course__Group__0__Impl : ( 'course' ) ;
    public final void rule__Course__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:395:1: ( ( 'course' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:396:1: ( 'course' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:396:1: ( 'course' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:397:1: 'course'
            {
             before(grammarAccess.getCourseAccess().getCourseKeyword_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Course__Group__0__Impl782); 
             after(grammarAccess.getCourseAccess().getCourseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__0__Impl"


    // $ANTLR start "rule__Course__Group__1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:410:1: rule__Course__Group__1 : rule__Course__Group__1__Impl rule__Course__Group__2 ;
    public final void rule__Course__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:414:1: ( rule__Course__Group__1__Impl rule__Course__Group__2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:415:2: rule__Course__Group__1__Impl rule__Course__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__1__Impl_in_rule__Course__Group__1813);
            rule__Course__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__2_in_rule__Course__Group__1816);
            rule__Course__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__1"


    // $ANTLR start "rule__Course__Group__1__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:422:1: rule__Course__Group__1__Impl : ( ( rule__Course__NameAssignment_1 ) ) ;
    public final void rule__Course__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:426:1: ( ( ( rule__Course__NameAssignment_1 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:427:1: ( ( rule__Course__NameAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:427:1: ( ( rule__Course__NameAssignment_1 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:428:1: ( rule__Course__NameAssignment_1 )
            {
             before(grammarAccess.getCourseAccess().getNameAssignment_1()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:429:1: ( rule__Course__NameAssignment_1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:429:2: rule__Course__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__NameAssignment_1_in_rule__Course__Group__1__Impl843);
            rule__Course__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__1__Impl"


    // $ANTLR start "rule__Course__Group__2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:439:1: rule__Course__Group__2 : rule__Course__Group__2__Impl rule__Course__Group__3 ;
    public final void rule__Course__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:443:1: ( rule__Course__Group__2__Impl rule__Course__Group__3 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:444:2: rule__Course__Group__2__Impl rule__Course__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__2__Impl_in_rule__Course__Group__2873);
            rule__Course__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__3_in_rule__Course__Group__2876);
            rule__Course__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__2"


    // $ANTLR start "rule__Course__Group__2__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:451:1: rule__Course__Group__2__Impl : ( '{' ) ;
    public final void rule__Course__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:455:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:456:1: ( '{' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:456:1: ( '{' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:457:1: '{'
            {
             before(grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Course__Group__2__Impl904); 
             after(grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__2__Impl"


    // $ANTLR start "rule__Course__Group__3"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:470:1: rule__Course__Group__3 : rule__Course__Group__3__Impl rule__Course__Group__4 ;
    public final void rule__Course__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:474:1: ( rule__Course__Group__3__Impl rule__Course__Group__4 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:475:2: rule__Course__Group__3__Impl rule__Course__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__3__Impl_in_rule__Course__Group__3935);
            rule__Course__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__4_in_rule__Course__Group__3938);
            rule__Course__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__3"


    // $ANTLR start "rule__Course__Group__3__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:482:1: rule__Course__Group__3__Impl : ( ( rule__Course__GradingsAssignment_3 )* ) ;
    public final void rule__Course__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:486:1: ( ( ( rule__Course__GradingsAssignment_3 )* ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:487:1: ( ( rule__Course__GradingsAssignment_3 )* )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:487:1: ( ( rule__Course__GradingsAssignment_3 )* )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:488:1: ( rule__Course__GradingsAssignment_3 )*
            {
             before(grammarAccess.getCourseAccess().getGradingsAssignment_3()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:489:1: ( rule__Course__GradingsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:489:2: rule__Course__GradingsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Course__GradingsAssignment_3_in_rule__Course__Group__3__Impl965);
            	    rule__Course__GradingsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCourseAccess().getGradingsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__3__Impl"


    // $ANTLR start "rule__Course__Group__4"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:499:1: rule__Course__Group__4 : rule__Course__Group__4__Impl ;
    public final void rule__Course__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:503:1: ( rule__Course__Group__4__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:504:2: rule__Course__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__4__Impl_in_rule__Course__Group__4996);
            rule__Course__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__4"


    // $ANTLR start "rule__Course__Group__4__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:510:1: rule__Course__Group__4__Impl : ( '}' ) ;
    public final void rule__Course__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:514:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:515:1: ( '}' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:515:1: ( '}' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:516:1: '}'
            {
             before(grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Course__Group__4__Impl1024); 
             after(grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__4__Impl"


    // $ANTLR start "rule__Grading__Group__0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:539:1: rule__Grading__Group__0 : rule__Grading__Group__0__Impl rule__Grading__Group__1 ;
    public final void rule__Grading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:543:1: ( rule__Grading__Group__0__Impl rule__Grading__Group__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:544:2: rule__Grading__Group__0__Impl rule__Grading__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__0__Impl_in_rule__Grading__Group__01065);
            rule__Grading__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__1_in_rule__Grading__Group__01068);
            rule__Grading__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__Group__0"


    // $ANTLR start "rule__Grading__Group__0__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:551:1: rule__Grading__Group__0__Impl : ( 'semester' ) ;
    public final void rule__Grading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:555:1: ( ( 'semester' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:556:1: ( 'semester' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:556:1: ( 'semester' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:557:1: 'semester'
            {
             before(grammarAccess.getGradingAccess().getSemesterKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Grading__Group__0__Impl1096); 
             after(grammarAccess.getGradingAccess().getSemesterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__Group__0__Impl"


    // $ANTLR start "rule__Grading__Group__1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:570:1: rule__Grading__Group__1 : rule__Grading__Group__1__Impl rule__Grading__Group__2 ;
    public final void rule__Grading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:574:1: ( rule__Grading__Group__1__Impl rule__Grading__Group__2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:575:2: rule__Grading__Group__1__Impl rule__Grading__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__1__Impl_in_rule__Grading__Group__11127);
            rule__Grading__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__2_in_rule__Grading__Group__11130);
            rule__Grading__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__Group__1"


    // $ANTLR start "rule__Grading__Group__1__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:582:1: rule__Grading__Group__1__Impl : ( ( rule__Grading__SemesterAssignment_1 ) ) ;
    public final void rule__Grading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:586:1: ( ( ( rule__Grading__SemesterAssignment_1 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:587:1: ( ( rule__Grading__SemesterAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:587:1: ( ( rule__Grading__SemesterAssignment_1 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:588:1: ( rule__Grading__SemesterAssignment_1 )
            {
             before(grammarAccess.getGradingAccess().getSemesterAssignment_1()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:589:1: ( rule__Grading__SemesterAssignment_1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:589:2: rule__Grading__SemesterAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__SemesterAssignment_1_in_rule__Grading__Group__1__Impl1157);
            rule__Grading__SemesterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGradingAccess().getSemesterAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__Group__1__Impl"


    // $ANTLR start "rule__Grading__Group__2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:599:1: rule__Grading__Group__2 : rule__Grading__Group__2__Impl rule__Grading__Group__3 ;
    public final void rule__Grading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:603:1: ( rule__Grading__Group__2__Impl rule__Grading__Group__3 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:604:2: rule__Grading__Group__2__Impl rule__Grading__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__2__Impl_in_rule__Grading__Group__21187);
            rule__Grading__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__3_in_rule__Grading__Group__21190);
            rule__Grading__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__Group__2"


    // $ANTLR start "rule__Grading__Group__2__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:611:1: rule__Grading__Group__2__Impl : ( '{' ) ;
    public final void rule__Grading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:615:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:616:1: ( '{' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:616:1: ( '{' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:617:1: '{'
            {
             before(grammarAccess.getGradingAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Grading__Group__2__Impl1218); 
             after(grammarAccess.getGradingAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__Group__2__Impl"


    // $ANTLR start "rule__Grading__Group__3"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:630:1: rule__Grading__Group__3 : rule__Grading__Group__3__Impl rule__Grading__Group__4 ;
    public final void rule__Grading__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:634:1: ( rule__Grading__Group__3__Impl rule__Grading__Group__4 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:635:2: rule__Grading__Group__3__Impl rule__Grading__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__3__Impl_in_rule__Grading__Group__31249);
            rule__Grading__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__4_in_rule__Grading__Group__31252);
            rule__Grading__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__Group__3"


    // $ANTLR start "rule__Grading__Group__3__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:642:1: rule__Grading__Group__3__Impl : ( ( rule__Grading__GradingSchemeAssignment_3 ) ) ;
    public final void rule__Grading__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:646:1: ( ( ( rule__Grading__GradingSchemeAssignment_3 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:647:1: ( ( rule__Grading__GradingSchemeAssignment_3 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:647:1: ( ( rule__Grading__GradingSchemeAssignment_3 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:648:1: ( rule__Grading__GradingSchemeAssignment_3 )
            {
             before(grammarAccess.getGradingAccess().getGradingSchemeAssignment_3()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:649:1: ( rule__Grading__GradingSchemeAssignment_3 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:649:2: rule__Grading__GradingSchemeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__GradingSchemeAssignment_3_in_rule__Grading__Group__3__Impl1279);
            rule__Grading__GradingSchemeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGradingAccess().getGradingSchemeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__Group__3__Impl"


    // $ANTLR start "rule__Grading__Group__4"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:659:1: rule__Grading__Group__4 : rule__Grading__Group__4__Impl rule__Grading__Group__5 ;
    public final void rule__Grading__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:663:1: ( rule__Grading__Group__4__Impl rule__Grading__Group__5 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:664:2: rule__Grading__Group__4__Impl rule__Grading__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__4__Impl_in_rule__Grading__Group__41309);
            rule__Grading__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__5_in_rule__Grading__Group__41312);
            rule__Grading__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__Group__4"


    // $ANTLR start "rule__Grading__Group__4__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:671:1: rule__Grading__Group__4__Impl : ( ( ( rule__Grading__TasksAssignment_4 ) ) ( ( rule__Grading__TasksAssignment_4 )* ) ) ;
    public final void rule__Grading__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:675:1: ( ( ( ( rule__Grading__TasksAssignment_4 ) ) ( ( rule__Grading__TasksAssignment_4 )* ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:676:1: ( ( ( rule__Grading__TasksAssignment_4 ) ) ( ( rule__Grading__TasksAssignment_4 )* ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:676:1: ( ( ( rule__Grading__TasksAssignment_4 ) ) ( ( rule__Grading__TasksAssignment_4 )* ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:677:1: ( ( rule__Grading__TasksAssignment_4 ) ) ( ( rule__Grading__TasksAssignment_4 )* )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:677:1: ( ( rule__Grading__TasksAssignment_4 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:678:1: ( rule__Grading__TasksAssignment_4 )
            {
             before(grammarAccess.getGradingAccess().getTasksAssignment_4()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:679:1: ( rule__Grading__TasksAssignment_4 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:679:2: rule__Grading__TasksAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__TasksAssignment_4_in_rule__Grading__Group__4__Impl1341);
            rule__Grading__TasksAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGradingAccess().getTasksAssignment_4()); 

            }

            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:682:1: ( ( rule__Grading__TasksAssignment_4 )* )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:683:1: ( rule__Grading__TasksAssignment_4 )*
            {
             before(grammarAccess.getGradingAccess().getTasksAssignment_4()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:684:1: ( rule__Grading__TasksAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:684:2: rule__Grading__TasksAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Grading__TasksAssignment_4_in_rule__Grading__Group__4__Impl1353);
            	    rule__Grading__TasksAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getGradingAccess().getTasksAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__Group__4__Impl"


    // $ANTLR start "rule__Grading__Group__5"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:695:1: rule__Grading__Group__5 : rule__Grading__Group__5__Impl ;
    public final void rule__Grading__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:699:1: ( rule__Grading__Group__5__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:700:2: rule__Grading__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__5__Impl_in_rule__Grading__Group__51386);
            rule__Grading__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__Group__5"


    // $ANTLR start "rule__Grading__Group__5__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:706:1: rule__Grading__Group__5__Impl : ( '}' ) ;
    public final void rule__Grading__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:710:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:711:1: ( '}' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:711:1: ( '}' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:712:1: '}'
            {
             before(grammarAccess.getGradingAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Grading__Group__5__Impl1414); 
             after(grammarAccess.getGradingAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__Group__5__Impl"


    // $ANTLR start "rule__GradingScheme__Group__0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:737:1: rule__GradingScheme__Group__0 : rule__GradingScheme__Group__0__Impl rule__GradingScheme__Group__1 ;
    public final void rule__GradingScheme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:741:1: ( rule__GradingScheme__Group__0__Impl rule__GradingScheme__Group__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:742:2: rule__GradingScheme__Group__0__Impl rule__GradingScheme__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__0__Impl_in_rule__GradingScheme__Group__01457);
            rule__GradingScheme__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__1_in_rule__GradingScheme__Group__01460);
            rule__GradingScheme__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__0"


    // $ANTLR start "rule__GradingScheme__Group__0__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:749:1: rule__GradingScheme__Group__0__Impl : ( 'grading scheme' ) ;
    public final void rule__GradingScheme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:753:1: ( ( 'grading scheme' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:754:1: ( 'grading scheme' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:754:1: ( 'grading scheme' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:755:1: 'grading scheme'
            {
             before(grammarAccess.getGradingSchemeAccess().getGradingSchemeKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__GradingScheme__Group__0__Impl1488); 
             after(grammarAccess.getGradingSchemeAccess().getGradingSchemeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__0__Impl"


    // $ANTLR start "rule__GradingScheme__Group__1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:768:1: rule__GradingScheme__Group__1 : rule__GradingScheme__Group__1__Impl rule__GradingScheme__Group__2 ;
    public final void rule__GradingScheme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:772:1: ( rule__GradingScheme__Group__1__Impl rule__GradingScheme__Group__2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:773:2: rule__GradingScheme__Group__1__Impl rule__GradingScheme__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__1__Impl_in_rule__GradingScheme__Group__11519);
            rule__GradingScheme__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__2_in_rule__GradingScheme__Group__11522);
            rule__GradingScheme__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__1"


    // $ANTLR start "rule__GradingScheme__Group__1__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:780:1: rule__GradingScheme__Group__1__Impl : ( '(' ) ;
    public final void rule__GradingScheme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:784:1: ( ( '(' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:785:1: ( '(' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:785:1: ( '(' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:786:1: '('
            {
             before(grammarAccess.getGradingSchemeAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__GradingScheme__Group__1__Impl1550); 
             after(grammarAccess.getGradingSchemeAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__1__Impl"


    // $ANTLR start "rule__GradingScheme__Group__2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:799:1: rule__GradingScheme__Group__2 : rule__GradingScheme__Group__2__Impl rule__GradingScheme__Group__3 ;
    public final void rule__GradingScheme__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:803:1: ( rule__GradingScheme__Group__2__Impl rule__GradingScheme__Group__3 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:804:2: rule__GradingScheme__Group__2__Impl rule__GradingScheme__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__2__Impl_in_rule__GradingScheme__Group__21581);
            rule__GradingScheme__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__3_in_rule__GradingScheme__Group__21584);
            rule__GradingScheme__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__2"


    // $ANTLR start "rule__GradingScheme__Group__2__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:811:1: rule__GradingScheme__Group__2__Impl : ( ( rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2 ) ) ;
    public final void rule__GradingScheme__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:815:1: ( ( ( rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:816:1: ( ( rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:816:1: ( ( rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:817:1: ( rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2 )
            {
             before(grammarAccess.getGradingSchemeAccess().getMinRequirementNotFulfilledGradeAssignment_2()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:818:1: ( rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:818:2: rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2_in_rule__GradingScheme__Group__2__Impl1611);
            rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGradingSchemeAccess().getMinRequirementNotFulfilledGradeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__2__Impl"


    // $ANTLR start "rule__GradingScheme__Group__3"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:828:1: rule__GradingScheme__Group__3 : rule__GradingScheme__Group__3__Impl rule__GradingScheme__Group__4 ;
    public final void rule__GradingScheme__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:832:1: ( rule__GradingScheme__Group__3__Impl rule__GradingScheme__Group__4 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:833:2: rule__GradingScheme__Group__3__Impl rule__GradingScheme__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__3__Impl_in_rule__GradingScheme__Group__31641);
            rule__GradingScheme__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__4_in_rule__GradingScheme__Group__31644);
            rule__GradingScheme__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__3"


    // $ANTLR start "rule__GradingScheme__Group__3__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:840:1: rule__GradingScheme__Group__3__Impl : ( ')' ) ;
    public final void rule__GradingScheme__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:844:1: ( ( ')' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:845:1: ( ')' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:845:1: ( ')' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:846:1: ')'
            {
             before(grammarAccess.getGradingSchemeAccess().getRightParenthesisKeyword_3()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__GradingScheme__Group__3__Impl1672); 
             after(grammarAccess.getGradingSchemeAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__3__Impl"


    // $ANTLR start "rule__GradingScheme__Group__4"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:859:1: rule__GradingScheme__Group__4 : rule__GradingScheme__Group__4__Impl rule__GradingScheme__Group__5 ;
    public final void rule__GradingScheme__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:863:1: ( rule__GradingScheme__Group__4__Impl rule__GradingScheme__Group__5 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:864:2: rule__GradingScheme__Group__4__Impl rule__GradingScheme__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__4__Impl_in_rule__GradingScheme__Group__41703);
            rule__GradingScheme__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__5_in_rule__GradingScheme__Group__41706);
            rule__GradingScheme__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__4"


    // $ANTLR start "rule__GradingScheme__Group__4__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:871:1: rule__GradingScheme__Group__4__Impl : ( '{' ) ;
    public final void rule__GradingScheme__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:875:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:876:1: ( '{' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:876:1: ( '{' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:877:1: '{'
            {
             before(grammarAccess.getGradingSchemeAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__GradingScheme__Group__4__Impl1734); 
             after(grammarAccess.getGradingSchemeAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__4__Impl"


    // $ANTLR start "rule__GradingScheme__Group__5"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:890:1: rule__GradingScheme__Group__5 : rule__GradingScheme__Group__5__Impl rule__GradingScheme__Group__6 ;
    public final void rule__GradingScheme__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:894:1: ( rule__GradingScheme__Group__5__Impl rule__GradingScheme__Group__6 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:895:2: rule__GradingScheme__Group__5__Impl rule__GradingScheme__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__5__Impl_in_rule__GradingScheme__Group__51765);
            rule__GradingScheme__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__6_in_rule__GradingScheme__Group__51768);
            rule__GradingScheme__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__5"


    // $ANTLR start "rule__GradingScheme__Group__5__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:902:1: rule__GradingScheme__Group__5__Impl : ( ( ( rule__GradingScheme__GradesAssignment_5 ) ) ( ( rule__GradingScheme__GradesAssignment_5 )* ) ) ;
    public final void rule__GradingScheme__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:906:1: ( ( ( ( rule__GradingScheme__GradesAssignment_5 ) ) ( ( rule__GradingScheme__GradesAssignment_5 )* ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:907:1: ( ( ( rule__GradingScheme__GradesAssignment_5 ) ) ( ( rule__GradingScheme__GradesAssignment_5 )* ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:907:1: ( ( ( rule__GradingScheme__GradesAssignment_5 ) ) ( ( rule__GradingScheme__GradesAssignment_5 )* ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:908:1: ( ( rule__GradingScheme__GradesAssignment_5 ) ) ( ( rule__GradingScheme__GradesAssignment_5 )* )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:908:1: ( ( rule__GradingScheme__GradesAssignment_5 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:909:1: ( rule__GradingScheme__GradesAssignment_5 )
            {
             before(grammarAccess.getGradingSchemeAccess().getGradesAssignment_5()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:910:1: ( rule__GradingScheme__GradesAssignment_5 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:910:2: rule__GradingScheme__GradesAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__GradesAssignment_5_in_rule__GradingScheme__Group__5__Impl1797);
            rule__GradingScheme__GradesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGradingSchemeAccess().getGradesAssignment_5()); 

            }

            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:913:1: ( ( rule__GradingScheme__GradesAssignment_5 )* )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:914:1: ( rule__GradingScheme__GradesAssignment_5 )*
            {
             before(grammarAccess.getGradingSchemeAccess().getGradesAssignment_5()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:915:1: ( rule__GradingScheme__GradesAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:915:2: rule__GradingScheme__GradesAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__GradesAssignment_5_in_rule__GradingScheme__Group__5__Impl1809);
            	    rule__GradingScheme__GradesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getGradingSchemeAccess().getGradesAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__5__Impl"


    // $ANTLR start "rule__GradingScheme__Group__6"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:926:1: rule__GradingScheme__Group__6 : rule__GradingScheme__Group__6__Impl ;
    public final void rule__GradingScheme__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:930:1: ( rule__GradingScheme__Group__6__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:931:2: rule__GradingScheme__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__6__Impl_in_rule__GradingScheme__Group__61842);
            rule__GradingScheme__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__6"


    // $ANTLR start "rule__GradingScheme__Group__6__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:937:1: rule__GradingScheme__Group__6__Impl : ( '}' ) ;
    public final void rule__GradingScheme__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:941:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:942:1: ( '}' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:942:1: ( '}' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:943:1: '}'
            {
             before(grammarAccess.getGradingSchemeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__GradingScheme__Group__6__Impl1870); 
             after(grammarAccess.getGradingSchemeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__6__Impl"


    // $ANTLR start "rule__Grade__Group__0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:970:1: rule__Grade__Group__0 : rule__Grade__Group__0__Impl rule__Grade__Group__1 ;
    public final void rule__Grade__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:974:1: ( rule__Grade__Group__0__Impl rule__Grade__Group__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:975:2: rule__Grade__Group__0__Impl rule__Grade__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grade__Group__0__Impl_in_rule__Grade__Group__01915);
            rule__Grade__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grade__Group__1_in_rule__Grade__Group__01918);
            rule__Grade__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grade__Group__0"


    // $ANTLR start "rule__Grade__Group__0__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:982:1: rule__Grade__Group__0__Impl : ( ( rule__Grade__NameAssignment_0 ) ) ;
    public final void rule__Grade__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:986:1: ( ( ( rule__Grade__NameAssignment_0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:987:1: ( ( rule__Grade__NameAssignment_0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:987:1: ( ( rule__Grade__NameAssignment_0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:988:1: ( rule__Grade__NameAssignment_0 )
            {
             before(grammarAccess.getGradeAccess().getNameAssignment_0()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:989:1: ( rule__Grade__NameAssignment_0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:989:2: rule__Grade__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grade__NameAssignment_0_in_rule__Grade__Group__0__Impl1945);
            rule__Grade__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGradeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grade__Group__0__Impl"


    // $ANTLR start "rule__Grade__Group__1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:999:1: rule__Grade__Group__1 : rule__Grade__Group__1__Impl rule__Grade__Group__2 ;
    public final void rule__Grade__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1003:1: ( rule__Grade__Group__1__Impl rule__Grade__Group__2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1004:2: rule__Grade__Group__1__Impl rule__Grade__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grade__Group__1__Impl_in_rule__Grade__Group__11975);
            rule__Grade__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grade__Group__2_in_rule__Grade__Group__11978);
            rule__Grade__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grade__Group__1"


    // $ANTLR start "rule__Grade__Group__1__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1011:1: rule__Grade__Group__1__Impl : ( ':' ) ;
    public final void rule__Grade__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1015:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1016:1: ( ':' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1016:1: ( ':' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1017:1: ':'
            {
             before(grammarAccess.getGradeAccess().getColonKeyword_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Grade__Group__1__Impl2006); 
             after(grammarAccess.getGradeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grade__Group__1__Impl"


    // $ANTLR start "rule__Grade__Group__2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1030:1: rule__Grade__Group__2 : rule__Grade__Group__2__Impl rule__Grade__Group__3 ;
    public final void rule__Grade__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1034:1: ( rule__Grade__Group__2__Impl rule__Grade__Group__3 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1035:2: rule__Grade__Group__2__Impl rule__Grade__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grade__Group__2__Impl_in_rule__Grade__Group__22037);
            rule__Grade__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grade__Group__3_in_rule__Grade__Group__22040);
            rule__Grade__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grade__Group__2"


    // $ANTLR start "rule__Grade__Group__2__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1042:1: rule__Grade__Group__2__Impl : ( ( rule__Grade__RequiredPointsAssignment_2 ) ) ;
    public final void rule__Grade__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1046:1: ( ( ( rule__Grade__RequiredPointsAssignment_2 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1047:1: ( ( rule__Grade__RequiredPointsAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1047:1: ( ( rule__Grade__RequiredPointsAssignment_2 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1048:1: ( rule__Grade__RequiredPointsAssignment_2 )
            {
             before(grammarAccess.getGradeAccess().getRequiredPointsAssignment_2()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1049:1: ( rule__Grade__RequiredPointsAssignment_2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1049:2: rule__Grade__RequiredPointsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grade__RequiredPointsAssignment_2_in_rule__Grade__Group__2__Impl2067);
            rule__Grade__RequiredPointsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGradeAccess().getRequiredPointsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grade__Group__2__Impl"


    // $ANTLR start "rule__Grade__Group__3"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1059:1: rule__Grade__Group__3 : rule__Grade__Group__3__Impl ;
    public final void rule__Grade__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1063:1: ( rule__Grade__Group__3__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1064:2: rule__Grade__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grade__Group__3__Impl_in_rule__Grade__Group__32097);
            rule__Grade__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grade__Group__3"


    // $ANTLR start "rule__Grade__Group__3__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1070:1: rule__Grade__Group__3__Impl : ( ';' ) ;
    public final void rule__Grade__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1074:1: ( ( ';' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1075:1: ( ';' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1075:1: ( ';' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1076:1: ';'
            {
             before(grammarAccess.getGradeAccess().getSemicolonKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Grade__Group__3__Impl2125); 
             after(grammarAccess.getGradeAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grade__Group__3__Impl"


    // $ANTLR start "rule__ConcreteTask__Group__0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1097:1: rule__ConcreteTask__Group__0 : rule__ConcreteTask__Group__0__Impl rule__ConcreteTask__Group__1 ;
    public final void rule__ConcreteTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1101:1: ( rule__ConcreteTask__Group__0__Impl rule__ConcreteTask__Group__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1102:2: rule__ConcreteTask__Group__0__Impl rule__ConcreteTask__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__0__Impl_in_rule__ConcreteTask__Group__02164);
            rule__ConcreteTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__1_in_rule__ConcreteTask__Group__02167);
            rule__ConcreteTask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group__0"


    // $ANTLR start "rule__ConcreteTask__Group__0__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1109:1: rule__ConcreteTask__Group__0__Impl : ( ( rule__ConcreteTask__NameAssignment_0 ) ) ;
    public final void rule__ConcreteTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1113:1: ( ( ( rule__ConcreteTask__NameAssignment_0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1114:1: ( ( rule__ConcreteTask__NameAssignment_0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1114:1: ( ( rule__ConcreteTask__NameAssignment_0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1115:1: ( rule__ConcreteTask__NameAssignment_0 )
            {
             before(grammarAccess.getConcreteTaskAccess().getNameAssignment_0()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1116:1: ( rule__ConcreteTask__NameAssignment_0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1116:2: rule__ConcreteTask__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__NameAssignment_0_in_rule__ConcreteTask__Group__0__Impl2194);
            rule__ConcreteTask__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConcreteTaskAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group__0__Impl"


    // $ANTLR start "rule__ConcreteTask__Group__1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1126:1: rule__ConcreteTask__Group__1 : rule__ConcreteTask__Group__1__Impl rule__ConcreteTask__Group__2 ;
    public final void rule__ConcreteTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1130:1: ( rule__ConcreteTask__Group__1__Impl rule__ConcreteTask__Group__2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1131:2: rule__ConcreteTask__Group__1__Impl rule__ConcreteTask__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__1__Impl_in_rule__ConcreteTask__Group__12224);
            rule__ConcreteTask__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__2_in_rule__ConcreteTask__Group__12227);
            rule__ConcreteTask__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group__1"


    // $ANTLR start "rule__ConcreteTask__Group__1__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1138:1: rule__ConcreteTask__Group__1__Impl : ( '(' ) ;
    public final void rule__ConcreteTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1142:1: ( ( '(' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1143:1: ( '(' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1143:1: ( '(' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1144:1: '('
            {
             before(grammarAccess.getConcreteTaskAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__ConcreteTask__Group__1__Impl2255); 
             after(grammarAccess.getConcreteTaskAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group__1__Impl"


    // $ANTLR start "rule__ConcreteTask__Group__2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1157:1: rule__ConcreteTask__Group__2 : rule__ConcreteTask__Group__2__Impl rule__ConcreteTask__Group__3 ;
    public final void rule__ConcreteTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1161:1: ( rule__ConcreteTask__Group__2__Impl rule__ConcreteTask__Group__3 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1162:2: rule__ConcreteTask__Group__2__Impl rule__ConcreteTask__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__2__Impl_in_rule__ConcreteTask__Group__22286);
            rule__ConcreteTask__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__3_in_rule__ConcreteTask__Group__22289);
            rule__ConcreteTask__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group__2"


    // $ANTLR start "rule__ConcreteTask__Group__2__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1169:1: rule__ConcreteTask__Group__2__Impl : ( ( rule__ConcreteTask__MaxPointsAssignment_2 ) ) ;
    public final void rule__ConcreteTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1173:1: ( ( ( rule__ConcreteTask__MaxPointsAssignment_2 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1174:1: ( ( rule__ConcreteTask__MaxPointsAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1174:1: ( ( rule__ConcreteTask__MaxPointsAssignment_2 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1175:1: ( rule__ConcreteTask__MaxPointsAssignment_2 )
            {
             before(grammarAccess.getConcreteTaskAccess().getMaxPointsAssignment_2()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1176:1: ( rule__ConcreteTask__MaxPointsAssignment_2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1176:2: rule__ConcreteTask__MaxPointsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__MaxPointsAssignment_2_in_rule__ConcreteTask__Group__2__Impl2316);
            rule__ConcreteTask__MaxPointsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConcreteTaskAccess().getMaxPointsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group__2__Impl"


    // $ANTLR start "rule__ConcreteTask__Group__3"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1186:1: rule__ConcreteTask__Group__3 : rule__ConcreteTask__Group__3__Impl rule__ConcreteTask__Group__4 ;
    public final void rule__ConcreteTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1190:1: ( rule__ConcreteTask__Group__3__Impl rule__ConcreteTask__Group__4 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1191:2: rule__ConcreteTask__Group__3__Impl rule__ConcreteTask__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__3__Impl_in_rule__ConcreteTask__Group__32346);
            rule__ConcreteTask__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__4_in_rule__ConcreteTask__Group__32349);
            rule__ConcreteTask__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group__3"


    // $ANTLR start "rule__ConcreteTask__Group__3__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1198:1: rule__ConcreteTask__Group__3__Impl : ( ')' ) ;
    public final void rule__ConcreteTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1202:1: ( ( ')' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1203:1: ( ')' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1203:1: ( ')' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1204:1: ')'
            {
             before(grammarAccess.getConcreteTaskAccess().getRightParenthesisKeyword_3()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__ConcreteTask__Group__3__Impl2377); 
             after(grammarAccess.getConcreteTaskAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group__3__Impl"


    // $ANTLR start "rule__ConcreteTask__Group__4"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1217:1: rule__ConcreteTask__Group__4 : rule__ConcreteTask__Group__4__Impl rule__ConcreteTask__Group__5 ;
    public final void rule__ConcreteTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1221:1: ( rule__ConcreteTask__Group__4__Impl rule__ConcreteTask__Group__5 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1222:2: rule__ConcreteTask__Group__4__Impl rule__ConcreteTask__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__4__Impl_in_rule__ConcreteTask__Group__42408);
            rule__ConcreteTask__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__5_in_rule__ConcreteTask__Group__42411);
            rule__ConcreteTask__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group__4"


    // $ANTLR start "rule__ConcreteTask__Group__4__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1229:1: rule__ConcreteTask__Group__4__Impl : ( ( rule__ConcreteTask__Group_4__0 )? ) ;
    public final void rule__ConcreteTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1233:1: ( ( ( rule__ConcreteTask__Group_4__0 )? ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1234:1: ( ( rule__ConcreteTask__Group_4__0 )? )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1234:1: ( ( rule__ConcreteTask__Group_4__0 )? )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1235:1: ( rule__ConcreteTask__Group_4__0 )?
            {
             before(grammarAccess.getConcreteTaskAccess().getGroup_4()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1236:1: ( rule__ConcreteTask__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1236:2: rule__ConcreteTask__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group_4__0_in_rule__ConcreteTask__Group__4__Impl2438);
                    rule__ConcreteTask__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConcreteTaskAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group__4__Impl"


    // $ANTLR start "rule__ConcreteTask__Group__5"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1246:1: rule__ConcreteTask__Group__5 : rule__ConcreteTask__Group__5__Impl ;
    public final void rule__ConcreteTask__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1250:1: ( rule__ConcreteTask__Group__5__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1251:2: rule__ConcreteTask__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__5__Impl_in_rule__ConcreteTask__Group__52469);
            rule__ConcreteTask__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group__5"


    // $ANTLR start "rule__ConcreteTask__Group__5__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1257:1: rule__ConcreteTask__Group__5__Impl : ( ';' ) ;
    public final void rule__ConcreteTask__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1261:1: ( ( ';' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1262:1: ( ';' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1262:1: ( ';' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1263:1: ';'
            {
             before(grammarAccess.getConcreteTaskAccess().getSemicolonKeyword_5()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__ConcreteTask__Group__5__Impl2497); 
             after(grammarAccess.getConcreteTaskAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group__5__Impl"


    // $ANTLR start "rule__ConcreteTask__Group_4__0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1288:1: rule__ConcreteTask__Group_4__0 : rule__ConcreteTask__Group_4__0__Impl rule__ConcreteTask__Group_4__1 ;
    public final void rule__ConcreteTask__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1292:1: ( rule__ConcreteTask__Group_4__0__Impl rule__ConcreteTask__Group_4__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1293:2: rule__ConcreteTask__Group_4__0__Impl rule__ConcreteTask__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group_4__0__Impl_in_rule__ConcreteTask__Group_4__02540);
            rule__ConcreteTask__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group_4__1_in_rule__ConcreteTask__Group_4__02543);
            rule__ConcreteTask__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group_4__0"


    // $ANTLR start "rule__ConcreteTask__Group_4__0__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1300:1: rule__ConcreteTask__Group_4__0__Impl : ( ':' ) ;
    public final void rule__ConcreteTask__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1304:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1305:1: ( ':' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1305:1: ( ':' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1306:1: ':'
            {
             before(grammarAccess.getConcreteTaskAccess().getColonKeyword_4_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__ConcreteTask__Group_4__0__Impl2571); 
             after(grammarAccess.getConcreteTaskAccess().getColonKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group_4__0__Impl"


    // $ANTLR start "rule__ConcreteTask__Group_4__1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1319:1: rule__ConcreteTask__Group_4__1 : rule__ConcreteTask__Group_4__1__Impl ;
    public final void rule__ConcreteTask__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1323:1: ( rule__ConcreteTask__Group_4__1__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1324:2: rule__ConcreteTask__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group_4__1__Impl_in_rule__ConcreteTask__Group_4__12602);
            rule__ConcreteTask__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group_4__1"


    // $ANTLR start "rule__ConcreteTask__Group_4__1__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1330:1: rule__ConcreteTask__Group_4__1__Impl : ( ( rule__ConcreteTask__MinRequirementAssignment_4_1 ) ) ;
    public final void rule__ConcreteTask__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1334:1: ( ( ( rule__ConcreteTask__MinRequirementAssignment_4_1 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1335:1: ( ( rule__ConcreteTask__MinRequirementAssignment_4_1 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1335:1: ( ( rule__ConcreteTask__MinRequirementAssignment_4_1 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1336:1: ( rule__ConcreteTask__MinRequirementAssignment_4_1 )
            {
             before(grammarAccess.getConcreteTaskAccess().getMinRequirementAssignment_4_1()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1337:1: ( rule__ConcreteTask__MinRequirementAssignment_4_1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1337:2: rule__ConcreteTask__MinRequirementAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__MinRequirementAssignment_4_1_in_rule__ConcreteTask__Group_4__1__Impl2629);
            rule__ConcreteTask__MinRequirementAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConcreteTaskAccess().getMinRequirementAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group_4__1__Impl"


    // $ANTLR start "rule__TaskGroup__Group__0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1351:1: rule__TaskGroup__Group__0 : rule__TaskGroup__Group__0__Impl rule__TaskGroup__Group__1 ;
    public final void rule__TaskGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1355:1: ( rule__TaskGroup__Group__0__Impl rule__TaskGroup__Group__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1356:2: rule__TaskGroup__Group__0__Impl rule__TaskGroup__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__0__Impl_in_rule__TaskGroup__Group__02663);
            rule__TaskGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__1_in_rule__TaskGroup__Group__02666);
            rule__TaskGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group__0"


    // $ANTLR start "rule__TaskGroup__Group__0__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1363:1: rule__TaskGroup__Group__0__Impl : ( ( rule__TaskGroup__NameAssignment_0 ) ) ;
    public final void rule__TaskGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1367:1: ( ( ( rule__TaskGroup__NameAssignment_0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1368:1: ( ( rule__TaskGroup__NameAssignment_0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1368:1: ( ( rule__TaskGroup__NameAssignment_0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1369:1: ( rule__TaskGroup__NameAssignment_0 )
            {
             before(grammarAccess.getTaskGroupAccess().getNameAssignment_0()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1370:1: ( rule__TaskGroup__NameAssignment_0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1370:2: rule__TaskGroup__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__NameAssignment_0_in_rule__TaskGroup__Group__0__Impl2693);
            rule__TaskGroup__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTaskGroupAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group__0__Impl"


    // $ANTLR start "rule__TaskGroup__Group__1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1380:1: rule__TaskGroup__Group__1 : rule__TaskGroup__Group__1__Impl rule__TaskGroup__Group__2 ;
    public final void rule__TaskGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1384:1: ( rule__TaskGroup__Group__1__Impl rule__TaskGroup__Group__2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1385:2: rule__TaskGroup__Group__1__Impl rule__TaskGroup__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__1__Impl_in_rule__TaskGroup__Group__12723);
            rule__TaskGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__2_in_rule__TaskGroup__Group__12726);
            rule__TaskGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group__1"


    // $ANTLR start "rule__TaskGroup__Group__1__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1392:1: rule__TaskGroup__Group__1__Impl : ( '{' ) ;
    public final void rule__TaskGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1396:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1397:1: ( '{' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1397:1: ( '{' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1398:1: '{'
            {
             before(grammarAccess.getTaskGroupAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__TaskGroup__Group__1__Impl2754); 
             after(grammarAccess.getTaskGroupAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group__1__Impl"


    // $ANTLR start "rule__TaskGroup__Group__2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1411:1: rule__TaskGroup__Group__2 : rule__TaskGroup__Group__2__Impl rule__TaskGroup__Group__3 ;
    public final void rule__TaskGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1415:1: ( rule__TaskGroup__Group__2__Impl rule__TaskGroup__Group__3 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1416:2: rule__TaskGroup__Group__2__Impl rule__TaskGroup__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__2__Impl_in_rule__TaskGroup__Group__22785);
            rule__TaskGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__3_in_rule__TaskGroup__Group__22788);
            rule__TaskGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group__2"


    // $ANTLR start "rule__TaskGroup__Group__2__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1423:1: rule__TaskGroup__Group__2__Impl : ( ( ( rule__TaskGroup__ContainsAssignment_2 ) ) ( ( rule__TaskGroup__ContainsAssignment_2 )* ) ) ;
    public final void rule__TaskGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1427:1: ( ( ( ( rule__TaskGroup__ContainsAssignment_2 ) ) ( ( rule__TaskGroup__ContainsAssignment_2 )* ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1428:1: ( ( ( rule__TaskGroup__ContainsAssignment_2 ) ) ( ( rule__TaskGroup__ContainsAssignment_2 )* ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1428:1: ( ( ( rule__TaskGroup__ContainsAssignment_2 ) ) ( ( rule__TaskGroup__ContainsAssignment_2 )* ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1429:1: ( ( rule__TaskGroup__ContainsAssignment_2 ) ) ( ( rule__TaskGroup__ContainsAssignment_2 )* )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1429:1: ( ( rule__TaskGroup__ContainsAssignment_2 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1430:1: ( rule__TaskGroup__ContainsAssignment_2 )
            {
             before(grammarAccess.getTaskGroupAccess().getContainsAssignment_2()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1431:1: ( rule__TaskGroup__ContainsAssignment_2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1431:2: rule__TaskGroup__ContainsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__ContainsAssignment_2_in_rule__TaskGroup__Group__2__Impl2817);
            rule__TaskGroup__ContainsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskGroupAccess().getContainsAssignment_2()); 

            }

            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1434:1: ( ( rule__TaskGroup__ContainsAssignment_2 )* )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1435:1: ( rule__TaskGroup__ContainsAssignment_2 )*
            {
             before(grammarAccess.getTaskGroupAccess().getContainsAssignment_2()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1436:1: ( rule__TaskGroup__ContainsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1436:2: rule__TaskGroup__ContainsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__ContainsAssignment_2_in_rule__TaskGroup__Group__2__Impl2829);
            	    rule__TaskGroup__ContainsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTaskGroupAccess().getContainsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group__2__Impl"


    // $ANTLR start "rule__TaskGroup__Group__3"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1447:1: rule__TaskGroup__Group__3 : rule__TaskGroup__Group__3__Impl rule__TaskGroup__Group__4 ;
    public final void rule__TaskGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1451:1: ( rule__TaskGroup__Group__3__Impl rule__TaskGroup__Group__4 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1452:2: rule__TaskGroup__Group__3__Impl rule__TaskGroup__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__3__Impl_in_rule__TaskGroup__Group__32862);
            rule__TaskGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__4_in_rule__TaskGroup__Group__32865);
            rule__TaskGroup__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group__3"


    // $ANTLR start "rule__TaskGroup__Group__3__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1459:1: rule__TaskGroup__Group__3__Impl : ( ( rule__TaskGroup__Group_3__0 )? ) ;
    public final void rule__TaskGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1463:1: ( ( ( rule__TaskGroup__Group_3__0 )? ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1464:1: ( ( rule__TaskGroup__Group_3__0 )? )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1464:1: ( ( rule__TaskGroup__Group_3__0 )? )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1465:1: ( rule__TaskGroup__Group_3__0 )?
            {
             before(grammarAccess.getTaskGroupAccess().getGroup_3()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1466:1: ( rule__TaskGroup__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1466:2: rule__TaskGroup__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group_3__0_in_rule__TaskGroup__Group__3__Impl2892);
                    rule__TaskGroup__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskGroupAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group__3__Impl"


    // $ANTLR start "rule__TaskGroup__Group__4"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1476:1: rule__TaskGroup__Group__4 : rule__TaskGroup__Group__4__Impl ;
    public final void rule__TaskGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1480:1: ( rule__TaskGroup__Group__4__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1481:2: rule__TaskGroup__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__4__Impl_in_rule__TaskGroup__Group__42923);
            rule__TaskGroup__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group__4"


    // $ANTLR start "rule__TaskGroup__Group__4__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1487:1: rule__TaskGroup__Group__4__Impl : ( '}' ) ;
    public final void rule__TaskGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1491:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1492:1: ( '}' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1492:1: ( '}' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1493:1: '}'
            {
             before(grammarAccess.getTaskGroupAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TaskGroup__Group__4__Impl2951); 
             after(grammarAccess.getTaskGroupAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group__4__Impl"


    // $ANTLR start "rule__TaskGroup__Group_3__0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1516:1: rule__TaskGroup__Group_3__0 : rule__TaskGroup__Group_3__0__Impl rule__TaskGroup__Group_3__1 ;
    public final void rule__TaskGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1520:1: ( rule__TaskGroup__Group_3__0__Impl rule__TaskGroup__Group_3__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1521:2: rule__TaskGroup__Group_3__0__Impl rule__TaskGroup__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group_3__0__Impl_in_rule__TaskGroup__Group_3__02992);
            rule__TaskGroup__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group_3__1_in_rule__TaskGroup__Group_3__02995);
            rule__TaskGroup__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group_3__0"


    // $ANTLR start "rule__TaskGroup__Group_3__0__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1528:1: rule__TaskGroup__Group_3__0__Impl : ( '@all' ) ;
    public final void rule__TaskGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1532:1: ( ( '@all' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1533:1: ( '@all' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1533:1: ( '@all' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1534:1: '@all'
            {
             before(grammarAccess.getTaskGroupAccess().getAllKeyword_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TaskGroup__Group_3__0__Impl3023); 
             after(grammarAccess.getTaskGroupAccess().getAllKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group_3__0__Impl"


    // $ANTLR start "rule__TaskGroup__Group_3__1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1547:1: rule__TaskGroup__Group_3__1 : rule__TaskGroup__Group_3__1__Impl rule__TaskGroup__Group_3__2 ;
    public final void rule__TaskGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1551:1: ( rule__TaskGroup__Group_3__1__Impl rule__TaskGroup__Group_3__2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1552:2: rule__TaskGroup__Group_3__1__Impl rule__TaskGroup__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group_3__1__Impl_in_rule__TaskGroup__Group_3__13054);
            rule__TaskGroup__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group_3__2_in_rule__TaskGroup__Group_3__13057);
            rule__TaskGroup__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group_3__1"


    // $ANTLR start "rule__TaskGroup__Group_3__1__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1559:1: rule__TaskGroup__Group_3__1__Impl : ( ':' ) ;
    public final void rule__TaskGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1563:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1564:1: ( ':' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1564:1: ( ':' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1565:1: ':'
            {
             before(grammarAccess.getTaskGroupAccess().getColonKeyword_3_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__TaskGroup__Group_3__1__Impl3085); 
             after(grammarAccess.getTaskGroupAccess().getColonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group_3__1__Impl"


    // $ANTLR start "rule__TaskGroup__Group_3__2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1578:1: rule__TaskGroup__Group_3__2 : rule__TaskGroup__Group_3__2__Impl rule__TaskGroup__Group_3__3 ;
    public final void rule__TaskGroup__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1582:1: ( rule__TaskGroup__Group_3__2__Impl rule__TaskGroup__Group_3__3 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1583:2: rule__TaskGroup__Group_3__2__Impl rule__TaskGroup__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group_3__2__Impl_in_rule__TaskGroup__Group_3__23116);
            rule__TaskGroup__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group_3__3_in_rule__TaskGroup__Group_3__23119);
            rule__TaskGroup__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group_3__2"


    // $ANTLR start "rule__TaskGroup__Group_3__2__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1590:1: rule__TaskGroup__Group_3__2__Impl : ( ( rule__TaskGroup__MinRequirementAssignment_3_2 ) ) ;
    public final void rule__TaskGroup__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1594:1: ( ( ( rule__TaskGroup__MinRequirementAssignment_3_2 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1595:1: ( ( rule__TaskGroup__MinRequirementAssignment_3_2 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1595:1: ( ( rule__TaskGroup__MinRequirementAssignment_3_2 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1596:1: ( rule__TaskGroup__MinRequirementAssignment_3_2 )
            {
             before(grammarAccess.getTaskGroupAccess().getMinRequirementAssignment_3_2()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1597:1: ( rule__TaskGroup__MinRequirementAssignment_3_2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1597:2: rule__TaskGroup__MinRequirementAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__MinRequirementAssignment_3_2_in_rule__TaskGroup__Group_3__2__Impl3146);
            rule__TaskGroup__MinRequirementAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskGroupAccess().getMinRequirementAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group_3__2__Impl"


    // $ANTLR start "rule__TaskGroup__Group_3__3"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1607:1: rule__TaskGroup__Group_3__3 : rule__TaskGroup__Group_3__3__Impl ;
    public final void rule__TaskGroup__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1611:1: ( rule__TaskGroup__Group_3__3__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1612:2: rule__TaskGroup__Group_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group_3__3__Impl_in_rule__TaskGroup__Group_3__33176);
            rule__TaskGroup__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group_3__3"


    // $ANTLR start "rule__TaskGroup__Group_3__3__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1618:1: rule__TaskGroup__Group_3__3__Impl : ( ';' ) ;
    public final void rule__TaskGroup__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1622:1: ( ( ';' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1623:1: ( ';' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1623:1: ( ';' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1624:1: ';'
            {
             before(grammarAccess.getTaskGroupAccess().getSemicolonKeyword_3_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TaskGroup__Group_3__3__Impl3204); 
             after(grammarAccess.getTaskGroupAccess().getSemicolonKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group_3__3__Impl"


    // $ANTLR start "rule__MinRequirement__Group__0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1645:1: rule__MinRequirement__Group__0 : rule__MinRequirement__Group__0__Impl rule__MinRequirement__Group__1 ;
    public final void rule__MinRequirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1649:1: ( rule__MinRequirement__Group__0__Impl rule__MinRequirement__Group__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1650:2: rule__MinRequirement__Group__0__Impl rule__MinRequirement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__Group__0__Impl_in_rule__MinRequirement__Group__03243);
            rule__MinRequirement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__Group__1_in_rule__MinRequirement__Group__03246);
            rule__MinRequirement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinRequirement__Group__0"


    // $ANTLR start "rule__MinRequirement__Group__0__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1657:1: rule__MinRequirement__Group__0__Impl : ( 'min' ) ;
    public final void rule__MinRequirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1661:1: ( ( 'min' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1662:1: ( 'min' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1662:1: ( 'min' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1663:1: 'min'
            {
             before(grammarAccess.getMinRequirementAccess().getMinKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MinRequirement__Group__0__Impl3274); 
             after(grammarAccess.getMinRequirementAccess().getMinKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinRequirement__Group__0__Impl"


    // $ANTLR start "rule__MinRequirement__Group__1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1676:1: rule__MinRequirement__Group__1 : rule__MinRequirement__Group__1__Impl rule__MinRequirement__Group__2 ;
    public final void rule__MinRequirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1680:1: ( rule__MinRequirement__Group__1__Impl rule__MinRequirement__Group__2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1681:2: rule__MinRequirement__Group__1__Impl rule__MinRequirement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__Group__1__Impl_in_rule__MinRequirement__Group__13305);
            rule__MinRequirement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__Group__2_in_rule__MinRequirement__Group__13308);
            rule__MinRequirement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinRequirement__Group__1"


    // $ANTLR start "rule__MinRequirement__Group__1__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1688:1: rule__MinRequirement__Group__1__Impl : ( ( rule__MinRequirement__ValueAssignment_1 ) ) ;
    public final void rule__MinRequirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1692:1: ( ( ( rule__MinRequirement__ValueAssignment_1 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1693:1: ( ( rule__MinRequirement__ValueAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1693:1: ( ( rule__MinRequirement__ValueAssignment_1 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1694:1: ( rule__MinRequirement__ValueAssignment_1 )
            {
             before(grammarAccess.getMinRequirementAccess().getValueAssignment_1()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1695:1: ( rule__MinRequirement__ValueAssignment_1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1695:2: rule__MinRequirement__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__ValueAssignment_1_in_rule__MinRequirement__Group__1__Impl3335);
            rule__MinRequirement__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMinRequirementAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinRequirement__Group__1__Impl"


    // $ANTLR start "rule__MinRequirement__Group__2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1705:1: rule__MinRequirement__Group__2 : rule__MinRequirement__Group__2__Impl ;
    public final void rule__MinRequirement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1709:1: ( rule__MinRequirement__Group__2__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1710:2: rule__MinRequirement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__Group__2__Impl_in_rule__MinRequirement__Group__23365);
            rule__MinRequirement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinRequirement__Group__2"


    // $ANTLR start "rule__MinRequirement__Group__2__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1716:1: rule__MinRequirement__Group__2__Impl : ( ( rule__MinRequirement__TypeAssignment_2 ) ) ;
    public final void rule__MinRequirement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1720:1: ( ( ( rule__MinRequirement__TypeAssignment_2 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1721:1: ( ( rule__MinRequirement__TypeAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1721:1: ( ( rule__MinRequirement__TypeAssignment_2 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1722:1: ( rule__MinRequirement__TypeAssignment_2 )
            {
             before(grammarAccess.getMinRequirementAccess().getTypeAssignment_2()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1723:1: ( rule__MinRequirement__TypeAssignment_2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1723:2: rule__MinRequirement__TypeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__TypeAssignment_2_in_rule__MinRequirement__Group__2__Impl3392);
            rule__MinRequirement__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMinRequirementAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinRequirement__Group__2__Impl"


    // $ANTLR start "rule__GradingSystem__CoursesAssignment"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1740:1: rule__GradingSystem__CoursesAssignment : ( ruleCourse ) ;
    public final void rule__GradingSystem__CoursesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1744:1: ( ( ruleCourse ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1745:1: ( ruleCourse )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1745:1: ( ruleCourse )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1746:1: ruleCourse
            {
             before(grammarAccess.getGradingSystemAccess().getCoursesCourseParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourse_in_rule__GradingSystem__CoursesAssignment3433);
            ruleCourse();

            state._fsp--;

             after(grammarAccess.getGradingSystemAccess().getCoursesCourseParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingSystem__CoursesAssignment"


    // $ANTLR start "rule__Course__NameAssignment_1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1755:1: rule__Course__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Course__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1759:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1760:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1760:1: ( RULE_ID )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1761:1: RULE_ID
            {
             before(grammarAccess.getCourseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Course__NameAssignment_13464); 
             after(grammarAccess.getCourseAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__NameAssignment_1"


    // $ANTLR start "rule__Course__GradingsAssignment_3"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1770:1: rule__Course__GradingsAssignment_3 : ( ruleGrading ) ;
    public final void rule__Course__GradingsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1774:1: ( ( ruleGrading ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1775:1: ( ruleGrading )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1775:1: ( ruleGrading )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1776:1: ruleGrading
            {
             before(grammarAccess.getCourseAccess().getGradingsGradingParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrading_in_rule__Course__GradingsAssignment_33495);
            ruleGrading();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getGradingsGradingParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__GradingsAssignment_3"


    // $ANTLR start "rule__Grading__SemesterAssignment_1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1785:1: rule__Grading__SemesterAssignment_1 : ( RULE_ID ) ;
    public final void rule__Grading__SemesterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1789:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1790:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1790:1: ( RULE_ID )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1791:1: RULE_ID
            {
             before(grammarAccess.getGradingAccess().getSemesterIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Grading__SemesterAssignment_13526); 
             after(grammarAccess.getGradingAccess().getSemesterIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__SemesterAssignment_1"


    // $ANTLR start "rule__Grading__GradingSchemeAssignment_3"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1800:1: rule__Grading__GradingSchemeAssignment_3 : ( ruleGradingScheme ) ;
    public final void rule__Grading__GradingSchemeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1804:1: ( ( ruleGradingScheme ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1805:1: ( ruleGradingScheme )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1805:1: ( ruleGradingScheme )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1806:1: ruleGradingScheme
            {
             before(grammarAccess.getGradingAccess().getGradingSchemeGradingSchemeParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGradingScheme_in_rule__Grading__GradingSchemeAssignment_33557);
            ruleGradingScheme();

            state._fsp--;

             after(grammarAccess.getGradingAccess().getGradingSchemeGradingSchemeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__GradingSchemeAssignment_3"


    // $ANTLR start "rule__Grading__TasksAssignment_4"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1815:1: rule__Grading__TasksAssignment_4 : ( ruleTask ) ;
    public final void rule__Grading__TasksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1819:1: ( ( ruleTask ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1820:1: ( ruleTask )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1820:1: ( ruleTask )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1821:1: ruleTask
            {
             before(grammarAccess.getGradingAccess().getTasksTaskParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTask_in_rule__Grading__TasksAssignment_43588);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getGradingAccess().getTasksTaskParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__TasksAssignment_4"


    // $ANTLR start "rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1830:1: rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1834:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1835:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1835:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1836:1: ( RULE_ID )
            {
             before(grammarAccess.getGradingSchemeAccess().getMinRequirementNotFulfilledGradeGradeCrossReference_2_0()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1837:1: ( RULE_ID )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1838:1: RULE_ID
            {
             before(grammarAccess.getGradingSchemeAccess().getMinRequirementNotFulfilledGradeGradeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_23623); 
             after(grammarAccess.getGradingSchemeAccess().getMinRequirementNotFulfilledGradeGradeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getGradingSchemeAccess().getMinRequirementNotFulfilledGradeGradeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2"


    // $ANTLR start "rule__GradingScheme__GradesAssignment_5"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1849:1: rule__GradingScheme__GradesAssignment_5 : ( ruleGrade ) ;
    public final void rule__GradingScheme__GradesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1853:1: ( ( ruleGrade ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1854:1: ( ruleGrade )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1854:1: ( ruleGrade )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1855:1: ruleGrade
            {
             before(grammarAccess.getGradingSchemeAccess().getGradesGradeParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrade_in_rule__GradingScheme__GradesAssignment_53658);
            ruleGrade();

            state._fsp--;

             after(grammarAccess.getGradingSchemeAccess().getGradesGradeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__GradesAssignment_5"


    // $ANTLR start "rule__Grade__NameAssignment_0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1864:1: rule__Grade__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Grade__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1868:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1869:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1869:1: ( RULE_ID )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1870:1: RULE_ID
            {
             before(grammarAccess.getGradeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Grade__NameAssignment_03689); 
             after(grammarAccess.getGradeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grade__NameAssignment_0"


    // $ANTLR start "rule__Grade__RequiredPointsAssignment_2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1879:1: rule__Grade__RequiredPointsAssignment_2 : ( RULE_INT ) ;
    public final void rule__Grade__RequiredPointsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1883:1: ( ( RULE_INT ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1884:1: ( RULE_INT )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1884:1: ( RULE_INT )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1885:1: RULE_INT
            {
             before(grammarAccess.getGradeAccess().getRequiredPointsINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Grade__RequiredPointsAssignment_23720); 
             after(grammarAccess.getGradeAccess().getRequiredPointsINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grade__RequiredPointsAssignment_2"


    // $ANTLR start "rule__ConcreteTask__NameAssignment_0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1894:1: rule__ConcreteTask__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ConcreteTask__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1898:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1899:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1899:1: ( RULE_ID )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1900:1: RULE_ID
            {
             before(grammarAccess.getConcreteTaskAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ConcreteTask__NameAssignment_03751); 
             after(grammarAccess.getConcreteTaskAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__NameAssignment_0"


    // $ANTLR start "rule__ConcreteTask__MaxPointsAssignment_2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1909:1: rule__ConcreteTask__MaxPointsAssignment_2 : ( RULE_INT ) ;
    public final void rule__ConcreteTask__MaxPointsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1913:1: ( ( RULE_INT ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1914:1: ( RULE_INT )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1914:1: ( RULE_INT )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1915:1: RULE_INT
            {
             before(grammarAccess.getConcreteTaskAccess().getMaxPointsINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__ConcreteTask__MaxPointsAssignment_23782); 
             after(grammarAccess.getConcreteTaskAccess().getMaxPointsINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__MaxPointsAssignment_2"


    // $ANTLR start "rule__ConcreteTask__MinRequirementAssignment_4_1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1924:1: rule__ConcreteTask__MinRequirementAssignment_4_1 : ( ruleMinRequirement ) ;
    public final void rule__ConcreteTask__MinRequirementAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1928:1: ( ( ruleMinRequirement ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1929:1: ( ruleMinRequirement )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1929:1: ( ruleMinRequirement )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1930:1: ruleMinRequirement
            {
             before(grammarAccess.getConcreteTaskAccess().getMinRequirementMinRequirementParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMinRequirement_in_rule__ConcreteTask__MinRequirementAssignment_4_13813);
            ruleMinRequirement();

            state._fsp--;

             after(grammarAccess.getConcreteTaskAccess().getMinRequirementMinRequirementParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__MinRequirementAssignment_4_1"


    // $ANTLR start "rule__TaskGroup__NameAssignment_0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1939:1: rule__TaskGroup__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TaskGroup__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1943:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1944:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1944:1: ( RULE_ID )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1945:1: RULE_ID
            {
             before(grammarAccess.getTaskGroupAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TaskGroup__NameAssignment_03844); 
             after(grammarAccess.getTaskGroupAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__NameAssignment_0"


    // $ANTLR start "rule__TaskGroup__ContainsAssignment_2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1954:1: rule__TaskGroup__ContainsAssignment_2 : ( ruleTask ) ;
    public final void rule__TaskGroup__ContainsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1958:1: ( ( ruleTask ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1959:1: ( ruleTask )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1959:1: ( ruleTask )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1960:1: ruleTask
            {
             before(grammarAccess.getTaskGroupAccess().getContainsTaskParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTask_in_rule__TaskGroup__ContainsAssignment_23875);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskGroupAccess().getContainsTaskParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__ContainsAssignment_2"


    // $ANTLR start "rule__TaskGroup__MinRequirementAssignment_3_2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1969:1: rule__TaskGroup__MinRequirementAssignment_3_2 : ( ruleMinRequirement ) ;
    public final void rule__TaskGroup__MinRequirementAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1973:1: ( ( ruleMinRequirement ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1974:1: ( ruleMinRequirement )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1974:1: ( ruleMinRequirement )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1975:1: ruleMinRequirement
            {
             before(grammarAccess.getTaskGroupAccess().getMinRequirementMinRequirementParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMinRequirement_in_rule__TaskGroup__MinRequirementAssignment_3_23906);
            ruleMinRequirement();

            state._fsp--;

             after(grammarAccess.getTaskGroupAccess().getMinRequirementMinRequirementParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__MinRequirementAssignment_3_2"


    // $ANTLR start "rule__MinRequirement__ValueAssignment_1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1984:1: rule__MinRequirement__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__MinRequirement__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1988:1: ( ( RULE_INT ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1989:1: ( RULE_INT )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1989:1: ( RULE_INT )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1990:1: RULE_INT
            {
             before(grammarAccess.getMinRequirementAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__MinRequirement__ValueAssignment_13937); 
             after(grammarAccess.getMinRequirementAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinRequirement__ValueAssignment_1"


    // $ANTLR start "rule__MinRequirement__TypeAssignment_2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1999:1: rule__MinRequirement__TypeAssignment_2 : ( ruleMinRequirementsType ) ;
    public final void rule__MinRequirement__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2003:1: ( ( ruleMinRequirementsType ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2004:1: ( ruleMinRequirementsType )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2004:1: ( ruleMinRequirementsType )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2005:1: ruleMinRequirementsType
            {
             before(grammarAccess.getMinRequirementAccess().getTypeMinRequirementsTypeEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMinRequirementsType_in_rule__MinRequirement__TypeAssignment_23968);
            ruleMinRequirementsType();

            state._fsp--;

             after(grammarAccess.getMinRequirementAccess().getTypeMinRequirementsTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinRequirement__TypeAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleGradingSystem_in_entryRuleGradingSystem61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGradingSystem68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingSystem__CoursesAssignment_in_ruleGradingSystem94 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleCourse_in_entryRuleCourse122 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCourse129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__0_in_ruleCourse155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrading_in_entryRuleGrading182 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGrading189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__Group__0_in_ruleGrading215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGradingScheme_in_entryRuleGradingScheme242 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGradingScheme249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__0_in_ruleGradingScheme275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrade_in_entryRuleGrade302 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGrade309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grade__Group__0_in_ruleGrade335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTask_in_entryRuleTask362 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTask369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Task__Alternatives_in_ruleTask395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteTask_in_entryRuleConcreteTask422 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConcreteTask429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__0_in_ruleConcreteTask455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskGroup_in_entryRuleTaskGroup482 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTaskGroup489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__0_in_ruleTaskGroup515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMinRequirement_in_entryRuleMinRequirement542 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMinRequirement549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MinRequirement__Group__0_in_ruleMinRequirement575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MinRequirementsType__Alternatives_in_ruleMinRequirementsType612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteTask_in_rule__Task__Alternatives647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskGroup_in_rule__Task__Alternatives664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__MinRequirementsType__Alternatives697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MinRequirementsType__Alternatives718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__0__Impl_in_rule__Course__Group__0751 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Course__Group__1_in_rule__Course__Group__0754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Course__Group__0__Impl782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__1__Impl_in_rule__Course__Group__1813 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Course__Group__2_in_rule__Course__Group__1816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__NameAssignment_1_in_rule__Course__Group__1__Impl843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__2__Impl_in_rule__Course__Group__2873 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__Course__Group__3_in_rule__Course__Group__2876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Course__Group__2__Impl904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__3__Impl_in_rule__Course__Group__3935 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__Course__Group__4_in_rule__Course__Group__3938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__GradingsAssignment_3_in_rule__Course__Group__3__Impl965 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Course__Group__4__Impl_in_rule__Course__Group__4996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Course__Group__4__Impl1024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__Group__0__Impl_in_rule__Grading__Group__01065 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Grading__Group__1_in_rule__Grading__Group__01068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Grading__Group__0__Impl1096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__Group__1__Impl_in_rule__Grading__Group__11127 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Grading__Group__2_in_rule__Grading__Group__11130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__SemesterAssignment_1_in_rule__Grading__Group__1__Impl1157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__Group__2__Impl_in_rule__Grading__Group__21187 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Grading__Group__3_in_rule__Grading__Group__21190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Grading__Group__2__Impl1218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__Group__3__Impl_in_rule__Grading__Group__31249 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Grading__Group__4_in_rule__Grading__Group__31252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__GradingSchemeAssignment_3_in_rule__Grading__Group__3__Impl1279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__Group__4__Impl_in_rule__Grading__Group__41309 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Grading__Group__5_in_rule__Grading__Group__41312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__TasksAssignment_4_in_rule__Grading__Group__4__Impl1341 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__Grading__TasksAssignment_4_in_rule__Grading__Group__4__Impl1353 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__Grading__Group__5__Impl_in_rule__Grading__Group__51386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Grading__Group__5__Impl1414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__0__Impl_in_rule__GradingScheme__Group__01457 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__1_in_rule__GradingScheme__Group__01460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__GradingScheme__Group__0__Impl1488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__1__Impl_in_rule__GradingScheme__Group__11519 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__2_in_rule__GradingScheme__Group__11522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__GradingScheme__Group__1__Impl1550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__2__Impl_in_rule__GradingScheme__Group__21581 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__3_in_rule__GradingScheme__Group__21584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2_in_rule__GradingScheme__Group__2__Impl1611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__3__Impl_in_rule__GradingScheme__Group__31641 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__4_in_rule__GradingScheme__Group__31644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__GradingScheme__Group__3__Impl1672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__4__Impl_in_rule__GradingScheme__Group__41703 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__5_in_rule__GradingScheme__Group__41706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__GradingScheme__Group__4__Impl1734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__5__Impl_in_rule__GradingScheme__Group__51765 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__6_in_rule__GradingScheme__Group__51768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__GradesAssignment_5_in_rule__GradingScheme__Group__5__Impl1797 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__GradingScheme__GradesAssignment_5_in_rule__GradingScheme__Group__5__Impl1809 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__6__Impl_in_rule__GradingScheme__Group__61842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__GradingScheme__Group__6__Impl1870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grade__Group__0__Impl_in_rule__Grade__Group__01915 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Grade__Group__1_in_rule__Grade__Group__01918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grade__NameAssignment_0_in_rule__Grade__Group__0__Impl1945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grade__Group__1__Impl_in_rule__Grade__Group__11975 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Grade__Group__2_in_rule__Grade__Group__11978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Grade__Group__1__Impl2006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grade__Group__2__Impl_in_rule__Grade__Group__22037 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Grade__Group__3_in_rule__Grade__Group__22040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grade__RequiredPointsAssignment_2_in_rule__Grade__Group__2__Impl2067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grade__Group__3__Impl_in_rule__Grade__Group__32097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Grade__Group__3__Impl2125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__0__Impl_in_rule__ConcreteTask__Group__02164 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__1_in_rule__ConcreteTask__Group__02167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__NameAssignment_0_in_rule__ConcreteTask__Group__0__Impl2194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__1__Impl_in_rule__ConcreteTask__Group__12224 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__2_in_rule__ConcreteTask__Group__12227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ConcreteTask__Group__1__Impl2255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__2__Impl_in_rule__ConcreteTask__Group__22286 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__3_in_rule__ConcreteTask__Group__22289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__MaxPointsAssignment_2_in_rule__ConcreteTask__Group__2__Impl2316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__3__Impl_in_rule__ConcreteTask__Group__32346 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__4_in_rule__ConcreteTask__Group__32349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ConcreteTask__Group__3__Impl2377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__4__Impl_in_rule__ConcreteTask__Group__42408 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__5_in_rule__ConcreteTask__Group__42411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group_4__0_in_rule__ConcreteTask__Group__4__Impl2438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__5__Impl_in_rule__ConcreteTask__Group__52469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__ConcreteTask__Group__5__Impl2497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group_4__0__Impl_in_rule__ConcreteTask__Group_4__02540 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group_4__1_in_rule__ConcreteTask__Group_4__02543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ConcreteTask__Group_4__0__Impl2571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group_4__1__Impl_in_rule__ConcreteTask__Group_4__12602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__MinRequirementAssignment_4_1_in_rule__ConcreteTask__Group_4__1__Impl2629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__0__Impl_in_rule__TaskGroup__Group__02663 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__1_in_rule__TaskGroup__Group__02666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__NameAssignment_0_in_rule__TaskGroup__Group__0__Impl2693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__1__Impl_in_rule__TaskGroup__Group__12723 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__2_in_rule__TaskGroup__Group__12726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TaskGroup__Group__1__Impl2754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__2__Impl_in_rule__TaskGroup__Group__22785 = new BitSet(new long[]{0x0000000000408000L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__3_in_rule__TaskGroup__Group__22788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__ContainsAssignment_2_in_rule__TaskGroup__Group__2__Impl2817 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__TaskGroup__ContainsAssignment_2_in_rule__TaskGroup__Group__2__Impl2829 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__3__Impl_in_rule__TaskGroup__Group__32862 = new BitSet(new long[]{0x0000000000408000L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__4_in_rule__TaskGroup__Group__32865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group_3__0_in_rule__TaskGroup__Group__3__Impl2892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__4__Impl_in_rule__TaskGroup__Group__42923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TaskGroup__Group__4__Impl2951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group_3__0__Impl_in_rule__TaskGroup__Group_3__02992 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group_3__1_in_rule__TaskGroup__Group_3__02995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TaskGroup__Group_3__0__Impl3023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group_3__1__Impl_in_rule__TaskGroup__Group_3__13054 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group_3__2_in_rule__TaskGroup__Group_3__13057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__TaskGroup__Group_3__1__Impl3085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group_3__2__Impl_in_rule__TaskGroup__Group_3__23116 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group_3__3_in_rule__TaskGroup__Group_3__23119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__MinRequirementAssignment_3_2_in_rule__TaskGroup__Group_3__2__Impl3146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group_3__3__Impl_in_rule__TaskGroup__Group_3__33176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TaskGroup__Group_3__3__Impl3204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MinRequirement__Group__0__Impl_in_rule__MinRequirement__Group__03243 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MinRequirement__Group__1_in_rule__MinRequirement__Group__03246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MinRequirement__Group__0__Impl3274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MinRequirement__Group__1__Impl_in_rule__MinRequirement__Group__13305 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__MinRequirement__Group__2_in_rule__MinRequirement__Group__13308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MinRequirement__ValueAssignment_1_in_rule__MinRequirement__Group__1__Impl3335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MinRequirement__Group__2__Impl_in_rule__MinRequirement__Group__23365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MinRequirement__TypeAssignment_2_in_rule__MinRequirement__Group__2__Impl3392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourse_in_rule__GradingSystem__CoursesAssignment3433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Course__NameAssignment_13464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrading_in_rule__Course__GradingsAssignment_33495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Grading__SemesterAssignment_13526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGradingScheme_in_rule__Grading__GradingSchemeAssignment_33557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTask_in_rule__Grading__TasksAssignment_43588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_23623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrade_in_rule__GradingScheme__GradesAssignment_53658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Grade__NameAssignment_03689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Grade__RequiredPointsAssignment_23720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ConcreteTask__NameAssignment_03751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__ConcreteTask__MaxPointsAssignment_23782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMinRequirement_in_rule__ConcreteTask__MinRequirementAssignment_4_13813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TaskGroup__NameAssignment_03844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTask_in_rule__TaskGroup__ContainsAssignment_23875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMinRequirement_in_rule__TaskGroup__MinRequirementAssignment_3_23906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__MinRequirement__ValueAssignment_13937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMinRequirementsType_in_rule__MinRequirement__TypeAssignment_23968 = new BitSet(new long[]{0x0000000000000002L});
    }


}