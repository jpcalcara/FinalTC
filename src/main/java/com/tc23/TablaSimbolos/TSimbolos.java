package com.tc23.TablaSimbolos;

import java.util.HashMap;
import java.util.LinkedList;

public class TSimbolos
{
    //Lista enlazada de mapas que asocian cadenas con objetos de tipo Id.
    private LinkedList<HashMap<String, Id>> tablaSimbolos;
    private LinkedList<HashMap<String, Id>> tablaSimbolosHistorica;
    //El atributo instance es una referencia a una única instancia de la clase TSimbolos (singleton)
    private static TSimbolos instance;

    /*
     * Comprueba si instance es null. Si es así, significa que aún no se ha creado una instancia de la clase TSimbolos, 
     * por lo que se crea una nueva instancia y se asigna a instance. Si instance ya no es null, significa que ya se 
     * ha creado una instancia previamente, por lo que simplemente se devuelve instance.
     */
    public static TSimbolos getInstance() {
        if(instance == null)
            instance = new TSimbolos();

        return instance;
    }
    /*
     * Inicializa dos objetos tablaSimbolos y tablaSimbolosHistorica con sus parametros nombre y id
     * addContext agrega un contexto a la tablas de simbolos, para tener un registro separado de los identificadores
     * en diferentes contextos
     */
    public TSimbolos() {
        this.tablaSimbolos = new LinkedList<HashMap<String, Id>>();
        this.tablaSimbolosHistorica = new LinkedList<HashMap<String, Id>>();
        this.addContext();
    }

    /*
     Agrega un nuevo contexto  a las dos estructuras "tablaSimbolos" y "tablaSimbolosHistorica"
     El nuevo contexto es un hashmap que asocia string con un id
     */
    public void addContext() {
        HashMap<String, Id> context = new HashMap<String, Id>();        
        this.tablaSimbolos.add(context);
        this.tablaSimbolosHistorica.add(context);
    }
    /*
     * Agrega un nuevo parametro a la tabla de simbolos y lo asocia a un nuevo mapa con nombre y id
     * Cada vez q se llama a este metodo se agrega un nuevo contexto a la tabla de simbolos, permitiendo tener
     * una visibilidad separada de los identificadores en cada contexto.
     */
    public void addParamForContext() {
        this.tablaSimbolos.add(new HashMap<String, Id>());
    }

    /*
     * Devuelve el tamaño de la tabla de simbolos,
     */
    public int getContext() {
        return this.tablaSimbolos.size();
    }
    /*
     * Elimina el ultimo contexto de la tabla de simbolos, usa el metodo removelast() de LinkedList
     * para eliminar el ultimo elemento de la lista que representa el ultimo contexto en la tabla de simbolos
     * Lo que permite eliminar contexto antiguos y volver a contextos anteriores en la tabla de simbolos.
     */
    public void removeContext() {
        this.tablaSimbolos.removeLast();//elimina el ultimo elemento de la lista (el actual)
    }

    /*
     Busca un Id en la estructura "tablaSimbolos"
     Toma un Id como parametro y recorre cada contexto en tablaSimbolos
     Para c/contexto usa un containsKey() para verificar si la cadena de caractares asociada al Id esta
     en el contexto.
     Si se encuentra devuelve el id correspondiente con el get.
     Si no encuentra nada devuelve null
     */
    public Id searchId(final Id id) {
        for(int i = 0; i < this.tablaSimbolos.size(); i++) {
            if(this.tablaSimbolos.get(i).containsKey(id.getNombre()))
                return this.tablaSimbolos.get(i).get(id.getNombre());
        }

        return null;
    }
    /*
     * Busca una variable en la tabla de simbolos(lista de mapas) que almacena nombre y valor de variable
     * Recibe el nombre de la variable como parametro y retorna el valor asociado a ese nombre.
     * Si no se encuentra el nombre en la tabla retorna null.
     */
    public Id searchVariable(final String nombre) {
        for(int i = 0; i < this.tablaSimbolos.size(); i++) {
            if(this.tablaSimbolos.get(i).containsKey(nombre))
                return this.tablaSimbolos.get(i).get(nombre);
        }

        return null;
    }

