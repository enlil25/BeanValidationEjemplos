/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo13;

import javax.validation.constraints.NotNull;

/**
 *
 * @author cesar
 */
public class TarjetaCredito {

    @NotNull
    private String numero;
    @NotNull
    private String fechaExpiracion;
    @NotNull
    private Integer numeroControl;
    private String tipo;

    public TarjetaCredito() {

    }

    public TarjetaCredito(String numero, String fechaExpiracion, Integer numeroControl, String tipo) {
        this.numero = numero;
        this.fechaExpiracion = fechaExpiracion;
        this.numeroControl = numeroControl;
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public Integer getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(Integer numeroControl) {
        this.numeroControl = numeroControl;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
