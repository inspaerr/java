package prob2;

import prob1.Student;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGPA() == o2.getGPA()) {
            return 0;
        }
        if (o1.getGPA() > o2.getGPA()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
