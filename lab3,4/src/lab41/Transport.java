package lab41;

import java.util.Scanner;

public abstract class Transport {
    String name;
    public abstract float count_time(float kgs, float passengers);
    public abstract float count_cost(float kgs, float passengers);
    public void print_info(float kgs, float passengers){
        System.out.println("Название средства: " + name);
        System.out.println("Время на доставку: " + String.valueOf(count_time(kgs, passengers)));
        System.out.println("Стоимость доставки: " + String.valueOf(count_cost(kgs, passengers)));
    }
}

class Train extends Transport{
    public Train(){
        name = "Поезд";
    }
    @Override
    public float count_time(float kgs, float passengers) {
        return kgs * 4 + passengers * passengers;
    }

    @Override
    public float count_cost(float kgs, float passengers) {
        return kgs / 2 + 2 * passengers * 100;
    }
}

class Plane extends Transport{
    public Plane(){
        name = "Самолёт";
    }
    @Override
    public float count_time(float kgs, float passengers) {
        return 2 * kgs;
    }

    @Override
    public float count_cost(float kgs, float passengers) {
        return 4 * kgs + passengers * 500;
    }
}

class Automoblie extends Transport{
    public Automoblie(){
        name = "Машина";
    }
    @Override
    public float count_time(float kgs, float passengers) {
        return kgs * 3 + 5 * passengers * passengers;
    }

    @Override
    public float count_cost(float kgs, float passengers) {
        return kgs / 4 + 20 * passengers;
    }
}

class Ship extends Transport{
    public Ship(){
        name = "Корабль";
    }
    @Override
    public float count_time(float kgs, float passengers) {
        return kgs / 10 + passengers * 10;
    }

    @Override
    public float count_cost(float kgs, float passengers) {
        return kgs / 20 + passengers * 50;
    }
}

class TransportTester{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float kgs = sc.nextFloat();
        float passengers = sc.nextFloat();
        Transport[] transports = new Transport[]{new Automoblie(), new Train(), new Ship(), new Plane()};
        for (int i = 0; i < transports.length; i++) {
            transports[i].print_info(kgs, passengers);
        }
    }
}