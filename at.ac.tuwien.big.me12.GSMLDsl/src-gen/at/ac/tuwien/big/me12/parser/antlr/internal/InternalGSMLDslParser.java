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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGSMLDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'course'", "'{'", "'}'", "'semester'", "'grading scheme'", "'('", "')'", "':'", "';'", "'@all'", "'min'", "'point(s)'", "'%'"
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
    public String getGrammarFileName() { return "../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g"; }



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



    // $ANTLR start "entryRuleGradingSystem"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:68:1: entryRuleGradingSystem returns [EObject current=null] : iv_ruleGradingSystem= ruleGradingSystem EOF ;
    public final EObject entryRuleGradingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGradingSystem = null;


        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:69:2: (iv_ruleGradingSystem= ruleGradingSystem EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:70:2: iv_ruleGradingSystem= ruleGradingSystem EOF
            {
             newCompositeNode(grammarAccess.getGradingSystemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGradingSystem_in_entryRuleGradingSystem75);
            iv_ruleGradingSystem=ruleGradingSystem();

            state._fsp--;

             current =iv_ruleGradingSystem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGradingSystem85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGradingSystem"


    // $ANTLR start "ruleGradingSystem"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:77:1: ruleGradingSystem returns [EObject current=null] : ( (lv_courses_0_0= ruleCourse ) )+ ;
    public final EObject ruleGradingSystem() throws RecognitionException {
        EObject current = null;

        EObject lv_courses_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:80:28: ( ( (lv_courses_0_0= ruleCourse ) )+ )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:81:1: ( (lv_courses_0_0= ruleCourse ) )+
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:81:1: ( (lv_courses_0_0= ruleCourse ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:82:1: (lv_courses_0_0= ruleCourse )
            	    {
            	    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:82:1: (lv_courses_0_0= ruleCourse )
            	    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:83:3: lv_courses_0_0= ruleCourse
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGradingSystemAccess().getCoursesCourseParserRuleCall_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCourse_in_ruleGradingSystem130);
            	    lv_courses_0_0=ruleCourse();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGradingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"courses",
            	            		lv_courses_0_0, 
            	            		"Course");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGradingSystem"


    // $ANTLR start "entryRuleCourse"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:107:1: entryRuleCourse returns [EObject current=null] : iv_ruleCourse= ruleCourse EOF ;
    public final EObject entryRuleCourse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCourse = null;


        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:108:2: (iv_ruleCourse= ruleCourse EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:109:2: iv_ruleCourse= ruleCourse EOF
            {
             newCompositeNode(grammarAccess.getCourseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourse_in_entryRuleCourse166);
            iv_ruleCourse=ruleCourse();

            state._fsp--;

             current =iv_ruleCourse; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCourse176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCourse"


    // $ANTLR start "ruleCourse"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:116:1: ruleCourse returns [EObject current=null] : ( () otherlv_1= 'course' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_gradings_4_0= ruleGrading ) )+ otherlv_5= '}' ) ;
    public final EObject ruleCourse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_gradings_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:119:28: ( ( () otherlv_1= 'course' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_gradings_4_0= ruleGrading ) )+ otherlv_5= '}' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:120:1: ( () otherlv_1= 'course' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_gradings_4_0= ruleGrading ) )+ otherlv_5= '}' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:120:1: ( () otherlv_1= 'course' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_gradings_4_0= ruleGrading ) )+ otherlv_5= '}' )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:120:2: () otherlv_1= 'course' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_gradings_4_0= ruleGrading ) )+ otherlv_5= '}'
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:120:2: ()
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:121:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCourseAccess().getCourseAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCourse222); 

                	newLeafNode(otherlv_1, grammarAccess.getCourseAccess().getCourseKeyword_1());
                
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:130:1: ( (lv_name_2_0= RULE_ID ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:131:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:131:1: (lv_name_2_0= RULE_ID )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:132:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCourse239); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCourseAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCourseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCourse256); 

                	newLeafNode(otherlv_3, grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:152:1: ( (lv_gradings_4_0= ruleGrading ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:153:1: (lv_gradings_4_0= ruleGrading )
            	    {
            	    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:153:1: (lv_gradings_4_0= ruleGrading )
            	    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:154:3: lv_gradings_4_0= ruleGrading
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCourseAccess().getGradingsGradingParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleGrading_in_ruleCourse277);
            	    lv_gradings_4_0=ruleGrading();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCourseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"gradings",
            	            		lv_gradings_4_0, 
            	            		"Grading");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCourse290); 

                	newLeafNode(otherlv_5, grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCourse"


    // $ANTLR start "entryRuleGrading"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:182:1: entryRuleGrading returns [EObject current=null] : iv_ruleGrading= ruleGrading EOF ;
    public final EObject entryRuleGrading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrading = null;


        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:183:2: (iv_ruleGrading= ruleGrading EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:184:2: iv_ruleGrading= ruleGrading EOF
            {
             newCompositeNode(grammarAccess.getGradingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrading_in_entryRuleGrading326);
            iv_ruleGrading=ruleGrading();

            state._fsp--;

             current =iv_ruleGrading; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGrading336); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrading"


    // $ANTLR start "ruleGrading"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:191:1: ruleGrading returns [EObject current=null] : (otherlv_0= 'semester' ( (lv_semester_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_gradingScheme_3_0= ruleGradingScheme ) ) ( (lv_tasks_4_0= ruleTask ) )* otherlv_5= '}' ) ;
    public final EObject ruleGrading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_semester_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_gradingScheme_3_0 = null;

        EObject lv_tasks_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:194:28: ( (otherlv_0= 'semester' ( (lv_semester_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_gradingScheme_3_0= ruleGradingScheme ) ) ( (lv_tasks_4_0= ruleTask ) )* otherlv_5= '}' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:195:1: (otherlv_0= 'semester' ( (lv_semester_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_gradingScheme_3_0= ruleGradingScheme ) ) ( (lv_tasks_4_0= ruleTask ) )* otherlv_5= '}' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:195:1: (otherlv_0= 'semester' ( (lv_semester_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_gradingScheme_3_0= ruleGradingScheme ) ) ( (lv_tasks_4_0= ruleTask ) )* otherlv_5= '}' )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:195:3: otherlv_0= 'semester' ( (lv_semester_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_gradingScheme_3_0= ruleGradingScheme ) ) ( (lv_tasks_4_0= ruleTask ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGrading373); 

                	newLeafNode(otherlv_0, grammarAccess.getGradingAccess().getSemesterKeyword_0());
                
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:199:1: ( (lv_semester_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:200:1: (lv_semester_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:200:1: (lv_semester_1_0= RULE_ID )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:201:3: lv_semester_1_0= RULE_ID
            {
            lv_semester_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGrading390); 

            			newLeafNode(lv_semester_1_0, grammarAccess.getGradingAccess().getSemesterIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGradingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"semester",
                    		lv_semester_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGrading407); 

                	newLeafNode(otherlv_2, grammarAccess.getGradingAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:221:1: ( (lv_gradingScheme_3_0= ruleGradingScheme ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:222:1: (lv_gradingScheme_3_0= ruleGradingScheme )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:222:1: (lv_gradingScheme_3_0= ruleGradingScheme )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:223:3: lv_gradingScheme_3_0= ruleGradingScheme
            {
             
            	        newCompositeNode(grammarAccess.getGradingAccess().getGradingSchemeGradingSchemeParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleGradingScheme_in_ruleGrading428);
            lv_gradingScheme_3_0=ruleGradingScheme();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGradingRule());
            	        }
                   		set(
                   			current, 
                   			"gradingScheme",
                    		lv_gradingScheme_3_0, 
                    		"GradingScheme");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:239:2: ( (lv_tasks_4_0= ruleTask ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:240:1: (lv_tasks_4_0= ruleTask )
            	    {
            	    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:240:1: (lv_tasks_4_0= ruleTask )
            	    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:241:3: lv_tasks_4_0= ruleTask
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGradingAccess().getTasksTaskParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTask_in_ruleGrading449);
            	    lv_tasks_4_0=ruleTask();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGradingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tasks",
            	            		lv_tasks_4_0, 
            	            		"Task");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGrading462); 

                	newLeafNode(otherlv_5, grammarAccess.getGradingAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrading"


    // $ANTLR start "entryRuleGradingScheme"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:269:1: entryRuleGradingScheme returns [EObject current=null] : iv_ruleGradingScheme= ruleGradingScheme EOF ;
    public final EObject entryRuleGradingScheme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGradingScheme = null;


        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:270:2: (iv_ruleGradingScheme= ruleGradingScheme EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:271:2: iv_ruleGradingScheme= ruleGradingScheme EOF
            {
             newCompositeNode(grammarAccess.getGradingSchemeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGradingScheme_in_entryRuleGradingScheme498);
            iv_ruleGradingScheme=ruleGradingScheme();

            state._fsp--;

             current =iv_ruleGradingScheme; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGradingScheme508); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGradingScheme"


    // $ANTLR start "ruleGradingScheme"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:278:1: ruleGradingScheme returns [EObject current=null] : (otherlv_0= 'grading scheme' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_grades_5_0= ruleGrade ) )+ otherlv_6= '}' ) ;
    public final EObject ruleGradingScheme() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_grades_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:281:28: ( (otherlv_0= 'grading scheme' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_grades_5_0= ruleGrade ) )+ otherlv_6= '}' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:282:1: (otherlv_0= 'grading scheme' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_grades_5_0= ruleGrade ) )+ otherlv_6= '}' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:282:1: (otherlv_0= 'grading scheme' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_grades_5_0= ruleGrade ) )+ otherlv_6= '}' )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:282:3: otherlv_0= 'grading scheme' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_grades_5_0= ruleGrade ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGradingScheme545); 

                	newLeafNode(otherlv_0, grammarAccess.getGradingSchemeAccess().getGradingSchemeKeyword_0());
                
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGradingScheme557); 

                	newLeafNode(otherlv_1, grammarAccess.getGradingSchemeAccess().getLeftParenthesisKeyword_1());
                
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:290:1: ( (otherlv_2= RULE_ID ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:291:1: (otherlv_2= RULE_ID )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:291:1: (otherlv_2= RULE_ID )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:292:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGradingSchemeRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGradingScheme577); 

            		newLeafNode(otherlv_2, grammarAccess.getGradingSchemeAccess().getMinRequirementNotFulfilledGradeGradeCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGradingScheme589); 

                	newLeafNode(otherlv_3, grammarAccess.getGradingSchemeAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGradingScheme601); 

                	newLeafNode(otherlv_4, grammarAccess.getGradingSchemeAccess().getLeftCurlyBracketKeyword_4());
                
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:311:1: ( (lv_grades_5_0= ruleGrade ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:312:1: (lv_grades_5_0= ruleGrade )
            	    {
            	    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:312:1: (lv_grades_5_0= ruleGrade )
            	    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:313:3: lv_grades_5_0= ruleGrade
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGradingSchemeAccess().getGradesGradeParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleGrade_in_ruleGradingScheme622);
            	    lv_grades_5_0=ruleGrade();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGradingSchemeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"grades",
            	            		lv_grades_5_0, 
            	            		"Grade");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGradingScheme635); 

                	newLeafNode(otherlv_6, grammarAccess.getGradingSchemeAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGradingScheme"


    // $ANTLR start "entryRuleGrade"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:341:1: entryRuleGrade returns [EObject current=null] : iv_ruleGrade= ruleGrade EOF ;
    public final EObject entryRuleGrade() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrade = null;


        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:342:2: (iv_ruleGrade= ruleGrade EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:343:2: iv_ruleGrade= ruleGrade EOF
            {
             newCompositeNode(grammarAccess.getGradeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrade_in_entryRuleGrade671);
            iv_ruleGrade=ruleGrade();

            state._fsp--;

             current =iv_ruleGrade; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGrade681); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrade"


    // $ANTLR start "ruleGrade"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:350:1: ruleGrade returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_requiredPoints_2_0= RULE_INT ) ) otherlv_3= ';' ) ;
    public final EObject ruleGrade() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_requiredPoints_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:353:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_requiredPoints_2_0= RULE_INT ) ) otherlv_3= ';' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:354:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_requiredPoints_2_0= RULE_INT ) ) otherlv_3= ';' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:354:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_requiredPoints_2_0= RULE_INT ) ) otherlv_3= ';' )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:354:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_requiredPoints_2_0= RULE_INT ) ) otherlv_3= ';'
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:354:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:355:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:355:1: (lv_name_0_0= RULE_ID )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:356:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGrade723); 

            			newLeafNode(lv_name_0_0, grammarAccess.getGradeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGradeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGrade740); 

                	newLeafNode(otherlv_1, grammarAccess.getGradeAccess().getColonKeyword_1());
                
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:376:1: ( (lv_requiredPoints_2_0= RULE_INT ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:377:1: (lv_requiredPoints_2_0= RULE_INT )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:377:1: (lv_requiredPoints_2_0= RULE_INT )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:378:3: lv_requiredPoints_2_0= RULE_INT
            {
            lv_requiredPoints_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleGrade757); 

            			newLeafNode(lv_requiredPoints_2_0, grammarAccess.getGradeAccess().getRequiredPointsINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGradeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"requiredPoints",
                    		lv_requiredPoints_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGrade774); 

                	newLeafNode(otherlv_3, grammarAccess.getGradeAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrade"


    // $ANTLR start "entryRuleTask"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:406:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:407:2: (iv_ruleTask= ruleTask EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:408:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTask_in_entryRuleTask810);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTask820); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:415:1: ruleTask returns [EObject current=null] : (this_ConcreteTask_0= ruleConcreteTask | this_TaskGroup_1= ruleTaskGroup ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        EObject this_ConcreteTask_0 = null;

        EObject this_TaskGroup_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:418:28: ( (this_ConcreteTask_0= ruleConcreteTask | this_TaskGroup_1= ruleTaskGroup ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:419:1: (this_ConcreteTask_0= ruleConcreteTask | this_TaskGroup_1= ruleTaskGroup )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:419:1: (this_ConcreteTask_0= ruleConcreteTask | this_TaskGroup_1= ruleTaskGroup )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==16) ) {
                    alt5=1;
                }
                else if ( (LA5_1==12) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:420:5: this_ConcreteTask_0= ruleConcreteTask
                    {
                     
                            newCompositeNode(grammarAccess.getTaskAccess().getConcreteTaskParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConcreteTask_in_ruleTask867);
                    this_ConcreteTask_0=ruleConcreteTask();

                    state._fsp--;

                     
                            current = this_ConcreteTask_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:430:5: this_TaskGroup_1= ruleTaskGroup
                    {
                     
                            newCompositeNode(grammarAccess.getTaskAccess().getTaskGroupParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTaskGroup_in_ruleTask894);
                    this_TaskGroup_1=ruleTaskGroup();

                    state._fsp--;

                     
                            current = this_TaskGroup_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleTaskGroup"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:446:1: entryRuleTaskGroup returns [EObject current=null] : iv_ruleTaskGroup= ruleTaskGroup EOF ;
    public final EObject entryRuleTaskGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskGroup = null;


        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:447:2: (iv_ruleTaskGroup= ruleTaskGroup EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:448:2: iv_ruleTaskGroup= ruleTaskGroup EOF
            {
             newCompositeNode(grammarAccess.getTaskGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTaskGroup_in_entryRuleTaskGroup929);
            iv_ruleTaskGroup=ruleTaskGroup();

            state._fsp--;

             current =iv_ruleTaskGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTaskGroup939); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskGroup"


    // $ANTLR start "ruleTaskGroup"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:455:1: ruleTaskGroup returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_contains_2_0= ruleTask ) )* (otherlv_3= '@all' otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) ) otherlv_6= ';' )? otherlv_7= '}' ) ;
    public final EObject ruleTaskGroup() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_contains_2_0 = null;

        EObject lv_minRequirement_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:458:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_contains_2_0= ruleTask ) )* (otherlv_3= '@all' otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) ) otherlv_6= ';' )? otherlv_7= '}' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:459:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_contains_2_0= ruleTask ) )* (otherlv_3= '@all' otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) ) otherlv_6= ';' )? otherlv_7= '}' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:459:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_contains_2_0= ruleTask ) )* (otherlv_3= '@all' otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) ) otherlv_6= ';' )? otherlv_7= '}' )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:459:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_contains_2_0= ruleTask ) )* (otherlv_3= '@all' otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) ) otherlv_6= ';' )? otherlv_7= '}'
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:459:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:460:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:460:1: (lv_name_0_0= RULE_ID )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:461:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTaskGroup981); 

            			newLeafNode(lv_name_0_0, grammarAccess.getTaskGroupAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTaskGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTaskGroup998); 

                	newLeafNode(otherlv_1, grammarAccess.getTaskGroupAccess().getLeftCurlyBracketKeyword_1());
                
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:481:1: ( (lv_contains_2_0= ruleTask ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:482:1: (lv_contains_2_0= ruleTask )
            	    {
            	    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:482:1: (lv_contains_2_0= ruleTask )
            	    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:483:3: lv_contains_2_0= ruleTask
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTaskGroupAccess().getContainsTaskParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTask_in_ruleTaskGroup1019);
            	    lv_contains_2_0=ruleTask();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTaskGroupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contains",
            	            		lv_contains_2_0, 
            	            		"Task");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:499:3: (otherlv_3= '@all' otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) ) otherlv_6= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:499:5: otherlv_3= '@all' otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTaskGroup1033); 

                        	newLeafNode(otherlv_3, grammarAccess.getTaskGroupAccess().getAllKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTaskGroup1045); 

                        	newLeafNode(otherlv_4, grammarAccess.getTaskGroupAccess().getColonKeyword_3_1());
                        
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:507:1: ( (lv_minRequirement_5_0= ruleMinRequirement ) )
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:508:1: (lv_minRequirement_5_0= ruleMinRequirement )
                    {
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:508:1: (lv_minRequirement_5_0= ruleMinRequirement )
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:509:3: lv_minRequirement_5_0= ruleMinRequirement
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaskGroupAccess().getMinRequirementMinRequirementParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMinRequirement_in_ruleTaskGroup1066);
                    lv_minRequirement_5_0=ruleMinRequirement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTaskGroupRule());
                    	        }
                           		set(
                           			current, 
                           			"minRequirement",
                            		lv_minRequirement_5_0, 
                            		"MinRequirement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTaskGroup1078); 

                        	newLeafNode(otherlv_6, grammarAccess.getTaskGroupAccess().getSemicolonKeyword_3_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTaskGroup1092); 

                	newLeafNode(otherlv_7, grammarAccess.getTaskGroupAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskGroup"


    // $ANTLR start "entryRuleConcreteTask"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:541:1: entryRuleConcreteTask returns [EObject current=null] : iv_ruleConcreteTask= ruleConcreteTask EOF ;
    public final EObject entryRuleConcreteTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteTask = null;


        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:542:2: (iv_ruleConcreteTask= ruleConcreteTask EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:543:2: iv_ruleConcreteTask= ruleConcreteTask EOF
            {
             newCompositeNode(grammarAccess.getConcreteTaskRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConcreteTask_in_entryRuleConcreteTask1128);
            iv_ruleConcreteTask=ruleConcreteTask();

            state._fsp--;

             current =iv_ruleConcreteTask; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConcreteTask1138); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcreteTask"


    // $ANTLR start "ruleConcreteTask"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:550:1: ruleConcreteTask returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_maxPoints_2_0= RULE_INT ) ) otherlv_3= ')' (otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleConcreteTask() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_maxPoints_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_minRequirement_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:553:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_maxPoints_2_0= RULE_INT ) ) otherlv_3= ')' (otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) ) )? otherlv_6= ';' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:554:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_maxPoints_2_0= RULE_INT ) ) otherlv_3= ')' (otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) ) )? otherlv_6= ';' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:554:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_maxPoints_2_0= RULE_INT ) ) otherlv_3= ')' (otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) ) )? otherlv_6= ';' )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:554:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_maxPoints_2_0= RULE_INT ) ) otherlv_3= ')' (otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) ) )? otherlv_6= ';'
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:554:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:555:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:555:1: (lv_name_0_0= RULE_ID )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:556:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConcreteTask1180); 

            			newLeafNode(lv_name_0_0, grammarAccess.getConcreteTaskAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConcreteTaskRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConcreteTask1197); 

                	newLeafNode(otherlv_1, grammarAccess.getConcreteTaskAccess().getLeftParenthesisKeyword_1());
                
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:576:1: ( (lv_maxPoints_2_0= RULE_INT ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:577:1: (lv_maxPoints_2_0= RULE_INT )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:577:1: (lv_maxPoints_2_0= RULE_INT )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:578:3: lv_maxPoints_2_0= RULE_INT
            {
            lv_maxPoints_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleConcreteTask1214); 

            			newLeafNode(lv_maxPoints_2_0, grammarAccess.getConcreteTaskAccess().getMaxPointsINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConcreteTaskRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"maxPoints",
                    		lv_maxPoints_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConcreteTask1231); 

                	newLeafNode(otherlv_3, grammarAccess.getConcreteTaskAccess().getRightParenthesisKeyword_3());
                
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:598:1: (otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:598:3: otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) )
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConcreteTask1244); 

                        	newLeafNode(otherlv_4, grammarAccess.getConcreteTaskAccess().getColonKeyword_4_0());
                        
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:602:1: ( (lv_minRequirement_5_0= ruleMinRequirement ) )
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:603:1: (lv_minRequirement_5_0= ruleMinRequirement )
                    {
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:603:1: (lv_minRequirement_5_0= ruleMinRequirement )
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:604:3: lv_minRequirement_5_0= ruleMinRequirement
                    {
                     
                    	        newCompositeNode(grammarAccess.getConcreteTaskAccess().getMinRequirementMinRequirementParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMinRequirement_in_ruleConcreteTask1265);
                    lv_minRequirement_5_0=ruleMinRequirement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConcreteTaskRule());
                    	        }
                           		set(
                           			current, 
                           			"minRequirement",
                            		lv_minRequirement_5_0, 
                            		"MinRequirement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleConcreteTask1279); 

                	newLeafNode(otherlv_6, grammarAccess.getConcreteTaskAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcreteTask"


    // $ANTLR start "entryRuleMinRequirement"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:632:1: entryRuleMinRequirement returns [EObject current=null] : iv_ruleMinRequirement= ruleMinRequirement EOF ;
    public final EObject entryRuleMinRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinRequirement = null;


        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:633:2: (iv_ruleMinRequirement= ruleMinRequirement EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:634:2: iv_ruleMinRequirement= ruleMinRequirement EOF
            {
             newCompositeNode(grammarAccess.getMinRequirementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMinRequirement_in_entryRuleMinRequirement1315);
            iv_ruleMinRequirement=ruleMinRequirement();

            state._fsp--;

             current =iv_ruleMinRequirement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMinRequirement1325); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinRequirement"


    // $ANTLR start "ruleMinRequirement"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:641:1: ruleMinRequirement returns [EObject current=null] : (otherlv_0= 'min' ( (lv_value_1_0= RULE_INT ) ) ( (lv_type_2_0= ruleMinRequirementsType ) ) ) ;
    public final EObject ruleMinRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Enumerator lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:644:28: ( (otherlv_0= 'min' ( (lv_value_1_0= RULE_INT ) ) ( (lv_type_2_0= ruleMinRequirementsType ) ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:645:1: (otherlv_0= 'min' ( (lv_value_1_0= RULE_INT ) ) ( (lv_type_2_0= ruleMinRequirementsType ) ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:645:1: (otherlv_0= 'min' ( (lv_value_1_0= RULE_INT ) ) ( (lv_type_2_0= ruleMinRequirementsType ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:645:3: otherlv_0= 'min' ( (lv_value_1_0= RULE_INT ) ) ( (lv_type_2_0= ruleMinRequirementsType ) )
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMinRequirement1362); 

                	newLeafNode(otherlv_0, grammarAccess.getMinRequirementAccess().getMinKeyword_0());
                
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:649:1: ( (lv_value_1_0= RULE_INT ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:650:1: (lv_value_1_0= RULE_INT )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:650:1: (lv_value_1_0= RULE_INT )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:651:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleMinRequirement1379); 

            			newLeafNode(lv_value_1_0, grammarAccess.getMinRequirementAccess().getValueINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMinRequirementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"INT");
            	    

            }


            }

            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:667:2: ( (lv_type_2_0= ruleMinRequirementsType ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:668:1: (lv_type_2_0= ruleMinRequirementsType )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:668:1: (lv_type_2_0= ruleMinRequirementsType )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:669:3: lv_type_2_0= ruleMinRequirementsType
            {
             
            	        newCompositeNode(grammarAccess.getMinRequirementAccess().getTypeMinRequirementsTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMinRequirementsType_in_ruleMinRequirement1405);
            lv_type_2_0=ruleMinRequirementsType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMinRequirementRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"MinRequirementsType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinRequirement"


    // $ANTLR start "ruleMinRequirementsType"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:693:1: ruleMinRequirementsType returns [Enumerator current=null] : ( (enumLiteral_0= 'point(s)' ) | (enumLiteral_1= '%' ) ) ;
    public final Enumerator ruleMinRequirementsType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:695:28: ( ( (enumLiteral_0= 'point(s)' ) | (enumLiteral_1= '%' ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:696:1: ( (enumLiteral_0= 'point(s)' ) | (enumLiteral_1= '%' ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:696:1: ( (enumLiteral_0= 'point(s)' ) | (enumLiteral_1= '%' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            else if ( (LA9_0==23) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:696:2: (enumLiteral_0= 'point(s)' )
                    {
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:696:2: (enumLiteral_0= 'point(s)' )
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:696:4: enumLiteral_0= 'point(s)'
                    {
                    enumLiteral_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMinRequirementsType1455); 

                            current = grammarAccess.getMinRequirementsTypeAccess().getAbsoluteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMinRequirementsTypeAccess().getAbsoluteEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:702:6: (enumLiteral_1= '%' )
                    {
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:702:6: (enumLiteral_1= '%' )
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:702:8: enumLiteral_1= '%'
                    {
                    enumLiteral_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMinRequirementsType1472); 

                            current = grammarAccess.getMinRequirementsTypeAccess().getPercentageEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMinRequirementsTypeAccess().getPercentageEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinRequirementsType"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleGradingSystem_in_entryRuleGradingSystem75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGradingSystem85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourse_in_ruleGradingSystem130 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_ruleCourse_in_entryRuleCourse166 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCourse176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleCourse222 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCourse239 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCourse256 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleGrading_in_ruleCourse277 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleCourse290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrading_in_entryRuleGrading326 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGrading336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleGrading373 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGrading390 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGrading407 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleGradingScheme_in_ruleGrading428 = new BitSet(new long[]{0x0000000000002010L});
        public static final BitSet FOLLOW_ruleTask_in_ruleGrading449 = new BitSet(new long[]{0x0000000000002010L});
        public static final BitSet FOLLOW_13_in_ruleGrading462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGradingScheme_in_entryRuleGradingScheme498 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGradingScheme508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleGradingScheme545 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleGradingScheme557 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGradingScheme577 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleGradingScheme589 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGradingScheme601 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleGrade_in_ruleGradingScheme622 = new BitSet(new long[]{0x0000000000002010L});
        public static final BitSet FOLLOW_13_in_ruleGradingScheme635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrade_in_entryRuleGrade671 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGrade681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGrade723 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleGrade740 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleGrade757 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleGrade774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTask_in_entryRuleTask810 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTask820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteTask_in_ruleTask867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskGroup_in_ruleTask894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskGroup_in_entryRuleTaskGroup929 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTaskGroup939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTaskGroup981 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTaskGroup998 = new BitSet(new long[]{0x0000000000102010L});
        public static final BitSet FOLLOW_ruleTask_in_ruleTaskGroup1019 = new BitSet(new long[]{0x0000000000102010L});
        public static final BitSet FOLLOW_20_in_ruleTaskGroup1033 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTaskGroup1045 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleMinRequirement_in_ruleTaskGroup1066 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleTaskGroup1078 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTaskGroup1092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteTask_in_entryRuleConcreteTask1128 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConcreteTask1138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConcreteTask1180 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleConcreteTask1197 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleConcreteTask1214 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleConcreteTask1231 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleConcreteTask1244 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleMinRequirement_in_ruleConcreteTask1265 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleConcreteTask1279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMinRequirement_in_entryRuleMinRequirement1315 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMinRequirement1325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleMinRequirement1362 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleMinRequirement1379 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_ruleMinRequirementsType_in_ruleMinRequirement1405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleMinRequirementsType1455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleMinRequirementsType1472 = new BitSet(new long[]{0x0000000000000002L});
    }


}