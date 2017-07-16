/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo10;

import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.ConstraintValidatorContext.ConstraintViolationBuilder;

/**
 *
 * @author cesar
 */
public class BarValidator implements ConstraintValidator<Bar,Suerte>{

    @Override
    public void initialize(Bar constraintAnnotation) {
    }

    @Override
    public boolean isValid(Suerte suerte, ConstraintValidatorContext context) {
        
        if(suerte == null){
            return true;
        }
        
        context.disableDefaultConstraintViolation();
        context.buildConstraintViolationWithTemplate("mensaje de error con template").addConstraintViolation();
        
        
       return Objects.equals(suerte.getNumero1(), suerte.getNumero2()) && Objects.equals(suerte.getNumero2(), suerte.getNumero3()) &&  suerte.getNumero3() == 7;
    }
    
}
