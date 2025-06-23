package com.distruida.service;
import com.distruida.dao.ClienteRepository;
import com.distruida.model.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Optional;
import java.util.List;
import static net.bytebuddy.matcher.ElementMatchers.any;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class ClienteServiceTestUnitaria {
    @Mock
    private ClienteRepository clienteRepository;
    @InjectMocks
    private  ClienteServiceImpl clienteService;
    private Cliente cliente;
    @BeforeEach
    public void setUp(){
        cliente = new Cliente();
        cliente.setIdCliente(1);
        cliente.setCedula ("0502455746");
        cliente.setNombre("Juan");
        cliente.setApellido("Taipe");
        cliente.setDireccion("Av. por ahi");
        cliente.setTelefono( "0987256894");
        cliente.setCorreo("jtaipe@correo.com");
        }
        @Test
    public void testFinAll(){
        when(clienteRepository.findAll()).thenReturn(List.of(cliente));
    List<Cliente> clientes= clienteService.findAll();
    assertNotNull(clientes);
    assertEquals(1,clientes.size());
    verify(clienteRepository, Mockito.times(1)).findAll();
    }
 @Test
    public void testFinOneExistente(){
     //when(clienteRepository.findAll(1)).thenReturn(Optional.ofNullable(cliente));
   Cliente cliente=clienteService.findOne(1);
     assertNotNull(cliente);
     assertEquals("Juan", cliente.getNombre());
 }

@Test
    public void testFindOneNoExistente(){
    when(clienteRepository.findById(2)).thenReturn(Optional.empty());
    Cliente  cliente = clienteService.findOne(2);
    assertNull(cliente);

}
@Test
    public void testSave(){
        when(clienteRepository.save(cliente)).thenReturn(cliente);
        Cliente cliente1= clienteService.save(cliente);
        assertNotNull(cliente1);
        assertEquals("juan",cliente1.getNombre());

}
@Test
    public void testUpdateExistente(){
        Cliente clienteActualizado = new Cliente();
        clienteActualizado.setCedula("1701234522");
        clienteActualizado.setNombre("juan22");
        clienteActualizado.setApellido("Apellido22");
        clienteActualizado.setDireccion("Av.22");
        clienteActualizado.setTelefono("098745612");
        clienteActualizado.setCorreo("gbhf@correo.com");
        when(clienteRepository.findById(1)).thenReturn(Optional.ofNullable(cliente));
        //when(clienteRepository.save(any())).thenReturn(clienteActualizado));
        Cliente  clienteResultado = clienteService.update(1,clienteActualizado);
        assertNotNull(clienteResultado);
        assertEquals("juan22", clienteResultado.getNombre());
       // verify(clienteRepository.times(1)).save(cliente);


}
@Test
    public void testUpdateNoExistente(){
        Cliente clienteNuevo = new Cliente();
        when(clienteRepository.findById(999)).thenReturn(Optional.empty());
        Cliente clienteResultado = clienteService.update(999, clienteNuevo);
        assertNull(clienteResultado);
       // verify(clienteRepository.never()).save(any());//times(0)
}
@Test
    public void testDeleteExiste(){
        when(clienteRepository.existsById(1)).thenReturn(true);
        clienteService.delete(1);
        verify(clienteRepository).deleteById(1);
}
    @Test
    public void testDeleteNoExiste(){
        when(clienteRepository.existsById(999)).thenReturn(false);
        clienteService.delete(999);
       // verify(clienteRepository. never()).deleteById(anyInt);//999
    }
}
