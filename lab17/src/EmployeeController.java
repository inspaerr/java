//уровень контроллера
public class EmployeeController {
    private Employee model;
    private EmployeeView view;
    public EmployeeController(Employee model, EmployeeView view){
        this.model = model;
        this.view = view;
    }
    public void setEmployeeHoursWorked(int hoursWorked){
        model.setHoursWorked(hoursWorked);
    }
    public int getEmployeeName(){
        return model.getHoursWorked();
    }
    public Prof getEmployeeProfession(){
        return model.getProfession();
    }
    public void setEmployeeProfession(Prof profession){
        model.setProfession(profession);
    }

    public void updateView(){
        view.printSalariesOfEmployees(model.getProfession(), model.getHoursWorked());
    }
}
