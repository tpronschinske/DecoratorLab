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
public class ChineseCurrency extends Currency {
     
    
    
    public ChineseCurrency(){
        this.setCurrencyType("Chinese Currency");
    }
    
    

     @Override
    public String money(double money) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.CHINESE);
        return nf.format(money);
    }
    
    
}
