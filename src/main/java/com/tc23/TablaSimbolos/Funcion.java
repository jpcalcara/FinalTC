package com.tc23.TablaSimbolos;

import java.util.Iterator;
import java.util.LinkedList;

public class Funcion extends Id {
    private LinkedList<Id> parametros;

    public Funcion() {
        this.parametros = new LinkedList<Id>();
    }

    public Funcion(String tipo, String nombre) {
        super();
        this.parametros = new LinkedList<Id>();
        this.setTipo(tipo);
        this.setNombre(nombre);
        this.setUsado(false);
    }

    public LinkedList<Id> getParametros() {
        return this.parametros;
    }

    public void setParametros(LinkedList<Id> parametros) {
        this.parametros = parametros;
    }

    public Boolean addParametro(Id parametro) {
        return this.parametros.add(parametro);
    }

    public Boolean deleteParametro(Id parametro) {
        return this.parametros.remove(parametro);
    }

    @Override
    public String toString() {
        String funcion = this.getTipo() + " " + this.getNombre() + "(";
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
