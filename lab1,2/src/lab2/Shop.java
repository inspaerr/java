package lab2;
import java.util.ArrayList;
import java.util.Scanner;

class Item{
    private int num;
    private String name;

    public Item(int num, String name) {
        this.name = name;
        this.num = num;
    }
    public int getNum() {
        return num;
    }
    public String getName() {
        return name;
    }

}
interface ShopInterface {
    void AddItem();
    void DeleteItem();
    void SearchItem();
    void OutList();
}
public class Shop implements ShopInterface {
    ArrayList<Item> computers = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void AddItem() {
        System.out.println("Введите название компьютера и номер модели");
        String name = sc.next();
        int num = sc.nextInt();
        Item computer = new Item(num, name);
        computers.add(computer);
        System.out.println("Компьютер добавлен");
    }
    public void DeleteItem() {
        System.out.println("Введите номер модели компьютера, который хотите удалить");
        int num = sc.nextInt();
        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).getNum() == num) {
                computers.remove(i);
                System.out.println("Компьютер удален");
            }
        }
    }
    public void SearchItem() {
        System.out.println("Введите номер компьютера, который хотите найти");
        int num = sc.nextInt();
        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).getNum() == num) {
                System.out.println("Найденый компьютер: " + computers.get(i).getName() + " " + computers.get(i).getNum());
            }
        }
    }
    public void OutList() {
        System.out.println("База компьютеров:");
        for (int i = 0; i < computers.size(); i++) {
            System.out.println(computers.get(i).getName() + " " + computers.get(i).getNum());
        }
    }
}

class TestShop {
    public static void main(String[] args){
        Shop shop = new Shop();
        int n;
        int StopFlag = 0;
        Scanner sc = new Scanner(System.in);
        while(StopFlag == 0) {
            System.out.println("Введите номер команды:\n 1 - добавить новый компьютер\n 2 - удалить компьютер\n 3 - найти компьютер\n 4 - вывести базу компьютеров\n 5 - завершить");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    shop.AddItem();
                    break;
                case 2:
                    shop.DeleteItem();
                    break;
                case 3:
                    shop.SearchItem();
                    break;
                case 4:
                    shop.OutList();
                    break;
                case 5:
                    StopFlag = 1;
                    break;
            }
        }
    }
}
