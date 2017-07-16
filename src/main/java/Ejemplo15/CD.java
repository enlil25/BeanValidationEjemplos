/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo15;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author cesar
 */
public class CD {

    @NotNull
    @Size(min = 4, max = 50)
    private String titulo;
    @NotNull
    private Float precio;
    @NotNull(groups = {PrintingCatalog.class})
    @Size(min = 100, max = 5000, groups = {PrintingCatalog.class})
    private String descripcion;
    @Pattern(regexp = "[A-Z][a-z]{1,}")
    private String disquera;
    @Max(value = 5)
    private Integer numeroCds;

    @NotNull
    @DecimalMin("5.8")
    public Float calcularPrecio(@DecimalMin("1.4") Float tarifa) {
        return precio * tarifa;
    }

    @DecimalMin("9.99")
    public Float calcularVat() {
        return precio * 0.196f;
    }
    
    public CD(){
        
    }
    
    public CD(String titulo, Float precio){
        this.titulo = titulo;
        this.precio = precio;
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

    public String getDisquera() {
        return disquera;
    }

    public void setDisquera(String disquera) {
        this.disquera = disquera;
    }

    public Integer getNumeroCds() {
        return numeroCds;
    }

    public void setNumeroCds(Integer numeroCds) {
        this.numeroCds = numeroCds;
    }

    @Override
    public String toString() {
        return "CD{" + "titulo=" + titulo + ", precio=" + precio + ", descripcion=" + descripcion + ", disquera=" + disquera + ", numeroCds=" + numeroCds + '}';
    }
    
    
}
