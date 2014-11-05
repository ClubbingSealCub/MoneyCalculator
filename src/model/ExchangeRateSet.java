package model;

import java.util.Iterator;
import java.util.Set;
import model.ExchangeRate;

public class ExchangeRateSet implements Iterable {

    public static Set<ExchangeRate> exchangeRateSet;

    public ExchangeRateSet(Set<ExchangeRate> exchangeRateSet) {
        exchangeRateSet = exchangeRateSet;
    }

    public static boolean add(ExchangeRate exchangeRate) {
        return exchangeRateSet.add((ExchangeRate) exchangeRate);
    }

    public void delete(ExchangeRate exchangeRate) {
        exchangeRateSet.remove(exchangeRate);
    }

    public boolean contains(ExchangeRate exchangeRate) {
        return exchangeRateSet.contains(exchangeRate);
    }

    public static ExchangeRate findRate(Currency from, Currency to) {
        for (ExchangeRate rate : exchangeRateSet) {
            if (rate.getFrom().getName().equals(from) && rate.getTo().getName().equals(to)) {
                return rate;
            } else if (rate.getFrom().getName().equals(to) && rate.getTo().getName().equals(from)){
                Fraction a = new Fraction(1,1);
                return new ExchangeRate(from, to, a.divide(rate.getRate()));
            }
        }
        return new ExchangeRate(from, to, new Fraction(1,1));
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
