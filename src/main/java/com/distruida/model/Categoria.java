package com.distruida.model;
import jakarta.persistence.*;
@Entity
@Table(name="categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private int idCategoria;
    private String categoria;
    private String descripcion;

    public Categoria() {
    }

    public Categoria(int idcategoria, String categoria, String descripcion) {
        this.idCategoria = idcategoria;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    public int getIdcategoria() {
        return idCategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idCategoria = idcategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "idcategoria=" + idCategoria +
                ", categoria='" + categoria + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
