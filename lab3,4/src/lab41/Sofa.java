package lab41;

public class Sofa extends Furniture{
    public int pillows_count;
    public boolean is_folding;

    @Override
    public String toString() {
        return "Sofa{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", pillows_count=" + pillows_count +
                ", is_folding=" + is_folding +
                '}';
    }

    public Sofa(int length, int width, int height, int price, String name, int pillows_count, boolean is_folding){
        this.length = length;
        this.width = width;
        this.height = height;
        this.price = price;
        this.name = name;
        this.pillows_count = pillows_count;
        this.is_folding = is_folding;
    }
}
