package lab5;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageOpener {
    public static void main(String[] args) throws IOException {
        JFrame frame = buildFrame();
        // C:\\Users\\София\\Desktop\\разработка\\практ1\\favicon.png
        final BufferedImage image = ImageIO.read(new File(args[0]));

        JPanel pane = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, null);
            }
        };
        frame.add(pane);
    }

    private static JFrame buildFrame() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
        return frame;
    }
}