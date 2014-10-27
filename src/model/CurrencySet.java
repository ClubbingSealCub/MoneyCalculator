package model;

import java.util.Set;

public class CurrencySet {

    static Set<Currency> currencySet;

    public CurrencySet(Set<Currency> currencySet) {
        this.currencySet = currencySet;
    }

    public boolean add(Currency currency) {
        return currencySet.add(currency);
    }

    public void delete(Currency currency) {
        currencySet.remove(currency);
    }

    public boolean contains(Currency currency) {
        if (currencySet.contains(currency)) {
            return true;
        }
        return false;
    }
}
