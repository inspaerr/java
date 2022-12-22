package lab4;

public class Product {
    private String name;
    private double price;
    private Measure measure;

    public Product(String name, double price, Measure measure) {
        this.name = name;
        this.price = price;
        this.measure = measure;
    }

    public double getPrice() {
        return price;
    }

    public Measure getMeasure() {
        return measure;
    }

    public String getName() {
        return name;
    }
}
