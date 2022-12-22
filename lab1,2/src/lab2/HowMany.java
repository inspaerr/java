package lab2;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        System.out.println("Введите строку из слов");
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        int counter = 0;

        if (str.charAt(str.length() - 1) == ' ') {
            counter++;
            System.out.println("Нет конца строки");
        }
        else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                    //if ((str.charAt(i) > 100 && str.charAt(i) < 133) || (str.charAt(i) > 140 && str.charAt(i) < 173)) {
                    counter++;

                }
            }
        }
        counter++;
        System.out.println(counter);
    }
}
