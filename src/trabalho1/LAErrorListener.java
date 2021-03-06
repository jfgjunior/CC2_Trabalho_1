package trabalho1;

import java.util.BitSet;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class LAErrorListener implements ANTLRErrorListener {
    SaidaParser sp;
    
    public LAErrorListener(SaidaParser sp) {
        this.sp = sp;
    }


    @Override
    public void syntaxError(Recognizer<?, ?> rcgnzr, Object o, int i, int i1, String string, RecognitionException re) {
        //int indice = string.indexOf("expecting");
        CommonToken t = (CommonToken) o;
        String text = t.getText();
        if (text.contentEquals("<EOF>"))
                text = "EOF";
        sp.println("Linha " + i + ": erro sintatico proximo a " + text);
        throw new ParseCancellationException();
    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean bln, BitSet bitset, ATNConfigSet atncs) {
        //sp.println("Ambiguidade: linha " + i + ":" + i1 + " " + dfa.toString());
    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitset, ATNConfigSet atncs) {
    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atncs) {
    }
}
