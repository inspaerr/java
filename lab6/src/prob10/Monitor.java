package prob10;

public class Monitor {
    private int hz; //герц
    private double diagonal;

    public Monitor(int hz, double diagonal){
        this.diagonal = diagonal;
        this.hz = hz;
    }

    public int getHz() {
        return hz;
    }

    public double getDiagonal() {
        return diagonal;
    }
}
