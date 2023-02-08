package com.tc23;

public class Errores {
    /*para implementar un singleton, para asegurar que exista una unica
     * instancia de la clase.
     */
    private static Errores instance = null;
    /*bandera que indica si hay algun error en el codigo */
    private boolean errorInCode = false;

    /*Devuelve la unica instancia de la clase, si no fue creada
     * se crea una nueva.
     */
    public static Errores getInstance() {
        if (instance == null) {
            instance = new Errores();
        }
        return instance;
    }
    /*Imprime los errores en el codigo, recibe como parametros
     * la linea donde ocurrio el error y un string que describe el error
     * establece la bandera errorInCode en true para indicar que hay un error.
     */
    public void printError(int line, String error) {
        this.errorInCode = true;
        System.out.println("\nERROR en la linea " + line + " " +error);
    }
    /*Devuelve el valor de la bandera errorInCode */
    public Boolean thereIsError() {
        return this.errorInCode;
    }
}

