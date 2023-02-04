package com.tc23;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;

public class MiVisitor extends ReglasBaseVisitor<String> {
    private int count_label;
    private int count_tmp;
    private String tmp_previous;
    private String tmp_current;
    private String code;
    private boolean tmp_add;
    private HashMap<String, String> opposites;
    private String[] operators_logical;

    public MiVisitor() {
        this.opposites = new HashMap<String, String>() {{
            put("!=", "==");
            put("==", "!=");
            put("<", ">=");
            put(">=", "<");
            put("<=", ">");
            put(">", "<=")
            ;
        }};
        this.operators_logical = new String[]{"&&", "||"};
        this.tmp_add = false;
        this.count_label = 0;
        this.count_tmp = 0;
        this.code = "";
        this.tmp_previous = "";
        this.tmp_current = ""; // el nombre de la variable temporal actual por ej t0

    }

    /**
     * getNodes obtiene todos los nodos del árbol que coincidan con la regla de idx_rule
     * @param ctx Árbol donde se busca la regla gramatical
     * @param idx_rule Regla a buscar
     * @return Lista de nodos coincidentes con la regla
     */
    private List<ParseTree> getNodes(ParseTree ctx, int idx_rule) {
        return new ArrayList<ParseTree>(Trees.findAllRuleNodes(ctx, idx_rule));
    }

    /**
     * findRuleNodes busca todos los nodos que coincidan con la regla pasada por parametro, clasificando y 
     * limpiando nodos residuales no pertenecientes a la regla
     * @param t     Arbol sobre el cual buscar las reglas
     * @param index Regla a buscar
     * @param nodes Lista en la cual almacenar los nodos
     */
    public void findRuleNodes(ParseTree t, int index, List<ParseTree> nodes) {
        if (t instanceof ParserRuleContext) {
            ParserRuleContext ctx = (ParserRuleContext) t;
            if (ctx.getRuleIndex() == index) {
                nodes.add(t);
            }
        }
        // check children
        for (int i = 0; i < t.getChildCount(); i++) {
            if (!(t.getChild(i) instanceof ReglasParser.OperacionesContext)) {
                findRuleNodes(t.getChild(i), index, nodes);
            }
        }
    }

    /**
     * getLastLine toma un String para retornar la última línea
     * @param string String sobre el cual obtener su última línea
     * @return Devuelve la última línea del String
     */
    public String getLastLine(String string) {
        List<String> lines = Arrays.asList(string.split("\n"));
        return new ArrayList<>(lines.subList(Math.max(0, lines.size() - 1), lines.size())).get(0);
    }

    /**
     * separateOR toma un Contexto de operaciones y lo divide dado ||, por ejemplo:
     * @param t Contexto de operaciones aritmetico lógica
     * @return lista de los terminos divididor por ||
     */
    private List<ParseTree> separateOR(ParseTree t) {
        List<ParseTree> nodes = new ArrayList<ParseTree>();
        List<ParseTree> aux = this.getNodes(t, ReglasParser.RULE_disyuncion);
        List<ParseTree> operations = this.getNodes(t, ReglasParser.RULE_factor);
        int count = 0;
        for (int i = 0; i < operations.size(); i++){
            if(((ReglasParser.FactorContext) operations.get(i)).PA() != null){
                count++;
            }
        }
        int params = Trees.findAllRuleNodes(t, ReglasParser.RULE_parametros).size();
        params = aux.size() == params ? 0 : params;
        for (int i = 0; i < aux.size() - params - count; i++) {
            if(aux.get(i).getChild(0) instanceof ReglasParser.DisyuncionContext){
                nodes.add(((ReglasParser.DisyuncionContext) aux.get(i)).conjuncion());
            }
            else {
                nodes.add(aux.get(i));
            }
        }
        Collections.reverse(nodes);
        return nodes;        
    }

