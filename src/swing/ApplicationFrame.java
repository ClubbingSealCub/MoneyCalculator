package swing;

import static java.awt.BorderLayout.SOUTH;
import java.awt.Dimension;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.Currency;
import ui.dialog.ExchangeDialog;

public class ApplicationFrame extends JFrame {
    private Currency[] currencies;
    private ActionListener actionListener;

    public ApplicationFrame() {
        this.setTitle("Money Calculator");
        this.setSize(new Dimension(500, 500));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(createExchangePanel());
        this.add(createMoneyPanel(), SOUTH);
        this.add(createCalculateButton(), SOUTH);
        this.setVisible(true);
    }

    private JPanel createExchangePanel() {
        ExchangeDialogPanel dialogPanel = new ExchangeDialogPanel(currencies);
        return dialogPanel;

    }

    private JPanel createMoneyPanel() {
        return new JPanel();
    }

    private JButton createCalculateButton() {
        JButton button = new JButton("Calcular");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionListener.actionPerformed(e);
            }
        });
        return button;
    }

    public void register(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    public Object getExchangeDialog() {
        return null;
    }

}
