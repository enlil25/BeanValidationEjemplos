/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo14;

import java.net.MalformedURLException;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author cesar
 */
public class UrlValidator implements ConstraintValidator<Url, String> {

    private String host;
    private String protocol;
    private int port;

    @Override
    public void initialize(Url url) {
        this.protocol = url.protocol();
        this.host = url.host();
        this.port = url.port();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.length() == 0) {
            return true;
        }

        java.net.URL url;
        try {
            url = new java.net.URL(value);
        } catch (MalformedURLException e) {
            return false;
        }
        
        boolean esvalido = true;
        
        if (protocol != null && protocol.length() > 0 && !url.getProtocol().equals(protocol)) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("{Ejemplo14.Url.message2}").addConstraintViolation();
            //return false;
            esvalido = false;
        }
        
        if (host != null && host.length() > 0 && !url.getHost().startsWith(host)) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("{Ejemplo14.Url.message3}").addConstraintViolation();
           // return false;
           esvalido = false;
        }
        
        if (port != -1 && url.getPort() != port) {
           context.disableDefaultConstraintViolation();
           context.buildConstraintViolationWithTemplate("{Ejemplo14.Url.message4}").addConstraintViolation();
           //return false;
           esvalido = false;
        }
        
       // return true;
        return esvalido;
    }

}