    /**
     * separateAND toma un Contexto de operaciones y lo divide dado &&, por ejemplo:
     * @param t Contexto de Conjuncion
     * @return Lista de los terminos divididos por &&
     */
    private List<ParseTree> separateAND(ParseTree t){
        List<ParseTree> nodes = new ArrayList<ParseTree>();
        List<ParseTree> aux = getNodes(t, ReglasParser.RULE_conjuncion);
        List<ParseTree> factores = getNodes(t, ReglasParser.RULE_factor);
        int count = 0;
        for (int i = 0; i < factores.size(); i++) {
            if (((ReglasParser.FactorContext) factores.get(i)).PA() != null){
                count++;
            }
        }
        int params = Trees.findAllRuleNodes(t, ReglasParser.RULE_parametros).size();
        params = aux.size() == params ? 0 : params;
        for (int i = 0; i < aux.size() - params - count; i++) {
            if (aux.get(i).getChild(i) instanceof ReglasParser.ConjuncionContext){
                nodes.add(((ReglasParser.ConjuncionContext) aux.get(i)).igualdad());
            } else{
                nodes.add(aux.get(i));
            }
        }
        Collections.reverse(nodes);
        return nodes;
    }

    /**
     * divide a los factores según los operadores booleanos presentes, por ejemplo si la operacion es:
     * @param t Contexto a tratar
     * @return  lista con todos los factores separados por operación booleana
     */
    private List<ParseTree> separateComparisons(ParseTree t){
        List<ParseTree> nodes = new ArrayList<ParseTree>();
        List<ParseTree> aux = getNodes(t, ReglasParser.RULE_igualdad);
        List<ParseTree> factors = getNodes(t, ReglasParser.RULE_factor);
        int count = 0;
        for (int i = 0; i < factors.size(); i++) {
            if (((ReglasParser.FactorContext) factors.get(i)).PA() != null){
                count++;
                count += getNodes(factors.get(i), ReglasParser.RULE_comparacion).size();
            }
        }
        int params = Trees.findAllRuleNodes(t, ReglasParser.RULE_parametros).size();
        params = aux.size() == params ? 0 : params;
        for (int i = 0; i < aux.size() - params - count; i++) {
            if (aux.get(i).getChild(0) instanceof ReglasParser.IgualdadContext){
                nodes.add(((ReglasParser.IgualdadContext) aux.get(i)).expresion());
            } else{
                nodes.add(aux.get(i));
            }
        }
        Collections.reverse(nodes);
        return nodes;
    }

    /**
     * toma un Conjunción Context para dividir la operación según los operadores lógicos AND
     * @param ctx
     */
    private void divideAND(ParseTree ctx) {
        String operator = "&&";
        List<ParseTree> terminos = separateAND(ctx);
        String temp;
        for (int i = 0; i < terminos.size(); i++) {
            temp = this.tmp_current;
            divideComparisons(terminos.get(i));
            this.tmp_previous = temp;
            if (i > 0) {
                concatTemps(operator);
            }
        }
    }

    /**
     * divideComparisons toma un contexto y divide a la operación por los operadores aritméticos presentes (==, !=, <, >, <=, >=)
     * @param ctx
     */
    private void divideComparisons(ParseTree ctx) {
        List<ParseTree> terminos = separateComparisons(ctx);
        String temp;
        for (int i = 0; i < terminos.size(); i++) {
            temp = tmp_current;
            processTerms(terminos.get(i));
            tmp_previous = temp;
            if (i > 0) {
                String operator = terminos.get(i).getParent().getChild(1).getText();
                concatTemps(operator);
            }
        }
    }

    /**
     * concatTemps concatena los temporales con una operación de por medio, tomando el temporal anterior
     * y el temporal actual
     * @param operation
     */
    private void concatTemps(String operation) {
        this.code += String.format("t%d = %s %s %s \n", this.count_tmp, this.tmp_previous, operation, this.tmp_current);
        this.tmp_current = "t" + this.count_tmp;
        this.count_tmp++;
    }

