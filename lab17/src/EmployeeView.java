//слой представления
public class EmployeeView {
    public void printSalariesOfEmployees(Prof profession, int hoursWorked){
        System.out.println("Employee salary information:\n" + profession + " " + hoursWorked * profession.getSalary() + " руб/день");
    }
}
