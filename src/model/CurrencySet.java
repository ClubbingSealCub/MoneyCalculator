package model;

import java.util.Iterator;
import java.util.Set;

public class CurrencySet implements Iterable {

    public Set<Currency> currencySet;

    public CurrencySet(Set<Currency> currencySet) {
        this.currencySet = currencySet;
    }

    public boolean add(Currency currency) {
        return currencySet.add(currency);
    }

    public void delete(Currency currency) {
        currencySet.remove(currency);
    }

    public Currency getCurrency(String currencyName) {
        for (Currency currency : currencySet) {
            if(currency.getName() == null ? currencyName == null : currency.getName().equals(currencyName)){
                return currency;
            }
        }
        return null;
    }

    public String[] toCurrencyString() {
        String[] currencies = new String[currencySet.size()];
        int i = 0;
        for (Currency currency : currencySet) {
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
                if (currencySet.size() > i) {
                    return true;
                }
                return false;
            }

            @Override
            public Currency next() {
                i++;
                return (Currency) currencySet.toArray()[i];
            }
        };
    }
}
