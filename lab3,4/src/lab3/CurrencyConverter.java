package lab3;

public class CurrencyConverter {
    private double cost;

    public void setCost(double cost) {
        this.cost = cost;
    }
    public double getCost() {
        return cost;
    }
    public double toEuro(){
        cost /= 60.8571;
        return cost;
    }
    public double toDollars(){
        cost /= 60.4696;
        return cost;
    }
    public double toPounds(){
        cost /= 69.4856;
        return cost;
    }
    public double toYuans(){
        cost /= 87.3512;
        return cost;
    }
}
