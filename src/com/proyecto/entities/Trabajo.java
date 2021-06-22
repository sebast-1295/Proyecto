package com.proyecto.entities;

public class Trabajo extends Cliente {
    private String empleo;

    public Trabajo(String nombre, String cedula, int age, boolean prestamo, String empleo) {
        super(nombre, cedula, age, prestamo);
        this.empleo = empleo;
    }
    public String getEmpleo(){
        return empleo;
    }

}
