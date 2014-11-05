package persistence;

import model.ExchangeRate;
import model.ExchangeRateSet;

public class ExchangeRateLoader {
    public void loadSet(ExchangeRateSet source){
        for (Object exchangeRate : source) {
            boolean add = ExchangeRateSet.add((ExchangeRate) exchangeRate); 
            
        }
    }

//TODO
}
