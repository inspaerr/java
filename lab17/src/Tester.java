public class Tester {
    public static void main(String[] args) {
        Employee model = retriveCourseFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        //update model data
        controller.setEmployeeProfession(Prof.CASHIER);
        System.out.println("After updating, Salary Details are as follows");
                controller.updateView();
    }
    private static Employee retriveCourseFromDatabase(){
        Employee employee = new Employee();
        employee.setProfession(Prof.CONSULTANT);
        employee.setHoursWorked(10);
        return employee;
    }
}
