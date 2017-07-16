/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo10;

import java.util.Date;
import javax.validation.constraints.Pattern;

/**
 *
 * @author cesar
 */

public class Orden22 {
    
    @Pattern.List({
        @Pattern(regexp = "[C,D,M][A-Z][0-9]*"),
        @Pattern(regexp = ".[A-Z].*?")
    })    
    public String orderId;
    private Date creationDate;
    private Double totalAmount;
    private Date paymentDate;
    private Date deliveryDate;
            
}
