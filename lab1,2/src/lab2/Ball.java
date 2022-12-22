package lab2;
import java.util.Scanner;
import java.lang.*;

class Ball {
    private double x;
    private double y;

    public Ball() {}
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setXY(double x, double y) {
        setX(x);
        setY(y);
    }
    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }
    @Override
    public String toString() {
        return "Ball{" + "x = " + x + " y = " + y + "}";
    }
}

class TestBall {
    public static void main(String[] args) {
        double x, y, x2, y2;
        double xDisp, yDisp;
        Ball ball = new Ball();
        System.out.println("Введите координаты x и y до перемещения мяча");
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        ball.setX(x);
        y = sc.nextDouble();
        ball.setY(y);

        System.out.println("Введите координаты перемещения по x и y");
        xDisp = sc.nextDouble();
        yDisp = sc.nextDouble();
        ball.move(xDisp, yDisp);

        System.out.println("Координаты мяча после перемещения:" + ball.getX() + " " + ball.getY());

        System.out.println("Введите координаты мяча еще раз...");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        ball.setXY(x2, y2);
        System.out.println(ball);
    }
}

