package lab41;

public class Manager extends Employer{
    private double averageSum;

    public Manager(double averageSum){
        this.averageSum = averageSum;
    }

    @Override
    public double getIncome() {
        return super.getIncome() + averageSum;
    }
}
