package model;

import java.util.Iterator;
import java.util.Set;

public class ExchangeRateSet implements Iterable {

    public static Set<ExchangeRate> exchangeRateSet;

    public ExchangeRateSet(Set<ExchangeRate> exchangeRateSet) {
        this.exchangeRateSet = exchangeRateSet;
    }

    public boolean add(ExchangeRate exchangeRate) {
        return exchangeRateSet.add(exchangeRate);
    }

    public void delete(ExchangeRate exchangeRate) {
        exchangeRateSet.remove(exchangeRate);
    }

    public boolean contains(ExchangeRate exchangeRate) {
        if (exchangeRateSet.contains(exchangeRate)) {
            return true;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            int i = 0;

            @Override
            public boolean hasNext() {
                if (exchangeRateSet.size() < i) {
                    return true;
                }
                return false;
            }

            @Override
            public Object next() {
                i++;
                return exchangeRateSet.toArray()[i];
            }
        };
    }

}
