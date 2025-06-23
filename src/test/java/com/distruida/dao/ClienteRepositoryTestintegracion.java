package com.distruida.dao;
import com.distruida.model.Cliente;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@Nested
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
@Rollback(value = false)
class ClienteRepositoryTestIntegracion {
    @Autowired
    private ClienteRepository clienteRepository;
    @Test
    public void findAll(){
        List<Cliente> clientes = clienteRepository.findAll();
        assertNotNull(clientes);
        assertTrue(clientes.size()>0);
        for(Cliente item: clientes){
            System.out.println(item.toString());} }


@Test
public void findOne(){
    Optional<Cliente> cliente = clienteRepository.findById(1);
    assertTrue(cliente.isPresent());
    System.out.println(cliente.toString());
}
@Test
    public void save() {
    Cliente cliente = new Cliente(0,"1701234567","Juan","Taipe","Av.por ahi", "0985462157","ssdgq@gmail.com");
    Cliente clienteGuardado =clienteRepository.save(cliente);
  assertNotNull(clienteGuardado);
  assertEquals("Juan",clienteGuardado.getNombre());
  assertEquals("Taipe",clienteGuardado.getApellido());
}
@Test
    public void update(){
        Optional<Cliente> cliente = clienteRepository.findById(40);
        assertTrue(cliente.isPresent());
        cliente.orElse(null).setCedula("0548768419");
       cliente.orElse(null).setNombre("Gerardo");
     cliente.orElse(null).setApellido("Acurio");
       cliente.orElse(null).setDireccion("Cotopaxi");
       cliente.orElse(null).setTelefono("225788");
       cliente.orElse(null).setCorreo("acurio@gmail.com");
       Cliente clienteActualizado = clienteRepository.save(cliente.orElse(null));
       assertNotNull(clienteActualizado);
       assertEquals("Gerardo",clienteActualizado.getNombre());
    assertEquals("Acurio",clienteActualizado.getApellido());
}
@Test
    public void delete(){
        if(clienteRepository.existsById(41));
        clienteRepository.deleteById(41);
}

}