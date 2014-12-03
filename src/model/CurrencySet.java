package model;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class CurrencySet implements Iterable {

    public Set<Currency> currencySet;

    public CurrencySet() {
        this.currencySet = new Set<Currency>() {

            @Override
            public int size() {
                return currencySet.size();
            }

            @Override
            public boolean isEmpty() {
                return currencySet.isEmpty();
            }

            @Override
            public boolean contains(Object o) {
                return currencySet.contains(o);
            }

            @Override
            public Iterator<Currency> iterator() {
                return new Iterator() {
                    int i=0;
                    @Override
                    public boolean hasNext() {
                        return currencySet.size()>i;
                    }

                    @Override
                    public Object next() {
                        i++;
                        return currencySet.toArray()[i];
                    }
                };
            }

            @Override
            public Object[] toArray() {
                return currencySet.toArray();
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return currencySet.toArray(a);
            }

            @Override
            public boolean add(Currency e) {
                return currencySet.add(e);
            }

            @Override
            public boolean remove(Object o) {
                return currencySet.remove(o);
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return currencySet.containsAll(c);
            }

            @Override
            public boolean addAll(Collection<? extends Currency> c) {
                return currencySet.addAll(c);
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return currencySet.retainAll(c);
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return currencySet.removeAll(c);
            }

            @Override
            public void clear() {
                currencySet.clear();
            }
        };
    }

    public boolean add(Currency currency) {
        return currencySet.add(currency);
    }

    public void delete(Currency currency) {
        currencySet.remove(currency);
    }

    public Currency getCurrency(String currencyCode) {
        for (Currency currency : currencySet) {
            if(currency.getCode() == null ? currencyCode == null : currency.getName().equals(currencyCode)){
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
