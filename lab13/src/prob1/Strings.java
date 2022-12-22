package prob1;

import java.util.Scanner;

public class Strings {
    public static void WorkWithJava(String str){
        System.out.println("Последний символ строки: " + str.charAt(str.length() - 1));
        if (str.endsWith("!!!")) {
            System.out.println("Строка заканчивается на !!!");
        }
        else {System.out.println("Строка не заканчивается на !!!");}
        if (str.startsWith("I like")) {
            System.out.println("Строка начинается на I like");
        }
        else {System.out.println("Строка не начинается на I like");}
        if (str.contains("Java")) {
            System.out.println("Строка содержит подстроку Java");
        }
        else {System.out.println("Строка не содержит подстроку Java");}
        System.out.println("Строка в нижнем регистре: " + str.toLowerCase());
        System.out.println("Строка в верхнем регистре: " + str.toUpperCase());
        System.out.println("Позиция подстроки Java в данной строке: " + str.indexOf("Java"));
        str =   str.replace('a', 'o');
        System.out.println("Строка после замена а на о: " + str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = sc.nextLine();
        WorkWithJava(str);
    }
}
