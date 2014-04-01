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
public class USCurrency extends Currency{
    
    private Locale locale;
    
    public USCurrency(){
        this.setCurrencyType("United States Currency");
    }
    
    

    @Override
    public String money(String money) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        return nf.format(money);
    }

   
    
    
    
}
