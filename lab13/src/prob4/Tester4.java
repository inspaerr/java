package prob4;

public class Tester4 {
    public static void main(String[] args) {
        String[] shirts1 = {"S002,Black Polo Shirt,Black,L", "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M", "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL", "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L", "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S", "S011,Maroon Polo Shirt,Maroon,S"};
        Shirt[] shirts2 = new Shirt[10];
        String[] params;
        for (int i = 0; i < 10; i++){
            params = shirts1[i].split(",");
            Shirt shirt = new Shirt();
            shirt.setId(params[0]);
            shirt.setName(params[1]);
            shirt.setColor(params[2]);
            shirt.setSize(params[3]);
            shirts2[i] = shirt;
        }
        for (int i = 0; i < 10; i++){
            System.out.println(shirts2[i].toString());
        }
    }
}
