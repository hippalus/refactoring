package com.refactoring.tecniques.extractmethod.reverceconditional.replacetempwithquery;


import  static  org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PriceCalculatorTest {

    private static final String COUNTRY_GERMANY = "de_DE";
    private static final String COUNTRY_TURKEY = "tr_TR";

    @Test
    void should_calculate_price_for_german_locale() {
        PriceCalculatorNew calculator =new PriceCalculatorNew();
        assertEquals( 119,calculator.calculate( COUNTRY_GERMANY, 100 ) );

    }

    @Test
    void should_calculate_price_for_turkey_locale() {
        PriceCalculatorNew calculator =new PriceCalculatorNew();
        assertEquals( 118, calculator.calculate( COUNTRY_TURKEY, 100 ) );

    }

    @Test
    void should_calculate_price_for_german_locale_old() {
        PriceCalculatorOld calculator =new PriceCalculatorOld();
        assertEquals( 119,calculator.calculate( COUNTRY_GERMANY, 100 ) );

    }

    @Test
    void should_calculate_price_for_turkey_locale_old() {
        PriceCalculatorOld calculator =new PriceCalculatorOld();
        assertEquals( 118, calculator.calculate( COUNTRY_TURKEY, 100 ) );

    }


}
