/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo13;

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
    
    public static void main(String[] args) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        
        TarjetaValidator obj = new TarjetaValidator(null);
        Set<ConstraintViolation<TarjetaValidator>> violations = validator.validate(obj);
        if(violations.size()>0){
            System.out.println("Se encontraron errores");
            for(ConstraintViolation violation : violations){
                System.out.println(violation.getMessage() + "---value:"+violation.getInvalidValue());
            }
        }
    }
}
