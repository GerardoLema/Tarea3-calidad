package com.distruida.service;

import com.distruida.model.Libro;

import java.util.List;

public interface LibroService {
    public List<Libro> findAll();
    public Libro findOne(int id);
    public Libro save(Libro libro);
    public Libro update(int id, Libro libro);
    public void delete(int id);
}



