package model;

public class ExchangeRate {

    private Currency from;
    private Currency to;
    private Fraction rate;

    public ExchangeRate(Currency from, Currency to, Fraction rate) {
        this.from = from;
        this.to = to;
        this.rate = rate;
    }
    
    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public Fraction getRate() {
        return rate;
    }

    public void setFrom(Currency from) {
        this.from = from;
    }

    public void setTo(Currency to) {
        this.to = to;
    }

    public void setRate(Fraction rate) {
        this.rate = rate;
    }
    
}
