package lab41;

public class Chair extends Furniture{
    public int diameter;
    public int leg_height;

    @Override
    public String toString() {
        return "Chair{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", price=" + price +
                ", name='" + name +
                ", diameter=" + diameter +
                ", leg_height=" + leg_height +
                '}';
    }

    public Chair(int length, int width, int height, int price, String name, int diameter, int leg_height){
        this.length = length;
        this.width = width;
        this.height = height;
        this.price = price;
        this.name = name;
        this.diameter = diameter;
        this.leg_height = leg_height;
    }
}
