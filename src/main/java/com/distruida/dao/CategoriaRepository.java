package com.distruida.dao;
import com.distruida.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CategoriaRepository  extends JpaRepository<Categoria, Integer> {

}
