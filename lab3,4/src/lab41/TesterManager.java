package lab41;

import java.util.Scanner;

public class TesterManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employer[] employers = new Employer[4];
        for (int i = 0; i < 2; i++){
            Employer manager = new Manager(random (1000, 5000));
            System.out.println("Введите имя и фамилию");
            String firstname = sc.next();
            String lastname = sc.next();
            manager.setFirstName(firstname);
            manager.setLastName(lastname);
            manager.setIncome(random(42000, 48000));
            employers[i] = manager;
        }
        for (int i = 2; i < 4; i++){
            Employer employer = new Employer();
            System.out.println("Введите имя, фамилию");
            String firstname = sc.next();
            String lastname = sc.next();
            employer.setFirstName(firstname);
            employer.setLastName(lastname);
            employer.setIncome(random(42000, 48000));
            employers[i] = employer;
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(employers[i].getLastName() + " " + employers[i].getIncome());
        }
    }
    public static int random(int min, int max) //функция получения псевдорандомного числа
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
