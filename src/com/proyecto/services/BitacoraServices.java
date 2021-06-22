package com.proyecto.services;

import com.proyecto.UI.ErrorEndEdadException;
import com.proyecto.entities.Trabajo;
import com.proyecto.entities.Cliente;
import com.proyecto.repositories.Repository;

import java.util.Date;
import java.util.List;

public class BitacoraServices extends Throwable {

    private Repository repository;

    public BitacoraServices(Repository repository){
        this.repository = repository;
    }
    public void save(String Nombre, String cedula, String txtEdad,
                     boolean prestamo, String empleo, String cantidad) throws ErrorEndEdadException {

        int edad;
        try {
            edad = Integer.parseInt(txtEdad);
        } catch (NumberFormatException x) {
            throw new ErrorEndEdadException (txtEdad);
        }


    }
    public List<String> get(){
        return this.repository.get();
    }

}
