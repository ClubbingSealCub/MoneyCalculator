package process;

import model.Money;

public class Exchanger {

    public Money exchangeAmount(model.Money money, model.ExchangeRate exchangeRate) {
        return new Money(money.getAmount().multiply(exchangeRate.getRate()), exchangeRate.getTo());
    }
}
