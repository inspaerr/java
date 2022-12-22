package lab3;

public class Circle {
    private Point center;
    private double radius;

    public Circle() {}

    public Point getCenter() { return center; }
    public double getRadius(){
        return radius;
    }
    public void setCenter(Point center) { this.center = center; }
    public void setRadius(double radius){
        this.radius = radius;
    }
}
