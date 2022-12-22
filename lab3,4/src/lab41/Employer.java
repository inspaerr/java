package lab41;

public class Employer {
    private String firstName;
    private String lastName;
    private double income;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getIncome() {
        return income;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
