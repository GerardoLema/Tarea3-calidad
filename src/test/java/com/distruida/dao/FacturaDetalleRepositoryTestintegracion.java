package com.distruida.dao;
import com.distruida.model.FacturaDetalle;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import java.util.List;
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
@Rollback(value = false)
public class FacturaDetalleRepositoryTestintegracion {
    @Autowired
    private FacturaDetalleRepository facturadetalleRepository;
    @Test
    public void findAll(){
        List<FacturaDetalle> facturadetalles = facturadetalleRepository.findAll();
        for(FacturaDetalle item:facturadetalles){
            System.out.println(item.toString());
        }
    }
}