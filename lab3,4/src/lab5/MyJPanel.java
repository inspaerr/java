package lab5;

import java.util.concurrent.ThreadLocalRandom;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyJPanel extends JPanel {
    private JFrame frame;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int n;
        Shape shape;
        for (int i = 0; i < 20; i++) {
            n = ThreadLocalRandom.current().nextInt(0, 3);
            if (n == 0) {
                shape = new Rect(ThreadLocalRandom.current().nextInt(0, 601),
                        ThreadLocalRandom.current().nextInt(0, 601),
                        ThreadLocalRandom.current().nextInt(0, 101),
                        ThreadLocalRandom.current().nextInt(0, 101));
            } else if (n == 1) {
                shape = new Square(ThreadLocalRandom.current().nextInt(0, 601),
                        ThreadLocalRandom.current().nextInt(0, 601),
                        ThreadLocalRandom.current().nextInt(0, 101));
            } else {
                shape = new Circle(ThreadLocalRandom.current().nextInt(0, 601),
                        ThreadLocalRandom.current().nextInt(0, 601),
                        ThreadLocalRandom.current().nextInt(0, 101));
            }
            shape.draw(g);
        }
    }

    private void showGui() {
        setPreferredSize(new Dimension(600, 600));
        frame = new JFrame("Drawing");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(this, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MyJPanel().showGui();
    }
}
