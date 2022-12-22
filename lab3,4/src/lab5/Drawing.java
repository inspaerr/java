package lab5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Drawing {
    static int width = 600;
    static int height = 600;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing shapes");
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        // задали свойство панели размеры

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
