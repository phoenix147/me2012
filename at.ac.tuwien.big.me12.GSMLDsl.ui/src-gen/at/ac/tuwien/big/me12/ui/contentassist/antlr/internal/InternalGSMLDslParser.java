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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:69:1: ruleGradingSystem : ( ( ( rule__GradingSystem__CoursesAssignment ) ) ( ( rule__GradingSystem__CoursesAssignment )* ) ) ;
    public final void ruleGradingSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:73:2: ( ( ( ( rule__GradingSystem__CoursesAssignment ) ) ( ( rule__GradingSystem__CoursesAssignment )* ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:74:1: ( ( ( rule__GradingSystem__CoursesAssignment ) ) ( ( rule__GradingSystem__CoursesAssignment )* ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:74:1: ( ( ( rule__GradingSystem__CoursesAssignment ) ) ( ( rule__GradingSystem__CoursesAssignment )* ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:75:1: ( ( rule__GradingSystem__CoursesAssignment ) ) ( ( rule__GradingSystem__CoursesAssignment )* )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:75:1: ( ( rule__GradingSystem__CoursesAssignment ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:76:1: ( rule__GradingSystem__CoursesAssignment )
            {
             before(grammarAccess.getGradingSystemAccess().getCoursesAssignment()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:77:1: ( rule__GradingSystem__CoursesAssignment )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:77:2: rule__GradingSystem__CoursesAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingSystem__CoursesAssignment_in_ruleGradingSystem96);
            rule__GradingSystem__CoursesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getGradingSystemAccess().getCoursesAssignment()); 

            }

            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:80:1: ( ( rule__GradingSystem__CoursesAssignment )* )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:81:1: ( rule__GradingSystem__CoursesAssignment )*
            {
             before(grammarAccess.getGradingSystemAccess().getCoursesAssignment()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:82:1: ( rule__GradingSystem__CoursesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:82:2: rule__GradingSystem__CoursesAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__GradingSystem__CoursesAssignment_in_ruleGradingSystem108);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:95:1: entryRuleCourse : ruleCourse EOF ;
    public final void entryRuleCourse() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:96:1: ( ruleCourse EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:97:1: ruleCourse EOF
            {
             before(grammarAccess.getCourseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourse_in_entryRuleCourse138);
            ruleCourse();

            state._fsp--;

             after(grammarAccess.getCourseRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCourse145); 

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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:104:1: ruleCourse : ( ( rule__Course__Group__0 ) ) ;
    public final void ruleCourse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:108:2: ( ( ( rule__Course__Group__0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:109:1: ( ( rule__Course__Group__0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:109:1: ( ( rule__Course__Group__0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:110:1: ( rule__Course__Group__0 )
            {
             before(grammarAccess.getCourseAccess().getGroup()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:111:1: ( rule__Course__Group__0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:111:2: rule__Course__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__0_in_ruleCourse171);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:123:1: entryRuleGrading : ruleGrading EOF ;
    public final void entryRuleGrading() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:124:1: ( ruleGrading EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:125:1: ruleGrading EOF
            {
             before(grammarAccess.getGradingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrading_in_entryRuleGrading198);
            ruleGrading();

            state._fsp--;

             after(grammarAccess.getGradingRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGrading205); 

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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:132:1: ruleGrading : ( ( rule__Grading__Group__0 ) ) ;
    public final void ruleGrading() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:136:2: ( ( ( rule__Grading__Group__0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:137:1: ( ( rule__Grading__Group__0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:137:1: ( ( rule__Grading__Group__0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:138:1: ( rule__Grading__Group__0 )
            {
             before(grammarAccess.getGradingAccess().getGroup()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:139:1: ( rule__Grading__Group__0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:139:2: rule__Grading__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__0_in_ruleGrading231);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:151:1: entryRuleGradingScheme : ruleGradingScheme EOF ;
    public final void entryRuleGradingScheme() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:152:1: ( ruleGradingScheme EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:153:1: ruleGradingScheme EOF
            {
             before(grammarAccess.getGradingSchemeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGradingScheme_in_entryRuleGradingScheme258);
            ruleGradingScheme();

            state._fsp--;

             after(grammarAccess.getGradingSchemeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGradingScheme265); 

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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:160:1: ruleGradingScheme : ( ( rule__GradingScheme__Group__0 ) ) ;
    public final void ruleGradingScheme() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:164:2: ( ( ( rule__GradingScheme__Group__0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:165:1: ( ( rule__GradingScheme__Group__0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:165:1: ( ( rule__GradingScheme__Group__0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:166:1: ( rule__GradingScheme__Group__0 )
            {
             before(grammarAccess.getGradingSchemeAccess().getGroup()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:167:1: ( rule__GradingScheme__Group__0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:167:2: rule__GradingScheme__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__0_in_ruleGradingScheme291);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:179:1: entryRuleGrade : ruleGrade EOF ;
    public final void entryRuleGrade() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:180:1: ( ruleGrade EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:181:1: ruleGrade EOF
            {
             before(grammarAccess.getGradeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrade_in_entryRuleGrade318);
            ruleGrade();

            state._fsp--;

             after(grammarAccess.getGradeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGrade325); 

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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:188:1: ruleGrade : ( ( rule__Grade__Group__0 ) ) ;
    public final void ruleGrade() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:192:2: ( ( ( rule__Grade__Group__0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:193:1: ( ( rule__Grade__Group__0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:193:1: ( ( rule__Grade__Group__0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:194:1: ( rule__Grade__Group__0 )
            {
             before(grammarAccess.getGradeAccess().getGroup()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:195:1: ( rule__Grade__Group__0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:195:2: rule__Grade__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grade__Group__0_in_ruleGrade351);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:207:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:208:1: ( ruleTask EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:209:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTask_in_entryRuleTask378);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTask385); 

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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:216:1: ruleTask : ( ( rule__Task__Alternatives ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:220:2: ( ( ( rule__Task__Alternatives ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:221:1: ( ( rule__Task__Alternatives ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:221:1: ( ( rule__Task__Alternatives ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:222:1: ( rule__Task__Alternatives )
            {
             before(grammarAccess.getTaskAccess().getAlternatives()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:223:1: ( rule__Task__Alternatives )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:223:2: rule__Task__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Task__Alternatives_in_ruleTask411);
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


    // $ANTLR start "entryRuleTaskGroup"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:235:1: entryRuleTaskGroup : ruleTaskGroup EOF ;
    public final void entryRuleTaskGroup() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:236:1: ( ruleTaskGroup EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:237:1: ruleTaskGroup EOF
            {
             before(grammarAccess.getTaskGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTaskGroup_in_entryRuleTaskGroup438);
            ruleTaskGroup();

            state._fsp--;

             after(grammarAccess.getTaskGroupRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTaskGroup445); 

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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:244:1: ruleTaskGroup : ( ( rule__TaskGroup__Group__0 ) ) ;
    public final void ruleTaskGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:248:2: ( ( ( rule__TaskGroup__Group__0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:249:1: ( ( rule__TaskGroup__Group__0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:249:1: ( ( rule__TaskGroup__Group__0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:250:1: ( rule__TaskGroup__Group__0 )
            {
             before(grammarAccess.getTaskGroupAccess().getGroup()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:251:1: ( rule__TaskGroup__Group__0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:251:2: rule__TaskGroup__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__0_in_ruleTaskGroup471);
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


    // $ANTLR start "entryRuleConcreteTask"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:263:1: entryRuleConcreteTask : ruleConcreteTask EOF ;
    public final void entryRuleConcreteTask() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:264:1: ( ruleConcreteTask EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:265:1: ruleConcreteTask EOF
            {
             before(grammarAccess.getConcreteTaskRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConcreteTask_in_entryRuleConcreteTask498);
            ruleConcreteTask();

            state._fsp--;

             after(grammarAccess.getConcreteTaskRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConcreteTask505); 

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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:272:1: ruleConcreteTask : ( ( rule__ConcreteTask__Group__0 ) ) ;
    public final void ruleConcreteTask() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:276:2: ( ( ( rule__ConcreteTask__Group__0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:277:1: ( ( rule__ConcreteTask__Group__0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:277:1: ( ( rule__ConcreteTask__Group__0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:278:1: ( rule__ConcreteTask__Group__0 )
            {
             before(grammarAccess.getConcreteTaskAccess().getGroup()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:279:1: ( rule__ConcreteTask__Group__0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:279:2: rule__ConcreteTask__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__0_in_ruleConcreteTask531);
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


    // $ANTLR start "entryRuleMinRequirement"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:291:1: entryRuleMinRequirement : ruleMinRequirement EOF ;
    public final void entryRuleMinRequirement() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:292:1: ( ruleMinRequirement EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:293:1: ruleMinRequirement EOF
            {
             before(grammarAccess.getMinRequirementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMinRequirement_in_entryRuleMinRequirement558);
            ruleMinRequirement();

            state._fsp--;

             after(grammarAccess.getMinRequirementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMinRequirement565); 

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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:300:1: ruleMinRequirement : ( ( rule__MinRequirement__Group__0 ) ) ;
    public final void ruleMinRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:304:2: ( ( ( rule__MinRequirement__Group__0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:305:1: ( ( rule__MinRequirement__Group__0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:305:1: ( ( rule__MinRequirement__Group__0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:306:1: ( rule__MinRequirement__Group__0 )
            {
             before(grammarAccess.getMinRequirementAccess().getGroup()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:307:1: ( rule__MinRequirement__Group__0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:307:2: rule__MinRequirement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__Group__0_in_ruleMinRequirement591);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:320:1: ruleMinRequirementsType : ( ( rule__MinRequirementsType__Alternatives ) ) ;
    public final void ruleMinRequirementsType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:324:1: ( ( ( rule__MinRequirementsType__Alternatives ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:325:1: ( ( rule__MinRequirementsType__Alternatives ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:325:1: ( ( rule__MinRequirementsType__Alternatives ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:326:1: ( rule__MinRequirementsType__Alternatives )
            {
             before(grammarAccess.getMinRequirementsTypeAccess().getAlternatives()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:327:1: ( rule__MinRequirementsType__Alternatives )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:327:2: rule__MinRequirementsType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__MinRequirementsType__Alternatives_in_ruleMinRequirementsType628);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:338:1: rule__Task__Alternatives : ( ( ruleConcreteTask ) | ( ruleTaskGroup ) );
    public final void rule__Task__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:342:1: ( ( ruleConcreteTask ) | ( ruleTaskGroup ) )
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
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:343:1: ( ruleConcreteTask )
                    {
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:343:1: ( ruleConcreteTask )
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:344:1: ruleConcreteTask
                    {
                     before(grammarAccess.getTaskAccess().getConcreteTaskParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleConcreteTask_in_rule__Task__Alternatives663);
                    ruleConcreteTask();

                    state._fsp--;

                     after(grammarAccess.getTaskAccess().getConcreteTaskParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:349:6: ( ruleTaskGroup )
                    {
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:349:6: ( ruleTaskGroup )
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:350:1: ruleTaskGroup
                    {
                     before(grammarAccess.getTaskAccess().getTaskGroupParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTaskGroup_in_rule__Task__Alternatives680);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:360:1: rule__MinRequirementsType__Alternatives : ( ( ( 'point(s)' ) ) | ( ( '%' ) ) );
    public final void rule__MinRequirementsType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:364:1: ( ( ( 'point(s)' ) ) | ( ( '%' ) ) )
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
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:365:1: ( ( 'point(s)' ) )
                    {
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:365:1: ( ( 'point(s)' ) )
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:366:1: ( 'point(s)' )
                    {
                     before(grammarAccess.getMinRequirementsTypeAccess().getAbsoluteEnumLiteralDeclaration_0()); 
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:367:1: ( 'point(s)' )
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:367:3: 'point(s)'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__MinRequirementsType__Alternatives713); 

                    }

                     after(grammarAccess.getMinRequirementsTypeAccess().getAbsoluteEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:372:6: ( ( '%' ) )
                    {
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:372:6: ( ( '%' ) )
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:373:1: ( '%' )
                    {
                     before(grammarAccess.getMinRequirementsTypeAccess().getPercentageEnumLiteralDeclaration_1()); 
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:374:1: ( '%' )
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:374:3: '%'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__MinRequirementsType__Alternatives734); 

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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:386:1: rule__Course__Group__0 : rule__Course__Group__0__Impl rule__Course__Group__1 ;
    public final void rule__Course__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:390:1: ( rule__Course__Group__0__Impl rule__Course__Group__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:391:2: rule__Course__Group__0__Impl rule__Course__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__0__Impl_in_rule__Course__Group__0767);
            rule__Course__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__1_in_rule__Course__Group__0770);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:398:1: rule__Course__Group__0__Impl : ( () ) ;
    public final void rule__Course__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:402:1: ( ( () ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:403:1: ( () )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:403:1: ( () )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:404:1: ()
            {
             before(grammarAccess.getCourseAccess().getCourseAction_0()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:405:1: ()
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:407:1: 
            {
            }

             after(grammarAccess.getCourseAccess().getCourseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__0__Impl"


    // $ANTLR start "rule__Course__Group__1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:417:1: rule__Course__Group__1 : rule__Course__Group__1__Impl rule__Course__Group__2 ;
    public final void rule__Course__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:421:1: ( rule__Course__Group__1__Impl rule__Course__Group__2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:422:2: rule__Course__Group__1__Impl rule__Course__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__1__Impl_in_rule__Course__Group__1828);
            rule__Course__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__2_in_rule__Course__Group__1831);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:429:1: rule__Course__Group__1__Impl : ( 'course' ) ;
    public final void rule__Course__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:433:1: ( ( 'course' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:434:1: ( 'course' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:434:1: ( 'course' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:435:1: 'course'
            {
             before(grammarAccess.getCourseAccess().getCourseKeyword_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Course__Group__1__Impl859); 
             after(grammarAccess.getCourseAccess().getCourseKeyword_1()); 

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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:448:1: rule__Course__Group__2 : rule__Course__Group__2__Impl rule__Course__Group__3 ;
    public final void rule__Course__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:452:1: ( rule__Course__Group__2__Impl rule__Course__Group__3 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:453:2: rule__Course__Group__2__Impl rule__Course__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__2__Impl_in_rule__Course__Group__2890);
            rule__Course__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__3_in_rule__Course__Group__2893);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:460:1: rule__Course__Group__2__Impl : ( ( rule__Course__NameAssignment_2 ) ) ;
    public final void rule__Course__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:464:1: ( ( ( rule__Course__NameAssignment_2 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:465:1: ( ( rule__Course__NameAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:465:1: ( ( rule__Course__NameAssignment_2 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:466:1: ( rule__Course__NameAssignment_2 )
            {
             before(grammarAccess.getCourseAccess().getNameAssignment_2()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:467:1: ( rule__Course__NameAssignment_2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:467:2: rule__Course__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__NameAssignment_2_in_rule__Course__Group__2__Impl920);
            rule__Course__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getNameAssignment_2()); 

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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:477:1: rule__Course__Group__3 : rule__Course__Group__3__Impl rule__Course__Group__4 ;
    public final void rule__Course__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:481:1: ( rule__Course__Group__3__Impl rule__Course__Group__4 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:482:2: rule__Course__Group__3__Impl rule__Course__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__3__Impl_in_rule__Course__Group__3950);
            rule__Course__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__4_in_rule__Course__Group__3953);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:489:1: rule__Course__Group__3__Impl : ( '{' ) ;
    public final void rule__Course__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:493:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:494:1: ( '{' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:494:1: ( '{' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:495:1: '{'
            {
             before(grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Course__Group__3__Impl981); 
             after(grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_3()); 

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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:508:1: rule__Course__Group__4 : rule__Course__Group__4__Impl rule__Course__Group__5 ;
    public final void rule__Course__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:512:1: ( rule__Course__Group__4__Impl rule__Course__Group__5 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:513:2: rule__Course__Group__4__Impl rule__Course__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__4__Impl_in_rule__Course__Group__41012);
            rule__Course__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__5_in_rule__Course__Group__41015);
            rule__Course__Group__5();

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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:520:1: rule__Course__Group__4__Impl : ( ( ( rule__Course__GradingsAssignment_4 ) ) ( ( rule__Course__GradingsAssignment_4 )* ) ) ;
    public final void rule__Course__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:524:1: ( ( ( ( rule__Course__GradingsAssignment_4 ) ) ( ( rule__Course__GradingsAssignment_4 )* ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:525:1: ( ( ( rule__Course__GradingsAssignment_4 ) ) ( ( rule__Course__GradingsAssignment_4 )* ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:525:1: ( ( ( rule__Course__GradingsAssignment_4 ) ) ( ( rule__Course__GradingsAssignment_4 )* ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:526:1: ( ( rule__Course__GradingsAssignment_4 ) ) ( ( rule__Course__GradingsAssignment_4 )* )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:526:1: ( ( rule__Course__GradingsAssignment_4 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:527:1: ( rule__Course__GradingsAssignment_4 )
            {
             before(grammarAccess.getCourseAccess().getGradingsAssignment_4()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:528:1: ( rule__Course__GradingsAssignment_4 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:528:2: rule__Course__GradingsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__GradingsAssignment_4_in_rule__Course__Group__4__Impl1044);
            rule__Course__GradingsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getGradingsAssignment_4()); 

            }

            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:531:1: ( ( rule__Course__GradingsAssignment_4 )* )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:532:1: ( rule__Course__GradingsAssignment_4 )*
            {
             before(grammarAccess.getCourseAccess().getGradingsAssignment_4()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:533:1: ( rule__Course__GradingsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:533:2: rule__Course__GradingsAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Course__GradingsAssignment_4_in_rule__Course__Group__4__Impl1056);
            	    rule__Course__GradingsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCourseAccess().getGradingsAssignment_4()); 

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
    // $ANTLR end "rule__Course__Group__4__Impl"


    // $ANTLR start "rule__Course__Group__5"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:544:1: rule__Course__Group__5 : rule__Course__Group__5__Impl ;
    public final void rule__Course__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:548:1: ( rule__Course__Group__5__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:549:2: rule__Course__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__5__Impl_in_rule__Course__Group__51089);
            rule__Course__Group__5__Impl();

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
    // $ANTLR end "rule__Course__Group__5"


    // $ANTLR start "rule__Course__Group__5__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:555:1: rule__Course__Group__5__Impl : ( '}' ) ;
    public final void rule__Course__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:559:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:560:1: ( '}' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:560:1: ( '}' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:561:1: '}'
            {
             before(grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Course__Group__5__Impl1117); 
             after(grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Course__Group__5__Impl"


    // $ANTLR start "rule__Grading__Group__0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:586:1: rule__Grading__Group__0 : rule__Grading__Group__0__Impl rule__Grading__Group__1 ;
    public final void rule__Grading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:590:1: ( rule__Grading__Group__0__Impl rule__Grading__Group__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:591:2: rule__Grading__Group__0__Impl rule__Grading__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__0__Impl_in_rule__Grading__Group__01160);
            rule__Grading__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__1_in_rule__Grading__Group__01163);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:598:1: rule__Grading__Group__0__Impl : ( 'semester' ) ;
    public final void rule__Grading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:602:1: ( ( 'semester' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:603:1: ( 'semester' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:603:1: ( 'semester' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:604:1: 'semester'
            {
             before(grammarAccess.getGradingAccess().getSemesterKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Grading__Group__0__Impl1191); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:617:1: rule__Grading__Group__1 : rule__Grading__Group__1__Impl rule__Grading__Group__2 ;
    public final void rule__Grading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:621:1: ( rule__Grading__Group__1__Impl rule__Grading__Group__2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:622:2: rule__Grading__Group__1__Impl rule__Grading__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__1__Impl_in_rule__Grading__Group__11222);
            rule__Grading__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__2_in_rule__Grading__Group__11225);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:629:1: rule__Grading__Group__1__Impl : ( ( rule__Grading__SemesterAssignment_1 ) ) ;
    public final void rule__Grading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:633:1: ( ( ( rule__Grading__SemesterAssignment_1 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:634:1: ( ( rule__Grading__SemesterAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:634:1: ( ( rule__Grading__SemesterAssignment_1 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:635:1: ( rule__Grading__SemesterAssignment_1 )
            {
             before(grammarAccess.getGradingAccess().getSemesterAssignment_1()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:636:1: ( rule__Grading__SemesterAssignment_1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:636:2: rule__Grading__SemesterAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__SemesterAssignment_1_in_rule__Grading__Group__1__Impl1252);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:646:1: rule__Grading__Group__2 : rule__Grading__Group__2__Impl rule__Grading__Group__3 ;
    public final void rule__Grading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:650:1: ( rule__Grading__Group__2__Impl rule__Grading__Group__3 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:651:2: rule__Grading__Group__2__Impl rule__Grading__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__2__Impl_in_rule__Grading__Group__21282);
            rule__Grading__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__3_in_rule__Grading__Group__21285);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:658:1: rule__Grading__Group__2__Impl : ( '{' ) ;
    public final void rule__Grading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:662:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:663:1: ( '{' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:663:1: ( '{' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:664:1: '{'
            {
             before(grammarAccess.getGradingAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Grading__Group__2__Impl1313); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:677:1: rule__Grading__Group__3 : rule__Grading__Group__3__Impl rule__Grading__Group__4 ;
    public final void rule__Grading__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:681:1: ( rule__Grading__Group__3__Impl rule__Grading__Group__4 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:682:2: rule__Grading__Group__3__Impl rule__Grading__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__3__Impl_in_rule__Grading__Group__31344);
            rule__Grading__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__4_in_rule__Grading__Group__31347);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:689:1: rule__Grading__Group__3__Impl : ( ( rule__Grading__GradingSchemeAssignment_3 ) ) ;
    public final void rule__Grading__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:693:1: ( ( ( rule__Grading__GradingSchemeAssignment_3 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:694:1: ( ( rule__Grading__GradingSchemeAssignment_3 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:694:1: ( ( rule__Grading__GradingSchemeAssignment_3 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:695:1: ( rule__Grading__GradingSchemeAssignment_3 )
            {
             before(grammarAccess.getGradingAccess().getGradingSchemeAssignment_3()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:696:1: ( rule__Grading__GradingSchemeAssignment_3 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:696:2: rule__Grading__GradingSchemeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__GradingSchemeAssignment_3_in_rule__Grading__Group__3__Impl1374);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:706:1: rule__Grading__Group__4 : rule__Grading__Group__4__Impl rule__Grading__Group__5 ;
    public final void rule__Grading__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:710:1: ( rule__Grading__Group__4__Impl rule__Grading__Group__5 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:711:2: rule__Grading__Group__4__Impl rule__Grading__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__4__Impl_in_rule__Grading__Group__41404);
            rule__Grading__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__5_in_rule__Grading__Group__41407);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:718:1: rule__Grading__Group__4__Impl : ( ( rule__Grading__TasksAssignment_4 )* ) ;
    public final void rule__Grading__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:722:1: ( ( ( rule__Grading__TasksAssignment_4 )* ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:723:1: ( ( rule__Grading__TasksAssignment_4 )* )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:723:1: ( ( rule__Grading__TasksAssignment_4 )* )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:724:1: ( rule__Grading__TasksAssignment_4 )*
            {
             before(grammarAccess.getGradingAccess().getTasksAssignment_4()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:725:1: ( rule__Grading__TasksAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:725:2: rule__Grading__TasksAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Grading__TasksAssignment_4_in_rule__Grading__Group__4__Impl1434);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:735:1: rule__Grading__Group__5 : rule__Grading__Group__5__Impl ;
    public final void rule__Grading__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:739:1: ( rule__Grading__Group__5__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:740:2: rule__Grading__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__5__Impl_in_rule__Grading__Group__51465);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:746:1: rule__Grading__Group__5__Impl : ( '}' ) ;
    public final void rule__Grading__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:750:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:751:1: ( '}' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:751:1: ( '}' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:752:1: '}'
            {
             before(grammarAccess.getGradingAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Grading__Group__5__Impl1493); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:777:1: rule__GradingScheme__Group__0 : rule__GradingScheme__Group__0__Impl rule__GradingScheme__Group__1 ;
    public final void rule__GradingScheme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:781:1: ( rule__GradingScheme__Group__0__Impl rule__GradingScheme__Group__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:782:2: rule__GradingScheme__Group__0__Impl rule__GradingScheme__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__0__Impl_in_rule__GradingScheme__Group__01536);
            rule__GradingScheme__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__1_in_rule__GradingScheme__Group__01539);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:789:1: rule__GradingScheme__Group__0__Impl : ( 'grading scheme' ) ;
    public final void rule__GradingScheme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:793:1: ( ( 'grading scheme' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:794:1: ( 'grading scheme' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:794:1: ( 'grading scheme' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:795:1: 'grading scheme'
            {
             before(grammarAccess.getGradingSchemeAccess().getGradingSchemeKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__GradingScheme__Group__0__Impl1567); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:808:1: rule__GradingScheme__Group__1 : rule__GradingScheme__Group__1__Impl rule__GradingScheme__Group__2 ;
    public final void rule__GradingScheme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:812:1: ( rule__GradingScheme__Group__1__Impl rule__GradingScheme__Group__2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:813:2: rule__GradingScheme__Group__1__Impl rule__GradingScheme__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__1__Impl_in_rule__GradingScheme__Group__11598);
            rule__GradingScheme__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__2_in_rule__GradingScheme__Group__11601);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:820:1: rule__GradingScheme__Group__1__Impl : ( '(' ) ;
    public final void rule__GradingScheme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:824:1: ( ( '(' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:825:1: ( '(' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:825:1: ( '(' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:826:1: '('
            {
             before(grammarAccess.getGradingSchemeAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__GradingScheme__Group__1__Impl1629); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:839:1: rule__GradingScheme__Group__2 : rule__GradingScheme__Group__2__Impl rule__GradingScheme__Group__3 ;
    public final void rule__GradingScheme__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:843:1: ( rule__GradingScheme__Group__2__Impl rule__GradingScheme__Group__3 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:844:2: rule__GradingScheme__Group__2__Impl rule__GradingScheme__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__2__Impl_in_rule__GradingScheme__Group__21660);
            rule__GradingScheme__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__3_in_rule__GradingScheme__Group__21663);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:851:1: rule__GradingScheme__Group__2__Impl : ( ( rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2 ) ) ;
    public final void rule__GradingScheme__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:855:1: ( ( ( rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:856:1: ( ( rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:856:1: ( ( rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:857:1: ( rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2 )
            {
             before(grammarAccess.getGradingSchemeAccess().getMinRequirementNotFulfilledGradeAssignment_2()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:858:1: ( rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:858:2: rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2_in_rule__GradingScheme__Group__2__Impl1690);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:868:1: rule__GradingScheme__Group__3 : rule__GradingScheme__Group__3__Impl rule__GradingScheme__Group__4 ;
    public final void rule__GradingScheme__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:872:1: ( rule__GradingScheme__Group__3__Impl rule__GradingScheme__Group__4 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:873:2: rule__GradingScheme__Group__3__Impl rule__GradingScheme__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__3__Impl_in_rule__GradingScheme__Group__31720);
            rule__GradingScheme__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__4_in_rule__GradingScheme__Group__31723);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:880:1: rule__GradingScheme__Group__3__Impl : ( ')' ) ;
    public final void rule__GradingScheme__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:884:1: ( ( ')' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:885:1: ( ')' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:885:1: ( ')' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:886:1: ')'
            {
             before(grammarAccess.getGradingSchemeAccess().getRightParenthesisKeyword_3()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__GradingScheme__Group__3__Impl1751); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:899:1: rule__GradingScheme__Group__4 : rule__GradingScheme__Group__4__Impl rule__GradingScheme__Group__5 ;
    public final void rule__GradingScheme__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:903:1: ( rule__GradingScheme__Group__4__Impl rule__GradingScheme__Group__5 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:904:2: rule__GradingScheme__Group__4__Impl rule__GradingScheme__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__4__Impl_in_rule__GradingScheme__Group__41782);
            rule__GradingScheme__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__5_in_rule__GradingScheme__Group__41785);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:911:1: rule__GradingScheme__Group__4__Impl : ( '{' ) ;
    public final void rule__GradingScheme__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:915:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:916:1: ( '{' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:916:1: ( '{' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:917:1: '{'
            {
             before(grammarAccess.getGradingSchemeAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__GradingScheme__Group__4__Impl1813); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:930:1: rule__GradingScheme__Group__5 : rule__GradingScheme__Group__5__Impl rule__GradingScheme__Group__6 ;
    public final void rule__GradingScheme__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:934:1: ( rule__GradingScheme__Group__5__Impl rule__GradingScheme__Group__6 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:935:2: rule__GradingScheme__Group__5__Impl rule__GradingScheme__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__5__Impl_in_rule__GradingScheme__Group__51844);
            rule__GradingScheme__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__6_in_rule__GradingScheme__Group__51847);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:942:1: rule__GradingScheme__Group__5__Impl : ( ( ( rule__GradingScheme__GradesAssignment_5 ) ) ( ( rule__GradingScheme__GradesAssignment_5 )* ) ) ;
    public final void rule__GradingScheme__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:946:1: ( ( ( ( rule__GradingScheme__GradesAssignment_5 ) ) ( ( rule__GradingScheme__GradesAssignment_5 )* ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:947:1: ( ( ( rule__GradingScheme__GradesAssignment_5 ) ) ( ( rule__GradingScheme__GradesAssignment_5 )* ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:947:1: ( ( ( rule__GradingScheme__GradesAssignment_5 ) ) ( ( rule__GradingScheme__GradesAssignment_5 )* ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:948:1: ( ( rule__GradingScheme__GradesAssignment_5 ) ) ( ( rule__GradingScheme__GradesAssignment_5 )* )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:948:1: ( ( rule__GradingScheme__GradesAssignment_5 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:949:1: ( rule__GradingScheme__GradesAssignment_5 )
            {
             before(grammarAccess.getGradingSchemeAccess().getGradesAssignment_5()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:950:1: ( rule__GradingScheme__GradesAssignment_5 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:950:2: rule__GradingScheme__GradesAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__GradesAssignment_5_in_rule__GradingScheme__Group__5__Impl1876);
            rule__GradingScheme__GradesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGradingSchemeAccess().getGradesAssignment_5()); 

            }

            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:953:1: ( ( rule__GradingScheme__GradesAssignment_5 )* )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:954:1: ( rule__GradingScheme__GradesAssignment_5 )*
            {
             before(grammarAccess.getGradingSchemeAccess().getGradesAssignment_5()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:955:1: ( rule__GradingScheme__GradesAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:955:2: rule__GradingScheme__GradesAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__GradesAssignment_5_in_rule__GradingScheme__Group__5__Impl1888);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:966:1: rule__GradingScheme__Group__6 : rule__GradingScheme__Group__6__Impl ;
    public final void rule__GradingScheme__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:970:1: ( rule__GradingScheme__Group__6__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:971:2: rule__GradingScheme__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__6__Impl_in_rule__GradingScheme__Group__61921);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:977:1: rule__GradingScheme__Group__6__Impl : ( '}' ) ;
    public final void rule__GradingScheme__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:981:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:982:1: ( '}' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:982:1: ( '}' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:983:1: '}'
            {
             before(grammarAccess.getGradingSchemeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__GradingScheme__Group__6__Impl1949); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1010:1: rule__Grade__Group__0 : rule__Grade__Group__0__Impl rule__Grade__Group__1 ;
    public final void rule__Grade__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1014:1: ( rule__Grade__Group__0__Impl rule__Grade__Group__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1015:2: rule__Grade__Group__0__Impl rule__Grade__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grade__Group__0__Impl_in_rule__Grade__Group__01994);
            rule__Grade__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grade__Group__1_in_rule__Grade__Group__01997);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1022:1: rule__Grade__Group__0__Impl : ( ( rule__Grade__NameAssignment_0 ) ) ;
    public final void rule__Grade__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1026:1: ( ( ( rule__Grade__NameAssignment_0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1027:1: ( ( rule__Grade__NameAssignment_0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1027:1: ( ( rule__Grade__NameAssignment_0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1028:1: ( rule__Grade__NameAssignment_0 )
            {
             before(grammarAccess.getGradeAccess().getNameAssignment_0()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1029:1: ( rule__Grade__NameAssignment_0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1029:2: rule__Grade__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grade__NameAssignment_0_in_rule__Grade__Group__0__Impl2024);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1039:1: rule__Grade__Group__1 : rule__Grade__Group__1__Impl rule__Grade__Group__2 ;
    public final void rule__Grade__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1043:1: ( rule__Grade__Group__1__Impl rule__Grade__Group__2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1044:2: rule__Grade__Group__1__Impl rule__Grade__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grade__Group__1__Impl_in_rule__Grade__Group__12054);
            rule__Grade__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grade__Group__2_in_rule__Grade__Group__12057);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1051:1: rule__Grade__Group__1__Impl : ( ':' ) ;
    public final void rule__Grade__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1055:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1056:1: ( ':' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1056:1: ( ':' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1057:1: ':'
            {
             before(grammarAccess.getGradeAccess().getColonKeyword_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Grade__Group__1__Impl2085); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1070:1: rule__Grade__Group__2 : rule__Grade__Group__2__Impl rule__Grade__Group__3 ;
    public final void rule__Grade__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1074:1: ( rule__Grade__Group__2__Impl rule__Grade__Group__3 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1075:2: rule__Grade__Group__2__Impl rule__Grade__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grade__Group__2__Impl_in_rule__Grade__Group__22116);
            rule__Grade__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grade__Group__3_in_rule__Grade__Group__22119);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1082:1: rule__Grade__Group__2__Impl : ( ( rule__Grade__RequiredPointsAssignment_2 ) ) ;
    public final void rule__Grade__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1086:1: ( ( ( rule__Grade__RequiredPointsAssignment_2 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1087:1: ( ( rule__Grade__RequiredPointsAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1087:1: ( ( rule__Grade__RequiredPointsAssignment_2 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1088:1: ( rule__Grade__RequiredPointsAssignment_2 )
            {
             before(grammarAccess.getGradeAccess().getRequiredPointsAssignment_2()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1089:1: ( rule__Grade__RequiredPointsAssignment_2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1089:2: rule__Grade__RequiredPointsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grade__RequiredPointsAssignment_2_in_rule__Grade__Group__2__Impl2146);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1099:1: rule__Grade__Group__3 : rule__Grade__Group__3__Impl ;
    public final void rule__Grade__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1103:1: ( rule__Grade__Group__3__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1104:2: rule__Grade__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grade__Group__3__Impl_in_rule__Grade__Group__32176);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1110:1: rule__Grade__Group__3__Impl : ( ';' ) ;
    public final void rule__Grade__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1114:1: ( ( ';' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1115:1: ( ';' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1115:1: ( ';' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1116:1: ';'
            {
             before(grammarAccess.getGradeAccess().getSemicolonKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Grade__Group__3__Impl2204); 
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


    // $ANTLR start "rule__TaskGroup__Group__0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1137:1: rule__TaskGroup__Group__0 : rule__TaskGroup__Group__0__Impl rule__TaskGroup__Group__1 ;
    public final void rule__TaskGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1141:1: ( rule__TaskGroup__Group__0__Impl rule__TaskGroup__Group__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1142:2: rule__TaskGroup__Group__0__Impl rule__TaskGroup__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__0__Impl_in_rule__TaskGroup__Group__02243);
            rule__TaskGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__1_in_rule__TaskGroup__Group__02246);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1149:1: rule__TaskGroup__Group__0__Impl : ( ( rule__TaskGroup__NameAssignment_0 ) ) ;
    public final void rule__TaskGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1153:1: ( ( ( rule__TaskGroup__NameAssignment_0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1154:1: ( ( rule__TaskGroup__NameAssignment_0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1154:1: ( ( rule__TaskGroup__NameAssignment_0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1155:1: ( rule__TaskGroup__NameAssignment_0 )
            {
             before(grammarAccess.getTaskGroupAccess().getNameAssignment_0()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1156:1: ( rule__TaskGroup__NameAssignment_0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1156:2: rule__TaskGroup__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__NameAssignment_0_in_rule__TaskGroup__Group__0__Impl2273);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1166:1: rule__TaskGroup__Group__1 : rule__TaskGroup__Group__1__Impl rule__TaskGroup__Group__2 ;
    public final void rule__TaskGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1170:1: ( rule__TaskGroup__Group__1__Impl rule__TaskGroup__Group__2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1171:2: rule__TaskGroup__Group__1__Impl rule__TaskGroup__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__1__Impl_in_rule__TaskGroup__Group__12303);
            rule__TaskGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__2_in_rule__TaskGroup__Group__12306);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1178:1: rule__TaskGroup__Group__1__Impl : ( '{' ) ;
    public final void rule__TaskGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1182:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1183:1: ( '{' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1183:1: ( '{' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1184:1: '{'
            {
             before(grammarAccess.getTaskGroupAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__TaskGroup__Group__1__Impl2334); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1197:1: rule__TaskGroup__Group__2 : rule__TaskGroup__Group__2__Impl rule__TaskGroup__Group__3 ;
    public final void rule__TaskGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1201:1: ( rule__TaskGroup__Group__2__Impl rule__TaskGroup__Group__3 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1202:2: rule__TaskGroup__Group__2__Impl rule__TaskGroup__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__2__Impl_in_rule__TaskGroup__Group__22365);
            rule__TaskGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__3_in_rule__TaskGroup__Group__22368);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1209:1: rule__TaskGroup__Group__2__Impl : ( ( rule__TaskGroup__ContainsAssignment_2 )* ) ;
    public final void rule__TaskGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1213:1: ( ( ( rule__TaskGroup__ContainsAssignment_2 )* ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1214:1: ( ( rule__TaskGroup__ContainsAssignment_2 )* )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1214:1: ( ( rule__TaskGroup__ContainsAssignment_2 )* )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1215:1: ( rule__TaskGroup__ContainsAssignment_2 )*
            {
             before(grammarAccess.getTaskGroupAccess().getContainsAssignment_2()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1216:1: ( rule__TaskGroup__ContainsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1216:2: rule__TaskGroup__ContainsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__ContainsAssignment_2_in_rule__TaskGroup__Group__2__Impl2395);
            	    rule__TaskGroup__ContainsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTaskGroupAccess().getContainsAssignment_2()); 

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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1226:1: rule__TaskGroup__Group__3 : rule__TaskGroup__Group__3__Impl rule__TaskGroup__Group__4 ;
    public final void rule__TaskGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1230:1: ( rule__TaskGroup__Group__3__Impl rule__TaskGroup__Group__4 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1231:2: rule__TaskGroup__Group__3__Impl rule__TaskGroup__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__3__Impl_in_rule__TaskGroup__Group__32426);
            rule__TaskGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__4_in_rule__TaskGroup__Group__32429);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1238:1: rule__TaskGroup__Group__3__Impl : ( ( rule__TaskGroup__Group_3__0 )? ) ;
    public final void rule__TaskGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1242:1: ( ( ( rule__TaskGroup__Group_3__0 )? ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1243:1: ( ( rule__TaskGroup__Group_3__0 )? )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1243:1: ( ( rule__TaskGroup__Group_3__0 )? )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1244:1: ( rule__TaskGroup__Group_3__0 )?
            {
             before(grammarAccess.getTaskGroupAccess().getGroup_3()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1245:1: ( rule__TaskGroup__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1245:2: rule__TaskGroup__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group_3__0_in_rule__TaskGroup__Group__3__Impl2456);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1255:1: rule__TaskGroup__Group__4 : rule__TaskGroup__Group__4__Impl ;
    public final void rule__TaskGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1259:1: ( rule__TaskGroup__Group__4__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1260:2: rule__TaskGroup__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__4__Impl_in_rule__TaskGroup__Group__42487);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1266:1: rule__TaskGroup__Group__4__Impl : ( '}' ) ;
    public final void rule__TaskGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1270:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1271:1: ( '}' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1271:1: ( '}' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1272:1: '}'
            {
             before(grammarAccess.getTaskGroupAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TaskGroup__Group__4__Impl2515); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1295:1: rule__TaskGroup__Group_3__0 : rule__TaskGroup__Group_3__0__Impl rule__TaskGroup__Group_3__1 ;
    public final void rule__TaskGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1299:1: ( rule__TaskGroup__Group_3__0__Impl rule__TaskGroup__Group_3__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1300:2: rule__TaskGroup__Group_3__0__Impl rule__TaskGroup__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group_3__0__Impl_in_rule__TaskGroup__Group_3__02556);
            rule__TaskGroup__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group_3__1_in_rule__TaskGroup__Group_3__02559);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1307:1: rule__TaskGroup__Group_3__0__Impl : ( '@all' ) ;
    public final void rule__TaskGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1311:1: ( ( '@all' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1312:1: ( '@all' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1312:1: ( '@all' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1313:1: '@all'
            {
             before(grammarAccess.getTaskGroupAccess().getAllKeyword_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TaskGroup__Group_3__0__Impl2587); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1326:1: rule__TaskGroup__Group_3__1 : rule__TaskGroup__Group_3__1__Impl rule__TaskGroup__Group_3__2 ;
    public final void rule__TaskGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1330:1: ( rule__TaskGroup__Group_3__1__Impl rule__TaskGroup__Group_3__2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1331:2: rule__TaskGroup__Group_3__1__Impl rule__TaskGroup__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group_3__1__Impl_in_rule__TaskGroup__Group_3__12618);
            rule__TaskGroup__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group_3__2_in_rule__TaskGroup__Group_3__12621);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1338:1: rule__TaskGroup__Group_3__1__Impl : ( ':' ) ;
    public final void rule__TaskGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1342:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1343:1: ( ':' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1343:1: ( ':' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1344:1: ':'
            {
             before(grammarAccess.getTaskGroupAccess().getColonKeyword_3_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__TaskGroup__Group_3__1__Impl2649); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1357:1: rule__TaskGroup__Group_3__2 : rule__TaskGroup__Group_3__2__Impl rule__TaskGroup__Group_3__3 ;
    public final void rule__TaskGroup__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1361:1: ( rule__TaskGroup__Group_3__2__Impl rule__TaskGroup__Group_3__3 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1362:2: rule__TaskGroup__Group_3__2__Impl rule__TaskGroup__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group_3__2__Impl_in_rule__TaskGroup__Group_3__22680);
            rule__TaskGroup__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group_3__3_in_rule__TaskGroup__Group_3__22683);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1369:1: rule__TaskGroup__Group_3__2__Impl : ( ( rule__TaskGroup__MinRequirementAssignment_3_2 ) ) ;
    public final void rule__TaskGroup__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1373:1: ( ( ( rule__TaskGroup__MinRequirementAssignment_3_2 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1374:1: ( ( rule__TaskGroup__MinRequirementAssignment_3_2 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1374:1: ( ( rule__TaskGroup__MinRequirementAssignment_3_2 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1375:1: ( rule__TaskGroup__MinRequirementAssignment_3_2 )
            {
             before(grammarAccess.getTaskGroupAccess().getMinRequirementAssignment_3_2()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1376:1: ( rule__TaskGroup__MinRequirementAssignment_3_2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1376:2: rule__TaskGroup__MinRequirementAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__MinRequirementAssignment_3_2_in_rule__TaskGroup__Group_3__2__Impl2710);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1386:1: rule__TaskGroup__Group_3__3 : rule__TaskGroup__Group_3__3__Impl ;
    public final void rule__TaskGroup__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1390:1: ( rule__TaskGroup__Group_3__3__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1391:2: rule__TaskGroup__Group_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group_3__3__Impl_in_rule__TaskGroup__Group_3__32740);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1397:1: rule__TaskGroup__Group_3__3__Impl : ( ';' ) ;
    public final void rule__TaskGroup__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1401:1: ( ( ';' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1402:1: ( ';' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1402:1: ( ';' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1403:1: ';'
            {
             before(grammarAccess.getTaskGroupAccess().getSemicolonKeyword_3_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TaskGroup__Group_3__3__Impl2768); 
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


    // $ANTLR start "rule__ConcreteTask__Group__0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1424:1: rule__ConcreteTask__Group__0 : rule__ConcreteTask__Group__0__Impl rule__ConcreteTask__Group__1 ;
    public final void rule__ConcreteTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1428:1: ( rule__ConcreteTask__Group__0__Impl rule__ConcreteTask__Group__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1429:2: rule__ConcreteTask__Group__0__Impl rule__ConcreteTask__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__0__Impl_in_rule__ConcreteTask__Group__02807);
            rule__ConcreteTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__1_in_rule__ConcreteTask__Group__02810);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1436:1: rule__ConcreteTask__Group__0__Impl : ( ( rule__ConcreteTask__NameAssignment_0 ) ) ;
    public final void rule__ConcreteTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1440:1: ( ( ( rule__ConcreteTask__NameAssignment_0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1441:1: ( ( rule__ConcreteTask__NameAssignment_0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1441:1: ( ( rule__ConcreteTask__NameAssignment_0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1442:1: ( rule__ConcreteTask__NameAssignment_0 )
            {
             before(grammarAccess.getConcreteTaskAccess().getNameAssignment_0()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1443:1: ( rule__ConcreteTask__NameAssignment_0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1443:2: rule__ConcreteTask__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__NameAssignment_0_in_rule__ConcreteTask__Group__0__Impl2837);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1453:1: rule__ConcreteTask__Group__1 : rule__ConcreteTask__Group__1__Impl rule__ConcreteTask__Group__2 ;
    public final void rule__ConcreteTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1457:1: ( rule__ConcreteTask__Group__1__Impl rule__ConcreteTask__Group__2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1458:2: rule__ConcreteTask__Group__1__Impl rule__ConcreteTask__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__1__Impl_in_rule__ConcreteTask__Group__12867);
            rule__ConcreteTask__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__2_in_rule__ConcreteTask__Group__12870);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1465:1: rule__ConcreteTask__Group__1__Impl : ( '(' ) ;
    public final void rule__ConcreteTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1469:1: ( ( '(' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1470:1: ( '(' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1470:1: ( '(' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1471:1: '('
            {
             before(grammarAccess.getConcreteTaskAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__ConcreteTask__Group__1__Impl2898); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1484:1: rule__ConcreteTask__Group__2 : rule__ConcreteTask__Group__2__Impl rule__ConcreteTask__Group__3 ;
    public final void rule__ConcreteTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1488:1: ( rule__ConcreteTask__Group__2__Impl rule__ConcreteTask__Group__3 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1489:2: rule__ConcreteTask__Group__2__Impl rule__ConcreteTask__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__2__Impl_in_rule__ConcreteTask__Group__22929);
            rule__ConcreteTask__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__3_in_rule__ConcreteTask__Group__22932);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1496:1: rule__ConcreteTask__Group__2__Impl : ( ( rule__ConcreteTask__MaxPointsAssignment_2 ) ) ;
    public final void rule__ConcreteTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1500:1: ( ( ( rule__ConcreteTask__MaxPointsAssignment_2 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1501:1: ( ( rule__ConcreteTask__MaxPointsAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1501:1: ( ( rule__ConcreteTask__MaxPointsAssignment_2 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1502:1: ( rule__ConcreteTask__MaxPointsAssignment_2 )
            {
             before(grammarAccess.getConcreteTaskAccess().getMaxPointsAssignment_2()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1503:1: ( rule__ConcreteTask__MaxPointsAssignment_2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1503:2: rule__ConcreteTask__MaxPointsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__MaxPointsAssignment_2_in_rule__ConcreteTask__Group__2__Impl2959);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1513:1: rule__ConcreteTask__Group__3 : rule__ConcreteTask__Group__3__Impl rule__ConcreteTask__Group__4 ;
    public final void rule__ConcreteTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1517:1: ( rule__ConcreteTask__Group__3__Impl rule__ConcreteTask__Group__4 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1518:2: rule__ConcreteTask__Group__3__Impl rule__ConcreteTask__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__3__Impl_in_rule__ConcreteTask__Group__32989);
            rule__ConcreteTask__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__4_in_rule__ConcreteTask__Group__32992);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1525:1: rule__ConcreteTask__Group__3__Impl : ( ')' ) ;
    public final void rule__ConcreteTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1529:1: ( ( ')' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1530:1: ( ')' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1530:1: ( ')' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1531:1: ')'
            {
             before(grammarAccess.getConcreteTaskAccess().getRightParenthesisKeyword_3()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__ConcreteTask__Group__3__Impl3020); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1544:1: rule__ConcreteTask__Group__4 : rule__ConcreteTask__Group__4__Impl rule__ConcreteTask__Group__5 ;
    public final void rule__ConcreteTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1548:1: ( rule__ConcreteTask__Group__4__Impl rule__ConcreteTask__Group__5 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1549:2: rule__ConcreteTask__Group__4__Impl rule__ConcreteTask__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__4__Impl_in_rule__ConcreteTask__Group__43051);
            rule__ConcreteTask__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__5_in_rule__ConcreteTask__Group__43054);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1556:1: rule__ConcreteTask__Group__4__Impl : ( ( rule__ConcreteTask__Group_4__0 )? ) ;
    public final void rule__ConcreteTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1560:1: ( ( ( rule__ConcreteTask__Group_4__0 )? ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1561:1: ( ( rule__ConcreteTask__Group_4__0 )? )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1561:1: ( ( rule__ConcreteTask__Group_4__0 )? )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1562:1: ( rule__ConcreteTask__Group_4__0 )?
            {
             before(grammarAccess.getConcreteTaskAccess().getGroup_4()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1563:1: ( rule__ConcreteTask__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1563:2: rule__ConcreteTask__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group_4__0_in_rule__ConcreteTask__Group__4__Impl3081);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1573:1: rule__ConcreteTask__Group__5 : rule__ConcreteTask__Group__5__Impl ;
    public final void rule__ConcreteTask__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1577:1: ( rule__ConcreteTask__Group__5__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1578:2: rule__ConcreteTask__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__5__Impl_in_rule__ConcreteTask__Group__53112);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1584:1: rule__ConcreteTask__Group__5__Impl : ( ';' ) ;
    public final void rule__ConcreteTask__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1588:1: ( ( ';' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1589:1: ( ';' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1589:1: ( ';' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1590:1: ';'
            {
             before(grammarAccess.getConcreteTaskAccess().getSemicolonKeyword_5()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__ConcreteTask__Group__5__Impl3140); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1615:1: rule__ConcreteTask__Group_4__0 : rule__ConcreteTask__Group_4__0__Impl rule__ConcreteTask__Group_4__1 ;
    public final void rule__ConcreteTask__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1619:1: ( rule__ConcreteTask__Group_4__0__Impl rule__ConcreteTask__Group_4__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1620:2: rule__ConcreteTask__Group_4__0__Impl rule__ConcreteTask__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group_4__0__Impl_in_rule__ConcreteTask__Group_4__03183);
            rule__ConcreteTask__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group_4__1_in_rule__ConcreteTask__Group_4__03186);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1627:1: rule__ConcreteTask__Group_4__0__Impl : ( ':' ) ;
    public final void rule__ConcreteTask__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1631:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1632:1: ( ':' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1632:1: ( ':' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1633:1: ':'
            {
             before(grammarAccess.getConcreteTaskAccess().getColonKeyword_4_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__ConcreteTask__Group_4__0__Impl3214); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1646:1: rule__ConcreteTask__Group_4__1 : rule__ConcreteTask__Group_4__1__Impl ;
    public final void rule__ConcreteTask__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1650:1: ( rule__ConcreteTask__Group_4__1__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1651:2: rule__ConcreteTask__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group_4__1__Impl_in_rule__ConcreteTask__Group_4__13245);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1657:1: rule__ConcreteTask__Group_4__1__Impl : ( ( rule__ConcreteTask__MinRequirementAssignment_4_1 ) ) ;
    public final void rule__ConcreteTask__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1661:1: ( ( ( rule__ConcreteTask__MinRequirementAssignment_4_1 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1662:1: ( ( rule__ConcreteTask__MinRequirementAssignment_4_1 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1662:1: ( ( rule__ConcreteTask__MinRequirementAssignment_4_1 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1663:1: ( rule__ConcreteTask__MinRequirementAssignment_4_1 )
            {
             before(grammarAccess.getConcreteTaskAccess().getMinRequirementAssignment_4_1()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1664:1: ( rule__ConcreteTask__MinRequirementAssignment_4_1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1664:2: rule__ConcreteTask__MinRequirementAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__MinRequirementAssignment_4_1_in_rule__ConcreteTask__Group_4__1__Impl3272);
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


    // $ANTLR start "rule__MinRequirement__Group__0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1678:1: rule__MinRequirement__Group__0 : rule__MinRequirement__Group__0__Impl rule__MinRequirement__Group__1 ;
    public final void rule__MinRequirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1682:1: ( rule__MinRequirement__Group__0__Impl rule__MinRequirement__Group__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1683:2: rule__MinRequirement__Group__0__Impl rule__MinRequirement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__Group__0__Impl_in_rule__MinRequirement__Group__03306);
            rule__MinRequirement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__Group__1_in_rule__MinRequirement__Group__03309);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1690:1: rule__MinRequirement__Group__0__Impl : ( 'min' ) ;
    public final void rule__MinRequirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1694:1: ( ( 'min' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1695:1: ( 'min' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1695:1: ( 'min' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1696:1: 'min'
            {
             before(grammarAccess.getMinRequirementAccess().getMinKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MinRequirement__Group__0__Impl3337); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1709:1: rule__MinRequirement__Group__1 : rule__MinRequirement__Group__1__Impl rule__MinRequirement__Group__2 ;
    public final void rule__MinRequirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1713:1: ( rule__MinRequirement__Group__1__Impl rule__MinRequirement__Group__2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1714:2: rule__MinRequirement__Group__1__Impl rule__MinRequirement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__Group__1__Impl_in_rule__MinRequirement__Group__13368);
            rule__MinRequirement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__Group__2_in_rule__MinRequirement__Group__13371);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1721:1: rule__MinRequirement__Group__1__Impl : ( ( rule__MinRequirement__ValueAssignment_1 ) ) ;
    public final void rule__MinRequirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1725:1: ( ( ( rule__MinRequirement__ValueAssignment_1 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1726:1: ( ( rule__MinRequirement__ValueAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1726:1: ( ( rule__MinRequirement__ValueAssignment_1 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1727:1: ( rule__MinRequirement__ValueAssignment_1 )
            {
             before(grammarAccess.getMinRequirementAccess().getValueAssignment_1()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1728:1: ( rule__MinRequirement__ValueAssignment_1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1728:2: rule__MinRequirement__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__ValueAssignment_1_in_rule__MinRequirement__Group__1__Impl3398);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1738:1: rule__MinRequirement__Group__2 : rule__MinRequirement__Group__2__Impl ;
    public final void rule__MinRequirement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1742:1: ( rule__MinRequirement__Group__2__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1743:2: rule__MinRequirement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__Group__2__Impl_in_rule__MinRequirement__Group__23428);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1749:1: rule__MinRequirement__Group__2__Impl : ( ( rule__MinRequirement__TypeAssignment_2 ) ) ;
    public final void rule__MinRequirement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1753:1: ( ( ( rule__MinRequirement__TypeAssignment_2 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1754:1: ( ( rule__MinRequirement__TypeAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1754:1: ( ( rule__MinRequirement__TypeAssignment_2 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1755:1: ( rule__MinRequirement__TypeAssignment_2 )
            {
             before(grammarAccess.getMinRequirementAccess().getTypeAssignment_2()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1756:1: ( rule__MinRequirement__TypeAssignment_2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1756:2: rule__MinRequirement__TypeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__TypeAssignment_2_in_rule__MinRequirement__Group__2__Impl3455);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1773:1: rule__GradingSystem__CoursesAssignment : ( ruleCourse ) ;
    public final void rule__GradingSystem__CoursesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1777:1: ( ( ruleCourse ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1778:1: ( ruleCourse )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1778:1: ( ruleCourse )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1779:1: ruleCourse
            {
             before(grammarAccess.getGradingSystemAccess().getCoursesCourseParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourse_in_rule__GradingSystem__CoursesAssignment3496);
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


    // $ANTLR start "rule__Course__NameAssignment_2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1788:1: rule__Course__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Course__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1792:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1793:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1793:1: ( RULE_ID )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1794:1: RULE_ID
            {
             before(grammarAccess.getCourseAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Course__NameAssignment_23527); 
             after(grammarAccess.getCourseAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Course__NameAssignment_2"


    // $ANTLR start "rule__Course__GradingsAssignment_4"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1803:1: rule__Course__GradingsAssignment_4 : ( ruleGrading ) ;
    public final void rule__Course__GradingsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1807:1: ( ( ruleGrading ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1808:1: ( ruleGrading )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1808:1: ( ruleGrading )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1809:1: ruleGrading
            {
             before(grammarAccess.getCourseAccess().getGradingsGradingParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrading_in_rule__Course__GradingsAssignment_43558);
            ruleGrading();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getGradingsGradingParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Course__GradingsAssignment_4"


    // $ANTLR start "rule__Grading__SemesterAssignment_1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1818:1: rule__Grading__SemesterAssignment_1 : ( RULE_ID ) ;
    public final void rule__Grading__SemesterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1822:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1823:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1823:1: ( RULE_ID )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1824:1: RULE_ID
            {
             before(grammarAccess.getGradingAccess().getSemesterIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Grading__SemesterAssignment_13589); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1833:1: rule__Grading__GradingSchemeAssignment_3 : ( ruleGradingScheme ) ;
    public final void rule__Grading__GradingSchemeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1837:1: ( ( ruleGradingScheme ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1838:1: ( ruleGradingScheme )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1838:1: ( ruleGradingScheme )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1839:1: ruleGradingScheme
            {
             before(grammarAccess.getGradingAccess().getGradingSchemeGradingSchemeParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGradingScheme_in_rule__Grading__GradingSchemeAssignment_33620);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1848:1: rule__Grading__TasksAssignment_4 : ( ruleTask ) ;
    public final void rule__Grading__TasksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1852:1: ( ( ruleTask ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1853:1: ( ruleTask )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1853:1: ( ruleTask )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1854:1: ruleTask
            {
             before(grammarAccess.getGradingAccess().getTasksTaskParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTask_in_rule__Grading__TasksAssignment_43651);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1863:1: rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1867:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1868:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1868:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1869:1: ( RULE_ID )
            {
             before(grammarAccess.getGradingSchemeAccess().getMinRequirementNotFulfilledGradeGradeCrossReference_2_0()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1870:1: ( RULE_ID )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1871:1: RULE_ID
            {
             before(grammarAccess.getGradingSchemeAccess().getMinRequirementNotFulfilledGradeGradeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_23686); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1882:1: rule__GradingScheme__GradesAssignment_5 : ( ruleGrade ) ;
    public final void rule__GradingScheme__GradesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1886:1: ( ( ruleGrade ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1887:1: ( ruleGrade )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1887:1: ( ruleGrade )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1888:1: ruleGrade
            {
             before(grammarAccess.getGradingSchemeAccess().getGradesGradeParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrade_in_rule__GradingScheme__GradesAssignment_53721);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1897:1: rule__Grade__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Grade__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1901:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1902:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1902:1: ( RULE_ID )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1903:1: RULE_ID
            {
             before(grammarAccess.getGradeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Grade__NameAssignment_03752); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1912:1: rule__Grade__RequiredPointsAssignment_2 : ( RULE_INT ) ;
    public final void rule__Grade__RequiredPointsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1916:1: ( ( RULE_INT ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1917:1: ( RULE_INT )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1917:1: ( RULE_INT )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1918:1: RULE_INT
            {
             before(grammarAccess.getGradeAccess().getRequiredPointsINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Grade__RequiredPointsAssignment_23783); 
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


    // $ANTLR start "rule__TaskGroup__NameAssignment_0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1927:1: rule__TaskGroup__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TaskGroup__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1931:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1932:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1932:1: ( RULE_ID )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1933:1: RULE_ID
            {
             before(grammarAccess.getTaskGroupAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TaskGroup__NameAssignment_03814); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1942:1: rule__TaskGroup__ContainsAssignment_2 : ( ruleTask ) ;
    public final void rule__TaskGroup__ContainsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1946:1: ( ( ruleTask ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1947:1: ( ruleTask )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1947:1: ( ruleTask )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1948:1: ruleTask
            {
             before(grammarAccess.getTaskGroupAccess().getContainsTaskParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTask_in_rule__TaskGroup__ContainsAssignment_23845);
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1957:1: rule__TaskGroup__MinRequirementAssignment_3_2 : ( ruleMinRequirement ) ;
    public final void rule__TaskGroup__MinRequirementAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1961:1: ( ( ruleMinRequirement ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1962:1: ( ruleMinRequirement )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1962:1: ( ruleMinRequirement )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1963:1: ruleMinRequirement
            {
             before(grammarAccess.getTaskGroupAccess().getMinRequirementMinRequirementParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMinRequirement_in_rule__TaskGroup__MinRequirementAssignment_3_23876);
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


    // $ANTLR start "rule__ConcreteTask__NameAssignment_0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1972:1: rule__ConcreteTask__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ConcreteTask__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1976:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1977:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1977:1: ( RULE_ID )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1978:1: RULE_ID
            {
             before(grammarAccess.getConcreteTaskAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ConcreteTask__NameAssignment_03907); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1987:1: rule__ConcreteTask__MaxPointsAssignment_2 : ( RULE_INT ) ;
    public final void rule__ConcreteTask__MaxPointsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1991:1: ( ( RULE_INT ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1992:1: ( RULE_INT )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1992:1: ( RULE_INT )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1993:1: RULE_INT
            {
             before(grammarAccess.getConcreteTaskAccess().getMaxPointsINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__ConcreteTask__MaxPointsAssignment_23938); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2002:1: rule__ConcreteTask__MinRequirementAssignment_4_1 : ( ruleMinRequirement ) ;
    public final void rule__ConcreteTask__MinRequirementAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2006:1: ( ( ruleMinRequirement ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2007:1: ( ruleMinRequirement )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2007:1: ( ruleMinRequirement )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2008:1: ruleMinRequirement
            {
             before(grammarAccess.getConcreteTaskAccess().getMinRequirementMinRequirementParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMinRequirement_in_rule__ConcreteTask__MinRequirementAssignment_4_13969);
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


    // $ANTLR start "rule__MinRequirement__ValueAssignment_1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2017:1: rule__MinRequirement__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__MinRequirement__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2021:1: ( ( RULE_INT ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2022:1: ( RULE_INT )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2022:1: ( RULE_INT )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2023:1: RULE_INT
            {
             before(grammarAccess.getMinRequirementAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__MinRequirement__ValueAssignment_14000); 
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
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2032:1: rule__MinRequirement__TypeAssignment_2 : ( ruleMinRequirementsType ) ;
    public final void rule__MinRequirement__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2036:1: ( ( ruleMinRequirementsType ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2037:1: ( ruleMinRequirementsType )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2037:1: ( ruleMinRequirementsType )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2038:1: ruleMinRequirementsType
            {
             before(grammarAccess.getMinRequirementAccess().getTypeMinRequirementsTypeEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMinRequirementsType_in_rule__MinRequirement__TypeAssignment_24031);
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
        public static final BitSet FOLLOW_rule__GradingSystem__CoursesAssignment_in_ruleGradingSystem96 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__GradingSystem__CoursesAssignment_in_ruleGradingSystem108 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleCourse_in_entryRuleCourse138 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCourse145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__0_in_ruleCourse171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrading_in_entryRuleGrading198 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGrading205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__Group__0_in_ruleGrading231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGradingScheme_in_entryRuleGradingScheme258 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGradingScheme265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__0_in_ruleGradingScheme291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrade_in_entryRuleGrade318 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGrade325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grade__Group__0_in_ruleGrade351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTask_in_entryRuleTask378 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTask385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Task__Alternatives_in_ruleTask411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskGroup_in_entryRuleTaskGroup438 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTaskGroup445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__0_in_ruleTaskGroup471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteTask_in_entryRuleConcreteTask498 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConcreteTask505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__0_in_ruleConcreteTask531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMinRequirement_in_entryRuleMinRequirement558 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMinRequirement565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MinRequirement__Group__0_in_ruleMinRequirement591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MinRequirementsType__Alternatives_in_ruleMinRequirementsType628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteTask_in_rule__Task__Alternatives663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskGroup_in_rule__Task__Alternatives680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__MinRequirementsType__Alternatives713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MinRequirementsType__Alternatives734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__0__Impl_in_rule__Course__Group__0767 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Course__Group__1_in_rule__Course__Group__0770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__1__Impl_in_rule__Course__Group__1828 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Course__Group__2_in_rule__Course__Group__1831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Course__Group__1__Impl859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__2__Impl_in_rule__Course__Group__2890 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Course__Group__3_in_rule__Course__Group__2893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__NameAssignment_2_in_rule__Course__Group__2__Impl920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__3__Impl_in_rule__Course__Group__3950 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Course__Group__4_in_rule__Course__Group__3953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Course__Group__3__Impl981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__4__Impl_in_rule__Course__Group__41012 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Course__Group__5_in_rule__Course__Group__41015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__GradingsAssignment_4_in_rule__Course__Group__4__Impl1044 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Course__GradingsAssignment_4_in_rule__Course__Group__4__Impl1056 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Course__Group__5__Impl_in_rule__Course__Group__51089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Course__Group__5__Impl1117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__Group__0__Impl_in_rule__Grading__Group__01160 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Grading__Group__1_in_rule__Grading__Group__01163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Grading__Group__0__Impl1191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__Group__1__Impl_in_rule__Grading__Group__11222 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Grading__Group__2_in_rule__Grading__Group__11225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__SemesterAssignment_1_in_rule__Grading__Group__1__Impl1252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__Group__2__Impl_in_rule__Grading__Group__21282 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Grading__Group__3_in_rule__Grading__Group__21285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Grading__Group__2__Impl1313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__Group__3__Impl_in_rule__Grading__Group__31344 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_rule__Grading__Group__4_in_rule__Grading__Group__31347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__GradingSchemeAssignment_3_in_rule__Grading__Group__3__Impl1374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__Group__4__Impl_in_rule__Grading__Group__41404 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_rule__Grading__Group__5_in_rule__Grading__Group__41407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__TasksAssignment_4_in_rule__Grading__Group__4__Impl1434 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__Grading__Group__5__Impl_in_rule__Grading__Group__51465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Grading__Group__5__Impl1493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__0__Impl_in_rule__GradingScheme__Group__01536 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__1_in_rule__GradingScheme__Group__01539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__GradingScheme__Group__0__Impl1567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__1__Impl_in_rule__GradingScheme__Group__11598 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__2_in_rule__GradingScheme__Group__11601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__GradingScheme__Group__1__Impl1629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__2__Impl_in_rule__GradingScheme__Group__21660 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__3_in_rule__GradingScheme__Group__21663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2_in_rule__GradingScheme__Group__2__Impl1690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__3__Impl_in_rule__GradingScheme__Group__31720 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__4_in_rule__GradingScheme__Group__31723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__GradingScheme__Group__3__Impl1751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__4__Impl_in_rule__GradingScheme__Group__41782 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__5_in_rule__GradingScheme__Group__41785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__GradingScheme__Group__4__Impl1813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__5__Impl_in_rule__GradingScheme__Group__51844 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__6_in_rule__GradingScheme__Group__51847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__GradesAssignment_5_in_rule__GradingScheme__Group__5__Impl1876 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__GradingScheme__GradesAssignment_5_in_rule__GradingScheme__Group__5__Impl1888 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__6__Impl_in_rule__GradingScheme__Group__61921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__GradingScheme__Group__6__Impl1949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grade__Group__0__Impl_in_rule__Grade__Group__01994 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Grade__Group__1_in_rule__Grade__Group__01997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grade__NameAssignment_0_in_rule__Grade__Group__0__Impl2024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grade__Group__1__Impl_in_rule__Grade__Group__12054 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Grade__Group__2_in_rule__Grade__Group__12057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Grade__Group__1__Impl2085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grade__Group__2__Impl_in_rule__Grade__Group__22116 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Grade__Group__3_in_rule__Grade__Group__22119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grade__RequiredPointsAssignment_2_in_rule__Grade__Group__2__Impl2146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grade__Group__3__Impl_in_rule__Grade__Group__32176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Grade__Group__3__Impl2204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__0__Impl_in_rule__TaskGroup__Group__02243 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__1_in_rule__TaskGroup__Group__02246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__NameAssignment_0_in_rule__TaskGroup__Group__0__Impl2273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__1__Impl_in_rule__TaskGroup__Group__12303 = new BitSet(new long[]{0x0000000000408010L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__2_in_rule__TaskGroup__Group__12306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TaskGroup__Group__1__Impl2334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__2__Impl_in_rule__TaskGroup__Group__22365 = new BitSet(new long[]{0x0000000000408010L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__3_in_rule__TaskGroup__Group__22368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__ContainsAssignment_2_in_rule__TaskGroup__Group__2__Impl2395 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__3__Impl_in_rule__TaskGroup__Group__32426 = new BitSet(new long[]{0x0000000000408010L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__4_in_rule__TaskGroup__Group__32429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group_3__0_in_rule__TaskGroup__Group__3__Impl2456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__4__Impl_in_rule__TaskGroup__Group__42487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TaskGroup__Group__4__Impl2515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group_3__0__Impl_in_rule__TaskGroup__Group_3__02556 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group_3__1_in_rule__TaskGroup__Group_3__02559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TaskGroup__Group_3__0__Impl2587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group_3__1__Impl_in_rule__TaskGroup__Group_3__12618 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group_3__2_in_rule__TaskGroup__Group_3__12621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__TaskGroup__Group_3__1__Impl2649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group_3__2__Impl_in_rule__TaskGroup__Group_3__22680 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group_3__3_in_rule__TaskGroup__Group_3__22683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__MinRequirementAssignment_3_2_in_rule__TaskGroup__Group_3__2__Impl2710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group_3__3__Impl_in_rule__TaskGroup__Group_3__32740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TaskGroup__Group_3__3__Impl2768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__0__Impl_in_rule__ConcreteTask__Group__02807 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__1_in_rule__ConcreteTask__Group__02810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__NameAssignment_0_in_rule__ConcreteTask__Group__0__Impl2837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__1__Impl_in_rule__ConcreteTask__Group__12867 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__2_in_rule__ConcreteTask__Group__12870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ConcreteTask__Group__1__Impl2898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__2__Impl_in_rule__ConcreteTask__Group__22929 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__3_in_rule__ConcreteTask__Group__22932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__MaxPointsAssignment_2_in_rule__ConcreteTask__Group__2__Impl2959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__3__Impl_in_rule__ConcreteTask__Group__32989 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__4_in_rule__ConcreteTask__Group__32992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ConcreteTask__Group__3__Impl3020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__4__Impl_in_rule__ConcreteTask__Group__43051 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__5_in_rule__ConcreteTask__Group__43054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group_4__0_in_rule__ConcreteTask__Group__4__Impl3081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__5__Impl_in_rule__ConcreteTask__Group__53112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__ConcreteTask__Group__5__Impl3140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group_4__0__Impl_in_rule__ConcreteTask__Group_4__03183 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group_4__1_in_rule__ConcreteTask__Group_4__03186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ConcreteTask__Group_4__0__Impl3214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group_4__1__Impl_in_rule__ConcreteTask__Group_4__13245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__MinRequirementAssignment_4_1_in_rule__ConcreteTask__Group_4__1__Impl3272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MinRequirement__Group__0__Impl_in_rule__MinRequirement__Group__03306 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MinRequirement__Group__1_in_rule__MinRequirement__Group__03309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MinRequirement__Group__0__Impl3337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MinRequirement__Group__1__Impl_in_rule__MinRequirement__Group__13368 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__MinRequirement__Group__2_in_rule__MinRequirement__Group__13371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MinRequirement__ValueAssignment_1_in_rule__MinRequirement__Group__1__Impl3398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MinRequirement__Group__2__Impl_in_rule__MinRequirement__Group__23428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MinRequirement__TypeAssignment_2_in_rule__MinRequirement__Group__2__Impl3455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourse_in_rule__GradingSystem__CoursesAssignment3496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Course__NameAssignment_23527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrading_in_rule__Course__GradingsAssignment_43558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Grading__SemesterAssignment_13589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGradingScheme_in_rule__Grading__GradingSchemeAssignment_33620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTask_in_rule__Grading__TasksAssignment_43651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_23686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrade_in_rule__GradingScheme__GradesAssignment_53721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Grade__NameAssignment_03752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Grade__RequiredPointsAssignment_23783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TaskGroup__NameAssignment_03814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTask_in_rule__TaskGroup__ContainsAssignment_23845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMinRequirement_in_rule__TaskGroup__MinRequirementAssignment_3_23876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ConcreteTask__NameAssignment_03907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__ConcreteTask__MaxPointsAssignment_23938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMinRequirement_in_rule__ConcreteTask__MinRequirementAssignment_4_13969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__MinRequirement__ValueAssignment_14000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMinRequirementsType_in_rule__MinRequirement__TypeAssignment_24031 = new BitSet(new long[]{0x0000000000000002L});
    }


}