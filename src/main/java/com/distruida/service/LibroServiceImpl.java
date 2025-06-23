package com.distruida.service;

import com.distruida.dao.LibroRepository;
import com.distruida.model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // es un bean de logica de negocio no usages
public class LibroServiceImpl implements  LibroService {
    @Autowired//anotacion psra inyeccion de dependencia
    private LibroRepository libroRepository;
    @Override
    public List<Libro> findAll() {return libroRepository.findAll();}
    @Override
    public Libro findOne(int id) {
        Optional<Libro> libro = libroRepository.findById(id);
        return libro.orElse(null); }
    @Override
    public Libro save(Libro Libro) {return libroRepository.save(Libro);}
    @Override
    public Libro update(int id, Libro libro) {
        Libro libroExistente = findOne(id);
         if (libroExistente == null) {return null;}

        libroExistente.setTitulo(libro.getTitulo());
        libroExistente.setEditorial(libro.getEditorial());
        libroExistente.setNumpaginas(libro.getNumpaginas());
        libroExistente.setEdicion(libro.getEdicion());
        libroExistente.setIdioma(libro.getIdioma());
        libroExistente.setFechapublicacion(libro.getFechapublicacion());
        libroExistente.setDescripcion(libro.getDescripcion());
        libroExistente.setTipopasta(libro.getTipopasta());
        libroExistente.setiSBN(libro.getiSBN());
        libroExistente.setNumejemplares(libro.getNumejemplares());
        libroExistente.setPortada(libro.getPortada());
        libroExistente.setPresentacion(libro.getPresentacion());
        libroExistente.setPrecio(libro.getPrecio());
        libroExistente.setCategoria(libro.getCategoria());
        libroExistente.setAutor(libro.getAutor());

        return libroRepository.save(libroExistente);}
    @Override
    public void delete(int id) {
                if (libroRepository.existsById(id)) {
                    libroRepository.deleteById(id);}}
}
