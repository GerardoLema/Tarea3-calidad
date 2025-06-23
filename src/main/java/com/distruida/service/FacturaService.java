package com.distruida.service;

import com.distruida.model.Factura;

import java.util.List;

public interface FacturaService {
    public List<Factura> findAll();
    public Factura findOne(int id);
    public Factura save(Factura Factura);
    public Factura update(int id, Factura factura);
    public void delete(int id);
}



