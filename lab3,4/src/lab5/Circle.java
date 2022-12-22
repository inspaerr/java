package lab5;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class Circle extends Shape {
    int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color_r = ThreadLocalRandom.current().nextInt(0, 256);
        this.color_g = ThreadLocalRandom.current().nextInt(0, 256);
        this.color_b = ThreadLocalRandom.current().nextInt(0, 256);
    }

    public void draw(Graphics g) {
        g.setColor(new Color(color_r, color_g, color_b));
        g.drawOval(x, y, radius, radius);
    }
}
