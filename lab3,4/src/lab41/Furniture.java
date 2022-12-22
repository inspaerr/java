package lab41;

public abstract class Furniture {
    public int length;
    public int width;
    public int height;
    public int price;
    public String name;

    public String toString() {
        return "Furniture{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}