    /**
     * processTerms procesa todos los términos en el contexto, analizando si dentro del término hay factores para procesarlos
     * previamente
     * @param ctx
     */
    private void processTerms(ParseTree ctx) {
        List<ParseTree> ruleTerms = new ArrayList<ParseTree>();
        findRuleNodes(ctx, ReglasParser.RULE_termino, ruleTerms);
        List<ParseTree> terms = new ArrayList<ParseTree>(ruleTerms);
        String temp;
        for (int i = 0; i < terms.size(); i++) {
            List<ParseTree> factors = new ArrayList<ParseTree>();
            findRuleNodes(terms.get(i), ReglasParser.RULE_factor, factors);
            if (factors.size() > 1) {
                temp = this.tmp_current;
                processFactors(factors);
                this.tmp_previous = temp;
                this.tmp_current = "t" + (this.count_tmp - 1);
            } else {
                this.tmp_previous = this.tmp_current;
                if (((ReglasParser.TerminoContext) terms.get(i)).factor().operaciones() != null) {
                    temp = this.tmp_current;
                    processOperacion(((ReglasParser.TerminoContext) terms.get(i)).factor().operaciones());
                    this.tmp_previous = temp;
                } else if (((ReglasParser.TerminoContext) terms.get(i)).factor().funcion() != null){
                    temp = this.tmp_current;
                    this.tmp_add = true;
                    visitFuncion(((ReglasParser.TerminoContext) terms.get(i)).factor().funcion());
                    this.tmp_add = false;
                    this.tmp_previous = temp;
                    this.tmp_current = "t" + (this.count_tmp - 1);
                } else {
                    this.tmp_current = factors.get(0).getText();
                }
            }
            if(i > 0){ 
                concatTemps(terms.get(i).getParent().getChild(0).getText());
            }
        }
    }

    /**
     * processFactors toma una lista de factores y realiza las operaciones presentes
     * @param factors
     */
    private void processFactors(List<ParseTree> factors) {
        String temp;
        for(int i=0; i < factors.size(); i++) {
            if(((ReglasParser.FactorContext)factors.get(i)).operaciones() != null) {
                temp = this.tmp_current;
                processOperacion(((ReglasParser.FactorContext) factors.get(i)).operaciones());
                this.tmp_previous = temp;
            }  else if (((ReglasParser.FactorContext) factors.get(i)).funcion() != null){
                temp = this.tmp_current;
                this.tmp_add = true;
                visitFuncion(((ReglasParser.FactorContext) factors.get(i)).funcion());
                this.tmp_add = false;
                this.tmp_previous = temp;
                this.tmp_current = "t" + (this.count_tmp - 1);
            } else {
                this.tmp_previous = this.tmp_current;
                this.tmp_current = factors.get(i).getText();
            }
            if (i > 0){
                concatTemps(factors.get(i).getParent().getChild(0).getText());
            }
        }
    }

    /**
     * toma un operaciones Context para dividir la operación según los operadores lógicos OR
     * @param ctx Context operaciones
     */
    private void processOperacion(ReglasParser.OperacionesContext ctx) {
        String operator = "||";
        List<ParseTree> terminos = separateOR(ctx);
        String temp;
        for (int i = 0; i < terminos.size(); i++) {
            temp = this.tmp_current;
            divideAND(terminos.get(i));
            this.tmp_previous = temp;
            if (i > 0) {
                concatTemps(operator);
            }
        }
    }


    /**
     * getOppossiteOperation devuelve la operacion booleana opuesta dada una operacion booleana original
     * @param operation operacion sobre la cual obtener su opuesto
     * @return operacion booleana opuesta
     */
    private String getOpossiteOperation(String operation) {
        StringBuilder newOperation = new StringBuilder();
            for (int i = 0; i < operation.length(); i++) {     
                if (i+2 <= operation.length()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(operation.charAt(i));
                    sb.append(operation.charAt(i+1));
                    String op = sb.toString();
                    if (this.opposites.containsKey(op)) {
                        newOperation.append(this.opposites.get(op));
                        i++;
                    } else if (this.opposites.containsKey(String.valueOf(operation.charAt(i)))) {
                        newOperation.append(this.opposites.get(String.valueOf(operation.charAt(i))));
                    } else if (Arrays.asList(this.operators_logical).contains(op)) {
                        newOperation.append(op);
                        i++;
                    } else {
                        newOperation.append(operation.charAt(i));
                    }
                } else{ //Last character
                    newOperation.append(operation.charAt(i));
                }       
            }
        return newOperation.toString();
    }

