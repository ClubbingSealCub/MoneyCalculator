package control;

import ui.dialog.ExchangeDialog;

public class ExchangeOperation {

    private final ExchangeDialog exchangeDialog;

    public ExchangeOperation(ExchangeDialog exchangeDialog) {
        this.exchangeDialog = exchangeDialog;
    }
    
    public void execute(){
        System.out.println(exchangeDialog.getExchange().getMoney().getAmount());
    }
    
}
