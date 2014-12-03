package model;

public class Exchange {
    
    private final Money money;

    public Exchange(Money money, Currency currency) {
        this.money = money;
        this.currency = currency;
    }

    public Money getMoney() {
        return money;
    }

    public Currency getCurrency() {
        return currency;
    }
    private final Currency currency;
    
}
