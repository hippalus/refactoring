package com.refactoring.tecniques.extractmethod.reverceconditional.replacetempwithquery;


//Replace Conditional Dispatcher With Command
public class PriceCalculatorNew {


    private static final String COUNTRY_GERMANY = "de_DE";
    private static final String COUNTRY_TURKEY = "tr_TR";
    private static final double TAX_RATE_GERMANY = 19.00;
    private static final double TAX_RATE_TURKEY = 18.00;

    public Double calculate(String locale, double price) {
        return calculatePrice( locale, price );
    }

    private Double calculatePrice(String local, double price) {
        return getTaxRateBasedOnLocale( local, price ) + price;

    }

    private Double getTaxRateBasedOnLocale(String locale, double price) {
        return ((price / 100) * getTaxRateBasedOnLocale( locale ));
    }

    private double getTaxRateBasedOnLocale(String locale) {
        if ( countryGermany( locale ) ) {
            return getGermanTaxRate();
        } else if ( countryTurkey( locale ) ) {
            return getTurkeyTaxRate();
        }
        return 0d;
    }

    private double getTurkeyTaxRate() {
        return TAX_RATE_TURKEY;
    }

    private double getGermanTaxRate() {
        return TAX_RATE_GERMANY;
    }

    private boolean countryTurkey(String locale) {
        return locale != null && locale.equals( COUNTRY_TURKEY );
    }

    private boolean countryGermany(String locale) {
        return locale != null && locale.equals( COUNTRY_GERMANY );
    }

}
