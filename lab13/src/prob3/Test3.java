package prob3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите разделитель:\n 1 - ,\n 2 - , . ;");
        int n = sc.nextInt();
        String str = "Russia;Yamal,Salekhard.Pushkinskaya.21;1,32";
        String[] strings;
        Address address = new Address();
        switch (n) {
            case 1 -> {
                strings = str.split(",");
                address.country = strings[0];
                address.region = strings[1];
                address.city = strings[2];
                address.street = strings[3];
                address.houseNum = strings[4];
                address.building = strings[5];
                address.flat = strings[6];
            }
            case 2 -> {
                StringTokenizer st = new StringTokenizer(str, ",.;");
                address.country = st.nextToken();
                address.region = st.nextToken();
                address.city = st.nextToken();
                address.street = st.nextToken();
                address.houseNum = st.nextToken();
                address.building = st.nextToken();
                address.flat = st.nextToken();
            }
        }
        System.out.println(address.toString());
    }
}
