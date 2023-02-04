package com.tc23;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class App {
    public static void main(String[] args) throws Exception {

        //Se crea un variable para leer el fuente ejemplo.
        CharStream input = CharStreams.fromFileName("src/ejemplo.txt");

        //Se crea un objeto lexer que se alimenta de la entrada CharStream
        ReglasLexer lexer = new ReglasLexer(input);
        
        //Genera los tokens obtenidos del lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        //Toma los tokens
        ReglasParser parser = new ReglasParser(tokens);
                
        /* USO DE LISTENER */
        //Se crea el objeto que tiene los Listeners
        ReglasBaseListener escucha = new MiListener(parser);

        // Conecto el objeto con Listeners al parser
        parser.addParseListener(escucha);

        //Se solicita al parser que comience indicando una regla gramatical(regla de entrarda "programa")
        ParseTree tree = parser.programa();

        MiVisitor visitor = new MiVisitor();
        if (!Errores.getInstance().thereIsError()){
            // código de 3 direcciones
            visitor.visit(tree);
            visitor.printCode();
        }

        // Imprime el arbol obtenido
        //System.out.println(tree.toStringTree(parser));

    }
}

