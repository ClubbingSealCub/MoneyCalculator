package moneycalculator.persistence;

import moneycalculator.model.CurrencySet;
import moneycalculator.model.ExchangeRate;

public interface ExchangeRateSetLoader {

    public ExchangeRate load(CurrencySet currencySet);
}
