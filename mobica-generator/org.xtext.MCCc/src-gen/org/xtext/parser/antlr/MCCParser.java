/*
 * generated by Xtext 2.34.0
 */
package org.xtext.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.parser.antlr.internal.InternalMCCParser;
import org.xtext.services.MCCGrammarAccess;

public class MCCParser extends AbstractAntlrParser {

	@Inject
	private MCCGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMCCParser createParser(XtextTokenStream stream) {
		return new InternalMCCParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public MCCGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MCCGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
