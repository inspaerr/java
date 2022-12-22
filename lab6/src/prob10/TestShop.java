/*package prob10;

import java.util.Scanner;

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
}*/
