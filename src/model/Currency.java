package model;

public class Currency {

    private final char symbol;
    private final String name;
    private final String code;

    public Currency(char symbol, String name, String code) {
        this.symbol = symbol;
        this.name = name;
        this.code = code;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

}
