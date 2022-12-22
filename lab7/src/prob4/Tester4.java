package prob4;

import java.util.Scanner;

public class Tester4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathCalculable mc = new MathFunc();
        System.out.println("Введите радиус окружности");
        double r = sc.nextDouble();
        System.out.println("Длина окружности = " + 2*r*mc.pi + " площадь круга = " + mc.pi* mc.Exponentiation(r,2));
        System.out.println("Введите коэффициенты a, b комплексного числа");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Модуль комплексного числа = " + mc.ComplexNumModulus(a, b));
    }
}
