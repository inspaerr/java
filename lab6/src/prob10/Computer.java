package prob10;

public class Computer {
    private BrandOfComputer brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(BrandOfComputer brand, Processor processor, Monitor monitor, Memory memory){
        this.brand = brand;
        this.memory = memory;
        this.monitor = monitor;
        this.processor = processor;
    }

    public BrandOfComputer getBrand() {
        return brand;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Processor getProcessor() {
        return processor;
    }
}
