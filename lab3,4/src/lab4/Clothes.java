package lab4;

public abstract class Clothes{
    public String name;
    private Size size;
    private double price;
    private String color;

    public void setPrice(double price) {
        this.price = price;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSize(Size size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public double getPrice() {
        return price;
    }
    public Size getSize() {
        return size;
    }
    public void setName() {

    }

}
