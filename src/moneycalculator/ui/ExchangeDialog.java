package moneycalculator.ui;

import moneycalculator.model.Exchange;
import moneycalculator.model.ExchangeRate;

public interface ExchangeDialog {
    
    public Exchange getExchange();
    
    public ExchangeRate getExchangeRate();
    
    public void setLabel(String string);
}
