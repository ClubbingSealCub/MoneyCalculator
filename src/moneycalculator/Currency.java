package moneycalculator;

public class Currency {
    private char symbol;
    private String name;
    private String code;

    public Currency(char symbol, String name, String code) {
        this.symbol = symbol;
        this.name = name;
        this.code = code;
    }
    
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
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


