package lab5;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class Square extends Shape {
    int a;

    public Square(int x, int y, int a) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.color_r = ThreadLocalRandom.current().nextInt(0, 256);
        this.color_g = ThreadLocalRandom.current().nextInt(0, 256);
        this.color_b = ThreadLocalRandom.current().nextInt(0, 256);
    }

    public void draw(Graphics g) {
        g.setColor(new Color(color_r, color_g, color_b));
        g.drawRect(x, y, a, a);
    }
}
