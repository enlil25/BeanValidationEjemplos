/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo7;

import java.util.Date;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 *
 * @author cesar
 */
public class Main {
    
    public static void main(String[] args){
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        
        Long i = System.currentTimeMillis();
        Orden orden = new Orden("SD11234"); 
        orden.setFechaCreacion(new Date(i));
        orden.setFechaPago(new Date(i+10));
        orden.setFechaEntrega(new Date(i+12));
    
        
        Set<ConstraintViolation<Orden>> constraints = validator.validate(orden);
        if(constraints.size()>0){
            System.out.println("Se encontro errores");
            System.out.println(constraints.iterator().next().getMessage());
        }
    }
}
