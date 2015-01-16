package moneycalculator.swing;

import java.awt.FlowLayout;
import static java.awt.FlowLayout.LEFT;
import java.awt.BorderLayout;
import java.awt.PopupMenu;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import moneycalculator.model.Currency;
import moneycalculator.model.CurrencySet;
import moneycalculator.model.Exchange;
import moneycalculator.model.ExchangeRate;
import moneycalculator.model.Money;
import moneycalculator.ui.ExchangeDialog;

public class ExchangeDialogPanel extends JPanel implements ExchangeDialog {

    private final CurrencySet currencySet;
    private final ExchangeRate exchangeRate;
    private JTextField amount;
    private JComboBox<Currency> fromCurrency;
    private JComboBox<Currency> toCurrency;
    private JLabel label;

    public ExchangeDialogPanel(CurrencySet currencySet, ExchangeRate exchangeRate) {
        this.currencySet = currencySet;
        setLayout(new FlowLayout(LEFT));
        createWidgets();
        this.exchangeRate = exchangeRate;
    }

    public ExchangeRate getExchangeRate() {
        return exchangeRate;
    }

    @Override
    public Exchange getExchange() {
        return new Exchange(new Money(getAmount(), getFromCurrency()), getToCurrency());
    }

    private void createWidgets() {
        this.add(createAmountWidget(), BorderLayout.NORTH);
        this.add(createFromCurrencyWidget(), BorderLayout.NORTH);
        this.add(createToCurrencyWidget(), BorderLayout.NORTH);
        label = new JLabel("");
        this.add(label, BorderLayout.CENTER); 
    }

    private JTextField createAmountWidget() {
        JTextField amount = new JTextField();
        amount.setColumns(10);
        this.amount = amount;
        return amount;
    }

    private JComboBox createFromCurrencyWidget() {
        JComboBox<Currency> combo = new JComboBox<Currency>(currencySet.getItems());
        combo.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent event) {
                if (event.getStateChange() == ItemEvent.DESELECTED) {
                    return;
                }
                addCurrenciesToTargetCombobox();
            }

        });
        this.fromCurrency = combo;
        return combo;
    }

    private JComboBox createToCurrencyWidget() {
        JComboBox<Currency> combo = new JComboBox<Currency>();
        this.toCurrency = combo;
        addCurrenciesToTargetCombobox();
        return combo;
    }

    private double getAmount() {
        return Double.parseDouble(amount.getText());
    }

    private Currency getFromCurrency() {
        return fromCurrency.getItemAt(fromCurrency.getSelectedIndex());
    }

    private Currency getToCurrency() {
        return toCurrency.getItemAt(toCurrency.getSelectedIndex());
    }

    private void addCurrenciesToTargetCombobox() {
        toCurrency.removeAllItems();
        for (Currency currency : currencySet) {
            if (currency == getFromCurrency()) {
                continue;
            }
            toCurrency.addItem(currency);
        }
    }

    @Override
    public void setLabel(String string) {
        label.setText(string);
    }

}
