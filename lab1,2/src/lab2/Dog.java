package lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class Dog {
    private String name;
    private int age;

    public Dog() {}
    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int toHuman() {
        int HumanAge = 7 * age;
        return HumanAge;
    }

    @Override
    public String toString() {
        return "Dog{" + "age = " + age + " name = " + name + "}";
    }
}
class DogKennel {
    ArrayList<Dog> dogs = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void AddDog() {
        Dog dog = new Dog();
        System.out.println("Введите имя собаки и ее возраст");
        String name = sc.next();
        int age = sc.nextInt();
        dog.setAge(age);
        dog.setName(name);
        dogs.add(dog);
        System.out.println("Собака добавлена");
    }

    public void OutList() {
        System.out.println("Собаки питомника:");
        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i).getName() + " " + dogs.get(i).getAge());
        }
    }

    public Dog SearchDog() {
        int indx = 0;
        String name = sc.next();
        for (int i = 0; i < dogs.size(); i++) {
            if (dogs.get(i).getName().equals(name)) {
                indx = i;
            }
        }
        return dogs.get(indx);
    }
}

class DogTester {
    public static void main(String[] args) {
        DogKennel kennel = new DogKennel();
        int n;
        int StopFlag = 0;
        Scanner sc = new Scanner(System.in);
        while(StopFlag == 0) {
            System.out.println("Введите номер команды:\n 1 - добавить собачку\n 2 - перевести возраст собаки в человеческий\n 3 - вывести имена и возраст собак питомника\n 4 - завершить");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    kennel.AddDog();
                    break;
                case 2:
                    System.out.println("Введите кличку собаки, возраст которой хотите перевести в человеческий");
                    Dog dog = kennel.SearchDog();
                    int age = dog.toHuman();
                    System.out.println("Итог: " + age);
                    break;
                case 3:
                    kennel.OutList();
                    break;
                case 4:
                    StopFlag = 1;
                    break;
            }
        }
    }
}
