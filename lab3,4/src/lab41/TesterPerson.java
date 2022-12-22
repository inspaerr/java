package lab41;

import java.util.Scanner;

public class TesterPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person1 = new Person();
        System.out.println("Введите имя и возраст первого человека");
        String name = sc.next();
        int age = sc.nextInt();
        person1.setFullName(name);
        person1.setAge(age);
        System.out.println("Введите имя и возраст второго человека");
        name = sc.next();
        age = sc.nextInt();
        Person person2 = new Person(name, age);
        person1.move();
        person1.talk();
    }
}
