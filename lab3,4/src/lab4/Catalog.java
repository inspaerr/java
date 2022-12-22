package lab4;

public class Catalog {
    private String name;
    Product[] mass = new Product[2];
    public Catalog(String name, Product[] mass) {
        this.name = name;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }
}
