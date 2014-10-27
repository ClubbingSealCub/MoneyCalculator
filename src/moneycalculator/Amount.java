package moneycalculator;

public class Amount {

    private Number amount;
    private Currency currency;

    public Amount(Number amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }
    
    public Number getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setAmount(Number amount) {
        this.amount = amount;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
    
}
