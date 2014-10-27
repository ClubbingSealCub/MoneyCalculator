package model;

public class Exchange {

    private Money money;
    private Currency currency;

    public Exchange(Money amount, Currency currency) {
        this.money = amount;
        this.currency = currency;
    }

    public Money getMoney() {
        return money;
    }
    
    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

}
