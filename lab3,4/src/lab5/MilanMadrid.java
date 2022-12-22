package lab5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MilanMadrid {
    static int milan = 0;
    static int madrid = 0;
    static JLabel result;
    static JLabel last;
    static JLabel winner;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Milan Madrid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
        //создали панель
        JPanel panel = new JPanel();
        //задали свойство панели – цвет фона
        panel.setBackground(Color.GRAY);
        // задали свойство панели размеры
        panel.setPreferredSize(new Dimension(200, 300));
        JButton buttonMilan = new JButton("AC Milan");
        JButton buttonMadrid = new JButton("Real Madrid");
        panel.add(buttonMilan);
        panel.add(buttonMadrid);
        JLabel result = new JLabel("Result: 0 X 0");
        JLabel last = new JLabel("Last Scorer: N/A");
        JLabel winner = new JLabel("Winner: DRAW");
        panel.add(result);
        panel.add(last);
        panel.add(winner);

        //добавили панель к фрейму
        frame.getContentPane().add(panel);
        buttonMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milan += 1;
                result.setText("Result: " + String.valueOf(milan) + " X " + String.valueOf(madrid));
                last.setText("Last Scorer: AC Milan");
                if (milan > madrid) {
                    winner.setText("Winner: AC Milan");
                } else if (milan < madrid) {
                    winner.setText("Winner: Real Madrid");
                } else {
                    winner.setText("Winner: DRAW");
                }
            }
        });
        buttonMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madrid += 1;
                result.setText("Result: " + String.valueOf(milan) + " X " + String.valueOf(madrid));
                last.setText("Last Scorer: Real Madrid");
                if (milan > madrid) {
                    winner.setText("Winner: AC Milan");
                } else if (milan < madrid) {
                    winner.setText("Winner: Real Madrid");
                } else {
                    winner.setText("Winner: DRAW");
                }
            }
        });
        //упакуем во фрейм
        frame.pack();
        frame.setVisible(true);
    }
}
