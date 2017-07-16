/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo1;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.executable.ExecutableValidator;

/**
 *
 * @author cesar
 */
public class Main {
    public static void main(String[] args) {
        
        
       ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
       Validator validator = factory.getValidator();
       Libro01 libro01 = new Libro01(null, 120f, "DESCRIPCION1", "434311", 230, Boolean.TRUE);
       
       Set<ConstraintViolation<Libro01>> violations = validator.validate(libro01);
       
       
       
       if(violations.size()>0){
           System.out.println("Se encontraron errores");
           for(ConstraintViolation<Libro01> violation : violations ){
               System.out.println(violation.getMessage());
           }
       }
       
       
    }
}
