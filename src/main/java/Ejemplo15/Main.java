/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo15;

import java.lang.reflect.Method;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.executable.ExecutableValidator;
import javax.validation.groups.Default;

/**
 *
 * @author cesar
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        CD cd1 = new CD("Kind of Blue", 12.5f);
        Set<ConstraintViolation<CD>> violations = validator.validate(cd1, Default.class);
        System.out.println("violations.size() = " + violations.size());

        ///
        CD cd2 = new CD();
        Set<ConstraintViolation<CD>> violations2 = validator.validate(cd2);
        System.out.println("violations2.size() = " + violations2.size());

        //validacion de propiedades
        CD cd3 = new CD();
        cd3.setNumeroCds(3);
        Set<ConstraintViolation<CD>> violations3 = validator.validateProperty(cd3, "numeroCds");
        System.out.println("violations3.size() = " + violations3.size());

        //validacion de valores
        Set<ConstraintViolation<CD>> violations4 = validator.validateValue(CD.class, "numeroCds", 1);
        System.out.println("violations4.size() = " + violations4.size());

        //validacion de metodos
        ExecutableValidator executableval = validator.forExecutables();

        CD cd4 = new CD("Kind of Blue", 12.5f);
        Method method = CD.class.getMethod("calcularPrecio", Float.class);
        Set<ConstraintViolation<CD>> violations5 = executableval.validateParameters(cd4, method, new Object[]{new Float(1.5)}, Default.class);
        System.out.println("violations5.size() = " + violations5.size());

        Set<ConstraintViolation<CD>> violations6 = executableval.validateReturnValue(cd4, method, 6, Default.class);
        System.out.println("violations6.size() = " + violations6.size());
        
        Set<ConstraintViolation<CD>> violations7 = executableval.validateConstructorParameters(CD.class.getConstructor(String.class,Float.class), new Object[]{"titulo",50f},Default.class);
        System.out.println("violations7.size() = " + violations7.size());
        

        factory.close();
    }
}
