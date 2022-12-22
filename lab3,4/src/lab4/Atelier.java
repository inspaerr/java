package lab4;

import java.util.Objects;
import java.util.Scanner;

public class Atelier{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tshirt tshirt = new Tshirt();
        tshirt.setName();
        Skirt skirt = new Skirt();
        skirt.setName();
        Tie tie = new Tie();
        tie.setName();
        Pants pants = new Pants();
        pants.setName();
        Clothes[] mass = new Clothes[]{tshirt, skirt, tie, pants};
        for (int i = 0; i < mass.length; i++) {
            System.out.println("Введите цвет, размер (XXS, XS, S...L), цену товара " + mass[i].name);
            String color = sc.next();
            mass[i].setColor(color);
            Size size = null;
            String size1 = sc.next();
            if (Objects.equals(size1, "XXS")) {
                size = Size.XXS;
            } else if (Objects.equals(size1, "XS")) {
                size = Size.XS;
            } else if (Objects.equals(size1, "S")) {
                size = Size.S;
            } else if (Objects.equals(size1, "M")) {
                size = Size.M;
            } else if (Objects.equals(size1, "L")) {
                size = Size.L;
            }
            mass[i].setSize(size);
            Double price = sc.nextDouble();
            mass[i].setPrice(price);


        }
        dressWoman(mass);
        dressMan(mass);
    }
    public static void dressWoman(Clothes[] mass) {
        System.out.println("Женская одежда:");
        for (int i = 0; i < mass.length; i++){
            if(!Objects.equals(mass[i].name, "Галстук")){
                System.out.println(mass[i].name + ": " + mass[i].getSize() + " " + mass[i].getColor() + " " + mass[i].getPrice() + " рублей");
            }
        }
        System.out.println("\n");
    }
    public static void dressMan(Clothes[] mass) {
        System.out.println("Мужская одежда:");
        for (int i = 0; i < mass.length; i++){
            if(!Objects.equals(mass[i].name, "Юбка")){
                System.out.println(mass[i].name + ": " + mass[i].getSize() +" " + mass[i].getColor() + " " + mass[i].getPrice() + " рублей");
            }
        }
    }
}

