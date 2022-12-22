package lab41;

public class Square2 extends Rectangle2{
    private double side;

    Square2(){};

    Square2(double side){
        this.side = side;
    }

    Square2(double side, String color, boolean filled){
        this.side = side;
        this.filled = filled;
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setLength(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square2{" +
                "side=" + side +
                '}';
    }
}
