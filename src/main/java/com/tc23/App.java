package com.tc23;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class App {
    public static void main(String[] args) throws Exception {

        //Se crea un variable para leer el fuente ejemplo.
        CharStream input = CharStreams.fromFileName("src/ejemplo.txt");
        //CharStream input = CharStreams.fromFileName("src/ejemplo2.txt");

        //Se crea un objeto lexer que se alimenta de la entrada CharStream //Analizador Lexico
        ReglasLexer lexer = new ReglasLexer(input);
        
        //Genera los tokens a partir de la secuencia de caracteres que se obtiene del lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        //Se le otorga al parser(analizador sintactico) la secuencia de tokens
        //El parser va pidiendo tokens al lexer.
        ReglasParser parser = new ReglasParser(tokens); //Analizador Sinctactico
                
        /* USO DE LISTENER */
        //Se crea el objeto que tiene los Listeners
        ReglasBaseListener escucha = new MiListener(parser);

        // Conecto el objeto con Listeners al parser
        parser.addParseListener(escucha);

        //Se solicita al parser que ejecute la regla gramatical(regla de entrada) y se genera un arbol
        //de analisis.
        ParseTree tree = parser.programa();

        //Se genera una instancia de tipo visitor
        MiVisitor visitor = new MiVisitor();
        //Si no hay error se llama al metodo visit y se le pasa el arbol de analisis y se imprime el C3D
        if (!Errores.getInstance().thereIsError()){
            // código de 3 direcciones
            visitor.visit(tree);
            visitor.printCode();
        }

        // Imprime el arbol obtenido
        //System.out.println(tree.toStringTree(parser));

    }
}

