/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package decoratorpatternlab;

import java.text.NumberFormat;


public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Currency c = new CanadaCurrency();
        
        System.out.println(c.money(12.53));
        System.out.println(c.getCurrencyType());
        
        
        
        Currency c2 = new GermanCurrency();
        System.out.println(c2.money(100.01));
        System.out.println(c2.getCurrencyType());
        
        Currency c3 = new ChineseCurrency();
        System.out.println(c3.money(252.46));
        System.out.println(c3.getCurrencyType());
        
         Currency c4 = new JapanCurrency();
        System.out.println(c4.money(22552.46));
        System.out.println(c4.getCurrencyType());
        
    }
    
}
