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

    public Fraction findRate(Currency from, Currency to) {
        for (ExchangeRate rate : exchangeRateSet) {
            if (rate.getFrom() == from && rate.getTo() == to) {
                return rate.getRate();
            }
        }
        return new Fraction(1,1);
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
            public ExchangeRate next() {
                i++;
                return (ExchangeRate) exchangeRateSet.toArray()[i];
            }
        };
    }

}
