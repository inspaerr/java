package prob1;

import java.util.Scanner;

public class Tester1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во студентов");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++){
            System.out.println("Введите id и итоговый балл " + (i+1) + "-ого студента");
            int id = sc.nextInt();
            double GPA = sc.nextDouble();
            Student student = new Student(GPA, id);
            students[i] = student;
        }
        for (int i = 1; i < students.length; i++) {
            int current = students[i].getId();
            int j = i - 1;
            while(j >= 0 && current < students[j].getId()) {
                students[j+1].setId(students[j].getId());
                j--;
            }
            // в этой точке мы вышли, так что j так же -1
            // или в первом элементе, где текущий >= a[j]
            students[j+1].setId(current);
        }
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].getId() + " ");
        }
    }
}
