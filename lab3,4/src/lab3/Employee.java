package lab3;

public class Employee {
    private String FullName;
    private double Salary;

    public void setFullName(String fullName) {
        FullName = fullName;
    }
    public void setSalary(double salary) {
        Salary = salary;
    }
    public double getSalary() {
        return Salary;
    }
    public String getFullName() {
        return FullName;
    }

}
