package prob2;

import prob1.Student;

import java.util.Arrays;
import java.util.Scanner;

public class Tester2 {
    public static void quickSort(Student[] array, int low, int high) {
        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        Student opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (sort.compare(array[i], opora) == -1) {
                i++;
            }
            while (sort.compare(array[j], opora) == 1) {
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }
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
        quickSort(students, 0, students.length - 1);
        for (int i = n - 1; i > -1; i--) {
            System.out.println(students[i].toString());
        }
    }
}
