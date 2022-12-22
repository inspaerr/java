package prob2;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Сomparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день, месяц и год");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, year);
        date.set(Calendar.MONTH, month - 1);
        date.set(Calendar.DAY_OF_MONTH, day);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);

        Calendar now = Calendar.getInstance();
        now.set(Calendar.MINUTE, 0);
        now.set(Calendar.SECOND, 0);
        now.set(Calendar.MILLISECOND, 0);

        if (date.compareTo(now) == 0) {
            System.out.println("Даты равны");
        }
        else if (date.compareTo(now) < 0){
            System.out.println("Дата меньше текущей");
        }
        else if (date.compareTo(now) > 0){
            System.out.println("Дата больше текущей");
        }
    }
}
