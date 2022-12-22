package lab3;
import java.util.Random;
import java.util.Scanner;

public class Randomizer {
    public static void main(String args[]){
        int x;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - заполнить массив с помощью класса Random \n2 - заполнить массив с помощью метода Random() класса Math");
        x = sc.nextInt();
        System.out.println("Введите количество элементов массива");
        n = sc.nextInt();
        double[] arr = new double[n];
        if (x == 1) {
            Random rand = new Random(); //класс Random
            for (int i = 0; i < n; i++) {arr[i] = rand.nextInt(1000);}
        }
        else {
            for (int i = 0; i < n; i++) {arr[i] = Math.random();}
        }
        System.out.println("Неотсортированный массив: ");
        for (int i = 0; i < n; i++) {System.out.println(arr[i] + " ");}
        for(int i = arr.length-1 ; i > 0 ; i--) { //сортировка пузырек
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < n; i++) {System.out.println(arr[i] + " ");}
    }
}
