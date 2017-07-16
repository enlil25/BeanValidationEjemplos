/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo10;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 *
 * @author cesar
 */
public class Numericos {

    @Primo
    private Integer numeroPrimo;

    public Numericos(Integer numeroPrimo) {
        this.numeroPrimo = numeroPrimo;
    }
}
