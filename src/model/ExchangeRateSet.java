package model;

import java.util.Iterator;
import java.util.Set;

public class ExchangeRateSet implements Iterable {

    public static Set<ExchangeRate> exchangeRateSet;

    public ExchangeRateSet(Set<ExchangeRate> exchangeRateSet) {
        ExchangeRateSet.exchangeRateSet = exchangeRateSet;
    }

    public boolean add(ExchangeRate exchangeRate) {
        return exchangeRateSet.add(exchangeRate);
    }

    public void delete(ExchangeRate exchangeRate) {
        exchangeRateSet.remove(exchangeRate);
    }

    public boolean contains(ExchangeRate exchangeRate) {
        return exchangeRateSet.contains(exchangeRate);
    }

    public Fraction findRate(String from, String to) {
        for (ExchangeRate rate : exchangeRateSet) {
            if (rate.getFrom().getName().equals(from) && rate.getTo().getName().equals(to)) {
                return rate.getRate();
            } else if (rate.getFrom().getName().equals(to) && rate.getTo().getName().equals(from)){
                Fraction a = new Fraction(1,1);
                return a.divide(rate.getRate());
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
