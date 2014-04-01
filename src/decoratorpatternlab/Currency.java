/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package decoratorpatternlab;

import java.util.Locale;

/**
 *
 * @author Celeste
 */
public abstract class Currency {
    
    private String description = "Currency Type";
    
    public abstract String money(String money);
    
    public String getCurrencyType(){
        return description;
    }
    
    public void setCurrencyType(String currencyType){
        this.description = currencyType;
    }
    
    
    
}
