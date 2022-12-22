package prob2;

import java.util.Scanner;

public class Person {
    public static void outInitials(String str){
        String lastName = null;
        String firstName = null;
        String patronymic = null;
        int n = 1;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' ' || i == str.length() - 1 ){
                if (n == 1) {
                    lastName = str.substring(0, i + 1);
                }
                if (n == 2) {
                    firstName = str.substring(lastName.length(), i);
                }
                if (n == 3) {
                    patronymic = str.substring(firstName.length() + lastName.length() + 1, str.length());
                }
                n++;
            }

        }
        if (firstName != null && patronymic != null) {
            System.out.println(lastName + firstName.charAt(0) + "." + patronymic.charAt(0) + ".");
        }
        else System.out.println(lastName);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите фамилию, имя, отчество");
        String FIO = sc.nextLine();
        outInitials(FIO);
    }
}
