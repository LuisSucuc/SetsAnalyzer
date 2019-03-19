package setanalyzer;

import java.io.File;


public class UpdateLexer {

  
    public static void main(String[] args) {
        String ubicacion = "/home/luis/Dropbox/UMG/Compiladores/Proyectos/SetAnalyzer/src/setanalyzer/LexGenerator.lexer";
        generarLexer(ubicacion);
    }
    
    /**
     * Método que genera y actualiza la clase Lexer basada en la
     * definicion del archivo Lexer.lex
     * @param ubicacion Ubicación del archivo Lexer.lex
     */
    public static void generarLexer(String ubicacion){
       File file = new File(ubicacion);
       jflex.Main.generate(file);   
   }
    
}