    /*
     * Agrega una nueva variable a la tabla de simbolos
     * Recibe como parametro un Id que representa una variable, agrega el par nombre-valor al ultimo de la lista
     * tablaSimbolos y en tablaSimbolosHistorica para mantener un historial de las variables agregadas y su valor.
     */
    public void addId(final Id id) {
        this.tablaSimbolos.getLast().put(id.getNombre(), id);
        this.tablaSimbolosHistorica.get(this.tablaSimbolosHistorica.size() - 1).put(id.getNombre(), id);
    }
    /*
     * Se realiza una asignacion a una variable en la tabla de simbolos
     * Recibe como parametro un Id, que representa una variable
     * Se busca la primera ocurrencia de la variable en la tabla de simbolos empezando por el ultimo
     * y siguiendo hacia atras  en la lista.
     * Si encuentra la variable se reemplaza su valor en el mapa tanto en tablaSimbolos como 
     * tablaSimbolosHistorica, si no se encuentra retorna false.
     */
    public Boolean asignacionId(final Id id) {
        for(int i = this.tablaSimbolos.size() - 1; i >= 0; i--) {
            if(this.tablaSimbolos.get(i).containsKey(id.getNombre())) {
                this.tablaSimbolos.get(i).replace(id.getNombre(), id);
                this.tablaSimbolosHistorica.get(i).replace(id.getNombre(), id);
                return true;
            }
        }
        return false;
    }
    /*Agrega una funcion a la tabla de simbolos
     * se agrega al ultimo contexto de la tabla de simbolos, luego verifica si el tamaño de la tabla
     * es igual a 0, si lo es entonces entra al siguiente if.
     * En el segundo if verifica si el tamaño de la tabla historica es  mayor a 1,
     * si lo es agrega la funcion al penultimo contexto de la tabla de simbolos historicos.
     * Si no lo es agrega la funcion al ultimo contexto de la tabla de simbolos historicos
     */
    public void addFuncion(final Funcion funcion) {
        this.tablaSimbolos.getLast().put(funcion.getNombre(), funcion);
        if (this.tablaSimbolos.size() == 0){
            if (this.tablaSimbolosHistorica.size() > 1){
                this.tablaSimbolosHistorica.get(this.tablaSimbolosHistorica.size() - 2).put(funcion.getNombre(), funcion);
            }
            else {
                this.tablaSimbolosHistorica.get(this.tablaSimbolosHistorica.size() - 1).put(funcion.getNombre(), funcion);
            }
        }
    }

    public void addParamFuncion(final Id id) {
        // antes se debe que agregar un contexto para la funcion
        this.tablaSimbolos.getLast().put(id.getNombre(), id);//al ultimo elemento le agrega el nombre y el id
        //que a su vez es el elemento actual.
    }
    /*
     * Determina si una variable fue declarada en una tabla de simbolos
     * Toma como parametro un Id
     * Se recorre con un for de atras hacia adelante las entradas de la tabla de simbolos
     * Por cada entrada se llama containskey y se le pasa el id de la variable si devuelve true
     * significa que la variable fue declarada.
     * Si termina y no encontro nada devuelve false, lo que indica que la variable no fue declarada.
     */
    public boolean isVariableDeclared(final Id id) {
        for(int i = this.tablaSimbolos.size() - 1; i >= 0; i--) {
            if (this.tablaSimbolos.get(i).containsKey(id.getNombre())) {
                return true;
            }
        }
        return false;
    }
     /*
     * Determina si una variable fue declarada en una tabla de simbolos
     * Toma como parametro el nombre
     * Se recorre con un for de atras hacia adelante las entradas de la tabla de simbolos
     * Por cada entrada se llama containskey y se le pasa el nombre de la variable si devuelve true
     * significa que la variable fue declarada.
     * Si termina y no encontro nada devuelve false, lo que indica que la variable no fue declarada.
     */
    public boolean isVariableDeclared(final String nombre) {
        for(int i = this.tablaSimbolos.size() - 1; i >= 0; i--) {
            if (this.tablaSimbolos.get(i).containsKey(nombre)) {
                return true;
            }
        }
        return false;
    }

    /*
     * Recibe como parametro el nombre
     * Compara el nombre del id con la cadena nombre si son iguales llama al metodo setUsado
     * y le pasa un True, que lo marca como usado.
     */
    public void setUsedId(final String nombre) {
        for (HashMap<String, Id> contexto : this.tablaSimbolos) {
            for (Id id : contexto.values()) {
                if (id.getNombre().equals(nombre))
                    id.setUsado(true);
            }
        }
    }
    /*
     * Busca una funcion en la tabla de simbolos, toma como parametro funcion
     * Accede al primer valor de la tabla de simbolos y obtiene el valor asociado al
     * nombre de la funciona y lo guarda en la variable id.
     */
    public Funcion getFirmaFuncion(final Funcion function) {
        Id id = this.tablaSimbolos.getFirst().get(function.getNombre()); //guarda el nombre de la primera funcion.
        
        /*se comprueba si id es una instancia de la clase Funcion, si lo es
         * se hace un casteo de id a Funcion y  retorna el resultado.
         * Si no devuelve null.
         */
        if (id instanceof Funcion)
            return (Funcion) id;
        else
            return null; 
    }
    /*Imprime la tabla de simbolos, incializa la variable ctx en 1.
     * Por cada contexto se imprime el nro de contexto usando ctx y se incrementa en 1
     * luego se iteran los valores id en el contexto actual y por cada id se llama al tostring
     * Para cada contexto se imprime el nro y todos los identificadores dentro de el.
     */
   /* */ public void print() {
        int ctx = 1;
        /*System.out.println("\n=== TABLA DE SIMBOLOS ===");
        for (HashMap<String, Id> contexto : this.tablaSimbolos) {
            System.out.println("Contexto: " + ctx++ + " {");
            for (Id id : contexto.values()) {
                System.out.println("    " + id.toString());
            }
            System.out.println("}");
        }
        */
        ctx = 1;
        System.out.println("\n=== TABLA DE SIMBOLOS ===");
        for (HashMap<String, Id> contexto : this.tablaSimbolosHistorica) {
            System.out.println("Contexto: " + ctx++ + " {");
            for (Id id : contexto.values()) {
                 System.out.println("    " + id.toString());
            }
            System.out.println("}");
        }       
    }
}