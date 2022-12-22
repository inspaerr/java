package lab3;
import java.util.Scanner;

public class Shop {
    public static void main(String args[]) {
        int cost = 0;
        int v;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        while (n != 6) {
            System.out.println("Введите номер товара, которые хотите добавить корзину:\n1 - лимоны (52 рубля)\n2 - курица (230 рублей)\n3 - огурцы (74 рубля) \n4 - грибы (198 рублей)\n5 - вода (60 рублей)\n6 - подсчитать сумму цен товаров");
            n = sc.nextInt();
            switch (n) {
                case 1 -> cost += 52;
                case 2 -> cost += 230;
                case 3 -> cost += 74;
                case 4 -> cost += 198;
                case 5 -> cost += 60;
            }
        }
        System.out.println("Полученная сумма = " + cost + " рублей");

        CurrencyConverter converter = new CurrencyConverter();
        converter.setCost(cost);
        System.out.println("Выберите валюту, в которую перевести сумму:\n 1 - USD(Доллар США)\n 2 - EUR(Евро)\n 3 - GBP(Фунт стерлингов)\n 4 - CNY(Китайский юань)");
        v = sc.nextInt();
        switch (v) {
            case 1 -> System.out.println("В итоге: " + converter.toDollars() + " USD");
            case 2 -> System.out.println("В итоге: " + converter.toEuro() + " EUR");
            case 3 -> System.out.println("В итоге: " + converter.toPounds() + " GBP");
            case 4 -> System.out.println("В итоге: " + converter.toYuans() + " CNY");
        }
    }
}
