package process;

import model.ExchangeRate;
import model.Money;

public class Exchanger {

    public static Money exchangeAmount(Money money, ExchangeRate exchangeRate) {
        return new Money(money.getAmount().multiply(exchangeRate.getRate()), exchangeRate.getTo());
    }
}
