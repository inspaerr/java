package prob10;

public class Processor {
    private int cores; //ядра
    private int hz;

    public Processor(int cores, int hz){
        this.cores = cores;
        this.hz = hz;
    }

    public int getCores() {
        return cores;
    }

    public int getHz() {
        return hz;
    }
}
