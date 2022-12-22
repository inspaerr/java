package lab3;
import java.util.ArrayList;
import java.util.Scanner;

public class NaturalNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        double n = sc.nextDouble();
        while ((n < 1) || (n % 1 != 0)) {
            System.out.println("Введено неправильное число. Повторите ввод.");
            n = sc.nextDouble();
        }
        int n2 = (int) n;
        int[] array = new int[n2];
        for (int i = 0; i < n2; i++) {
            array[i] = random(0,n2);
        }
        System.out.println("Первый массив: ");
        for (int i = 0; i < n2; i++) {
            System.out.println(array[i] + " ");
        }
        ArrayList<Integer> array2 = new ArrayList<>();
        for (int i = 0; i < n2; i++) {
            if (array[i] % 2 == 0) {array2.add(array[i]);}
        }
        System.out.println("Второй массив из четных элементов первого: ");
        for (int i = 0; i < array2.size(); i++) {
            System.out.println(array2.get(i) + " ");
        }
    }

    public static int random(int min, int max) //функция получения псевдорандомного числа
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
