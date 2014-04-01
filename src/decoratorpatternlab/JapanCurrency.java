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
public class JapanCurrency extends Currency {
    
       public JapanCurrency(){
        this.setCurrencyType("Japan Currency");
    }
    
    

     @Override
    public String money(double money) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        return nf.format(money);
        
    }
    
    
}
