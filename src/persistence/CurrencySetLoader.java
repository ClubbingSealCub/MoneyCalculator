package persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader {
    //INTERFACE
    private final Connection connection;

    public CurrencySetLoader(Connection connection) {
        this.connection = connection;
    }
    
    public CurrencySet load(){
        return null;
    }

    private CurrencySet processCurrencies(ResultSet resultSet) throws Exception{
        CurrencySet currencySet = new CurrencySet();
        return null;
    }
    
    public static void loadSet(CurrencySet source, CurrencySet currencySet){
        for (Object currency : source) {
            boolean add = currencySet.add((Currency) currency); 
            
        }
    }

    public static void loadSetMock(CurrencySet currencySet) {
        currencySet.add(new Currency('€', "Euro", "EUR"));
        currencySet.add(new Currency('$', "American Dollar", "USD"));
        currencySet.add(new Currency('£', "Pound Sterling", "GBP"));
    }
}
