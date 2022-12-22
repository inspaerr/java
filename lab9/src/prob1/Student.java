package prob1;

public class Student {
    private double GPA;
    private int id;

    public Student(double GPA, int id){
        this.GPA = GPA;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGPA() { return GPA;}

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "GPA=" + GPA +
                ", id=" + id +
                '}';
    }
}