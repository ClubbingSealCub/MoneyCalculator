package process;

public class Exchanger {
    public Number exchangeAmount(model.ExchangeRate rate, model.Exchange amount){
        return amount.getAmount().floatValue()*rate.getRate().floatValue();
    }
}
