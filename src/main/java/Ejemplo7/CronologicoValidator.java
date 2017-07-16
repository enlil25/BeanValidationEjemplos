/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo7;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author cesar
 */
public class CronologicoValidator implements ConstraintValidator<Cronologico, Orden> {

    @Override
    public void initialize(Cronologico a) {
    }

    @Override
    public boolean isValid(Orden orden, ConstraintValidatorContext context) {
        return orden.getFechaCreacion().getTime() < orden.getFechaPago().getTime() && orden.getFechaPago().getTime() < orden.getFechaEntrega().getTime();
    }

}
