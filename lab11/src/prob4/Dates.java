package prob4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату и время: (день, месяц, год, час, минуты)");
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd MMMM yyyy");

        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        Date date1 = new Date();
        date1.setDate(day);
        date1.setMonth(month - 1);
        date1.setYear(year - 1900);
        date1.setHours(hour);
        date1.setMinutes(minute);

        Calendar date2 = Calendar.getInstance();
        date2.set(Calendar.YEAR, year);
        date2.set(Calendar.MONTH, month - 1);
        date2.set(Calendar.DAY_OF_MONTH, day);
        date2.set(Calendar.HOUR, hour);
        date2.set(Calendar.MINUTE, minute);

        System.out.println("Вывод объекта класса Date: " + sdf.format(date1));
        System.out.println("Вывод объекта класса Calendar " + sdf.format(date2.getTime()));
    }
}