    @Override
    public String visitAsignacion(ReglasParser.AsignacionContext ctx) {
        List<ParseTree> fact = this.getNodes(ctx, ReglasParser.RULE_factor);
        if(fact.size() == 1){
            this.code += ctx.ID().getText() + " = " + fact.get(0).getText() + "\n";
        }
        else {
            ReglasParser.OperacionesContext ctx_opearaciones = ctx.operaciones();
            processOperacion(ctx_opearaciones);
            this.code = this.code.replace("t" + (this.count_tmp - 1), ctx.ID().getText());
            this.count_tmp--;
        }
        return null;
    }

    @Override
    public String visitDeclaracion(ReglasParser.DeclaracionContext ctx) {
        ReglasParser.Lista_declaracionContext lista = ctx.lista_declaracion();
        while (lista != null){
            if (lista.asignacion() != null) {
                List<ParseTree> factor = getNodes(lista, ReglasParser.RULE_factor);
                if (factor.size() == 1){
                    this.code +=  lista.asignacion().ID().getText() + " = " + factor.get(0).getText() + "\n";
                } else{
                    ReglasParser.OperacionesContext operaciones_ctx = lista.asignacion().operaciones();
                    processOperacion(operaciones_ctx);
                    this.code = this.code.replace("t" + (this.count_tmp - 1), lista.asignacion().ID().getText());
                    this.count_tmp--;
                }
            }
            lista = lista.lista_declaracion();
        }
        return null;
    }

    @Override
    public String visitCiclo_for(ReglasParser.Ciclo_forContext ctx) {
        this.count_label++;
        int first_label = this.count_label;
        if (ctx.getChild(2) instanceof ReglasParser.DeclaracionContext) {
            visitDeclaracion((ReglasParser.DeclaracionContext) ctx.getChild(2));
        } else if (ctx.getChild(2) instanceof ReglasParser.AsignacionContext) {
            visitAsignacion((ReglasParser.AsignacionContext) ctx.getChild(2));
        }
        String operation = ctx.getChild(4).getText();
        code += String.format("L%s:", this.count_label);
        this.code += String.format("if %s goto L%s\n", getOpossiteOperation(operation), ++this.count_label);
        visitChildren(ctx.instruccion().ambito());
        code +=  ctx.getChild(6).getText() + "\n";
        code += String.format("goto L%s", first_label);
        code += String.format("\nL%s:", this.count_label);

        return null;
    }

    @Override
    public String visitCiclo_while(ReglasParser.Ciclo_whileContext ctx) {
        this.count_label++;
        int first_label = this.count_label;
        String operation = ctx.operaciones().getChild(0).getText();
        code += String.format("\nL%s:", this.count_label);
        this.code += String.format("if %s goto L%s\n", getOpossiteOperation(operation), ++this.count_label);
        visitChildren(ctx.instruccion().ambito());
        code += String.format("goto L%s", first_label);
        code += String.format("\nL%s:", this.count_label);
        return null;
    }

    public String visitCiclo_do(ReglasParser.Ciclo_doContext ctx) {
        this.count_label++;
        code += String.format("\nL%s:", this.count_label);
        visitChildren(ctx.instruccion().ambito());
        String operation = ctx.operaciones().getChild(0).getText();
        this.code += String.format("if %s goto L%s\n", getOpossiteOperation(operation), this.count_label);
        return null;
    }

