//слой модели
//расчет заработной платы сотрудника предприятия
public class Employee {
    private Prof profession;
    private int HoursWorked;

    public void setHoursWorked(int hoursWorked) {
        HoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return HoursWorked;
    }

    public Prof getProfession() {
        return profession;
    }

    public void setProfession(Prof profession) {
        this.profession = profession;
    }
}
