package lab41;

import java.util.ArrayList;
import java.util.Scanner;

public class TesterPhone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Phone> phones = new ArrayList<Phone>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите номер, модель и вес телефона");
            int number = sc.nextInt();
            String model = sc.next();
            double weight = sc.nextDouble();
            Phone phone = new Phone(weight, model, number);
            phones.add(phone);
        }
        System.out.println("Значения объектов класса Phone:");
        for (int i = 0; i < 3; i++){
            System.out.println(phones.get(i).toString());
        }
        System.out.println("Метод receiveCall:");
        phones.get(1).receiveCall("Андрей", phones.get(0).getNumber());
        System.out.println("Метод sendMessage:");
        phones.get(0).sendMessage(8849, 83839, 1123, 544839);
    }
}
