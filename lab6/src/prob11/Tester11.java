package prob11;

import java.util.Scanner;

public class Tester11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите температуру в градусах Цельсия");
        double grad = sc.nextDouble();
        toKelvin kelvin = new toKelvin();
        toFahrenheit fahrenheit = new toFahrenheit();
        System.out.println("Температура в градусах по шкале Кельвина и Фаренгейта: " + kelvin.convert(grad) + "K, " + fahrenheit.convert(grad) + "F");
    }
}
