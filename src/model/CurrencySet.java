package model;

import java.util.Iterator;
import java.util.Set;

public class CurrencySet implements Iterable {

    public static Set<Currency> currencySet;

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
    
    
    public static String[] toCurrencyString() {
        String[] currencies = new String[CurrencySet.currencySet.size()];
        int i = 0;
        for (Currency currency : CurrencySet.currencySet) {
            currencies[i] = currency.getName();
        }
        return currencies;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            int i = 0;

            @Override
            public boolean hasNext() {
                if (currencySet.size() < i) {
                    return true;
                }
                return false;
            }

            @Override
            public Object next() {
                i++;
                return currencySet.toArray()[i];
            }
        };
    }
}
