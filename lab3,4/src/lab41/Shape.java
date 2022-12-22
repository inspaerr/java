package lab41;

abstract class Shape {
    String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType(){
        return type;
    };
    public abstract double getArea();
    public abstract double getPerimeter();
}
