package persistence;

import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader {
    public void loadSet(CurrencySet source){
        for (Object currency : source) {
            boolean add = CurrencySet.add((Currency) currency); 
            
        }
    }

//TODO
}
