package model;

public class Money {
    private final Fraction amount;
    private final Currency currency;

    public Money(Fraction amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Fraction getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }
    
    
}
