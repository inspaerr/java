package prob3;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Student implements FormatOfData {
    private String name;
    private Calendar dateOfBirth;

    public Student(String name, Calendar dateOfBirth){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString(int n) {
        if (n == 1){ // dd.mm.yyyy
            SimpleDateFormat sdf = new SimpleDateFormat("dd.M.yy");
            return sdf.format(this.dateOfBirth.getTime());
        }
        else if (n == 2){
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
            return sdf.format(this.dateOfBirth.getTime());
        }
        else {
            SimpleDateFormat sdf = new SimpleDateFormat("dd (EEEE) MMMM yyyy");
            return sdf.format(this.dateOfBirth.getTime()) + " год";
        }
    }
}
