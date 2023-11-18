/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 *
 * @author Nguyen Huy Hoang
 */
public class ConvertDoubleToMoney {
    private DecimalFormat formatter = new DecimalFormat("###,###,###");
    
    public ConvertDoubleToMoney() {
        
    }
    
    public String toMoney(double num) {
        return formatter.format(num);
    }
    
    public double toDouble(String money) {
        double parsedValue = 0;
        try {
            Number parsedNumber = formatter.parse(money);
            parsedValue = parsedNumber.doubleValue();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        return parsedValue;
    }
}
