package lab1;
import java.util.Scanner;

public class prob34 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        int sum = 0;
        float sr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 10 целых чисел");
        for (int i = 0; i < 10; i++) {
            mass[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            sum += mass[i];
        }
        sr = sum / 10;
        System.out.println("Сумма = " + sum + ", среднее арифметическое = " + sr);
        sum = 0;
        int counter = 0;
        while (counter != 10) {
            sum += mass[counter];
            counter++;
        }
        sum = 0;
        counter = 0;
        do {
            sum += mass[counter];
            counter++;
        } while (counter != 10);
        int max, min;
        max = mass[0];
        min = mass[0];
        for (int i = 1; i < 10; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        for (int i = 1; i < 10; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }
        }
        System.out.println("Сумма = " + sum + ", минимальное = " + min + ", максимальное = " + max);

    }
}

