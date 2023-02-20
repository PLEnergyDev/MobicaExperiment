package org.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.MCCGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMCCParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'-->'", "'--|'", "'--::'", "'Cloud'", "'['", "','", "']'", "';'", "'Mobile'", "'Application'", "'{'", "'}'", "'Structure'", "'Fragment'", "'System'", "':='", "'|'", "'init'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMCCParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMCCParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMCCParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMCC.g"; }


    	private MCCGrammarAccess grammarAccess;

    	public void setGrammarAccess(MCCGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalMCC.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMCC.g:54:1: ( ruleModel EOF )
            // InternalMCC.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMCC.g:62:1: ruleModel : ( ( rule__Model__Alternatives )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:66:2: ( ( ( rule__Model__Alternatives )* ) )
            // InternalMCC.g:67:2: ( ( rule__Model__Alternatives )* )
            {
            // InternalMCC.g:67:2: ( ( rule__Model__Alternatives )* )
            // InternalMCC.g:68:3: ( rule__Model__Alternatives )*
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // InternalMCC.g:69:3: ( rule__Model__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||(LA1_0>=21 && LA1_0<=22)||LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMCC.g:69:4: rule__Model__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDevice"
    // InternalMCC.g:78:1: entryRuleDevice : ruleDevice EOF ;
    public final void entryRuleDevice() throws RecognitionException {
        try {
            // InternalMCC.g:79:1: ( ruleDevice EOF )
            // InternalMCC.g:80:1: ruleDevice EOF
            {
             before(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getDeviceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalMCC.g:87:1: ruleDevice : ( ( rule__Device__Alternatives ) ) ;
    public final void ruleDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:91:2: ( ( ( rule__Device__Alternatives ) ) )
            // InternalMCC.g:92:2: ( ( rule__Device__Alternatives ) )
            {
            // InternalMCC.g:92:2: ( ( rule__Device__Alternatives ) )
            // InternalMCC.g:93:3: ( rule__Device__Alternatives )
            {
             before(grammarAccess.getDeviceAccess().getAlternatives()); 
            // InternalMCC.g:94:3: ( rule__Device__Alternatives )
            // InternalMCC.g:94:4: rule__Device__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Device__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleCloud"
    // InternalMCC.g:103:1: entryRuleCloud : ruleCloud EOF ;
    public final void entryRuleCloud() throws RecognitionException {
        try {
            // InternalMCC.g:104:1: ( ruleCloud EOF )
            // InternalMCC.g:105:1: ruleCloud EOF
            {
             before(grammarAccess.getCloudRule()); 
            pushFollow(FOLLOW_1);
            ruleCloud();

            state._fsp--;

             after(grammarAccess.getCloudRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCloud"


    // $ANTLR start "ruleCloud"
    // InternalMCC.g:112:1: ruleCloud : ( ( rule__Cloud__Group__0 ) ) ;
    public final void ruleCloud() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:116:2: ( ( ( rule__Cloud__Group__0 ) ) )
            // InternalMCC.g:117:2: ( ( rule__Cloud__Group__0 ) )
            {
            // InternalMCC.g:117:2: ( ( rule__Cloud__Group__0 ) )
            // InternalMCC.g:118:3: ( rule__Cloud__Group__0 )
            {
             before(grammarAccess.getCloudAccess().getGroup()); 
            // InternalMCC.g:119:3: ( rule__Cloud__Group__0 )
            // InternalMCC.g:119:4: rule__Cloud__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCloudAccess().getGroup()); 

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
    // $ANTLR end "ruleCloud"


    // $ANTLR start "entryRuleMobile"
    // InternalMCC.g:128:1: entryRuleMobile : ruleMobile EOF ;
    public final void entryRuleMobile() throws RecognitionException {
        try {
            // InternalMCC.g:129:1: ( ruleMobile EOF )
            // InternalMCC.g:130:1: ruleMobile EOF
            {
             before(grammarAccess.getMobileRule()); 
            pushFollow(FOLLOW_1);
            ruleMobile();

            state._fsp--;

             after(grammarAccess.getMobileRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMobile"


    // $ANTLR start "ruleMobile"
    // InternalMCC.g:137:1: ruleMobile : ( ( rule__Mobile__Group__0 ) ) ;
    public final void ruleMobile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:141:2: ( ( ( rule__Mobile__Group__0 ) ) )
            // InternalMCC.g:142:2: ( ( rule__Mobile__Group__0 ) )
            {
            // InternalMCC.g:142:2: ( ( rule__Mobile__Group__0 ) )
            // InternalMCC.g:143:3: ( rule__Mobile__Group__0 )
            {
             before(grammarAccess.getMobileAccess().getGroup()); 
            // InternalMCC.g:144:3: ( rule__Mobile__Group__0 )
            // InternalMCC.g:144:4: rule__Mobile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mobile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobileAccess().getGroup()); 

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
    // $ANTLR end "ruleMobile"


    // $ANTLR start "entryRuleApplication"
    // InternalMCC.g:153:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // InternalMCC.g:154:1: ( ruleApplication EOF )
            // InternalMCC.g:155:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getApplicationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalMCC.g:162:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:166:2: ( ( ( rule__Application__Group__0 ) ) )
            // InternalMCC.g:167:2: ( ( rule__Application__Group__0 ) )
            {
            // InternalMCC.g:167:2: ( ( rule__Application__Group__0 ) )
            // InternalMCC.g:168:3: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // InternalMCC.g:169:3: ( rule__Application__Group__0 )
            // InternalMCC.g:169:4: rule__Application__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroup()); 

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
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleStructure"
    // InternalMCC.g:178:1: entryRuleStructure : ruleStructure EOF ;
    public final void entryRuleStructure() throws RecognitionException {
        try {
            // InternalMCC.g:179:1: ( ruleStructure EOF )
            // InternalMCC.g:180:1: ruleStructure EOF
            {
             before(grammarAccess.getStructureRule()); 
            pushFollow(FOLLOW_1);
            ruleStructure();

            state._fsp--;

             after(grammarAccess.getStructureRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStructure"


    // $ANTLR start "ruleStructure"
    // InternalMCC.g:187:1: ruleStructure : ( ( rule__Structure__Group__0 ) ) ;
    public final void ruleStructure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:191:2: ( ( ( rule__Structure__Group__0 ) ) )
            // InternalMCC.g:192:2: ( ( rule__Structure__Group__0 ) )
            {
            // InternalMCC.g:192:2: ( ( rule__Structure__Group__0 ) )
            // InternalMCC.g:193:3: ( rule__Structure__Group__0 )
            {
             before(grammarAccess.getStructureAccess().getGroup()); 
            // InternalMCC.g:194:3: ( rule__Structure__Group__0 )
            // InternalMCC.g:194:4: rule__Structure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Structure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructureAccess().getGroup()); 

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
    // $ANTLR end "ruleStructure"


    // $ANTLR start "entryRuleEdge"
    // InternalMCC.g:203:1: entryRuleEdge : ruleEdge EOF ;
    public final void entryRuleEdge() throws RecognitionException {
        try {
            // InternalMCC.g:204:1: ( ruleEdge EOF )
            // InternalMCC.g:205:1: ruleEdge EOF
            {
             before(grammarAccess.getEdgeRule()); 
            pushFollow(FOLLOW_1);
            ruleEdge();

            state._fsp--;

             after(grammarAccess.getEdgeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEdge"


    // $ANTLR start "ruleEdge"
    // InternalMCC.g:212:1: ruleEdge : ( ( rule__Edge__Group__0 ) ) ;
    public final void ruleEdge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:216:2: ( ( ( rule__Edge__Group__0 ) ) )
            // InternalMCC.g:217:2: ( ( rule__Edge__Group__0 ) )
            {
            // InternalMCC.g:217:2: ( ( rule__Edge__Group__0 ) )
            // InternalMCC.g:218:3: ( rule__Edge__Group__0 )
            {
             before(grammarAccess.getEdgeAccess().getGroup()); 
            // InternalMCC.g:219:3: ( rule__Edge__Group__0 )
            // InternalMCC.g:219:4: rule__Edge__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Edge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getGroup()); 

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
    // $ANTLR end "ruleEdge"


    // $ANTLR start "entryRuleFragment"
    // InternalMCC.g:228:1: entryRuleFragment : ruleFragment EOF ;
    public final void entryRuleFragment() throws RecognitionException {
        try {
            // InternalMCC.g:229:1: ( ruleFragment EOF )
            // InternalMCC.g:230:1: ruleFragment EOF
            {
             before(grammarAccess.getFragmentRule()); 
            pushFollow(FOLLOW_1);
            ruleFragment();

            state._fsp--;

             after(grammarAccess.getFragmentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFragment"


    // $ANTLR start "ruleFragment"
    // InternalMCC.g:237:1: ruleFragment : ( ( rule__Fragment__Group__0 ) ) ;
    public final void ruleFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:241:2: ( ( ( rule__Fragment__Group__0 ) ) )
            // InternalMCC.g:242:2: ( ( rule__Fragment__Group__0 ) )
            {
            // InternalMCC.g:242:2: ( ( rule__Fragment__Group__0 ) )
            // InternalMCC.g:243:3: ( rule__Fragment__Group__0 )
            {
             before(grammarAccess.getFragmentAccess().getGroup()); 
            // InternalMCC.g:244:3: ( rule__Fragment__Group__0 )
            // InternalMCC.g:244:4: rule__Fragment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getGroup()); 

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
    // $ANTLR end "ruleFragment"


    // $ANTLR start "entryRuleSystem"
    // InternalMCC.g:253:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalMCC.g:254:1: ( ruleSystem EOF )
            // InternalMCC.g:255:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalMCC.g:262:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:266:2: ( ( ( rule__System__Group__0 ) ) )
            // InternalMCC.g:267:2: ( ( rule__System__Group__0 ) )
            {
            // InternalMCC.g:267:2: ( ( rule__System__Group__0 ) )
            // InternalMCC.g:268:3: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // InternalMCC.g:269:3: ( rule__System__Group__0 )
            // InternalMCC.g:269:4: rule__System__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "ruleOperator"
    // InternalMCC.g:278:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:282:1: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalMCC.g:283:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalMCC.g:283:2: ( ( rule__Operator__Alternatives ) )
            // InternalMCC.g:284:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalMCC.g:285:3: ( rule__Operator__Alternatives )
            // InternalMCC.g:285:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalMCC.g:293:1: rule__Model__Alternatives : ( ( ( rule__Model__DevicesAssignment_0 ) ) | ( ( rule__Model__ApplicationsAssignment_1 ) ) | ( ( rule__Model__SystemsAssignment_2 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:297:1: ( ( ( rule__Model__DevicesAssignment_0 ) ) | ( ( rule__Model__ApplicationsAssignment_1 ) ) | ( ( rule__Model__SystemsAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 16:
            case 21:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMCC.g:298:2: ( ( rule__Model__DevicesAssignment_0 ) )
                    {
                    // InternalMCC.g:298:2: ( ( rule__Model__DevicesAssignment_0 ) )
                    // InternalMCC.g:299:3: ( rule__Model__DevicesAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getDevicesAssignment_0()); 
                    // InternalMCC.g:300:3: ( rule__Model__DevicesAssignment_0 )
                    // InternalMCC.g:300:4: rule__Model__DevicesAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__DevicesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDevicesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCC.g:304:2: ( ( rule__Model__ApplicationsAssignment_1 ) )
                    {
                    // InternalMCC.g:304:2: ( ( rule__Model__ApplicationsAssignment_1 ) )
                    // InternalMCC.g:305:3: ( rule__Model__ApplicationsAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getApplicationsAssignment_1()); 
                    // InternalMCC.g:306:3: ( rule__Model__ApplicationsAssignment_1 )
                    // InternalMCC.g:306:4: rule__Model__ApplicationsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ApplicationsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getApplicationsAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMCC.g:310:2: ( ( rule__Model__SystemsAssignment_2 ) )
                    {
                    // InternalMCC.g:310:2: ( ( rule__Model__SystemsAssignment_2 ) )
                    // InternalMCC.g:311:3: ( rule__Model__SystemsAssignment_2 )
                    {
                     before(grammarAccess.getModelAccess().getSystemsAssignment_2()); 
                    // InternalMCC.g:312:3: ( rule__Model__SystemsAssignment_2 )
                    // InternalMCC.g:312:4: rule__Model__SystemsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__SystemsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getSystemsAssignment_2()); 

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
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__Device__Alternatives"
    // InternalMCC.g:320:1: rule__Device__Alternatives : ( ( ruleMobile ) | ( ruleCloud ) );
    public final void rule__Device__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:324:1: ( ( ruleMobile ) | ( ruleCloud ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMCC.g:325:2: ( ruleMobile )
                    {
                    // InternalMCC.g:325:2: ( ruleMobile )
                    // InternalMCC.g:326:3: ruleMobile
                    {
                     before(grammarAccess.getDeviceAccess().getMobileParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMobile();

                    state._fsp--;

                     after(grammarAccess.getDeviceAccess().getMobileParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCC.g:331:2: ( ruleCloud )
                    {
                    // InternalMCC.g:331:2: ( ruleCloud )
                    // InternalMCC.g:332:3: ruleCloud
                    {
                     before(grammarAccess.getDeviceAccess().getCloudParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCloud();

                    state._fsp--;

                     after(grammarAccess.getDeviceAccess().getCloudParserRuleCall_1()); 

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
    // $ANTLR end "rule__Device__Alternatives"


    // $ANTLR start "rule__Fragment__IsOfflodableAlternatives_9_0"
    // InternalMCC.g:341:1: rule__Fragment__IsOfflodableAlternatives_9_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Fragment__IsOfflodableAlternatives_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:345:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMCC.g:346:2: ( 'true' )
                    {
                    // InternalMCC.g:346:2: ( 'true' )
                    // InternalMCC.g:347:3: 'true'
                    {
                     before(grammarAccess.getFragmentAccess().getIsOfflodableTrueKeyword_9_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getFragmentAccess().getIsOfflodableTrueKeyword_9_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCC.g:352:2: ( 'false' )
                    {
                    // InternalMCC.g:352:2: ( 'false' )
                    // InternalMCC.g:353:3: 'false'
                    {
                     before(grammarAccess.getFragmentAccess().getIsOfflodableFalseKeyword_9_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getFragmentAccess().getIsOfflodableFalseKeyword_9_0_1()); 

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
    // $ANTLR end "rule__Fragment__IsOfflodableAlternatives_9_0"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalMCC.g:362:1: rule__Operator__Alternatives : ( ( ( '-->' ) ) | ( ( '--|' ) ) | ( ( '--::' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:366:1: ( ( ( '-->' ) ) | ( ( '--|' ) ) | ( ( '--::' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMCC.g:367:2: ( ( '-->' ) )
                    {
                    // InternalMCC.g:367:2: ( ( '-->' ) )
                    // InternalMCC.g:368:3: ( '-->' )
                    {
                     before(grammarAccess.getOperatorAccess().getNDCEnumLiteralDeclaration_0()); 
                    // InternalMCC.g:369:3: ( '-->' )
                    // InternalMCC.g:369:4: '-->'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getNDCEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCC.g:373:2: ( ( '--|' ) )
                    {
                    // InternalMCC.g:373:2: ( ( '--|' ) )
                    // InternalMCC.g:374:3: ( '--|' )
                    {
                     before(grammarAccess.getOperatorAccess().getPAREnumLiteralDeclaration_1()); 
                    // InternalMCC.g:375:3: ( '--|' )
                    // InternalMCC.g:375:4: '--|'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getPAREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMCC.g:379:2: ( ( '--::' ) )
                    {
                    // InternalMCC.g:379:2: ( ( '--::' ) )
                    // InternalMCC.g:380:3: ( '--::' )
                    {
                     before(grammarAccess.getOperatorAccess().getSEQEnumLiteralDeclaration_2()); 
                    // InternalMCC.g:381:3: ( '--::' )
                    // InternalMCC.g:381:4: '--::'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getSEQEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Cloud__Group__0"
    // InternalMCC.g:389:1: rule__Cloud__Group__0 : rule__Cloud__Group__0__Impl rule__Cloud__Group__1 ;
    public final void rule__Cloud__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:393:1: ( rule__Cloud__Group__0__Impl rule__Cloud__Group__1 )
            // InternalMCC.g:394:2: rule__Cloud__Group__0__Impl rule__Cloud__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Cloud__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__1();

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
    // $ANTLR end "rule__Cloud__Group__0"


    // $ANTLR start "rule__Cloud__Group__0__Impl"
    // InternalMCC.g:401:1: rule__Cloud__Group__0__Impl : ( 'Cloud' ) ;
    public final void rule__Cloud__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:405:1: ( ( 'Cloud' ) )
            // InternalMCC.g:406:1: ( 'Cloud' )
            {
            // InternalMCC.g:406:1: ( 'Cloud' )
            // InternalMCC.g:407:2: 'Cloud'
            {
             before(grammarAccess.getCloudAccess().getCloudKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getCloudKeyword_0()); 

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
    // $ANTLR end "rule__Cloud__Group__0__Impl"


    // $ANTLR start "rule__Cloud__Group__1"
    // InternalMCC.g:416:1: rule__Cloud__Group__1 : rule__Cloud__Group__1__Impl rule__Cloud__Group__2 ;
    public final void rule__Cloud__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:420:1: ( rule__Cloud__Group__1__Impl rule__Cloud__Group__2 )
            // InternalMCC.g:421:2: rule__Cloud__Group__1__Impl rule__Cloud__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Cloud__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__2();

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
    // $ANTLR end "rule__Cloud__Group__1"


    // $ANTLR start "rule__Cloud__Group__1__Impl"
    // InternalMCC.g:428:1: rule__Cloud__Group__1__Impl : ( ( rule__Cloud__NameAssignment_1 ) ) ;
    public final void rule__Cloud__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:432:1: ( ( ( rule__Cloud__NameAssignment_1 ) ) )
            // InternalMCC.g:433:1: ( ( rule__Cloud__NameAssignment_1 ) )
            {
            // InternalMCC.g:433:1: ( ( rule__Cloud__NameAssignment_1 ) )
            // InternalMCC.g:434:2: ( rule__Cloud__NameAssignment_1 )
            {
             before(grammarAccess.getCloudAccess().getNameAssignment_1()); 
            // InternalMCC.g:435:2: ( rule__Cloud__NameAssignment_1 )
            // InternalMCC.g:435:3: rule__Cloud__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCloudAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Cloud__Group__1__Impl"


    // $ANTLR start "rule__Cloud__Group__2"
    // InternalMCC.g:443:1: rule__Cloud__Group__2 : rule__Cloud__Group__2__Impl rule__Cloud__Group__3 ;
    public final void rule__Cloud__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:447:1: ( rule__Cloud__Group__2__Impl rule__Cloud__Group__3 )
            // InternalMCC.g:448:2: rule__Cloud__Group__2__Impl rule__Cloud__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Cloud__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__3();

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
    // $ANTLR end "rule__Cloud__Group__2"


    // $ANTLR start "rule__Cloud__Group__2__Impl"
    // InternalMCC.g:455:1: rule__Cloud__Group__2__Impl : ( '[' ) ;
    public final void rule__Cloud__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:459:1: ( ( '[' ) )
            // InternalMCC.g:460:1: ( '[' )
            {
            // InternalMCC.g:460:1: ( '[' )
            // InternalMCC.g:461:2: '['
            {
             before(grammarAccess.getCloudAccess().getLeftSquareBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__Cloud__Group__2__Impl"


    // $ANTLR start "rule__Cloud__Group__3"
    // InternalMCC.g:470:1: rule__Cloud__Group__3 : rule__Cloud__Group__3__Impl rule__Cloud__Group__4 ;
    public final void rule__Cloud__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:474:1: ( rule__Cloud__Group__3__Impl rule__Cloud__Group__4 )
            // InternalMCC.g:475:2: rule__Cloud__Group__3__Impl rule__Cloud__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Cloud__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__4();

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
    // $ANTLR end "rule__Cloud__Group__3"


    // $ANTLR start "rule__Cloud__Group__3__Impl"
    // InternalMCC.g:482:1: rule__Cloud__Group__3__Impl : ( ( rule__Cloud__CpuInstructionsAssignment_3 ) ) ;
    public final void rule__Cloud__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:486:1: ( ( ( rule__Cloud__CpuInstructionsAssignment_3 ) ) )
            // InternalMCC.g:487:1: ( ( rule__Cloud__CpuInstructionsAssignment_3 ) )
            {
            // InternalMCC.g:487:1: ( ( rule__Cloud__CpuInstructionsAssignment_3 ) )
            // InternalMCC.g:488:2: ( rule__Cloud__CpuInstructionsAssignment_3 )
            {
             before(grammarAccess.getCloudAccess().getCpuInstructionsAssignment_3()); 
            // InternalMCC.g:489:2: ( rule__Cloud__CpuInstructionsAssignment_3 )
            // InternalMCC.g:489:3: rule__Cloud__CpuInstructionsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__CpuInstructionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCloudAccess().getCpuInstructionsAssignment_3()); 

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
    // $ANTLR end "rule__Cloud__Group__3__Impl"


    // $ANTLR start "rule__Cloud__Group__4"
    // InternalMCC.g:497:1: rule__Cloud__Group__4 : rule__Cloud__Group__4__Impl rule__Cloud__Group__5 ;
    public final void rule__Cloud__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:501:1: ( rule__Cloud__Group__4__Impl rule__Cloud__Group__5 )
            // InternalMCC.g:502:2: rule__Cloud__Group__4__Impl rule__Cloud__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Cloud__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__5();

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
    // $ANTLR end "rule__Cloud__Group__4"


    // $ANTLR start "rule__Cloud__Group__4__Impl"
    // InternalMCC.g:509:1: rule__Cloud__Group__4__Impl : ( ',' ) ;
    public final void rule__Cloud__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:513:1: ( ( ',' ) )
            // InternalMCC.g:514:1: ( ',' )
            {
            // InternalMCC.g:514:1: ( ',' )
            // InternalMCC.g:515:2: ','
            {
             before(grammarAccess.getCloudAccess().getCommaKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__Cloud__Group__4__Impl"


    // $ANTLR start "rule__Cloud__Group__5"
    // InternalMCC.g:524:1: rule__Cloud__Group__5 : rule__Cloud__Group__5__Impl rule__Cloud__Group__6 ;
    public final void rule__Cloud__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:528:1: ( rule__Cloud__Group__5__Impl rule__Cloud__Group__6 )
            // InternalMCC.g:529:2: rule__Cloud__Group__5__Impl rule__Cloud__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Cloud__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__6();

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
    // $ANTLR end "rule__Cloud__Group__5"


    // $ANTLR start "rule__Cloud__Group__5__Impl"
    // InternalMCC.g:536:1: rule__Cloud__Group__5__Impl : ( ( rule__Cloud__ApplicationsAssignment_5 ) ) ;
    public final void rule__Cloud__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:540:1: ( ( ( rule__Cloud__ApplicationsAssignment_5 ) ) )
            // InternalMCC.g:541:1: ( ( rule__Cloud__ApplicationsAssignment_5 ) )
            {
            // InternalMCC.g:541:1: ( ( rule__Cloud__ApplicationsAssignment_5 ) )
            // InternalMCC.g:542:2: ( rule__Cloud__ApplicationsAssignment_5 )
            {
             before(grammarAccess.getCloudAccess().getApplicationsAssignment_5()); 
            // InternalMCC.g:543:2: ( rule__Cloud__ApplicationsAssignment_5 )
            // InternalMCC.g:543:3: rule__Cloud__ApplicationsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__ApplicationsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCloudAccess().getApplicationsAssignment_5()); 

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
    // $ANTLR end "rule__Cloud__Group__5__Impl"


    // $ANTLR start "rule__Cloud__Group__6"
    // InternalMCC.g:551:1: rule__Cloud__Group__6 : rule__Cloud__Group__6__Impl rule__Cloud__Group__7 ;
    public final void rule__Cloud__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:555:1: ( rule__Cloud__Group__6__Impl rule__Cloud__Group__7 )
            // InternalMCC.g:556:2: rule__Cloud__Group__6__Impl rule__Cloud__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Cloud__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__7();

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
    // $ANTLR end "rule__Cloud__Group__6"


    // $ANTLR start "rule__Cloud__Group__6__Impl"
    // InternalMCC.g:563:1: rule__Cloud__Group__6__Impl : ( ']' ) ;
    public final void rule__Cloud__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:567:1: ( ( ']' ) )
            // InternalMCC.g:568:1: ( ']' )
            {
            // InternalMCC.g:568:1: ( ']' )
            // InternalMCC.g:569:2: ']'
            {
             before(grammarAccess.getCloudAccess().getRightSquareBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getRightSquareBracketKeyword_6()); 

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
    // $ANTLR end "rule__Cloud__Group__6__Impl"


    // $ANTLR start "rule__Cloud__Group__7"
    // InternalMCC.g:578:1: rule__Cloud__Group__7 : rule__Cloud__Group__7__Impl ;
    public final void rule__Cloud__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:582:1: ( rule__Cloud__Group__7__Impl )
            // InternalMCC.g:583:2: rule__Cloud__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__Group__7__Impl();

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
    // $ANTLR end "rule__Cloud__Group__7"


    // $ANTLR start "rule__Cloud__Group__7__Impl"
    // InternalMCC.g:589:1: rule__Cloud__Group__7__Impl : ( ';' ) ;
    public final void rule__Cloud__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:593:1: ( ( ';' ) )
            // InternalMCC.g:594:1: ( ';' )
            {
            // InternalMCC.g:594:1: ( ';' )
            // InternalMCC.g:595:2: ';'
            {
             before(grammarAccess.getCloudAccess().getSemicolonKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getSemicolonKeyword_7()); 

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
    // $ANTLR end "rule__Cloud__Group__7__Impl"


    // $ANTLR start "rule__Mobile__Group__0"
    // InternalMCC.g:605:1: rule__Mobile__Group__0 : rule__Mobile__Group__0__Impl rule__Mobile__Group__1 ;
    public final void rule__Mobile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:609:1: ( rule__Mobile__Group__0__Impl rule__Mobile__Group__1 )
            // InternalMCC.g:610:2: rule__Mobile__Group__0__Impl rule__Mobile__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Mobile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__1();

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
    // $ANTLR end "rule__Mobile__Group__0"


    // $ANTLR start "rule__Mobile__Group__0__Impl"
    // InternalMCC.g:617:1: rule__Mobile__Group__0__Impl : ( 'Mobile' ) ;
    public final void rule__Mobile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:621:1: ( ( 'Mobile' ) )
            // InternalMCC.g:622:1: ( 'Mobile' )
            {
            // InternalMCC.g:622:1: ( 'Mobile' )
            // InternalMCC.g:623:2: 'Mobile'
            {
             before(grammarAccess.getMobileAccess().getMobileKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getMobileKeyword_0()); 

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
    // $ANTLR end "rule__Mobile__Group__0__Impl"


    // $ANTLR start "rule__Mobile__Group__1"
    // InternalMCC.g:632:1: rule__Mobile__Group__1 : rule__Mobile__Group__1__Impl rule__Mobile__Group__2 ;
    public final void rule__Mobile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:636:1: ( rule__Mobile__Group__1__Impl rule__Mobile__Group__2 )
            // InternalMCC.g:637:2: rule__Mobile__Group__1__Impl rule__Mobile__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Mobile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__2();

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
    // $ANTLR end "rule__Mobile__Group__1"


    // $ANTLR start "rule__Mobile__Group__1__Impl"
    // InternalMCC.g:644:1: rule__Mobile__Group__1__Impl : ( ( rule__Mobile__NameAssignment_1 ) ) ;
    public final void rule__Mobile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:648:1: ( ( ( rule__Mobile__NameAssignment_1 ) ) )
            // InternalMCC.g:649:1: ( ( rule__Mobile__NameAssignment_1 ) )
            {
            // InternalMCC.g:649:1: ( ( rule__Mobile__NameAssignment_1 ) )
            // InternalMCC.g:650:2: ( rule__Mobile__NameAssignment_1 )
            {
             before(grammarAccess.getMobileAccess().getNameAssignment_1()); 
            // InternalMCC.g:651:2: ( rule__Mobile__NameAssignment_1 )
            // InternalMCC.g:651:3: rule__Mobile__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Mobile__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMobileAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Mobile__Group__1__Impl"


    // $ANTLR start "rule__Mobile__Group__2"
    // InternalMCC.g:659:1: rule__Mobile__Group__2 : rule__Mobile__Group__2__Impl rule__Mobile__Group__3 ;
    public final void rule__Mobile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:663:1: ( rule__Mobile__Group__2__Impl rule__Mobile__Group__3 )
            // InternalMCC.g:664:2: rule__Mobile__Group__2__Impl rule__Mobile__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Mobile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__3();

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
    // $ANTLR end "rule__Mobile__Group__2"


    // $ANTLR start "rule__Mobile__Group__2__Impl"
    // InternalMCC.g:671:1: rule__Mobile__Group__2__Impl : ( '[' ) ;
    public final void rule__Mobile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:675:1: ( ( '[' ) )
            // InternalMCC.g:676:1: ( '[' )
            {
            // InternalMCC.g:676:1: ( '[' )
            // InternalMCC.g:677:2: '['
            {
             before(grammarAccess.getMobileAccess().getLeftSquareBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__Mobile__Group__2__Impl"


    // $ANTLR start "rule__Mobile__Group__3"
    // InternalMCC.g:686:1: rule__Mobile__Group__3 : rule__Mobile__Group__3__Impl rule__Mobile__Group__4 ;
    public final void rule__Mobile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:690:1: ( rule__Mobile__Group__3__Impl rule__Mobile__Group__4 )
            // InternalMCC.g:691:2: rule__Mobile__Group__3__Impl rule__Mobile__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Mobile__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__4();

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
    // $ANTLR end "rule__Mobile__Group__3"


    // $ANTLR start "rule__Mobile__Group__3__Impl"
    // InternalMCC.g:698:1: rule__Mobile__Group__3__Impl : ( ( rule__Mobile__CpuInstructionsAssignment_3 ) ) ;
    public final void rule__Mobile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:702:1: ( ( ( rule__Mobile__CpuInstructionsAssignment_3 ) ) )
            // InternalMCC.g:703:1: ( ( rule__Mobile__CpuInstructionsAssignment_3 ) )
            {
            // InternalMCC.g:703:1: ( ( rule__Mobile__CpuInstructionsAssignment_3 ) )
            // InternalMCC.g:704:2: ( rule__Mobile__CpuInstructionsAssignment_3 )
            {
             before(grammarAccess.getMobileAccess().getCpuInstructionsAssignment_3()); 
            // InternalMCC.g:705:2: ( rule__Mobile__CpuInstructionsAssignment_3 )
            // InternalMCC.g:705:3: rule__Mobile__CpuInstructionsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Mobile__CpuInstructionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMobileAccess().getCpuInstructionsAssignment_3()); 

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
    // $ANTLR end "rule__Mobile__Group__3__Impl"


    // $ANTLR start "rule__Mobile__Group__4"
    // InternalMCC.g:713:1: rule__Mobile__Group__4 : rule__Mobile__Group__4__Impl rule__Mobile__Group__5 ;
    public final void rule__Mobile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:717:1: ( rule__Mobile__Group__4__Impl rule__Mobile__Group__5 )
            // InternalMCC.g:718:2: rule__Mobile__Group__4__Impl rule__Mobile__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Mobile__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__5();

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
    // $ANTLR end "rule__Mobile__Group__4"


    // $ANTLR start "rule__Mobile__Group__4__Impl"
    // InternalMCC.g:725:1: rule__Mobile__Group__4__Impl : ( ',' ) ;
    public final void rule__Mobile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:729:1: ( ( ',' ) )
            // InternalMCC.g:730:1: ( ',' )
            {
            // InternalMCC.g:730:1: ( ',' )
            // InternalMCC.g:731:2: ','
            {
             before(grammarAccess.getMobileAccess().getCommaKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__Mobile__Group__4__Impl"


    // $ANTLR start "rule__Mobile__Group__5"
    // InternalMCC.g:740:1: rule__Mobile__Group__5 : rule__Mobile__Group__5__Impl rule__Mobile__Group__6 ;
    public final void rule__Mobile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:744:1: ( rule__Mobile__Group__5__Impl rule__Mobile__Group__6 )
            // InternalMCC.g:745:2: rule__Mobile__Group__5__Impl rule__Mobile__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Mobile__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__6();

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
    // $ANTLR end "rule__Mobile__Group__5"


    // $ANTLR start "rule__Mobile__Group__5__Impl"
    // InternalMCC.g:752:1: rule__Mobile__Group__5__Impl : ( ( rule__Mobile__ApplicationsAssignment_5 ) ) ;
    public final void rule__Mobile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:756:1: ( ( ( rule__Mobile__ApplicationsAssignment_5 ) ) )
            // InternalMCC.g:757:1: ( ( rule__Mobile__ApplicationsAssignment_5 ) )
            {
            // InternalMCC.g:757:1: ( ( rule__Mobile__ApplicationsAssignment_5 ) )
            // InternalMCC.g:758:2: ( rule__Mobile__ApplicationsAssignment_5 )
            {
             before(grammarAccess.getMobileAccess().getApplicationsAssignment_5()); 
            // InternalMCC.g:759:2: ( rule__Mobile__ApplicationsAssignment_5 )
            // InternalMCC.g:759:3: rule__Mobile__ApplicationsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Mobile__ApplicationsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMobileAccess().getApplicationsAssignment_5()); 

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
    // $ANTLR end "rule__Mobile__Group__5__Impl"


    // $ANTLR start "rule__Mobile__Group__6"
    // InternalMCC.g:767:1: rule__Mobile__Group__6 : rule__Mobile__Group__6__Impl rule__Mobile__Group__7 ;
    public final void rule__Mobile__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:771:1: ( rule__Mobile__Group__6__Impl rule__Mobile__Group__7 )
            // InternalMCC.g:772:2: rule__Mobile__Group__6__Impl rule__Mobile__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Mobile__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__7();

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
    // $ANTLR end "rule__Mobile__Group__6"


    // $ANTLR start "rule__Mobile__Group__6__Impl"
    // InternalMCC.g:779:1: rule__Mobile__Group__6__Impl : ( ',' ) ;
    public final void rule__Mobile__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:783:1: ( ( ',' ) )
            // InternalMCC.g:784:1: ( ',' )
            {
            // InternalMCC.g:784:1: ( ',' )
            // InternalMCC.g:785:2: ','
            {
             before(grammarAccess.getMobileAccess().getCommaKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getCommaKeyword_6()); 

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
    // $ANTLR end "rule__Mobile__Group__6__Impl"


    // $ANTLR start "rule__Mobile__Group__7"
    // InternalMCC.g:794:1: rule__Mobile__Group__7 : rule__Mobile__Group__7__Impl rule__Mobile__Group__8 ;
    public final void rule__Mobile__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:798:1: ( rule__Mobile__Group__7__Impl rule__Mobile__Group__8 )
            // InternalMCC.g:799:2: rule__Mobile__Group__7__Impl rule__Mobile__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Mobile__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__8();

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
    // $ANTLR end "rule__Mobile__Group__7"


    // $ANTLR start "rule__Mobile__Group__7__Impl"
    // InternalMCC.g:806:1: rule__Mobile__Group__7__Impl : ( ( rule__Mobile__BatteryAssignment_7 ) ) ;
    public final void rule__Mobile__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:810:1: ( ( ( rule__Mobile__BatteryAssignment_7 ) ) )
            // InternalMCC.g:811:1: ( ( rule__Mobile__BatteryAssignment_7 ) )
            {
            // InternalMCC.g:811:1: ( ( rule__Mobile__BatteryAssignment_7 ) )
            // InternalMCC.g:812:2: ( rule__Mobile__BatteryAssignment_7 )
            {
             before(grammarAccess.getMobileAccess().getBatteryAssignment_7()); 
            // InternalMCC.g:813:2: ( rule__Mobile__BatteryAssignment_7 )
            // InternalMCC.g:813:3: rule__Mobile__BatteryAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Mobile__BatteryAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMobileAccess().getBatteryAssignment_7()); 

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
    // $ANTLR end "rule__Mobile__Group__7__Impl"


    // $ANTLR start "rule__Mobile__Group__8"
    // InternalMCC.g:821:1: rule__Mobile__Group__8 : rule__Mobile__Group__8__Impl rule__Mobile__Group__9 ;
    public final void rule__Mobile__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:825:1: ( rule__Mobile__Group__8__Impl rule__Mobile__Group__9 )
            // InternalMCC.g:826:2: rule__Mobile__Group__8__Impl rule__Mobile__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__Mobile__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__9();

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
    // $ANTLR end "rule__Mobile__Group__8"


    // $ANTLR start "rule__Mobile__Group__8__Impl"
    // InternalMCC.g:833:1: rule__Mobile__Group__8__Impl : ( ',' ) ;
    public final void rule__Mobile__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:837:1: ( ( ',' ) )
            // InternalMCC.g:838:1: ( ',' )
            {
            // InternalMCC.g:838:1: ( ',' )
            // InternalMCC.g:839:2: ','
            {
             before(grammarAccess.getMobileAccess().getCommaKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getCommaKeyword_8()); 

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
    // $ANTLR end "rule__Mobile__Group__8__Impl"


    // $ANTLR start "rule__Mobile__Group__9"
    // InternalMCC.g:848:1: rule__Mobile__Group__9 : rule__Mobile__Group__9__Impl rule__Mobile__Group__10 ;
    public final void rule__Mobile__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:852:1: ( rule__Mobile__Group__9__Impl rule__Mobile__Group__10 )
            // InternalMCC.g:853:2: rule__Mobile__Group__9__Impl rule__Mobile__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__Mobile__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__10();

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
    // $ANTLR end "rule__Mobile__Group__9"


    // $ANTLR start "rule__Mobile__Group__9__Impl"
    // InternalMCC.g:860:1: rule__Mobile__Group__9__Impl : ( ( rule__Mobile__NetworkAssignment_9 ) ) ;
    public final void rule__Mobile__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:864:1: ( ( ( rule__Mobile__NetworkAssignment_9 ) ) )
            // InternalMCC.g:865:1: ( ( rule__Mobile__NetworkAssignment_9 ) )
            {
            // InternalMCC.g:865:1: ( ( rule__Mobile__NetworkAssignment_9 ) )
            // InternalMCC.g:866:2: ( rule__Mobile__NetworkAssignment_9 )
            {
             before(grammarAccess.getMobileAccess().getNetworkAssignment_9()); 
            // InternalMCC.g:867:2: ( rule__Mobile__NetworkAssignment_9 )
            // InternalMCC.g:867:3: rule__Mobile__NetworkAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Mobile__NetworkAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getMobileAccess().getNetworkAssignment_9()); 

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
    // $ANTLR end "rule__Mobile__Group__9__Impl"


    // $ANTLR start "rule__Mobile__Group__10"
    // InternalMCC.g:875:1: rule__Mobile__Group__10 : rule__Mobile__Group__10__Impl rule__Mobile__Group__11 ;
    public final void rule__Mobile__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:879:1: ( rule__Mobile__Group__10__Impl rule__Mobile__Group__11 )
            // InternalMCC.g:880:2: rule__Mobile__Group__10__Impl rule__Mobile__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__Mobile__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__11();

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
    // $ANTLR end "rule__Mobile__Group__10"


    // $ANTLR start "rule__Mobile__Group__10__Impl"
    // InternalMCC.g:887:1: rule__Mobile__Group__10__Impl : ( ',' ) ;
    public final void rule__Mobile__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:891:1: ( ( ',' ) )
            // InternalMCC.g:892:1: ( ',' )
            {
            // InternalMCC.g:892:1: ( ',' )
            // InternalMCC.g:893:2: ','
            {
             before(grammarAccess.getMobileAccess().getCommaKeyword_10()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getCommaKeyword_10()); 

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
    // $ANTLR end "rule__Mobile__Group__10__Impl"


    // $ANTLR start "rule__Mobile__Group__11"
    // InternalMCC.g:902:1: rule__Mobile__Group__11 : rule__Mobile__Group__11__Impl rule__Mobile__Group__12 ;
    public final void rule__Mobile__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:906:1: ( rule__Mobile__Group__11__Impl rule__Mobile__Group__12 )
            // InternalMCC.g:907:2: rule__Mobile__Group__11__Impl rule__Mobile__Group__12
            {
            pushFollow(FOLLOW_8);
            rule__Mobile__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__12();

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
    // $ANTLR end "rule__Mobile__Group__11"


    // $ANTLR start "rule__Mobile__Group__11__Impl"
    // InternalMCC.g:914:1: rule__Mobile__Group__11__Impl : ( ( rule__Mobile__MemoryAssignment_11 ) ) ;
    public final void rule__Mobile__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:918:1: ( ( ( rule__Mobile__MemoryAssignment_11 ) ) )
            // InternalMCC.g:919:1: ( ( rule__Mobile__MemoryAssignment_11 ) )
            {
            // InternalMCC.g:919:1: ( ( rule__Mobile__MemoryAssignment_11 ) )
            // InternalMCC.g:920:2: ( rule__Mobile__MemoryAssignment_11 )
            {
             before(grammarAccess.getMobileAccess().getMemoryAssignment_11()); 
            // InternalMCC.g:921:2: ( rule__Mobile__MemoryAssignment_11 )
            // InternalMCC.g:921:3: rule__Mobile__MemoryAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Mobile__MemoryAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getMobileAccess().getMemoryAssignment_11()); 

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
    // $ANTLR end "rule__Mobile__Group__11__Impl"


    // $ANTLR start "rule__Mobile__Group__12"
    // InternalMCC.g:929:1: rule__Mobile__Group__12 : rule__Mobile__Group__12__Impl rule__Mobile__Group__13 ;
    public final void rule__Mobile__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:933:1: ( rule__Mobile__Group__12__Impl rule__Mobile__Group__13 )
            // InternalMCC.g:934:2: rule__Mobile__Group__12__Impl rule__Mobile__Group__13
            {
            pushFollow(FOLLOW_9);
            rule__Mobile__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mobile__Group__13();

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
    // $ANTLR end "rule__Mobile__Group__12"


    // $ANTLR start "rule__Mobile__Group__12__Impl"
    // InternalMCC.g:941:1: rule__Mobile__Group__12__Impl : ( ']' ) ;
    public final void rule__Mobile__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:945:1: ( ( ']' ) )
            // InternalMCC.g:946:1: ( ']' )
            {
            // InternalMCC.g:946:1: ( ']' )
            // InternalMCC.g:947:2: ']'
            {
             before(grammarAccess.getMobileAccess().getRightSquareBracketKeyword_12()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getRightSquareBracketKeyword_12()); 

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
    // $ANTLR end "rule__Mobile__Group__12__Impl"


    // $ANTLR start "rule__Mobile__Group__13"
    // InternalMCC.g:956:1: rule__Mobile__Group__13 : rule__Mobile__Group__13__Impl ;
    public final void rule__Mobile__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:960:1: ( rule__Mobile__Group__13__Impl )
            // InternalMCC.g:961:2: rule__Mobile__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mobile__Group__13__Impl();

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
    // $ANTLR end "rule__Mobile__Group__13"


    // $ANTLR start "rule__Mobile__Group__13__Impl"
    // InternalMCC.g:967:1: rule__Mobile__Group__13__Impl : ( ';' ) ;
    public final void rule__Mobile__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:971:1: ( ( ';' ) )
            // InternalMCC.g:972:1: ( ';' )
            {
            // InternalMCC.g:972:1: ( ';' )
            // InternalMCC.g:973:2: ';'
            {
             before(grammarAccess.getMobileAccess().getSemicolonKeyword_13()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getSemicolonKeyword_13()); 

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
    // $ANTLR end "rule__Mobile__Group__13__Impl"


    // $ANTLR start "rule__Application__Group__0"
    // InternalMCC.g:983:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:987:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalMCC.g:988:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Application__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__1();

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
    // $ANTLR end "rule__Application__Group__0"


    // $ANTLR start "rule__Application__Group__0__Impl"
    // InternalMCC.g:995:1: rule__Application__Group__0__Impl : ( 'Application' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:999:1: ( ( 'Application' ) )
            // InternalMCC.g:1000:1: ( 'Application' )
            {
            // InternalMCC.g:1000:1: ( 'Application' )
            // InternalMCC.g:1001:2: 'Application'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 

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
    // $ANTLR end "rule__Application__Group__0__Impl"


    // $ANTLR start "rule__Application__Group__1"
    // InternalMCC.g:1010:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1014:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalMCC.g:1015:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Application__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__2();

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
    // $ANTLR end "rule__Application__Group__1"


    // $ANTLR start "rule__Application__Group__1__Impl"
    // InternalMCC.g:1022:1: rule__Application__Group__1__Impl : ( ( rule__Application__NameAssignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1026:1: ( ( ( rule__Application__NameAssignment_1 ) ) )
            // InternalMCC.g:1027:1: ( ( rule__Application__NameAssignment_1 ) )
            {
            // InternalMCC.g:1027:1: ( ( rule__Application__NameAssignment_1 ) )
            // InternalMCC.g:1028:2: ( rule__Application__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_1()); 
            // InternalMCC.g:1029:2: ( rule__Application__NameAssignment_1 )
            // InternalMCC.g:1029:3: rule__Application__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Application__Group__1__Impl"


    // $ANTLR start "rule__Application__Group__2"
    // InternalMCC.g:1037:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1041:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalMCC.g:1042:2: rule__Application__Group__2__Impl rule__Application__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Application__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__3();

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
    // $ANTLR end "rule__Application__Group__2"


    // $ANTLR start "rule__Application__Group__2__Impl"
    // InternalMCC.g:1049:1: rule__Application__Group__2__Impl : ( '{' ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1053:1: ( ( '{' ) )
            // InternalMCC.g:1054:1: ( '{' )
            {
            // InternalMCC.g:1054:1: ( '{' )
            // InternalMCC.g:1055:2: '{'
            {
             before(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Application__Group__2__Impl"


    // $ANTLR start "rule__Application__Group__3"
    // InternalMCC.g:1064:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1068:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // InternalMCC.g:1069:2: rule__Application__Group__3__Impl rule__Application__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Application__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__4();

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
    // $ANTLR end "rule__Application__Group__3"


    // $ANTLR start "rule__Application__Group__3__Impl"
    // InternalMCC.g:1076:1: rule__Application__Group__3__Impl : ( ( ( rule__Application__FragmentsAssignment_3 ) ) ( ( rule__Application__FragmentsAssignment_3 )* ) ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1080:1: ( ( ( ( rule__Application__FragmentsAssignment_3 ) ) ( ( rule__Application__FragmentsAssignment_3 )* ) ) )
            // InternalMCC.g:1081:1: ( ( ( rule__Application__FragmentsAssignment_3 ) ) ( ( rule__Application__FragmentsAssignment_3 )* ) )
            {
            // InternalMCC.g:1081:1: ( ( ( rule__Application__FragmentsAssignment_3 ) ) ( ( rule__Application__FragmentsAssignment_3 )* ) )
            // InternalMCC.g:1082:2: ( ( rule__Application__FragmentsAssignment_3 ) ) ( ( rule__Application__FragmentsAssignment_3 )* )
            {
            // InternalMCC.g:1082:2: ( ( rule__Application__FragmentsAssignment_3 ) )
            // InternalMCC.g:1083:3: ( rule__Application__FragmentsAssignment_3 )
            {
             before(grammarAccess.getApplicationAccess().getFragmentsAssignment_3()); 
            // InternalMCC.g:1084:3: ( rule__Application__FragmentsAssignment_3 )
            // InternalMCC.g:1084:4: rule__Application__FragmentsAssignment_3
            {
            pushFollow(FOLLOW_13);
            rule__Application__FragmentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getFragmentsAssignment_3()); 

            }

            // InternalMCC.g:1087:2: ( ( rule__Application__FragmentsAssignment_3 )* )
            // InternalMCC.g:1088:3: ( rule__Application__FragmentsAssignment_3 )*
            {
             before(grammarAccess.getApplicationAccess().getFragmentsAssignment_3()); 
            // InternalMCC.g:1089:3: ( rule__Application__FragmentsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMCC.g:1089:4: rule__Application__FragmentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Application__FragmentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getFragmentsAssignment_3()); 

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
    // $ANTLR end "rule__Application__Group__3__Impl"


    // $ANTLR start "rule__Application__Group__4"
    // InternalMCC.g:1098:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1102:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // InternalMCC.g:1103:2: rule__Application__Group__4__Impl rule__Application__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Application__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__5();

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
    // $ANTLR end "rule__Application__Group__4"


    // $ANTLR start "rule__Application__Group__4__Impl"
    // InternalMCC.g:1110:1: rule__Application__Group__4__Impl : ( ( rule__Application__StructureAssignment_4 ) ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1114:1: ( ( ( rule__Application__StructureAssignment_4 ) ) )
            // InternalMCC.g:1115:1: ( ( rule__Application__StructureAssignment_4 ) )
            {
            // InternalMCC.g:1115:1: ( ( rule__Application__StructureAssignment_4 ) )
            // InternalMCC.g:1116:2: ( rule__Application__StructureAssignment_4 )
            {
             before(grammarAccess.getApplicationAccess().getStructureAssignment_4()); 
            // InternalMCC.g:1117:2: ( rule__Application__StructureAssignment_4 )
            // InternalMCC.g:1117:3: rule__Application__StructureAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Application__StructureAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getStructureAssignment_4()); 

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
    // $ANTLR end "rule__Application__Group__4__Impl"


    // $ANTLR start "rule__Application__Group__5"
    // InternalMCC.g:1125:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1129:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // InternalMCC.g:1130:2: rule__Application__Group__5__Impl rule__Application__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Application__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__6();

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
    // $ANTLR end "rule__Application__Group__5"


    // $ANTLR start "rule__Application__Group__5__Impl"
    // InternalMCC.g:1137:1: rule__Application__Group__5__Impl : ( '}' ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1141:1: ( ( '}' ) )
            // InternalMCC.g:1142:1: ( '}' )
            {
            // InternalMCC.g:1142:1: ( '}' )
            // InternalMCC.g:1143:2: '}'
            {
             before(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Application__Group__5__Impl"


    // $ANTLR start "rule__Application__Group__6"
    // InternalMCC.g:1152:1: rule__Application__Group__6 : rule__Application__Group__6__Impl ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1156:1: ( rule__Application__Group__6__Impl )
            // InternalMCC.g:1157:2: rule__Application__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__6__Impl();

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
    // $ANTLR end "rule__Application__Group__6"


    // $ANTLR start "rule__Application__Group__6__Impl"
    // InternalMCC.g:1163:1: rule__Application__Group__6__Impl : ( ';' ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1167:1: ( ( ';' ) )
            // InternalMCC.g:1168:1: ( ';' )
            {
            // InternalMCC.g:1168:1: ( ';' )
            // InternalMCC.g:1169:2: ';'
            {
             before(grammarAccess.getApplicationAccess().getSemicolonKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__Application__Group__6__Impl"


    // $ANTLR start "rule__Structure__Group__0"
    // InternalMCC.g:1179:1: rule__Structure__Group__0 : rule__Structure__Group__0__Impl rule__Structure__Group__1 ;
    public final void rule__Structure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1183:1: ( rule__Structure__Group__0__Impl rule__Structure__Group__1 )
            // InternalMCC.g:1184:2: rule__Structure__Group__0__Impl rule__Structure__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Structure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structure__Group__1();

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
    // $ANTLR end "rule__Structure__Group__0"


    // $ANTLR start "rule__Structure__Group__0__Impl"
    // InternalMCC.g:1191:1: rule__Structure__Group__0__Impl : ( 'Structure' ) ;
    public final void rule__Structure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1195:1: ( ( 'Structure' ) )
            // InternalMCC.g:1196:1: ( 'Structure' )
            {
            // InternalMCC.g:1196:1: ( 'Structure' )
            // InternalMCC.g:1197:2: 'Structure'
            {
             before(grammarAccess.getStructureAccess().getStructureKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStructureAccess().getStructureKeyword_0()); 

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
    // $ANTLR end "rule__Structure__Group__0__Impl"


    // $ANTLR start "rule__Structure__Group__1"
    // InternalMCC.g:1206:1: rule__Structure__Group__1 : rule__Structure__Group__1__Impl rule__Structure__Group__2 ;
    public final void rule__Structure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1210:1: ( rule__Structure__Group__1__Impl rule__Structure__Group__2 )
            // InternalMCC.g:1211:2: rule__Structure__Group__1__Impl rule__Structure__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Structure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structure__Group__2();

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
    // $ANTLR end "rule__Structure__Group__1"


    // $ANTLR start "rule__Structure__Group__1__Impl"
    // InternalMCC.g:1218:1: rule__Structure__Group__1__Impl : ( ( rule__Structure__NameAssignment_1 ) ) ;
    public final void rule__Structure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1222:1: ( ( ( rule__Structure__NameAssignment_1 ) ) )
            // InternalMCC.g:1223:1: ( ( rule__Structure__NameAssignment_1 ) )
            {
            // InternalMCC.g:1223:1: ( ( rule__Structure__NameAssignment_1 ) )
            // InternalMCC.g:1224:2: ( rule__Structure__NameAssignment_1 )
            {
             before(grammarAccess.getStructureAccess().getNameAssignment_1()); 
            // InternalMCC.g:1225:2: ( rule__Structure__NameAssignment_1 )
            // InternalMCC.g:1225:3: rule__Structure__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Structure__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStructureAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Structure__Group__1__Impl"


    // $ANTLR start "rule__Structure__Group__2"
    // InternalMCC.g:1233:1: rule__Structure__Group__2 : rule__Structure__Group__2__Impl rule__Structure__Group__3 ;
    public final void rule__Structure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1237:1: ( rule__Structure__Group__2__Impl rule__Structure__Group__3 )
            // InternalMCC.g:1238:2: rule__Structure__Group__2__Impl rule__Structure__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Structure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structure__Group__3();

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
    // $ANTLR end "rule__Structure__Group__2"


    // $ANTLR start "rule__Structure__Group__2__Impl"
    // InternalMCC.g:1245:1: rule__Structure__Group__2__Impl : ( '[' ) ;
    public final void rule__Structure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1249:1: ( ( '[' ) )
            // InternalMCC.g:1250:1: ( '[' )
            {
            // InternalMCC.g:1250:1: ( '[' )
            // InternalMCC.g:1251:2: '['
            {
             before(grammarAccess.getStructureAccess().getLeftSquareBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStructureAccess().getLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__Structure__Group__2__Impl"


    // $ANTLR start "rule__Structure__Group__3"
    // InternalMCC.g:1260:1: rule__Structure__Group__3 : rule__Structure__Group__3__Impl rule__Structure__Group__4 ;
    public final void rule__Structure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1264:1: ( rule__Structure__Group__3__Impl rule__Structure__Group__4 )
            // InternalMCC.g:1265:2: rule__Structure__Group__3__Impl rule__Structure__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Structure__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structure__Group__4();

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
    // $ANTLR end "rule__Structure__Group__3"


    // $ANTLR start "rule__Structure__Group__3__Impl"
    // InternalMCC.g:1272:1: rule__Structure__Group__3__Impl : ( ( ( rule__Structure__EdgesAssignment_3 ) ) ( ( rule__Structure__EdgesAssignment_3 )* ) ) ;
    public final void rule__Structure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1276:1: ( ( ( ( rule__Structure__EdgesAssignment_3 ) ) ( ( rule__Structure__EdgesAssignment_3 )* ) ) )
            // InternalMCC.g:1277:1: ( ( ( rule__Structure__EdgesAssignment_3 ) ) ( ( rule__Structure__EdgesAssignment_3 )* ) )
            {
            // InternalMCC.g:1277:1: ( ( ( rule__Structure__EdgesAssignment_3 ) ) ( ( rule__Structure__EdgesAssignment_3 )* ) )
            // InternalMCC.g:1278:2: ( ( rule__Structure__EdgesAssignment_3 ) ) ( ( rule__Structure__EdgesAssignment_3 )* )
            {
            // InternalMCC.g:1278:2: ( ( rule__Structure__EdgesAssignment_3 ) )
            // InternalMCC.g:1279:3: ( rule__Structure__EdgesAssignment_3 )
            {
             before(grammarAccess.getStructureAccess().getEdgesAssignment_3()); 
            // InternalMCC.g:1280:3: ( rule__Structure__EdgesAssignment_3 )
            // InternalMCC.g:1280:4: rule__Structure__EdgesAssignment_3
            {
            pushFollow(FOLLOW_15);
            rule__Structure__EdgesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStructureAccess().getEdgesAssignment_3()); 

            }

            // InternalMCC.g:1283:2: ( ( rule__Structure__EdgesAssignment_3 )* )
            // InternalMCC.g:1284:3: ( rule__Structure__EdgesAssignment_3 )*
            {
             before(grammarAccess.getStructureAccess().getEdgesAssignment_3()); 
            // InternalMCC.g:1285:3: ( rule__Structure__EdgesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMCC.g:1285:4: rule__Structure__EdgesAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Structure__EdgesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getStructureAccess().getEdgesAssignment_3()); 

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
    // $ANTLR end "rule__Structure__Group__3__Impl"


    // $ANTLR start "rule__Structure__Group__4"
    // InternalMCC.g:1294:1: rule__Structure__Group__4 : rule__Structure__Group__4__Impl rule__Structure__Group__5 ;
    public final void rule__Structure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1298:1: ( rule__Structure__Group__4__Impl rule__Structure__Group__5 )
            // InternalMCC.g:1299:2: rule__Structure__Group__4__Impl rule__Structure__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Structure__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structure__Group__5();

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
    // $ANTLR end "rule__Structure__Group__4"


    // $ANTLR start "rule__Structure__Group__4__Impl"
    // InternalMCC.g:1306:1: rule__Structure__Group__4__Impl : ( ']' ) ;
    public final void rule__Structure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1310:1: ( ( ']' ) )
            // InternalMCC.g:1311:1: ( ']' )
            {
            // InternalMCC.g:1311:1: ( ']' )
            // InternalMCC.g:1312:2: ']'
            {
             before(grammarAccess.getStructureAccess().getRightSquareBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStructureAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__Structure__Group__4__Impl"


    // $ANTLR start "rule__Structure__Group__5"
    // InternalMCC.g:1321:1: rule__Structure__Group__5 : rule__Structure__Group__5__Impl ;
    public final void rule__Structure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1325:1: ( rule__Structure__Group__5__Impl )
            // InternalMCC.g:1326:2: rule__Structure__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Structure__Group__5__Impl();

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
    // $ANTLR end "rule__Structure__Group__5"


    // $ANTLR start "rule__Structure__Group__5__Impl"
    // InternalMCC.g:1332:1: rule__Structure__Group__5__Impl : ( ';' ) ;
    public final void rule__Structure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1336:1: ( ( ';' ) )
            // InternalMCC.g:1337:1: ( ';' )
            {
            // InternalMCC.g:1337:1: ( ';' )
            // InternalMCC.g:1338:2: ';'
            {
             before(grammarAccess.getStructureAccess().getSemicolonKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStructureAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__Structure__Group__5__Impl"


    // $ANTLR start "rule__Edge__Group__0"
    // InternalMCC.g:1348:1: rule__Edge__Group__0 : rule__Edge__Group__0__Impl rule__Edge__Group__1 ;
    public final void rule__Edge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1352:1: ( rule__Edge__Group__0__Impl rule__Edge__Group__1 )
            // InternalMCC.g:1353:2: rule__Edge__Group__0__Impl rule__Edge__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Edge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__1();

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
    // $ANTLR end "rule__Edge__Group__0"


    // $ANTLR start "rule__Edge__Group__0__Impl"
    // InternalMCC.g:1360:1: rule__Edge__Group__0__Impl : ( ( rule__Edge__StartAssignment_0 ) ) ;
    public final void rule__Edge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1364:1: ( ( ( rule__Edge__StartAssignment_0 ) ) )
            // InternalMCC.g:1365:1: ( ( rule__Edge__StartAssignment_0 ) )
            {
            // InternalMCC.g:1365:1: ( ( rule__Edge__StartAssignment_0 ) )
            // InternalMCC.g:1366:2: ( rule__Edge__StartAssignment_0 )
            {
             before(grammarAccess.getEdgeAccess().getStartAssignment_0()); 
            // InternalMCC.g:1367:2: ( rule__Edge__StartAssignment_0 )
            // InternalMCC.g:1367:3: rule__Edge__StartAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Edge__StartAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getStartAssignment_0()); 

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
    // $ANTLR end "rule__Edge__Group__0__Impl"


    // $ANTLR start "rule__Edge__Group__1"
    // InternalMCC.g:1375:1: rule__Edge__Group__1 : rule__Edge__Group__1__Impl rule__Edge__Group__2 ;
    public final void rule__Edge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1379:1: ( rule__Edge__Group__1__Impl rule__Edge__Group__2 )
            // InternalMCC.g:1380:2: rule__Edge__Group__1__Impl rule__Edge__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Edge__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__2();

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
    // $ANTLR end "rule__Edge__Group__1"


    // $ANTLR start "rule__Edge__Group__1__Impl"
    // InternalMCC.g:1387:1: rule__Edge__Group__1__Impl : ( ( rule__Edge__OperatorAssignment_1 ) ) ;
    public final void rule__Edge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1391:1: ( ( ( rule__Edge__OperatorAssignment_1 ) ) )
            // InternalMCC.g:1392:1: ( ( rule__Edge__OperatorAssignment_1 ) )
            {
            // InternalMCC.g:1392:1: ( ( rule__Edge__OperatorAssignment_1 ) )
            // InternalMCC.g:1393:2: ( rule__Edge__OperatorAssignment_1 )
            {
             before(grammarAccess.getEdgeAccess().getOperatorAssignment_1()); 
            // InternalMCC.g:1394:2: ( rule__Edge__OperatorAssignment_1 )
            // InternalMCC.g:1394:3: rule__Edge__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Edge__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getOperatorAssignment_1()); 

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
    // $ANTLR end "rule__Edge__Group__1__Impl"


    // $ANTLR start "rule__Edge__Group__2"
    // InternalMCC.g:1402:1: rule__Edge__Group__2 : rule__Edge__Group__2__Impl rule__Edge__Group__3 ;
    public final void rule__Edge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1406:1: ( rule__Edge__Group__2__Impl rule__Edge__Group__3 )
            // InternalMCC.g:1407:2: rule__Edge__Group__2__Impl rule__Edge__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Edge__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__3();

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
    // $ANTLR end "rule__Edge__Group__2"


    // $ANTLR start "rule__Edge__Group__2__Impl"
    // InternalMCC.g:1414:1: rule__Edge__Group__2__Impl : ( ( rule__Edge__StopAssignment_2 ) ) ;
    public final void rule__Edge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1418:1: ( ( ( rule__Edge__StopAssignment_2 ) ) )
            // InternalMCC.g:1419:1: ( ( rule__Edge__StopAssignment_2 ) )
            {
            // InternalMCC.g:1419:1: ( ( rule__Edge__StopAssignment_2 ) )
            // InternalMCC.g:1420:2: ( rule__Edge__StopAssignment_2 )
            {
             before(grammarAccess.getEdgeAccess().getStopAssignment_2()); 
            // InternalMCC.g:1421:2: ( rule__Edge__StopAssignment_2 )
            // InternalMCC.g:1421:3: rule__Edge__StopAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Edge__StopAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getStopAssignment_2()); 

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
    // $ANTLR end "rule__Edge__Group__2__Impl"


    // $ANTLR start "rule__Edge__Group__3"
    // InternalMCC.g:1429:1: rule__Edge__Group__3 : rule__Edge__Group__3__Impl rule__Edge__Group__4 ;
    public final void rule__Edge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1433:1: ( rule__Edge__Group__3__Impl rule__Edge__Group__4 )
            // InternalMCC.g:1434:2: rule__Edge__Group__3__Impl rule__Edge__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Edge__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__4();

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
    // $ANTLR end "rule__Edge__Group__3"


    // $ANTLR start "rule__Edge__Group__3__Impl"
    // InternalMCC.g:1441:1: rule__Edge__Group__3__Impl : ( ( rule__Edge__Group_3__0 )* ) ;
    public final void rule__Edge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1445:1: ( ( ( rule__Edge__Group_3__0 )* ) )
            // InternalMCC.g:1446:1: ( ( rule__Edge__Group_3__0 )* )
            {
            // InternalMCC.g:1446:1: ( ( rule__Edge__Group_3__0 )* )
            // InternalMCC.g:1447:2: ( rule__Edge__Group_3__0 )*
            {
             before(grammarAccess.getEdgeAccess().getGroup_3()); 
            // InternalMCC.g:1448:2: ( rule__Edge__Group_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMCC.g:1448:3: rule__Edge__Group_3__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Edge__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEdgeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Edge__Group__3__Impl"


    // $ANTLR start "rule__Edge__Group__4"
    // InternalMCC.g:1456:1: rule__Edge__Group__4 : rule__Edge__Group__4__Impl ;
    public final void rule__Edge__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1460:1: ( rule__Edge__Group__4__Impl )
            // InternalMCC.g:1461:2: rule__Edge__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Edge__Group__4__Impl();

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
    // $ANTLR end "rule__Edge__Group__4"


    // $ANTLR start "rule__Edge__Group__4__Impl"
    // InternalMCC.g:1467:1: rule__Edge__Group__4__Impl : ( ';' ) ;
    public final void rule__Edge__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1471:1: ( ( ';' ) )
            // InternalMCC.g:1472:1: ( ';' )
            {
            // InternalMCC.g:1472:1: ( ';' )
            // InternalMCC.g:1473:2: ';'
            {
             before(grammarAccess.getEdgeAccess().getSemicolonKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Edge__Group__4__Impl"


    // $ANTLR start "rule__Edge__Group_3__0"
    // InternalMCC.g:1483:1: rule__Edge__Group_3__0 : rule__Edge__Group_3__0__Impl rule__Edge__Group_3__1 ;
    public final void rule__Edge__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1487:1: ( rule__Edge__Group_3__0__Impl rule__Edge__Group_3__1 )
            // InternalMCC.g:1488:2: rule__Edge__Group_3__0__Impl rule__Edge__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Edge__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group_3__1();

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
    // $ANTLR end "rule__Edge__Group_3__0"


    // $ANTLR start "rule__Edge__Group_3__0__Impl"
    // InternalMCC.g:1495:1: rule__Edge__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Edge__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1499:1: ( ( ',' ) )
            // InternalMCC.g:1500:1: ( ',' )
            {
            // InternalMCC.g:1500:1: ( ',' )
            // InternalMCC.g:1501:2: ','
            {
             before(grammarAccess.getEdgeAccess().getCommaKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__Edge__Group_3__0__Impl"


    // $ANTLR start "rule__Edge__Group_3__1"
    // InternalMCC.g:1510:1: rule__Edge__Group_3__1 : rule__Edge__Group_3__1__Impl ;
    public final void rule__Edge__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1514:1: ( rule__Edge__Group_3__1__Impl )
            // InternalMCC.g:1515:2: rule__Edge__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Edge__Group_3__1__Impl();

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
    // $ANTLR end "rule__Edge__Group_3__1"


    // $ANTLR start "rule__Edge__Group_3__1__Impl"
    // InternalMCC.g:1521:1: rule__Edge__Group_3__1__Impl : ( ( rule__Edge__StopAssignment_3_1 ) ) ;
    public final void rule__Edge__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1525:1: ( ( ( rule__Edge__StopAssignment_3_1 ) ) )
            // InternalMCC.g:1526:1: ( ( rule__Edge__StopAssignment_3_1 ) )
            {
            // InternalMCC.g:1526:1: ( ( rule__Edge__StopAssignment_3_1 ) )
            // InternalMCC.g:1527:2: ( rule__Edge__StopAssignment_3_1 )
            {
             before(grammarAccess.getEdgeAccess().getStopAssignment_3_1()); 
            // InternalMCC.g:1528:2: ( rule__Edge__StopAssignment_3_1 )
            // InternalMCC.g:1528:3: rule__Edge__StopAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Edge__StopAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getStopAssignment_3_1()); 

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
    // $ANTLR end "rule__Edge__Group_3__1__Impl"


    // $ANTLR start "rule__Fragment__Group__0"
    // InternalMCC.g:1537:1: rule__Fragment__Group__0 : rule__Fragment__Group__0__Impl rule__Fragment__Group__1 ;
    public final void rule__Fragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1541:1: ( rule__Fragment__Group__0__Impl rule__Fragment__Group__1 )
            // InternalMCC.g:1542:2: rule__Fragment__Group__0__Impl rule__Fragment__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Fragment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__1();

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
    // $ANTLR end "rule__Fragment__Group__0"


    // $ANTLR start "rule__Fragment__Group__0__Impl"
    // InternalMCC.g:1549:1: rule__Fragment__Group__0__Impl : ( 'Fragment' ) ;
    public final void rule__Fragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1553:1: ( ( 'Fragment' ) )
            // InternalMCC.g:1554:1: ( 'Fragment' )
            {
            // InternalMCC.g:1554:1: ( 'Fragment' )
            // InternalMCC.g:1555:2: 'Fragment'
            {
             before(grammarAccess.getFragmentAccess().getFragmentKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getFragmentKeyword_0()); 

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
    // $ANTLR end "rule__Fragment__Group__0__Impl"


    // $ANTLR start "rule__Fragment__Group__1"
    // InternalMCC.g:1564:1: rule__Fragment__Group__1 : rule__Fragment__Group__1__Impl rule__Fragment__Group__2 ;
    public final void rule__Fragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1568:1: ( rule__Fragment__Group__1__Impl rule__Fragment__Group__2 )
            // InternalMCC.g:1569:2: rule__Fragment__Group__1__Impl rule__Fragment__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Fragment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__2();

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
    // $ANTLR end "rule__Fragment__Group__1"


    // $ANTLR start "rule__Fragment__Group__1__Impl"
    // InternalMCC.g:1576:1: rule__Fragment__Group__1__Impl : ( ( rule__Fragment__NameAssignment_1 ) ) ;
    public final void rule__Fragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1580:1: ( ( ( rule__Fragment__NameAssignment_1 ) ) )
            // InternalMCC.g:1581:1: ( ( rule__Fragment__NameAssignment_1 ) )
            {
            // InternalMCC.g:1581:1: ( ( rule__Fragment__NameAssignment_1 ) )
            // InternalMCC.g:1582:2: ( rule__Fragment__NameAssignment_1 )
            {
             before(grammarAccess.getFragmentAccess().getNameAssignment_1()); 
            // InternalMCC.g:1583:2: ( rule__Fragment__NameAssignment_1 )
            // InternalMCC.g:1583:3: rule__Fragment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Fragment__Group__1__Impl"


    // $ANTLR start "rule__Fragment__Group__2"
    // InternalMCC.g:1591:1: rule__Fragment__Group__2 : rule__Fragment__Group__2__Impl rule__Fragment__Group__3 ;
    public final void rule__Fragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1595:1: ( rule__Fragment__Group__2__Impl rule__Fragment__Group__3 )
            // InternalMCC.g:1596:2: rule__Fragment__Group__2__Impl rule__Fragment__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Fragment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__3();

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
    // $ANTLR end "rule__Fragment__Group__2"


    // $ANTLR start "rule__Fragment__Group__2__Impl"
    // InternalMCC.g:1603:1: rule__Fragment__Group__2__Impl : ( '[' ) ;
    public final void rule__Fragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1607:1: ( ( '[' ) )
            // InternalMCC.g:1608:1: ( '[' )
            {
            // InternalMCC.g:1608:1: ( '[' )
            // InternalMCC.g:1609:2: '['
            {
             before(grammarAccess.getFragmentAccess().getLeftSquareBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__Fragment__Group__2__Impl"


    // $ANTLR start "rule__Fragment__Group__3"
    // InternalMCC.g:1618:1: rule__Fragment__Group__3 : rule__Fragment__Group__3__Impl rule__Fragment__Group__4 ;
    public final void rule__Fragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1622:1: ( rule__Fragment__Group__3__Impl rule__Fragment__Group__4 )
            // InternalMCC.g:1623:2: rule__Fragment__Group__3__Impl rule__Fragment__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Fragment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__4();

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
    // $ANTLR end "rule__Fragment__Group__3"


    // $ANTLR start "rule__Fragment__Group__3__Impl"
    // InternalMCC.g:1630:1: rule__Fragment__Group__3__Impl : ( ( rule__Fragment__InstructionsAssignment_3 ) ) ;
    public final void rule__Fragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1634:1: ( ( ( rule__Fragment__InstructionsAssignment_3 ) ) )
            // InternalMCC.g:1635:1: ( ( rule__Fragment__InstructionsAssignment_3 ) )
            {
            // InternalMCC.g:1635:1: ( ( rule__Fragment__InstructionsAssignment_3 ) )
            // InternalMCC.g:1636:2: ( rule__Fragment__InstructionsAssignment_3 )
            {
             before(grammarAccess.getFragmentAccess().getInstructionsAssignment_3()); 
            // InternalMCC.g:1637:2: ( rule__Fragment__InstructionsAssignment_3 )
            // InternalMCC.g:1637:3: rule__Fragment__InstructionsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__InstructionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getInstructionsAssignment_3()); 

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
    // $ANTLR end "rule__Fragment__Group__3__Impl"


    // $ANTLR start "rule__Fragment__Group__4"
    // InternalMCC.g:1645:1: rule__Fragment__Group__4 : rule__Fragment__Group__4__Impl rule__Fragment__Group__5 ;
    public final void rule__Fragment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1649:1: ( rule__Fragment__Group__4__Impl rule__Fragment__Group__5 )
            // InternalMCC.g:1650:2: rule__Fragment__Group__4__Impl rule__Fragment__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Fragment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__5();

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
    // $ANTLR end "rule__Fragment__Group__4"


    // $ANTLR start "rule__Fragment__Group__4__Impl"
    // InternalMCC.g:1657:1: rule__Fragment__Group__4__Impl : ( ',' ) ;
    public final void rule__Fragment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1661:1: ( ( ',' ) )
            // InternalMCC.g:1662:1: ( ',' )
            {
            // InternalMCC.g:1662:1: ( ',' )
            // InternalMCC.g:1663:2: ','
            {
             before(grammarAccess.getFragmentAccess().getCommaKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__Fragment__Group__4__Impl"


    // $ANTLR start "rule__Fragment__Group__5"
    // InternalMCC.g:1672:1: rule__Fragment__Group__5 : rule__Fragment__Group__5__Impl rule__Fragment__Group__6 ;
    public final void rule__Fragment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1676:1: ( rule__Fragment__Group__5__Impl rule__Fragment__Group__6 )
            // InternalMCC.g:1677:2: rule__Fragment__Group__5__Impl rule__Fragment__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Fragment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__6();

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
    // $ANTLR end "rule__Fragment__Group__5"


    // $ANTLR start "rule__Fragment__Group__5__Impl"
    // InternalMCC.g:1684:1: rule__Fragment__Group__5__Impl : ( ( rule__Fragment__MemoryAssignment_5 ) ) ;
    public final void rule__Fragment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1688:1: ( ( ( rule__Fragment__MemoryAssignment_5 ) ) )
            // InternalMCC.g:1689:1: ( ( rule__Fragment__MemoryAssignment_5 ) )
            {
            // InternalMCC.g:1689:1: ( ( rule__Fragment__MemoryAssignment_5 ) )
            // InternalMCC.g:1690:2: ( rule__Fragment__MemoryAssignment_5 )
            {
             before(grammarAccess.getFragmentAccess().getMemoryAssignment_5()); 
            // InternalMCC.g:1691:2: ( rule__Fragment__MemoryAssignment_5 )
            // InternalMCC.g:1691:3: rule__Fragment__MemoryAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__MemoryAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getMemoryAssignment_5()); 

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
    // $ANTLR end "rule__Fragment__Group__5__Impl"


    // $ANTLR start "rule__Fragment__Group__6"
    // InternalMCC.g:1699:1: rule__Fragment__Group__6 : rule__Fragment__Group__6__Impl rule__Fragment__Group__7 ;
    public final void rule__Fragment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1703:1: ( rule__Fragment__Group__6__Impl rule__Fragment__Group__7 )
            // InternalMCC.g:1704:2: rule__Fragment__Group__6__Impl rule__Fragment__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Fragment__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__7();

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
    // $ANTLR end "rule__Fragment__Group__6"


    // $ANTLR start "rule__Fragment__Group__6__Impl"
    // InternalMCC.g:1711:1: rule__Fragment__Group__6__Impl : ( ',' ) ;
    public final void rule__Fragment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1715:1: ( ( ',' ) )
            // InternalMCC.g:1716:1: ( ',' )
            {
            // InternalMCC.g:1716:1: ( ',' )
            // InternalMCC.g:1717:2: ','
            {
             before(grammarAccess.getFragmentAccess().getCommaKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getCommaKeyword_6()); 

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
    // $ANTLR end "rule__Fragment__Group__6__Impl"


    // $ANTLR start "rule__Fragment__Group__7"
    // InternalMCC.g:1726:1: rule__Fragment__Group__7 : rule__Fragment__Group__7__Impl rule__Fragment__Group__8 ;
    public final void rule__Fragment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1730:1: ( rule__Fragment__Group__7__Impl rule__Fragment__Group__8 )
            // InternalMCC.g:1731:2: rule__Fragment__Group__7__Impl rule__Fragment__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Fragment__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__8();

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
    // $ANTLR end "rule__Fragment__Group__7"


    // $ANTLR start "rule__Fragment__Group__7__Impl"
    // InternalMCC.g:1738:1: rule__Fragment__Group__7__Impl : ( ( rule__Fragment__SyncAssignment_7 ) ) ;
    public final void rule__Fragment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1742:1: ( ( ( rule__Fragment__SyncAssignment_7 ) ) )
            // InternalMCC.g:1743:1: ( ( rule__Fragment__SyncAssignment_7 ) )
            {
            // InternalMCC.g:1743:1: ( ( rule__Fragment__SyncAssignment_7 ) )
            // InternalMCC.g:1744:2: ( rule__Fragment__SyncAssignment_7 )
            {
             before(grammarAccess.getFragmentAccess().getSyncAssignment_7()); 
            // InternalMCC.g:1745:2: ( rule__Fragment__SyncAssignment_7 )
            // InternalMCC.g:1745:3: rule__Fragment__SyncAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__SyncAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getSyncAssignment_7()); 

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
    // $ANTLR end "rule__Fragment__Group__7__Impl"


    // $ANTLR start "rule__Fragment__Group__8"
    // InternalMCC.g:1753:1: rule__Fragment__Group__8 : rule__Fragment__Group__8__Impl rule__Fragment__Group__9 ;
    public final void rule__Fragment__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1757:1: ( rule__Fragment__Group__8__Impl rule__Fragment__Group__9 )
            // InternalMCC.g:1758:2: rule__Fragment__Group__8__Impl rule__Fragment__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__Fragment__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__9();

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
    // $ANTLR end "rule__Fragment__Group__8"


    // $ANTLR start "rule__Fragment__Group__8__Impl"
    // InternalMCC.g:1765:1: rule__Fragment__Group__8__Impl : ( ',' ) ;
    public final void rule__Fragment__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1769:1: ( ( ',' ) )
            // InternalMCC.g:1770:1: ( ',' )
            {
            // InternalMCC.g:1770:1: ( ',' )
            // InternalMCC.g:1771:2: ','
            {
             before(grammarAccess.getFragmentAccess().getCommaKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getCommaKeyword_8()); 

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
    // $ANTLR end "rule__Fragment__Group__8__Impl"


    // $ANTLR start "rule__Fragment__Group__9"
    // InternalMCC.g:1780:1: rule__Fragment__Group__9 : rule__Fragment__Group__9__Impl rule__Fragment__Group__10 ;
    public final void rule__Fragment__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1784:1: ( rule__Fragment__Group__9__Impl rule__Fragment__Group__10 )
            // InternalMCC.g:1785:2: rule__Fragment__Group__9__Impl rule__Fragment__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__Fragment__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__10();

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
    // $ANTLR end "rule__Fragment__Group__9"


    // $ANTLR start "rule__Fragment__Group__9__Impl"
    // InternalMCC.g:1792:1: rule__Fragment__Group__9__Impl : ( ( rule__Fragment__IsOfflodableAssignment_9 ) ) ;
    public final void rule__Fragment__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1796:1: ( ( ( rule__Fragment__IsOfflodableAssignment_9 ) ) )
            // InternalMCC.g:1797:1: ( ( rule__Fragment__IsOfflodableAssignment_9 ) )
            {
            // InternalMCC.g:1797:1: ( ( rule__Fragment__IsOfflodableAssignment_9 ) )
            // InternalMCC.g:1798:2: ( rule__Fragment__IsOfflodableAssignment_9 )
            {
             before(grammarAccess.getFragmentAccess().getIsOfflodableAssignment_9()); 
            // InternalMCC.g:1799:2: ( rule__Fragment__IsOfflodableAssignment_9 )
            // InternalMCC.g:1799:3: rule__Fragment__IsOfflodableAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__IsOfflodableAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getIsOfflodableAssignment_9()); 

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
    // $ANTLR end "rule__Fragment__Group__9__Impl"


    // $ANTLR start "rule__Fragment__Group__10"
    // InternalMCC.g:1807:1: rule__Fragment__Group__10 : rule__Fragment__Group__10__Impl rule__Fragment__Group__11 ;
    public final void rule__Fragment__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1811:1: ( rule__Fragment__Group__10__Impl rule__Fragment__Group__11 )
            // InternalMCC.g:1812:2: rule__Fragment__Group__10__Impl rule__Fragment__Group__11
            {
            pushFollow(FOLLOW_20);
            rule__Fragment__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__11();

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
    // $ANTLR end "rule__Fragment__Group__10"


    // $ANTLR start "rule__Fragment__Group__10__Impl"
    // InternalMCC.g:1819:1: rule__Fragment__Group__10__Impl : ( ']' ) ;
    public final void rule__Fragment__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1823:1: ( ( ']' ) )
            // InternalMCC.g:1824:1: ( ']' )
            {
            // InternalMCC.g:1824:1: ( ']' )
            // InternalMCC.g:1825:2: ']'
            {
             before(grammarAccess.getFragmentAccess().getRightSquareBracketKeyword_10()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getRightSquareBracketKeyword_10()); 

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
    // $ANTLR end "rule__Fragment__Group__10__Impl"


    // $ANTLR start "rule__Fragment__Group__11"
    // InternalMCC.g:1834:1: rule__Fragment__Group__11 : rule__Fragment__Group__11__Impl rule__Fragment__Group__12 ;
    public final void rule__Fragment__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1838:1: ( rule__Fragment__Group__11__Impl rule__Fragment__Group__12 )
            // InternalMCC.g:1839:2: rule__Fragment__Group__11__Impl rule__Fragment__Group__12
            {
            pushFollow(FOLLOW_20);
            rule__Fragment__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__12();

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
    // $ANTLR end "rule__Fragment__Group__11"


    // $ANTLR start "rule__Fragment__Group__11__Impl"
    // InternalMCC.g:1846:1: rule__Fragment__Group__11__Impl : ( ( rule__Fragment__InitAssignment_11 )? ) ;
    public final void rule__Fragment__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1850:1: ( ( ( rule__Fragment__InitAssignment_11 )? ) )
            // InternalMCC.g:1851:1: ( ( rule__Fragment__InitAssignment_11 )? )
            {
            // InternalMCC.g:1851:1: ( ( rule__Fragment__InitAssignment_11 )? )
            // InternalMCC.g:1852:2: ( rule__Fragment__InitAssignment_11 )?
            {
             before(grammarAccess.getFragmentAccess().getInitAssignment_11()); 
            // InternalMCC.g:1853:2: ( rule__Fragment__InitAssignment_11 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMCC.g:1853:3: rule__Fragment__InitAssignment_11
                    {
                    pushFollow(FOLLOW_2);
                    rule__Fragment__InitAssignment_11();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFragmentAccess().getInitAssignment_11()); 

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
    // $ANTLR end "rule__Fragment__Group__11__Impl"


    // $ANTLR start "rule__Fragment__Group__12"
    // InternalMCC.g:1861:1: rule__Fragment__Group__12 : rule__Fragment__Group__12__Impl ;
    public final void rule__Fragment__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1865:1: ( rule__Fragment__Group__12__Impl )
            // InternalMCC.g:1866:2: rule__Fragment__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__Group__12__Impl();

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
    // $ANTLR end "rule__Fragment__Group__12"


    // $ANTLR start "rule__Fragment__Group__12__Impl"
    // InternalMCC.g:1872:1: rule__Fragment__Group__12__Impl : ( ';' ) ;
    public final void rule__Fragment__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1876:1: ( ( ';' ) )
            // InternalMCC.g:1877:1: ( ';' )
            {
            // InternalMCC.g:1877:1: ( ';' )
            // InternalMCC.g:1878:2: ';'
            {
             before(grammarAccess.getFragmentAccess().getSemicolonKeyword_12()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getSemicolonKeyword_12()); 

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
    // $ANTLR end "rule__Fragment__Group__12__Impl"


    // $ANTLR start "rule__System__Group__0"
    // InternalMCC.g:1888:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1892:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalMCC.g:1893:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__1();

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
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // InternalMCC.g:1900:1: rule__System__Group__0__Impl : ( 'System' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1904:1: ( ( 'System' ) )
            // InternalMCC.g:1905:1: ( 'System' )
            {
            // InternalMCC.g:1905:1: ( 'System' )
            // InternalMCC.g:1906:2: 'System'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getSystemKeyword_0()); 

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
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // InternalMCC.g:1915:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1919:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalMCC.g:1920:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__2();

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
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // InternalMCC.g:1927:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1931:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // InternalMCC.g:1932:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // InternalMCC.g:1932:1: ( ( rule__System__NameAssignment_1 ) )
            // InternalMCC.g:1933:2: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // InternalMCC.g:1934:2: ( rule__System__NameAssignment_1 )
            // InternalMCC.g:1934:3: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__System__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // InternalMCC.g:1942:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1946:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalMCC.g:1947:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__3();

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
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // InternalMCC.g:1954:1: rule__System__Group__2__Impl : ( ':=' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1958:1: ( ( ':=' ) )
            // InternalMCC.g:1959:1: ( ':=' )
            {
            // InternalMCC.g:1959:1: ( ':=' )
            // InternalMCC.g:1960:2: ':='
            {
             before(grammarAccess.getSystemAccess().getColonEqualsSignKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getColonEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // InternalMCC.g:1969:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1973:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // InternalMCC.g:1974:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__4();

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
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // InternalMCC.g:1981:1: rule__System__Group__3__Impl : ( ( rule__System__DevicesAssignment_3 ) ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1985:1: ( ( ( rule__System__DevicesAssignment_3 ) ) )
            // InternalMCC.g:1986:1: ( ( rule__System__DevicesAssignment_3 ) )
            {
            // InternalMCC.g:1986:1: ( ( rule__System__DevicesAssignment_3 ) )
            // InternalMCC.g:1987:2: ( rule__System__DevicesAssignment_3 )
            {
             before(grammarAccess.getSystemAccess().getDevicesAssignment_3()); 
            // InternalMCC.g:1988:2: ( rule__System__DevicesAssignment_3 )
            // InternalMCC.g:1988:3: rule__System__DevicesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__System__DevicesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getDevicesAssignment_3()); 

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
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // InternalMCC.g:1996:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2000:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // InternalMCC.g:2001:2: rule__System__Group__4__Impl rule__System__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__System__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__5();

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
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // InternalMCC.g:2008:1: rule__System__Group__4__Impl : ( ( rule__System__Group_4__0 )* ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2012:1: ( ( ( rule__System__Group_4__0 )* ) )
            // InternalMCC.g:2013:1: ( ( rule__System__Group_4__0 )* )
            {
            // InternalMCC.g:2013:1: ( ( rule__System__Group_4__0 )* )
            // InternalMCC.g:2014:2: ( rule__System__Group_4__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_4()); 
            // InternalMCC.g:2015:2: ( rule__System__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMCC.g:2015:3: rule__System__Group_4__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__System__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getGroup_4()); 

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
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__System__Group__5"
    // InternalMCC.g:2023:1: rule__System__Group__5 : rule__System__Group__5__Impl ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2027:1: ( rule__System__Group__5__Impl )
            // InternalMCC.g:2028:2: rule__System__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__5__Impl();

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
    // $ANTLR end "rule__System__Group__5"


    // $ANTLR start "rule__System__Group__5__Impl"
    // InternalMCC.g:2034:1: rule__System__Group__5__Impl : ( ';' ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2038:1: ( ( ';' ) )
            // InternalMCC.g:2039:1: ( ';' )
            {
            // InternalMCC.g:2039:1: ( ';' )
            // InternalMCC.g:2040:2: ';'
            {
             before(grammarAccess.getSystemAccess().getSemicolonKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__System__Group__5__Impl"


    // $ANTLR start "rule__System__Group_4__0"
    // InternalMCC.g:2050:1: rule__System__Group_4__0 : rule__System__Group_4__0__Impl rule__System__Group_4__1 ;
    public final void rule__System__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2054:1: ( rule__System__Group_4__0__Impl rule__System__Group_4__1 )
            // InternalMCC.g:2055:2: rule__System__Group_4__0__Impl rule__System__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__System__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_4__1();

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
    // $ANTLR end "rule__System__Group_4__0"


    // $ANTLR start "rule__System__Group_4__0__Impl"
    // InternalMCC.g:2062:1: rule__System__Group_4__0__Impl : ( '|' ) ;
    public final void rule__System__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2066:1: ( ( '|' ) )
            // InternalMCC.g:2067:1: ( '|' )
            {
            // InternalMCC.g:2067:1: ( '|' )
            // InternalMCC.g:2068:2: '|'
            {
             before(grammarAccess.getSystemAccess().getVerticalLineKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getVerticalLineKeyword_4_0()); 

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
    // $ANTLR end "rule__System__Group_4__0__Impl"


    // $ANTLR start "rule__System__Group_4__1"
    // InternalMCC.g:2077:1: rule__System__Group_4__1 : rule__System__Group_4__1__Impl ;
    public final void rule__System__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2081:1: ( rule__System__Group_4__1__Impl )
            // InternalMCC.g:2082:2: rule__System__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_4__1__Impl();

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
    // $ANTLR end "rule__System__Group_4__1"


    // $ANTLR start "rule__System__Group_4__1__Impl"
    // InternalMCC.g:2088:1: rule__System__Group_4__1__Impl : ( ( rule__System__DevicesAssignment_4_1 ) ) ;
    public final void rule__System__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2092:1: ( ( ( rule__System__DevicesAssignment_4_1 ) ) )
            // InternalMCC.g:2093:1: ( ( rule__System__DevicesAssignment_4_1 ) )
            {
            // InternalMCC.g:2093:1: ( ( rule__System__DevicesAssignment_4_1 ) )
            // InternalMCC.g:2094:2: ( rule__System__DevicesAssignment_4_1 )
            {
             before(grammarAccess.getSystemAccess().getDevicesAssignment_4_1()); 
            // InternalMCC.g:2095:2: ( rule__System__DevicesAssignment_4_1 )
            // InternalMCC.g:2095:3: rule__System__DevicesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__System__DevicesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getDevicesAssignment_4_1()); 

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
    // $ANTLR end "rule__System__Group_4__1__Impl"


    // $ANTLR start "rule__Model__DevicesAssignment_0"
    // InternalMCC.g:2104:1: rule__Model__DevicesAssignment_0 : ( ruleDevice ) ;
    public final void rule__Model__DevicesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2108:1: ( ( ruleDevice ) )
            // InternalMCC.g:2109:2: ( ruleDevice )
            {
            // InternalMCC.g:2109:2: ( ruleDevice )
            // InternalMCC.g:2110:3: ruleDevice
            {
             before(grammarAccess.getModelAccess().getDevicesDeviceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDevicesDeviceParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__DevicesAssignment_0"


    // $ANTLR start "rule__Model__ApplicationsAssignment_1"
    // InternalMCC.g:2119:1: rule__Model__ApplicationsAssignment_1 : ( ruleApplication ) ;
    public final void rule__Model__ApplicationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2123:1: ( ( ruleApplication ) )
            // InternalMCC.g:2124:2: ( ruleApplication )
            {
            // InternalMCC.g:2124:2: ( ruleApplication )
            // InternalMCC.g:2125:3: ruleApplication
            {
             before(grammarAccess.getModelAccess().getApplicationsApplicationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getModelAccess().getApplicationsApplicationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__ApplicationsAssignment_1"


    // $ANTLR start "rule__Model__SystemsAssignment_2"
    // InternalMCC.g:2134:1: rule__Model__SystemsAssignment_2 : ( ruleSystem ) ;
    public final void rule__Model__SystemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2138:1: ( ( ruleSystem ) )
            // InternalMCC.g:2139:2: ( ruleSystem )
            {
            // InternalMCC.g:2139:2: ( ruleSystem )
            // InternalMCC.g:2140:3: ruleSystem
            {
             before(grammarAccess.getModelAccess().getSystemsSystemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSystemsSystemParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__SystemsAssignment_2"


    // $ANTLR start "rule__Cloud__NameAssignment_1"
    // InternalMCC.g:2149:1: rule__Cloud__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Cloud__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2153:1: ( ( RULE_ID ) )
            // InternalMCC.g:2154:2: ( RULE_ID )
            {
            // InternalMCC.g:2154:2: ( RULE_ID )
            // InternalMCC.g:2155:3: RULE_ID
            {
             before(grammarAccess.getCloudAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Cloud__NameAssignment_1"


    // $ANTLR start "rule__Cloud__CpuInstructionsAssignment_3"
    // InternalMCC.g:2164:1: rule__Cloud__CpuInstructionsAssignment_3 : ( RULE_INT ) ;
    public final void rule__Cloud__CpuInstructionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2168:1: ( ( RULE_INT ) )
            // InternalMCC.g:2169:2: ( RULE_INT )
            {
            // InternalMCC.g:2169:2: ( RULE_INT )
            // InternalMCC.g:2170:3: RULE_INT
            {
             before(grammarAccess.getCloudAccess().getCpuInstructionsINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getCpuInstructionsINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Cloud__CpuInstructionsAssignment_3"


    // $ANTLR start "rule__Cloud__ApplicationsAssignment_5"
    // InternalMCC.g:2179:1: rule__Cloud__ApplicationsAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Cloud__ApplicationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2183:1: ( ( ( RULE_ID ) ) )
            // InternalMCC.g:2184:2: ( ( RULE_ID ) )
            {
            // InternalMCC.g:2184:2: ( ( RULE_ID ) )
            // InternalMCC.g:2185:3: ( RULE_ID )
            {
             before(grammarAccess.getCloudAccess().getApplicationsApplicationCrossReference_5_0()); 
            // InternalMCC.g:2186:3: ( RULE_ID )
            // InternalMCC.g:2187:4: RULE_ID
            {
             before(grammarAccess.getCloudAccess().getApplicationsApplicationIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getApplicationsApplicationIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getCloudAccess().getApplicationsApplicationCrossReference_5_0()); 

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
    // $ANTLR end "rule__Cloud__ApplicationsAssignment_5"


    // $ANTLR start "rule__Mobile__NameAssignment_1"
    // InternalMCC.g:2198:1: rule__Mobile__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mobile__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2202:1: ( ( RULE_ID ) )
            // InternalMCC.g:2203:2: ( RULE_ID )
            {
            // InternalMCC.g:2203:2: ( RULE_ID )
            // InternalMCC.g:2204:3: RULE_ID
            {
             before(grammarAccess.getMobileAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Mobile__NameAssignment_1"


    // $ANTLR start "rule__Mobile__CpuInstructionsAssignment_3"
    // InternalMCC.g:2213:1: rule__Mobile__CpuInstructionsAssignment_3 : ( RULE_INT ) ;
    public final void rule__Mobile__CpuInstructionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2217:1: ( ( RULE_INT ) )
            // InternalMCC.g:2218:2: ( RULE_INT )
            {
            // InternalMCC.g:2218:2: ( RULE_INT )
            // InternalMCC.g:2219:3: RULE_INT
            {
             before(grammarAccess.getMobileAccess().getCpuInstructionsINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getCpuInstructionsINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Mobile__CpuInstructionsAssignment_3"


    // $ANTLR start "rule__Mobile__ApplicationsAssignment_5"
    // InternalMCC.g:2228:1: rule__Mobile__ApplicationsAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Mobile__ApplicationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2232:1: ( ( ( RULE_ID ) ) )
            // InternalMCC.g:2233:2: ( ( RULE_ID ) )
            {
            // InternalMCC.g:2233:2: ( ( RULE_ID ) )
            // InternalMCC.g:2234:3: ( RULE_ID )
            {
             before(grammarAccess.getMobileAccess().getApplicationsApplicationCrossReference_5_0()); 
            // InternalMCC.g:2235:3: ( RULE_ID )
            // InternalMCC.g:2236:4: RULE_ID
            {
             before(grammarAccess.getMobileAccess().getApplicationsApplicationIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getApplicationsApplicationIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getMobileAccess().getApplicationsApplicationCrossReference_5_0()); 

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
    // $ANTLR end "rule__Mobile__ApplicationsAssignment_5"


    // $ANTLR start "rule__Mobile__BatteryAssignment_7"
    // InternalMCC.g:2247:1: rule__Mobile__BatteryAssignment_7 : ( RULE_INT ) ;
    public final void rule__Mobile__BatteryAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2251:1: ( ( RULE_INT ) )
            // InternalMCC.g:2252:2: ( RULE_INT )
            {
            // InternalMCC.g:2252:2: ( RULE_INT )
            // InternalMCC.g:2253:3: RULE_INT
            {
             before(grammarAccess.getMobileAccess().getBatteryINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getBatteryINTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Mobile__BatteryAssignment_7"


    // $ANTLR start "rule__Mobile__NetworkAssignment_9"
    // InternalMCC.g:2262:1: rule__Mobile__NetworkAssignment_9 : ( RULE_INT ) ;
    public final void rule__Mobile__NetworkAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2266:1: ( ( RULE_INT ) )
            // InternalMCC.g:2267:2: ( RULE_INT )
            {
            // InternalMCC.g:2267:2: ( RULE_INT )
            // InternalMCC.g:2268:3: RULE_INT
            {
             before(grammarAccess.getMobileAccess().getNetworkINTTerminalRuleCall_9_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getNetworkINTTerminalRuleCall_9_0()); 

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
    // $ANTLR end "rule__Mobile__NetworkAssignment_9"


    // $ANTLR start "rule__Mobile__MemoryAssignment_11"
    // InternalMCC.g:2277:1: rule__Mobile__MemoryAssignment_11 : ( RULE_INT ) ;
    public final void rule__Mobile__MemoryAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2281:1: ( ( RULE_INT ) )
            // InternalMCC.g:2282:2: ( RULE_INT )
            {
            // InternalMCC.g:2282:2: ( RULE_INT )
            // InternalMCC.g:2283:3: RULE_INT
            {
             before(grammarAccess.getMobileAccess().getMemoryINTTerminalRuleCall_11_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMobileAccess().getMemoryINTTerminalRuleCall_11_0()); 

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
    // $ANTLR end "rule__Mobile__MemoryAssignment_11"


    // $ANTLR start "rule__Application__NameAssignment_1"
    // InternalMCC.g:2292:1: rule__Application__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Application__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2296:1: ( ( RULE_ID ) )
            // InternalMCC.g:2297:2: ( RULE_ID )
            {
            // InternalMCC.g:2297:2: ( RULE_ID )
            // InternalMCC.g:2298:3: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Application__NameAssignment_1"


    // $ANTLR start "rule__Application__FragmentsAssignment_3"
    // InternalMCC.g:2307:1: rule__Application__FragmentsAssignment_3 : ( ruleFragment ) ;
    public final void rule__Application__FragmentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2311:1: ( ( ruleFragment ) )
            // InternalMCC.g:2312:2: ( ruleFragment )
            {
            // InternalMCC.g:2312:2: ( ruleFragment )
            // InternalMCC.g:2313:3: ruleFragment
            {
             before(grammarAccess.getApplicationAccess().getFragmentsFragmentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFragment();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getFragmentsFragmentParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Application__FragmentsAssignment_3"


    // $ANTLR start "rule__Application__StructureAssignment_4"
    // InternalMCC.g:2322:1: rule__Application__StructureAssignment_4 : ( ruleStructure ) ;
    public final void rule__Application__StructureAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2326:1: ( ( ruleStructure ) )
            // InternalMCC.g:2327:2: ( ruleStructure )
            {
            // InternalMCC.g:2327:2: ( ruleStructure )
            // InternalMCC.g:2328:3: ruleStructure
            {
             before(grammarAccess.getApplicationAccess().getStructureStructureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStructure();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getStructureStructureParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Application__StructureAssignment_4"


    // $ANTLR start "rule__Structure__NameAssignment_1"
    // InternalMCC.g:2337:1: rule__Structure__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Structure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2341:1: ( ( RULE_ID ) )
            // InternalMCC.g:2342:2: ( RULE_ID )
            {
            // InternalMCC.g:2342:2: ( RULE_ID )
            // InternalMCC.g:2343:3: RULE_ID
            {
             before(grammarAccess.getStructureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStructureAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Structure__NameAssignment_1"


    // $ANTLR start "rule__Structure__EdgesAssignment_3"
    // InternalMCC.g:2352:1: rule__Structure__EdgesAssignment_3 : ( ruleEdge ) ;
    public final void rule__Structure__EdgesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2356:1: ( ( ruleEdge ) )
            // InternalMCC.g:2357:2: ( ruleEdge )
            {
            // InternalMCC.g:2357:2: ( ruleEdge )
            // InternalMCC.g:2358:3: ruleEdge
            {
             before(grammarAccess.getStructureAccess().getEdgesEdgeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEdge();

            state._fsp--;

             after(grammarAccess.getStructureAccess().getEdgesEdgeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Structure__EdgesAssignment_3"


    // $ANTLR start "rule__Edge__StartAssignment_0"
    // InternalMCC.g:2367:1: rule__Edge__StartAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Edge__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2371:1: ( ( ( RULE_ID ) ) )
            // InternalMCC.g:2372:2: ( ( RULE_ID ) )
            {
            // InternalMCC.g:2372:2: ( ( RULE_ID ) )
            // InternalMCC.g:2373:3: ( RULE_ID )
            {
             before(grammarAccess.getEdgeAccess().getStartFragmentCrossReference_0_0()); 
            // InternalMCC.g:2374:3: ( RULE_ID )
            // InternalMCC.g:2375:4: RULE_ID
            {
             before(grammarAccess.getEdgeAccess().getStartFragmentIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getStartFragmentIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getEdgeAccess().getStartFragmentCrossReference_0_0()); 

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
    // $ANTLR end "rule__Edge__StartAssignment_0"


    // $ANTLR start "rule__Edge__OperatorAssignment_1"
    // InternalMCC.g:2386:1: rule__Edge__OperatorAssignment_1 : ( ruleOperator ) ;
    public final void rule__Edge__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2390:1: ( ( ruleOperator ) )
            // InternalMCC.g:2391:2: ( ruleOperator )
            {
            // InternalMCC.g:2391:2: ( ruleOperator )
            // InternalMCC.g:2392:3: ruleOperator
            {
             before(grammarAccess.getEdgeAccess().getOperatorOperatorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getEdgeAccess().getOperatorOperatorEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Edge__OperatorAssignment_1"


    // $ANTLR start "rule__Edge__StopAssignment_2"
    // InternalMCC.g:2401:1: rule__Edge__StopAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Edge__StopAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2405:1: ( ( ( RULE_ID ) ) )
            // InternalMCC.g:2406:2: ( ( RULE_ID ) )
            {
            // InternalMCC.g:2406:2: ( ( RULE_ID ) )
            // InternalMCC.g:2407:3: ( RULE_ID )
            {
             before(grammarAccess.getEdgeAccess().getStopFragmentCrossReference_2_0()); 
            // InternalMCC.g:2408:3: ( RULE_ID )
            // InternalMCC.g:2409:4: RULE_ID
            {
             before(grammarAccess.getEdgeAccess().getStopFragmentIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getStopFragmentIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getEdgeAccess().getStopFragmentCrossReference_2_0()); 

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
    // $ANTLR end "rule__Edge__StopAssignment_2"


    // $ANTLR start "rule__Edge__StopAssignment_3_1"
    // InternalMCC.g:2420:1: rule__Edge__StopAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Edge__StopAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2424:1: ( ( ( RULE_ID ) ) )
            // InternalMCC.g:2425:2: ( ( RULE_ID ) )
            {
            // InternalMCC.g:2425:2: ( ( RULE_ID ) )
            // InternalMCC.g:2426:3: ( RULE_ID )
            {
             before(grammarAccess.getEdgeAccess().getStopFragmentCrossReference_3_1_0()); 
            // InternalMCC.g:2427:3: ( RULE_ID )
            // InternalMCC.g:2428:4: RULE_ID
            {
             before(grammarAccess.getEdgeAccess().getStopFragmentIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getStopFragmentIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEdgeAccess().getStopFragmentCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Edge__StopAssignment_3_1"


    // $ANTLR start "rule__Fragment__NameAssignment_1"
    // InternalMCC.g:2439:1: rule__Fragment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Fragment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2443:1: ( ( RULE_ID ) )
            // InternalMCC.g:2444:2: ( RULE_ID )
            {
            // InternalMCC.g:2444:2: ( RULE_ID )
            // InternalMCC.g:2445:3: RULE_ID
            {
             before(grammarAccess.getFragmentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Fragment__NameAssignment_1"


    // $ANTLR start "rule__Fragment__InstructionsAssignment_3"
    // InternalMCC.g:2454:1: rule__Fragment__InstructionsAssignment_3 : ( RULE_INT ) ;
    public final void rule__Fragment__InstructionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2458:1: ( ( RULE_INT ) )
            // InternalMCC.g:2459:2: ( RULE_INT )
            {
            // InternalMCC.g:2459:2: ( RULE_INT )
            // InternalMCC.g:2460:3: RULE_INT
            {
             before(grammarAccess.getFragmentAccess().getInstructionsINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getInstructionsINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Fragment__InstructionsAssignment_3"


    // $ANTLR start "rule__Fragment__MemoryAssignment_5"
    // InternalMCC.g:2469:1: rule__Fragment__MemoryAssignment_5 : ( RULE_INT ) ;
    public final void rule__Fragment__MemoryAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2473:1: ( ( RULE_INT ) )
            // InternalMCC.g:2474:2: ( RULE_INT )
            {
            // InternalMCC.g:2474:2: ( RULE_INT )
            // InternalMCC.g:2475:3: RULE_INT
            {
             before(grammarAccess.getFragmentAccess().getMemoryINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getMemoryINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Fragment__MemoryAssignment_5"


    // $ANTLR start "rule__Fragment__SyncAssignment_7"
    // InternalMCC.g:2484:1: rule__Fragment__SyncAssignment_7 : ( RULE_INT ) ;
    public final void rule__Fragment__SyncAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2488:1: ( ( RULE_INT ) )
            // InternalMCC.g:2489:2: ( RULE_INT )
            {
            // InternalMCC.g:2489:2: ( RULE_INT )
            // InternalMCC.g:2490:3: RULE_INT
            {
             before(grammarAccess.getFragmentAccess().getSyncINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getSyncINTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Fragment__SyncAssignment_7"


    // $ANTLR start "rule__Fragment__IsOfflodableAssignment_9"
    // InternalMCC.g:2499:1: rule__Fragment__IsOfflodableAssignment_9 : ( ( rule__Fragment__IsOfflodableAlternatives_9_0 ) ) ;
    public final void rule__Fragment__IsOfflodableAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2503:1: ( ( ( rule__Fragment__IsOfflodableAlternatives_9_0 ) ) )
            // InternalMCC.g:2504:2: ( ( rule__Fragment__IsOfflodableAlternatives_9_0 ) )
            {
            // InternalMCC.g:2504:2: ( ( rule__Fragment__IsOfflodableAlternatives_9_0 ) )
            // InternalMCC.g:2505:3: ( rule__Fragment__IsOfflodableAlternatives_9_0 )
            {
             before(grammarAccess.getFragmentAccess().getIsOfflodableAlternatives_9_0()); 
            // InternalMCC.g:2506:3: ( rule__Fragment__IsOfflodableAlternatives_9_0 )
            // InternalMCC.g:2506:4: rule__Fragment__IsOfflodableAlternatives_9_0
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__IsOfflodableAlternatives_9_0();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getIsOfflodableAlternatives_9_0()); 

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
    // $ANTLR end "rule__Fragment__IsOfflodableAssignment_9"


    // $ANTLR start "rule__Fragment__InitAssignment_11"
    // InternalMCC.g:2514:1: rule__Fragment__InitAssignment_11 : ( ( 'init' ) ) ;
    public final void rule__Fragment__InitAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2518:1: ( ( ( 'init' ) ) )
            // InternalMCC.g:2519:2: ( ( 'init' ) )
            {
            // InternalMCC.g:2519:2: ( ( 'init' ) )
            // InternalMCC.g:2520:3: ( 'init' )
            {
             before(grammarAccess.getFragmentAccess().getInitInitKeyword_11_0()); 
            // InternalMCC.g:2521:3: ( 'init' )
            // InternalMCC.g:2522:4: 'init'
            {
             before(grammarAccess.getFragmentAccess().getInitInitKeyword_11_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getInitInitKeyword_11_0()); 

            }

             after(grammarAccess.getFragmentAccess().getInitInitKeyword_11_0()); 

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
    // $ANTLR end "rule__Fragment__InitAssignment_11"


    // $ANTLR start "rule__System__NameAssignment_1"
    // InternalMCC.g:2533:1: rule__System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2537:1: ( ( RULE_ID ) )
            // InternalMCC.g:2538:2: ( RULE_ID )
            {
            // InternalMCC.g:2538:2: ( RULE_ID )
            // InternalMCC.g:2539:3: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__System__NameAssignment_1"


    // $ANTLR start "rule__System__DevicesAssignment_3"
    // InternalMCC.g:2548:1: rule__System__DevicesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__System__DevicesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2552:1: ( ( ( RULE_ID ) ) )
            // InternalMCC.g:2553:2: ( ( RULE_ID ) )
            {
            // InternalMCC.g:2553:2: ( ( RULE_ID ) )
            // InternalMCC.g:2554:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemAccess().getDevicesDeviceCrossReference_3_0()); 
            // InternalMCC.g:2555:3: ( RULE_ID )
            // InternalMCC.g:2556:4: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getDevicesDeviceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getDevicesDeviceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSystemAccess().getDevicesDeviceCrossReference_3_0()); 

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
    // $ANTLR end "rule__System__DevicesAssignment_3"


    // $ANTLR start "rule__System__DevicesAssignment_4_1"
    // InternalMCC.g:2567:1: rule__System__DevicesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__System__DevicesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2571:1: ( ( ( RULE_ID ) ) )
            // InternalMCC.g:2572:2: ( ( RULE_ID ) )
            {
            // InternalMCC.g:2572:2: ( ( RULE_ID ) )
            // InternalMCC.g:2573:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemAccess().getDevicesDeviceCrossReference_4_1_0()); 
            // InternalMCC.g:2574:3: ( RULE_ID )
            // InternalMCC.g:2575:4: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getDevicesDeviceIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getDevicesDeviceIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getSystemAccess().getDevicesDeviceCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__System__DevicesAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008610002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000002L});

}