/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo14;

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
        ItemServerConnection obj = new ItemServerConnection("http://localhost:9012/index.jsp");
        Set<ConstraintViolation<ItemServerConnection>> violations = validator.validate(obj, Default.class);
        if(violations.size()>0){
            System.out.println("Se encontraron errores");
            for(ConstraintViolation violation : violations){
                System.out.println(violation.getMessage()+ "---value:"+violation.getInvalidValue()+"---template:"+violation.getMessageTemplate());
            }
        }
        
        factory.close();
    }
}
