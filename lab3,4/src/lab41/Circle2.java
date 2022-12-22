package lab41;

public class Circle2 extends Shape2{
    protected double radius;

    Circle2(){}

    Circle2(double radius){
        this.radius = radius;
    }

    Circle2(double radius,String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle2{" +
                "radius=" + radius +
                '}';
    }
}
