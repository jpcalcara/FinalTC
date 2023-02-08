package com.tc23.TablaSimbolos;

import java.util.Iterator;
import java.util.LinkedList;

public class Funcion extends Id {
    //Declara una variable de tipo LinkedList que contiene elementos de tipo Id.
    private LinkedList<Id> parametros;

    //Constructor en el que se inicializa la variable "parametros"como una instancia
    //de una lista enlazada de objetos Id.
    public Funcion() {
        this.parametros = new LinkedList<Id>();
    }

    //Constructor con parametros que toma dos parametros "tipo" y "nombre"
    //Inicializa parametros con una lista enlazada de objetos id.
    //Se establecen valores de la instancia actual para tipo, nombre y usado.
    public Funcion(String tipo, String nombre) {
        super();
        this.parametros = new LinkedList<Id>();
        this.setTipo(tipo);
        this.setNombre(nombre);
        this.setUsado(false);
    }
    
    /*Retorna una lista enlazada de tipo Id que represetan los parametros de la funcion */
    public LinkedList<Id> getParametros() {
        return this.parametros;
    }

    /*Establece una lista de parametros para una funcion, como una lista enlazada de tipo id
     * y es asignada a "parametros"
     */
    public void setParametros(LinkedList<Id> parametros) {
        this.parametros = parametros;
    }

    //Toma un parametro de tipo id
    //Este metodo retorna un valor booleano despues de agregar el parametro
    //a la lista enlazada(parametros)
    // add agrega un parametro al final de la lista(parametros) y retorna un booleano
    //indicando si la operacion fue correcta.
    public Boolean addParametro(Id parametro) {
        return this.parametros.add(parametro);
    }
    //Toma un parametro de tipo id
    //Este metodo retorna un valor booleano despues de eliminar el parametro
    //de la lista enlazada
    //remove elimina el primer elemento de la lista que sea igual al elemento pasado
    //como parametro y devuelve un booleano si la operacion fue correcta.
    public Boolean deleteParametro(Id parametro) {
        return this.parametros.remove(parametro);
    }

    //Metodo toString convierte un objeto en una representacion en forma de cadena de
    //caracteres.
    //Toma un objeto de tipo Funcion y devuelve en una cadena el tipo, nombre y parametros
    //ademas de si la funcion fue usada o no.
    //Para lograr esto el metodo itera sobre los parametros de la funcion almacenados en una
    //coleccion de elementos de tipo id y concatena cada parametro en una cadena que retorna al final
    public String toString() {
        String funcion = this.getTipo() + " " + this.getNombre() + "(";
        //Se inicializa un objeto de tipo iterator que itera sobre objetos de tipo id
        //la coleccion de objetos se obtiene a partir de "parametros"
        //todo esto es asignado en it
        Iterator<Id> it = this.parametros.iterator();

        int i = 0;
        while(it.hasNext()) {
            Id next = it.next();

            if (i != 0) funcion += ", " + next.getTipo() + " " + next.getNombre();
            else funcion += next.getTipo() + " " + next.getNombre();

            i++;
        }

        funcion += ")";

        if(this.isUsado()) {
            funcion += " (funcion usada)";
        }
        else {
            funcion += " (funcion sin usar)";
        }

        return funcion;
    }

    @Override
    //Para comparar objetos y determinar si son iguales o no
    //Toma un objeto de tipo Object y lo convierte en un objeto de tipo Funcion,
    //Luego compara la cantidad de parametros y el tipo con los de la funcion actual,
    //Si son iguales es True(indicando que  las funciones son iguales) si no retorn False.
    public boolean equals(Object obj) {
        Funcion firmaFuncion = (Funcion) obj;
        
        if (this.parametros.size() != firmaFuncion.getParametros().size())
            return false;
        
        else {
            for (int i = 0; i < this.parametros.size(); i++) {
                if (!this.parametros.get(i).getTipo().equals(firmaFuncion.getParametros().get(i).getTipo()))
                    return false;
            }
            return true;
        }   
    }
}
