package lab4;

import java.util.Objects;
import java.util.Scanner;

public class TestSeasons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fav;
        Seasons favourite = null;
        System.out.println("Введите название Вашего любомого времени года");
        fav = sc.next();
        if (Objects.equals(fav, "лето")) {favourite = Seasons.лето;}
        else if (Objects.equals(fav, "зима")) {favourite = Seasons.зима;}
        else if (Objects.equals(fav, "весна")) {favourite = Seasons.весна;}
        else if (Objects.equals(fav, "осень")) {favourite = Seasons.осень;}
        Favourite(favourite);
        favourite.getDescription();
        System.out.println("Время года и средняя температура");
        for (Seasons season : Seasons.values()) {
            System.out.println(season);
        }
        for (TempSeasons temp : TempSeasons.values()) {
            System.out.println(temp.getTemp());
        }
    }
    public static void Favourite(Seasons season) {
        switch (season) {
            case лето:
                System.out.println("Я люблю лето");
                break;
            case зима:
                System.out.println("Я люблю зиму");
            case осень:
                System.out.println("Я люблю осень");
            case весна:
                System.out.println("Я люблю весну");
        }
    }
}
