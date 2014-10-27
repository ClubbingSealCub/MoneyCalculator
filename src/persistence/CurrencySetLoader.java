package persistence;

import java.util.Set;
import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader {
    public void loadSet(CurrencySet source){
        for (Object currency : source) {
            boolean add = CurrencySet.currencySet.add((Currency) currency); 
            
        }
    }

//TODO
}
