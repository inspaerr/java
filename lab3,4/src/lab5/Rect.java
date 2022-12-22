package lab5;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class Rect extends Shape {
    int a, b;

    public Rect(int x, int y, int a, int b) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
        this.color_r = ThreadLocalRandom.current().nextInt(0, 256);
        this.color_g = ThreadLocalRandom.current().nextInt(0, 256);
        this.color_b = ThreadLocalRandom.current().nextInt(0, 256);
    }

    public void draw(Graphics g) {
        g.setColor(new Color(color_r, color_g, color_b));
        g.drawRect(x, y, a, b);
    }

}
