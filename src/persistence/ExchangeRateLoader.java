package persistence;

import model.CurrencySet;
import model.ExchangeRate;
import model.ExchangeRateSet;
import model.Fraction;

public class ExchangeRateLoader {

    public static void loadSet(ExchangeRateSet source) {
        for (Object exchangeRate : source) {
            boolean add = ExchangeRateSet.add((ExchangeRate) exchangeRate);

        }
    }

    public static void loadSetMock(CurrencySet currencySet) {
        ExchangeRateSet.add(new ExchangeRate(currencySet.getCurrency("Euro"), currencySet.getCurrency("USD"), new Fraction(10, 16)));
        ExchangeRateSet.add(new ExchangeRate(currencySet.getCurrency("Sterling Pound"), currencySet.getCurrency("EUR"), new Fraction(10, 14)));
        ExchangeRateSet.add(new ExchangeRate(currencySet.getCurrency("American Dollar"), currencySet.getCurrency("GBP"), new Fraction(18, 10)));
    }
}
