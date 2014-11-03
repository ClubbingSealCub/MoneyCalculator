package model;

public class ExchangeRate {

    private final Currency from;
    private final Currency to;
    private final Fraction rate;

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
}
