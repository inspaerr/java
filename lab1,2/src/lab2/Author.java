package lab2;

import java.io.IOException;
import java.util.Scanner;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender){
        this.email = email;
        this.name = name;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return "Author{" + "name = " + name + " email = " + email + " gender = " + gender + "}";
    }
}

class TestAuthor {
    public static void main(String[] args) throws IOException {
        String email, email2, name;
        char gender;
        System.out.println("Введите адрес электронной почты, имя и пол...");
        Scanner sc = new Scanner(System.in);
        email = sc.next();
        name = sc.next();
        gender = (char) System.in.read();
        Author author = new Author(name, email, gender);

        System.out.println("Почта: " + author.getEmail() + ", имя: " + author.getName() + ", пол: " + author.getGender());

        System.out.println("Задайте адрес электронной почты заново...");
        email2 = sc.next();
        author.setEmail(email2);
        System.out.println(author);

    }
}
