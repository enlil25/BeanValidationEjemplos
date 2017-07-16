/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo1;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author cesar
 */
public class Libro01 {
   
    private String titulo;
    
    private Float precio;
    
    private String descripcion;
    private String isbn;
    private Integer numeroPaginas;
    private Boolean ilustraciones;
    
    public Libro01(){
        
    }

    public Libro01(@NotNull String titulo, @NotNull @Min(2) Float precio, @Size(max = 2000) String descripcion, String isbn, Integer numeroPaginas, Boolean ilustraciones) {
        this.titulo = titulo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
        this.ilustraciones = ilustraciones;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public Float getPrecio() {
        return precio;
    }
   
    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Boolean getIlustraciones() {
        return ilustraciones;
    }

    public void setIlustraciones(Boolean ilustraciones) {
        this.ilustraciones = ilustraciones;
    }

    @Override
    public String toString() {
        return "Libro01{" + "titulo=" + titulo + ", precio=" + precio + ", descripcion=" + descripcion + ", isbn=" + isbn + ", numeroPaginas=" + numeroPaginas + ", ilustraciones=" + ilustraciones + '}';
    }
    
    
}
