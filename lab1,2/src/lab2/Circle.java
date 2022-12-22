package lab2;

import java.util.Scanner;

class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    };
}

public class Circle {
    private Point center;
    private double radius;

    public Circle() {}

    public Point getCenter() { return center; }
    public double getRadius(){
        return radius;
    }
    public void setCenter(Point center) { this.center = center; }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double Square() {
        double S = Math.PI * radius * radius;
        return S;
    }
    public double Length() {
        double L = 2 * Math.PI * radius;
        return L;
    }
    public boolean IsEqual(Circle circle) {
        if (Square() != circle.Square()) {return false;}
        else {return true;}
    }
}
class Tester{
    private int n;
    private Circle[] mass;
    public Tester(int n) {
        this.mass = new Circle[n];
    }
}
class CircleTest {
    public static void main(String[] args) {
        System.out.println("Введите радиус и центр первой окружности");
        Scanner sc = new Scanner(System.in);
        double r1, r2, x1, x2, y1, y2;

        Circle c1 = new Circle();
        r1 = sc.nextDouble();
        c1.setRadius(r1);
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        Point cen1 = new Point(x1, y1);
        c1.setCenter(cen1);

        Circle c2 = new Circle();
        System.out.println("Для второй");
        r2 = sc.nextDouble();
        c2.setRadius(r2);
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        Point cen2 = new Point(x2, y2);
        c2.setCenter(cen2);

        if(c1.IsEqual(c2) == true) { System.out.println("Окружности равны"); }
        else { System.out.println("Окружности не равны"); }

        System.out.println("Длина и площадь первой окружности: " + c1.Length() + " " + c1.Square());
        System.out.println("Длина и площадь второй окружности: " + c2.Length() + " " + c2.Square());
    }
}

