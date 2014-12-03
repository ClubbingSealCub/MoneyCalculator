package model;

public class Money {
    private final Fraction amount;
    private final Currency currency;

    public Money(Fraction amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money(double amount, Currency fromCurrency) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Fraction getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }
    
    
}
