/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo10;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.groups.Default;

/**
 *
 * @author cesar
 */
public class Main {

    public static void main(String[] args) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Numericos numericos = new Numericos(71);
        Set<ConstraintViolation<Numericos>> violations = validator.validate(numericos);
        if (violations.size() > 0) {
            System.out.println("Se encontraron errores");
            for (ConstraintViolation violation : violations) {
                System.out.println(violation.getMessage() + "-- value:" + violation.getInvalidValue() + "--template:"+violation.getMessageTemplate());
            }
        }
        
        Suerte suerte = new Suerte(6,7,7);
        Set<ConstraintViolation<Suerte>> violations2 = validator.validate(suerte, Default.class);
        if(violations2.size()>0){
            System.out.println("Se encontraron errores");
            int n=0;
            for(ConstraintViolation violation : violations2){
                
                System.out.println(n+")"+violation.getMessage() + "---value:"+violation.getInvalidValue() + " --templates:"+violation.getMessageTemplate());
                n++;
            }
        }
        
        factory.close();

    }
}
