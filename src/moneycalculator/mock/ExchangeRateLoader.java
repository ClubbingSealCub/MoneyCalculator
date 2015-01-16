package moneycalculator.mock;

import moneycalculator.model.CurrencySet;
import moneycalculator.model.ExchangeRate;
import moneycalculator.persistence.ExchangeRateSetLoader;

public class ExchangeRateLoader implements ExchangeRateSetLoader{

    @Override
    public ExchangeRate load(CurrencySet currencySet) {
        return new ExchangeRate(currencySet.getItems()[0], currencySet.getItems()[1], 1.5);
    }
    
}
