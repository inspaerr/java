package lab3;
import java.util.Random;
import java.util.Scanner;

public class Tester {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите количество окружностей");
        int n = sc.nextInt();
        Circle[] mass = new Circle[n];
        for (int i = 0; i < n; i++) {
            mass[i] = new Circle();
            mass[i].setRadius(rand.nextInt(10));
            System.out.println("Введите координаты x y для окружности");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            Point center = new Point();
            center.setXY(x, y);
            mass[i].setCenter(center);
        }
        System.out.println("Созданный массив окружностей: ");
        for (int i = 0; i < n; i++) {
            System.out.println("(" + mass[i].getCenter().getX() + ") " + "(" + mass[i].getCenter().getY() + ")" + " R = " + mass[i].getRadius());
        }
        System.out.println("Наименьшая окружность: " + "(" + MinCircle(mass).getCenter().getX() + ") " + "(" + MinCircle(mass).getCenter().getY() + ")" + " R = " + MinCircle(mass).getRadius() + "\nНаибольшая окружность: " + MaxCircle(mass).getCenter().getX() + ") " + "(" + MaxCircle(mass).getCenter().getY() + ")" + " R = " + MaxCircle(mass).getRadius() );
        mass = SortCircles(mass);
        System.out.println("Упорядоченный массив окружностей: ");
        for (int i = 0; i < n; i++) {
            System.out.println(mass[i].getCenter().getX() + " " + mass[i].getCenter().getY() + " R = " + mass[i].getRadius());
        }
    }
    public static Circle MaxCircle(Circle[] mass) {
        double max = 0;
        int index = 0;
        for(int i = 0; i < mass.length; i++) {
            if (mass[i].getRadius() > max) {
                max = mass[i].getRadius();
                index = i;
            }
        }
        return mass[index];
    }
    public static Circle MinCircle(Circle[] mass) {
        double min = mass[0].getRadius();
        int index = 0;
        for(int i = 1; i < mass.length; i++) {
            if (mass[i].getRadius() < min) {
                min = mass[i].getRadius();
                index = i;
            }
        }
        return mass[index];
    }
    public static Circle[] SortCircles(Circle[] mass) {
        for(int i = mass.length-1 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (mass[j].getRadius() > mass[j + 1].getRadius()) {
                    Circle tmp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = tmp;
                }
            }
        }
        return mass;
    }
}
