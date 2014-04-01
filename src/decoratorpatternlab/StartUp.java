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
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        
        Currency c = new CanadaCurrency();
        c.money(12.53);
        c.getCurrencyType();

        System.out.println(c);
        
        
    }
    
}
