package com.proyecto.entities;

public class Cliente {

    private String nombre;
    private String cedula;
    private int age;
    private boolean prestamo;

    public Cliente(String nombre, String cedula, int age, boolean prestamo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.age = age;
        this.prestamo = prestamo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public int getAge() {
        return age;
    }

    public boolean esPrestamo() {
        return prestamo;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPrestamo(boolean riesgo) {
        this.prestamo = prestamo;
    }

}