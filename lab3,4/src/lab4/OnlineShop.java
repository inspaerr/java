package lab4;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class OnlineShop {

    public static void ShowCatalog(int n, Catalog[] catalogs) {
        for (int i = 0; i < catalogs[n].mass.length; i++) {
            System.out.println(i + ") " + catalogs[n].mass[i].getName() + " " + catalogs[n].mass[i].getPrice() + " руб/" + catalogs[n].mass[i].getMeasure());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product bread = new Product("хлеб", 30, Measure.штука);
        Product bun = new Product("булочка", 26,Measure.штука);
        Product[] bakery = new Product[]{bread, bun};

        Product milk = new Product("молоко", 120.4, Measure.литр);
        Product yougurt = new Product("йогурт", 210,Measure.литр);
        Product[] daily = new Product[]{milk, yougurt};

        Product tomato = new Product("помидор", 101, Measure.кг);
        Product onion = new Product("лук", 54.3, Measure.кг);
        Product[] greens = new Product[]{tomato, onion};

        Catalog Bakery = new Catalog("Пекарня", bakery);
        Catalog Daily = new Catalog("Молочные продукты", daily);
        Catalog Greens = new Catalog("Овощи и фрукты", greens);
        Catalog[] catalogs = new Catalog[]{Bakery, Greens, Daily};

        ArrayList<String> users = new ArrayList<String>();
        ArrayList<String> passwords = new ArrayList<String>();
        ArrayList<Product> cart = new ArrayList<Product>();
        boolean StopFlag = false;
        while (!StopFlag) {
            System.out.println("Введите номер команды:\n 1 - Регистрация\n 2 - Вход\n 3 - Просмотр каталогов товаров\n 4 - Вывести чек\n 5 - Выход");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Зарегистрируйтесь, введите имя пользователя и пароль");
                    String login = sc.next();
                    String password = sc.next();
                    users.add(login);
                    passwords.add(password);
                    break;
                case 2:
                    System.out.println("Для входа введите имя пользователя и пароль");
                    login = sc.next();
                    password = sc.next();
                    if (users.contains(login)) {
                        if (Objects.equals(passwords.get(users.indexOf(login)), password)) {System.out.println("Вы вошли");}
                    }
                    else {System.out.println("Такого пользователя не сущесвует");}
                    break;
                case 3:
                    System.out.println("Выберите номер каталога");
                    for (int i = 0; i < catalogs.length; i++) {System.out.println(i + " " + catalogs[i].getName());}
                    int k = sc.nextInt();
                    ShowCatalog(k, catalogs);
                    int num;
                    System.out.println("Введите номер/номера товаров для добавления в корзину, -1 - для завершения");
                    num = sc.nextInt();
                    while(num != -1) {
                        cart.add(catalogs[k].mass[num]);
                        num = sc.nextInt();
                    }
                    break;
                case 4:
                    double cost = 0;
                    for (int i = 0; i < cart.size(); i++) {
                        System.out.println("-------------------------");
                        System.out.println(cart.get(i).getName() + " " + cart.get(i).getPrice());
                        cost += cart.get(i).getPrice();
                    }
                    System.out.println("-------------------------");
                    System.out.println("ОБЩАЯ СУММА: " + cost);
                    break;
                case 5:
                    StopFlag = true;
                    break;
            }
        }
    }
}