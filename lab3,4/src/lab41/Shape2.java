package lab41;

public abstract class Shape2 {
    protected String color;
    protected boolean filled;

    Shape2(){}

    Shape2(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getPerimeter();
    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape2{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
