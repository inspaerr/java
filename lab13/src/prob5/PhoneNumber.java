package prob5;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        String codeOfCountry;
        String codeOfOperator;
        String triple;
        String double1;
        String double2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер в одном из форматов");
        String num = sc.next();
        if (num.startsWith("+")){
            codeOfCountry = num.substring(1, num.length() - 10);
            codeOfOperator = num.substring(codeOfCountry.length() + 1, codeOfCountry.length() + 4);
            triple = num.substring(num.indexOf(codeOfOperator) + 3, num.indexOf(codeOfOperator) + 6);
            double1 = num.substring(num.indexOf(triple) + 3, num.indexOf(triple) + 5);
            double2 = num.substring(num.indexOf(double1) + 2, num.indexOf(double1) + 4);
        }
        else
        {
            codeOfCountry = "7";
            codeOfOperator = num.substring(1, 4);
            triple = num.substring(4, 7);
            double1 = num.substring(7, 9);
            double2 = num.substring(9, 11);

        }
        System.out.println("+" + codeOfCountry + "(" + codeOfOperator + ")" + triple + "-" + double1 + "-" + double2);

    }
}
