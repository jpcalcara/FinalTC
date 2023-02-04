package com.tc23.TablaSimbolos;

public abstract class Id {
    private String nombre;
    private String tipo;
    private Boolean usado;

    public Id() {}

    public Id(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.usado = false;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean isUsado() {
        return this.usado;
    }

    public void setUsado(Boolean usado) {
        this.usado = usado;
    }
}

