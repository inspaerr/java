package prob4;

public class Tester4 {
    public static void main(String args[]) {
        Product product = new Product(290.34);
        Service service = new Service(2830.21);
        System.out.println("Цены объектов классов: " + product.getPrice() + " " + service.getPrice());
    }
}
