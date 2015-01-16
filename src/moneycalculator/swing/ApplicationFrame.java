package moneycalculator.swing;

import static java.awt.BorderLayout.*;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import moneycalculator.model.CurrencySet;
import moneycalculator.model.ExchangeRate;
import moneycalculator.ui.ExchangeDialog;

public class ApplicationFrame extends JFrame {
    
    private final CurrencySet currencySet;
    private Map<String,ActionListener> listeners;
    private ExchangeDialog exchangeDialog;
    private final ExchangeRate exchangeRate;

    public ApplicationFrame(CurrencySet currencySet, ExchangeRate exchangeRate) {
        super();
        this.currencySet = currencySet;
        this.exchangeRate = exchangeRate;
        this.listeners = new HashMap<>();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(265,150);
        this.setTitle("Money Calculator");
        this.createWidgets();
        this.setVisible(true);
    }

    public void register(String command, ActionListener actionListener) {
        this.listeners.put(command, actionListener);
    }

    public ExchangeDialog getDialog() {
        return exchangeDialog;
    }

    private void createWidgets() {
        this.add(createCalculateButton(), SOUTH);
        this.add(createDialog());
    }

    private JButton createCalculateButton() {
        JButton button = new JButton("Calcular");
        button.addActionListener(createListener("Calcular"));
        return button;
    }

    private ActionListener createListener(final String text) {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                listeners.get(text).actionPerformed(event);
            }
        };
    }

    private JPanel createDialog() {
        ExchangeDialogPanel panel = new ExchangeDialogPanel(currencySet, exchangeRate);
        this.exchangeDialog = panel;
        return panel;
    }

    
    
    
}
