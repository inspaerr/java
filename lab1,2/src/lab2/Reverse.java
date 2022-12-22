package lab2;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int n;
        String k;
        System.out.println("Введите количество элементов в массиве");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String[] Array = new String[n];
        System.out.println("Введите " + n + " строк");

        for (int i = 0; i < n; i++) {
            Array[i] = sc.next();
        }

        for (int i = 0; i < n / 2; i++) {
            k = Array[i];
            Array[i] = Array[n - 1 - i];
            Array[n - 1 - i] = k;
        }

        System.out.println("Перевернутый массив:");
        for (int i = 0; i < n; i++) {
            System.out.println(Array[i]);
        }
    }
}
