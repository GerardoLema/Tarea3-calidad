package com.distruida.service;

import com.distruida.dao.FacturaRepository;
import com.distruida.model.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // es un bean de logica de negocio no usages
public class FacturaServiceImpl implements  FacturaService {
    @Autowired//anotacion psra inyeccion de dependencia
    private FacturaRepository facturaRepository;
    @Override
    public List<Factura> findAll() {return facturaRepository.findAll();}
    @Override
    public Factura findOne(int id) {
        Optional<Factura> factura = facturaRepository.findById(id);
        return factura.orElse(null);
    }
    @Override
    public Factura save(Factura Factura) {return facturaRepository.save(Factura);}
    @Override
    public Factura update(int id, Factura factura) {
        Factura facturaExistente = findOne(id);
         if (facturaExistente == null) {return null;}

        facturaExistente.setNumFactura(factura.getNumFactura());
        facturaExistente.setFecha(factura.getFecha());
        facturaExistente.setTotalNeto(factura.getTotal());
        facturaExistente.setIva(factura.getIva());
        facturaExistente.setTotal(factura.getTotal());
        facturaExistente.setCliente(factura.getCliente());
        return facturaRepository.save(facturaExistente);}
    @Override
    public void delete(int id) {
                if (facturaRepository.existsById(id)) {
                    facturaRepository.deleteById(id);}}
}
