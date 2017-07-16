/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo10;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author cesar
 */
public class PrimoValidator implements ConstraintValidator<Primo, Integer> {

    @Override
    public void initialize(Primo constraintAnnotation) {
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        
        

        boolean esprimo = false;

        Integer primos[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};
        for (Integer i : primos) {
            if (value == i) {
                esprimo = true;
                break;

            }
        }

        return esprimo;
    }

}
