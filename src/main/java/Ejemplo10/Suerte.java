/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo10;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author cesar
 */
@Bar
public class Suerte {
    
    @NotNull
    private Integer numero1;
    @NotNull
    private Integer numero2;
    @NotNull @Min(8)
    private Integer numero3;
    
    public Suerte(Integer numero1,Integer numero2,Integer numero3){
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public Integer getNumero2() {
        return numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }

    public Integer getNumero3() {
        return numero3;
    }

    public void setNumero3(Integer numero3) {
        this.numero3 = numero3;
    }
    
    
    
}
