package lab41;

public class Square extends Shape{
    double a;

    public Square (double a){
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }
}