    @Override
    public String visitIf_condicional(ReglasParser.If_condicionalContext ctx) {
        this.count_label++;
        processOperacion(ctx.operaciones());
        
        String auxString = getLastLine(this.code);
        String operation = auxString.substring(auxString.indexOf("=")+2);
        this.code = this.code.replace(auxString, String.format("if %s goto L%s", getOpossiteOperation(operation), this.count_label));
        this.count_tmp--;
        int lblGo = this.count_label;
        int aux1 = this.count_label;
        visitChildren(ctx.instruccion().ambito());

        ReglasParser.Else_condicionalContext elseCtx = ctx.else_condicional();
        while(elseCtx != null) {
            if (!elseCtx.getText().equals("")) {
                lblGo++;
            }
            elseCtx = elseCtx.else_condicional();
        }

        elseCtx = ctx.else_condicional();
        while(elseCtx != null) {
            if (!elseCtx.getText().equals("")) {
                // en caso de que no haya un else solo al final, evita el goto
                this.code += "goto L" + lblGo + "\n";
            }
            if (elseCtx.ELSE() != null) {
                this.code += "L" + aux1 + "\n";
                visitChildren(elseCtx.instruccion().ambito());
            }
            else if(elseCtx.ELSE_IF() != null){
                processOperacion(elseCtx.operaciones());
        
                auxString = getLastLine(this.code);
                operation = auxString.substring(auxString.indexOf("=")+2);
                this.code = this.code.replace(auxString, String.format("L%s if %s goto L%s", aux1, getOpossiteOperation(operation), ++this.count_label));
                visitChildren(elseCtx.instruccion().ambito());
            }
            aux1++;
            elseCtx = elseCtx.else_condicional();
        }

        this.code += "L" + lblGo + "\n";
        this.count_label = lblGo;
        
        return null;
    }

    @Override
    public String visitDefinicion_funcion(ReglasParser.Definicion_funcionContext ctx) {
        this.code += ctx.ID().getText() + ":\n";
        this.code += "BeginFunc\n";
        String parameter;
        List<ParseTree> params = getNodes(ctx, ReglasParser.RULE_param_definicion);
        for (int i = 0; i < params.size(); i++) {
            ReglasParser.Param_definicionContext actual = (ReglasParser.Param_definicionContext)params.get(i);
            if (actual.ID() != null) {
                parameter = actual.ID().getText();
                this.code += "PopParam " + parameter + "\n";
            }
        }
        visitChildren(ctx.ambito());
        this.code += "EndFunc\n";
        return null;
    }

    @Override
    public String visitRetorno(ReglasParser.RetornoContext ctx) {
        processOperacion(ctx.operaciones());
        this.code += String.format("return %s\n", this.tmp_current);
        return null;
    }

    @Override
    public String visitFuncion(ReglasParser.FuncionContext ctx) {
        LinkedList<String> params = new LinkedList<String>();
        if (ctx.parametros() != null) {
            LinkedList<ParseTree> operaciones = new LinkedList<ParseTree>();
            findRuleNodes(ctx.parametros(), ReglasParser.RULE_parametros, operaciones);
            for (ParseTree operacion : operaciones) {
                ReglasParser.ParametrosContext param = (ReglasParser.ParametrosContext) operacion;
                processOperacion(((ReglasParser.OperacionesContext) param.operaciones()));
                params.add("pushParam " + this.tmp_current);
            }
        }
        for (String param : params) {
            this.code += param + "\n";
        }
        if (this.tmp_add) {
            this.code += "t" + this.count_tmp + " = CALL " + ctx.ID() + "\n";
            this.count_tmp++;
        } else{
            this.code += "CALL " + ctx.ID() + "\n";
        }
        return null;
    }

    /**
     * printCode guarda el código de tres direcciones en un archivo txt
     */
    public void printCode() {
        System.out.println("\n=== CODIGO DE TRES DIRECCIONES ===");
        System.out.println(this.code);
        this.printCodeToFile();
    }

    /**
     * printCodeToFile guarda el código de tres direcciones en un archivo txt en el root del proyecto
     */
    private void printCodeToFile() {
        try {
            PrintWriter out = new PrintWriter("intermediateCode.txt");
            out.println(this.code);
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error saving intermediate code file: " + e.getMessage());
        }
    }
}
