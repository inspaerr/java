package prob4;

public class Service implements Priceable{
    private double price;

    public Service(double price){
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
