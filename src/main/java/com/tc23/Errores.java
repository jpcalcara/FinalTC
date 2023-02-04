package com.tc23;

public class Errores {
    private static Errores instance = null;
    private boolean errorInCode = false;

    public static Errores getInstance() {
        if (instance == null) {
            instance = new Errores();
        }
        return instance;
    }

    public void printError(int line, String error) {
        this.errorInCode = true;
        System.out.println("\nERROR en la linea " + line + " " +error);
    }

    public Boolean thereIsError() {
        return this.errorInCode;
    }
}

