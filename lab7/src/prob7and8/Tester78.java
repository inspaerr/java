package prob7and8;

import java.util.Random;
import java.util.Scanner;

public class Tester78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во книг журналов");
        int n = sc.nextInt();
        Printable[] array = new Printable[n];
        for(int i = 0; i < n; i++){
            System.out.println("Введите название " + (i + 1) + "ой книги/журнала");
            String title = sc.next();
            boolean BookElseMagazine = new Random().nextBoolean();
            if (BookElseMagazine){
                Book book = new Book(title);
                array[i] = book;;
            }
            else {
                Magazine magazine = new Magazine(title);
                array[i] = magazine;
            }
        }
        System.out.println("Книги: ");
        Book.printBook(array);
        System.out.println("Журналы: ");
        Magazine.printMagazines(array);
    }
}
