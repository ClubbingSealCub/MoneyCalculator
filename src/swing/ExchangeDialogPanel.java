package swing;

import java.awt.FlowLayout;
import java.awt.PopupMenu;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.ItemEvent;
import static java.awt.event.ItemEvent.SELECTED;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Currency;
import model.Exchange;
import model.Money;
import ui.dialog.ExchangeDialog;

public class ExchangeDialogPanel extends JPanel implements ExchangeDialog {

    private double amount;
    private Currency fromCurrency;
    private Currency toCurrency;
    private final Currency[] currencies;

    public ExchangeDialogPanel(Currency currencies[]) {
        this.currencies = currencies;
        this.setLayout(new FlowLayout());
        this.add(createAmountField());
        this.add(createFromCurrencyField());
        this.add(createToCurrencyField());
    }

    @Override
    public Exchange getExchange() {
        return new Exchange(new Money(amount, fromCurrency), toCurrency);
    }

    private JTextField createAmountField() {
        JTextField text = new JTextField();
        text.addInputMethodListener(new InputMethodListener() {

            @Override
            public void inputMethodTextChanged(InputMethodEvent event) {
                String value = text.getText();
                try {
                    amount = Double.parseDouble(value);
                } catch (NumberFormatException e) {

                }
                updateExchange();
            }

            @Override
            public void caretPositionChanged(InputMethodEvent event) {
            }

        });
        return text;
    }

    private JComboBox<Currency> createFromCurrencyField() {
        JComboBox<Currency> combo = new JComboBox<>(currencies);
        combo.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() != SELECTED) {
                    return;
                }
                fromCurrency = combo.getItemAt(combo.getSelectedIndex());
            }

        });
        return combo;
    }

    private void updateExchange() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private JComboBox<Currency> createToCurrencyField() {
        JComboBox<Currency> combo = new JComboBox<>(currencies);
        combo.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() != SELECTED) {
                    return;
                }
                fromCurrency = combo.getItemAt(combo.getSelectedIndex());
            }

        });
        return combo;
    }
}
