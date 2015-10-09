package trabalho1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class CompiladorLA {

    public static void main(String args[]) throws IOException, RecognitionException
    {
        SaidaParser out = new SaidaParser();
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(new File(args[0])));
        LALexer lexer = new LALexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LAParser parser = new LAParser(tokens);
        parser.addErrorListener(new LAErrorListener(out));
        LAParser.ProgramaContext raiz = null;
        try {
            raiz = parser.programa();    
        } catch(ParseCancellationException pce) {
            if (pce.getMessage() != null)
                out.println(pce.getMessage());
        }

        if(!out.isModificado())
            if(Mensagens.isModificado()) {
                String erros_semanticos = Mensagens.getText();
                out.print(erros_semanticos);
                out.println("Fim da compilacao");
            }
            else {
                GeradorDeCodigo gerador = new GeradorDeCodigo();
                gerador.visitPrograma(raiz);
                out.print(gerador.getCodigo());
            }
        else
            out.println("Fim da compilacao");

        File f = new File(args[1]);
        PrintWriter pw = new PrintWriter(f);
        pw.print(out);
        pw.flush();
        pw.close();
    }
}
