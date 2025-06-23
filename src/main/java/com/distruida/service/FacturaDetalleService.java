package com.distruida.service;

import com.distruida.model.FacturaDetalle;

import java.util.List;

public interface FacturaDetalleService {
    public List<FacturaDetalle> findAll();
    public FacturaDetalle findOne(int id);
    public FacturaDetalle save(FacturaDetalle facturaDetalle);
    public FacturaDetalle update(int id, FacturaDetalle facturaDetalle);
    public void delete(int id);
}



