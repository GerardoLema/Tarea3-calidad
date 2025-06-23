package com.distruida.dao;
import com.distruida.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
public interface FacturaRepository extends JpaRepository<Factura, Integer> {

}