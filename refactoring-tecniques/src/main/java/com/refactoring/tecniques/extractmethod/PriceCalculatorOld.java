package com.refactoring.tecniques.extractmethod;

public class PriceCalculatorOld {


    public Double calculate(String locale ,double price){
        Double result=new Double( 0 );
        double taxRate=0;
        if (locale != null && locale.equals("de_DE")) {
            taxRate = 19.00;
            final Double tax = Double.valueOf((price / 100) * taxRate);
            result = Double.valueOf(tax.doubleValue() + price);
        } else if (locale != null && locale.equals("tr_TR")) {
            taxRate = 18.00;
            final Double tax = Double.valueOf((price / 100) * taxRate);
            result = Double.valueOf(tax.doubleValue() + price);
        } else if (locale != null && locale.equals("at_AT")) {
            taxRate = 20.00;
            final Double tax = Double.valueOf((price / 100) * taxRate);
            result = Double.valueOf(tax.doubleValue() + price);
        }
        return result;
    }
}
