package lab1;
import java.util.Scanner;

public class prob7 {
    public static void main(String[] args) {
        int f = 1;
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println("Факториал числа = " + f);
    }
}
