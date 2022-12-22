package lab41;

public class Rectangle2 extends Shape2{
    protected double width;
    protected double length;

    Rectangle2(){}

    Rectangle2(double width, double length){
        this.length = length;
        this.width = width;
    }

    Rectangle2(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle2{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
