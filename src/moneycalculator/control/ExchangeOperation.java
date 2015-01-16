package moneycalculator.control;

import moneycalculator.ui.ExchangeDialog;

public class ExchangeOperation {
    
    private final ExchangeDialog dialog;

    public ExchangeOperation(ExchangeDialog dialog) {
        this.dialog = dialog;
    }
    
    public void execute() {
        dialog.setLabel("" + dialog.getExchange().getMoney().getAmount()
                *dialog.getExchangeRate().getRate());
        System.out.println(dialog.getExchange().getMoney().getAmount()*dialog.getExchangeRate().getRate());
        System.out.println(dialog.getExchange().getMoney().getCurrency().getCode());
        System.out.println(dialog.getExchange().getCurrency().getCode());
    }
    
}
