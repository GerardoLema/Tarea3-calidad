package com.distruida.service;
import com.distruida.model.Cliente;
import com.distruida.dao.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service // es un bean de logica de negocio no usages
public class ClienteServiceImpl implements  ClienteService {
    @Autowired//anotacion psra inyeccion de dependencia
    private ClienteRepository clienteRepository;
    @Override
    public List<Cliente> findAll() {return clienteRepository.findAll();}
    @Override
    public Cliente findOne(int id) {Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElse(null); }
    @Override
    public Cliente save(Cliente cliente) {return clienteRepository.save(cliente);}
    @Override
    public Cliente update(int id, Cliente cliente) {Cliente clienteExistente = findOne(id);
        if (clienteExistente == null) {return null;}
        clienteExistente.setCedula(cliente.getCedula());
        clienteExistente.setNombre(cliente.getNombre());
        clienteExistente.setApellido(cliente.getApellido());
        clienteExistente.setDireccion(cliente.getDireccion());
        clienteExistente.setTelefono(cliente.getTelefono());
        clienteExistente.setCorreo(cliente.getCorreo());
        return clienteRepository.save(clienteExistente);}
    @Override
    public void delete(int id) {SimpleJpaRepository clienteRepository = null;
        if (clienteRepository.existsById(id)) {clienteRepository.deleteById(id);}}
}
