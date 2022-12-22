package prob3;

import java.util.Calendar;
import java.util.Scanner;

public class Tester3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя и дату рождения студента (день месяц год)");
        String name = sc.next();
        Calendar date = Calendar.getInstance();
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        date.set(Calendar.YEAR, year);
        date.set(Calendar.MONTH, month - 1);
        date.set(Calendar.DAY_OF_MONTH, day);

        Student student = new Student(name, date);

        boolean StopFlag = false;
        while (!StopFlag) {
            System.out.println("Введите формат даты\n 1 - короткий\n 2 - средний\n 3 - полный\n 4 - выход");
            int n = sc.nextInt();
            switch (n) {
                case 1 -> System.out.println(student.toString(1));
                case 2 -> System.out.println(student.toString(2));
                case 3 -> System.out.println(student.toString(3));
                case 4 -> StopFlag = true;
            }
        }
    }
}
