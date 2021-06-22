package com.proyecto.UI;

public class ErrorEndEdadException extends Exception {
    public ErrorEndEdadException(String edad) {
        super("La edad ingresada no es valida " + edad);
    }
}
