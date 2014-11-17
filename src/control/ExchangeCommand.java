package control;

import model.Currency;
import model.ExchangeRateSet;
import model.Money;

public class ExchangeCommand {
    public String getExchange(Money from, Currency to){
        return process.Exchanger.exchangeAmount(from, ExchangeRateSet.findRate(from.getCurrency(), to)).getAmount().toString();
    }
}
