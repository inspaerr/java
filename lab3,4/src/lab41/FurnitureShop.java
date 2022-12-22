package lab41;

import java.util.Scanner;

public class FurnitureShop {
    public static void main(String[] args) {
        Furniture[] items = new Furniture[4];
        items[0] = new Chair(30, 30, 90, 60, "Модный стул", 15, 60);
        items[1] = new Chair(20, 20, 60, 100, "Низкий модный стул", 50, 40);
        items[2] = new Sofa(260, 50, 100, 250, "Складной диван", 4, true);
        items[3] = new Sofa(150, 60, 120, 200, "Нескладной диван", 3, false);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 0 - для вывода названий товара, номер товара - для отображения товара, -1 для выхода");
        int n1 = sc.nextInt();
        while (n1 != -1) {
            if (n1 == 0) {
                for (int n = 0; n < 4; n++) {
                    System.out.println(n + 1 + " - " + items[n].name);
                }
            } else if (n1 >= 1 & n1 <= 4) {
                System.out.println(items[n1-1].toString());
            } else {
                System.out.println("Введено неправильное значение");
            }
            n1 = sc.nextInt();
        }
    }
}
