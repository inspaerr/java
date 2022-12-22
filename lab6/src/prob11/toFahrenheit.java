package prob11;

public class toFahrenheit implements Convertable{
    @Override
    public double convert(double celsius) {
        return celsius * 1.8 + 32;
    }
}
