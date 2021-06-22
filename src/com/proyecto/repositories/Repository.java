package com.proyecto.repositories;

import com.proyecto.entities.Cliente;
import java.util.Date;
import java.util.List;


public interface Repository {
    void save(Cliente persona, int cantidad, Date fecha);

    List<String> get();
}
