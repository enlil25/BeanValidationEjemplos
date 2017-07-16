/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo14;

import java.lang.annotation.Documented;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 *
 * @author cesar
 */
@Documented
@Target({FIELD,CONSTRUCTOR,METHOD,PARAMETER,ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = {UrlValidator.class})
public @interface Url {
    String message() default "{Ejemplo14.Url.message}";
    
    Class<?>[] groups() default {};
    
    Class<? extends Payload>[] payload() default {};
    
    public String protocol() default "";
    
    public String host() default "";
    
    public int port() default -1;
    
    
    public @interface List{
        Url[] value();
    }
}
