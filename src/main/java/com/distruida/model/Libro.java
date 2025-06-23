package com.distruida.model;
import jakarta.persistence.*;
import java.util.Date;
@Entity
@Table(name="libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private int idlibro;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "editorial")
    private String editorial;
    @Column(name = "numpaginas")
    private int numpaginas;
    @Column(name = "edicion")
    private String edicion;
    @Column(name = "idioma")
    private String idioma;
    @Column(name = "fechapublicacion")
    private Date fechapublicacion;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "tipopasta")
    private String tipopasta;
    @Column(name = "iSBN")
    private  String iSBN;
    @Column(name = "numejemplares")
    private int numejemplares;
    @Column(name = "portada")
    private String portada;
    @Column(name = "presentacion")
    private String presentacion;
    @Column(name = "precio")
    private Double precio;

    //inyecion  de dependencia
    private Categoria categoria;
    private  Autor autor;

    public Libro() {
    }

    public Libro(int idlibro, String titulo, String editorial, int numpaginas, String edicion, String idioma, Date fechapublicacion, String descripcion, String tipopasta, String iSBN, int numejemplares, String portada, String presentacion, Double precio, Categoria categoria, Autor autor) {
        this.idlibro = idlibro;
        this.titulo = titulo;
        this.editorial = editorial;
        this.numpaginas = numpaginas;
        this.edicion = edicion;
        this.idioma = idioma;
        this.fechapublicacion = fechapublicacion;
        this.descripcion = descripcion;
        this.tipopasta = tipopasta;
        this.iSBN = iSBN;
        this.numejemplares = numejemplares;
        this.portada = portada;
        this.presentacion = presentacion;
        this.precio = precio;
        this.categoria = categoria;
        this.autor = autor;
    }

    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(int numpaginas) {
        this.numpaginas = numpaginas;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Date getFechapublicacion() {
        return fechapublicacion;
    }

    public void setFechapublicacion(Date fechapublicacion) {
        this.fechapublicacion = fechapublicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipopasta() {
        return tipopasta;
    }

    public void setTipopasta(String tipopasta) {
        this.tipopasta = tipopasta;
    }

    public String getiSBN() {
        return iSBN;
    }

    public void setiSBN(String iSBN) {
        this.iSBN = iSBN;
    }

    public int getNumejemplares() {
        return numejemplares;
    }

    public void setNumejemplares(int numejemplares) {
        this.numejemplares = numejemplares;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "idlibro=" + idlibro +
                ", titulo='" + titulo + '\'' +
                ", editorial='" + editorial + '\'' +
                ", numpaginas=" + numpaginas +
                ", edicion='" + edicion + '\'' +
                ", idioma='" + idioma + '\'' +
                ", fechapublicacion=" + fechapublicacion +
                ", descripcion='" + descripcion + '\'' +
                ", tipopasta='" + tipopasta + '\'' +
                ", iSBN='" + iSBN + '\'' +
                ", numejemplares=" + numejemplares +
                ", portada='" + portada + '\'' +
                ", presentacion='" + presentacion + '\'' +
                ", precio=" + precio +
                ", categoria=" + categoria +
                ", autor=" + autor +
                '}';
    }
}

