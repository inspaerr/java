package prob4;

public class MathFunc implements MathCalculable{
    @Override
    public double Exponentiation(double x, double n) {
        return Math.pow(x, n);
    }

    @Override
    public double ComplexNumModulus(int a, int b) {
        return Math.pow(a*a + b*b, 0.5);
    }
}
