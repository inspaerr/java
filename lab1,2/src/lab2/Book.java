package lab2;

import java.util.Scanner;

public class Book {
    private String author;
    private int year;
    private String title;

    public Book() {}

    public int getYear() { return year; }
    public String getAuthor(){
        return author;
    }
    public String getTitle() { return title; }

    public void setAuthor(String author){
        this.author = author;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setYear(int year){
        this.year = year;
    }

}
class Bookshelf {
    private int n;
    private Book[] sshelf;

    public Bookshelf(Book[] shelf) {
        this.sshelf = shelf;
    }

    public Book Earliest(Book[] shelf, int n) {
        int min = shelf[0].getYear();
        int indx = 0;
        for (int i = 1; i < n; i++) {
            if (shelf[i].getYear() < min) {
                min = shelf[i].getYear();
                indx = i;
            }
        }
        return shelf[indx];
    }

    public Book Latest(Book[] shelf, int n) {
        int max = shelf[0].getYear();
        int indx = 0;
        for (int i = 1; i < n; i++) {
            if (shelf[i].getYear() > max) {
                max = shelf[i].getYear();
                indx = i;
            }
        }
        return shelf[indx];
    }

    public Book[] SortByAge(Book[] shelf, int n) {
        int k;
        for (int i = 0; i < n - 1; i ++) {
            for (int y = i + 1; y < n; y++ ) {
                if (shelf[i].getYear() < shelf[y].getYear()) {
                    k = shelf[i].getYear();
                    shelf[i].setYear(shelf[y].getYear());
                    shelf[y].setYear(k);
                }
            }
        }
        return shelf;
    }
}
class BookTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, title;
        int date;
        int n;
        System.out.println("Введите количество книг на вашей полке");
        n = sc.nextInt();
        Book[] shelf = new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите название, дату выхода, имя автора книги");
            title = sc.next();
            date = sc.nextInt();
            name = sc.next();
            Book book = new Book();

            book.setAuthor(name);
            book.setTitle(title);
            book.setYear(date);
            shelf[i] = book;
        }
        Bookshelf Shelf = new Bookshelf(shelf);
        shelf = Shelf.SortByAge(shelf, n);
        System.out.println("Самое раннее издание: " + Shelf.Earliest(shelf, n).getYear() + " " + Shelf.Earliest(shelf, n).getAuthor() + " " + Shelf.Earliest(shelf, n).getTitle());
        System.out.println("Самое позднее издание: " + Shelf.Latest(shelf, n).getYear() + " " + Shelf.Latest(shelf, n).getAuthor() + " " + Shelf.Latest(shelf, n).getTitle());
        System.out.println("Упорядоченная полка:");
        for (int i = 0; i < n; i++) {
            System.out.println(shelf[i].getYear() + " " + shelf[i].getAuthor() + " " + shelf[i].getTitle());
        }
    }
}
