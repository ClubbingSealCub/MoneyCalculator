package application;

import control.ExchangeOperation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import swing.MoneyCalculatorFrame;

public class Application {

    public static void main(String[] args) {
        MoneyCalculatorFrame frame = new MoneyCalculatorFrame();
        frame.register(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
}
