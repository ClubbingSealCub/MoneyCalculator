package application;

import control.ExchangeOperation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import swing.ApplicationFrame;
import ui.dialog.ExchangeDialog;

public class Application {

    public static void main(String[] args) {
        ApplicationFrame frame = new ApplicationFrame();
        frame.register(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new ExchangeOperation((ExchangeDialog) frame.getExchangeDialog()).execute();

            }
        });

    }
}
