package prob6789;

import java.util.Scanner;

public class Tester6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во книг и журналов");
        int n = sc.nextInt();
        Printable[] array = new Printable[n];
        for(int i = 0; i < n; i++){
            System.out.println("Введите автора и название " + (i + 1) + "ой книги/журнала");
            String author = sc.next();
            String title = sc.next();
            Book book = new Book(author, title);
            array[i] = book;
        }
        for (int i = 0; i < n; i++){
            array[i].print();
        }
    }
}
