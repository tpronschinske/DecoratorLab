/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package decoratorpatternlab;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Celeste
 */
public class CanadaCurrency extends Currency {
    
    private Locale locale;
    
    public CanadaCurrency(){
        this.setCurrencyType("Canadian Currency");
    }
    
    

    @Override
    public Locale money() {
        locale = Locale.CANADA;
        NumberFormat.getCurrencyInstance(locale);
        return locale;
    }
    
}
