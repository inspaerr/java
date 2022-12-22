package prob5and6;

import java.util.Scanner;

public class Tester56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProcessStrings processStrings = new ProcessStrings();
        System.out.println("Введите строку");
        String str = sc.next();
        System.out.println("Количество символов в строке = " + processStrings.counterOfChars(str) + "\n" + "Новая строка: " + processStrings.newString(str));
        System.out.print("Перевернутая строка: ");
        processStrings.stringInversion(str);
    }
}
