package prob6;


import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws OrderAlreadyAddedException {
        var orderManager = new OrderManager();
        orderManager.add("100", new InternetOrder(new Item[]{
                new Dish("soup", "good soup", 100),
                new Dish("soup", "good soup", 100),
        }));
        orderManager.add("100", new InternetOrder(new Item[]{
                new Dish("soup", "good soup", 100),
                new Dish("soup", "good soup", 100),
        }));
        System.out.println(Arrays.toString(Arrays.stream(orderManager.getOrders()).toArray()));
    }
}
