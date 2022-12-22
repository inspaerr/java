package prob3;

/*Напишите программу, которая объединяет два списка данных о
студентах в один отсортированный список с использованием алгоритма
сортировки слиянием.*/
//сортировка по id
import prob1.Student;

import java.util.ArrayList;
import java.util.Scanner;


public class Tester3 {
    static void merge(Student[] array, int left, int mid, int right) {
        // вычисляем длину
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        // создаем временные подмассивы
        Student[] leftArray = new Student[lengthLeft];
        Student[] rightArray = new Student[lengthRight];

        // копируем отсортированные массивы во временные
        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left + i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid + i + 1];

        // итераторы содержат текущий индекс временного подмассива
        int leftIndex = 0;
        int rightIndex = 0;

        // копируем из leftArray и rightArray обратно в массив
        for (int i = left; i < right + 1; i++) {
            // если остаются нескопированные элементы в R и L, копируем минимальный
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex].getId() < rightArray[rightIndex].getId()) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            // если все элементы были скопированы из rightArray, скопировать остальные из leftArray
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            // если все элементы были скопированы из leftArray, скопировать остальные из rightArray
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }


    public static void mergeSort(Student[] array, int left, int right) {
        if (right <= left) return;
        int mid = (left+right)/2;
        mergeSort(array, left, mid);
        mergeSort(array, mid+1, right);
        merge(array, left, mid, right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во студентов в первой группе");
        int n1 = sc.nextInt();
        ArrayList<Student> students1 = new ArrayList<Student>();
        for (int i = 0; i < n1; i++){
            Student student = new Student(random (0, 100), n1 - 1 - i);
            students1.add(student);
        }
        System.out.println("Введите кол-во студентов во второй группе");
        int n2 = sc.nextInt();
        ArrayList<Student> students2 = new ArrayList<Student>();
        for (int i = 0; i < n2; i++){
            Student student = new Student(random (0, 100), n2 + n1 - 1 - i);
            students2.add(student);
        }
        Student[] array = new Student[n1 + n2];
        for (int i = 0; i < n1; i++){
            array[i] = students1.get(i);
        }
        int j = 0;
        for (int i = n1; i < n1 + n2; i++) {
            array[i] = students2.get(j);
            j++;
        }
        mergeSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i].getId());
        }
    }
    public static int random(int min, int max) //функция получения псевдорандомного числа
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}