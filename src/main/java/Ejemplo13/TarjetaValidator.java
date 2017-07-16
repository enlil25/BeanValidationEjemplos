/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo13;

import java.util.Date;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

/**
 *
 * @author cesar
 */
public class TarjetaValidator {

    private AlgoritmoValidacion algoritmoValidacion;

    public TarjetaValidator() {
    }

    public TarjetaValidator(@NotNull AlgoritmoValidacion algoritmoValidacion) {
        this.algoritmoValidacion = algoritmoValidacion;
    }

    @AssertTrue
    public Boolean validar(@NotNull TarjetaCredito tarjetaCredito) {
        String lastDigit = algoritmoValidacion.validar(tarjetaCredito.getNumero(), tarjetaCredito.getNumeroControl());
        if (Integer.parseInt(lastDigit.toString()) % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    @AssertTrue
    public Boolean validar(@NotNull String numero, @Future Date fechaExpiracion, @NotNull Integer numeroControl, String tipo) {
        String lastDigit = algoritmoValidacion.validar(numero, numeroControl);

        return Integer.parseInt(lastDigit) % 2 == 0;
    }

    public class AlgoritmoValidacion {

        public String validar(String numero, Integer numeroControl) {
            Character lastDigit = numero.charAt(numero.length() - 1);
            return lastDigit.toString();
        }
    }
}
