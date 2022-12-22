package lab41;

import java.util.Scanner;

public class TesterShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону квадрата, радиус круга и стороны прямоугольника");
        double a = sc.nextDouble();
        double r = sc.nextDouble();
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        Square square = new Square(a);
        Circle circle = new Circle(r);
        Rectangle rectangle = new Rectangle(a1, b1);

        square.setType("Квадрат");
        circle.setType("Круг");
        rectangle.setType("Прямоугольник");

        System.out.println(square.getType() + " " + square + " S = " + square.getArea() + " P = " + square.getPerimeter());
        System.out.println(circle.getType() + " " + circle + " S = " + circle.getArea() + " P = " + circle.getPerimeter());
        System.out.println(rectangle.getType() + " " + rectangle + " S = " + rectangle.getArea() + " P = " + rectangle.getPerimeter());
    }
}
