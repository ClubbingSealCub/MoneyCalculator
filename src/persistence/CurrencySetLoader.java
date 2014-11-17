package persistence;

import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader {
    public static void loadSet(CurrencySet source, CurrencySet currencySet){
        for (Object currency : source) {
            boolean add = currencySet.add((Currency) currency); 
            
        }
    }

    public static void loadSetMock(CurrencySet currencySet) {
        currencySet.add(new Currency('€', "Euro", "EUR"));
        currencySet.add(new Currency('$', "American Dollar", "USD"));
        currencySet.add(new Currency('£', "Pound Sterling", "GBP"));
    }
}
