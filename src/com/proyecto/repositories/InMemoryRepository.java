package com.proyecto.repositories;

import com.proyecto.entities.BitacoradePrestamo;
import com.proyecto.entities.Cliente;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class InMemoryRepository implements Repository {
    private final List<BitacoradePrestamo> db;

    public InMemoryRepository() {
        this.db = new ArrayList<>();
    }

    public void save (Cliente persona, int cantidad, Date fecha){
        this.db.add(new BitacoradePrestamo(persona, cantidad, fecha));
    }

    public List<String> get(){
        List<String> lines = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat( "DD-MM-YY");
        for (BitacoradePrestamo item: db) {
            lines.add(item.getCliente().getNombre()
                    + "-" + item.getCantidad()
                    + "-" + format.format(item.getFecha()));
        }
        return lines;
    }
}
