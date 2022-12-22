import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LabClassUI {
    public static void main(String[] args) throws StudentNotFoundException {
        ArrayList<Student[]> iDNumber = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int i;
        while (n != 0){
            System.out.println("Выберите команду");
            System.out.println("Всего списков студентов: " + iDNumber.size());
            System.out.println("1. Заполнить список студентов\n" +
                    "2. Сортировка списка студентов по баллам\n" +
                    "3. Вывод списка студентов\n" +
                    "4. Объединить списки студентов\n" +
                    "5. Найти студента\n" +
                    "0. Выход");
            n = sc.nextInt();
            switch (n){
                case 1:
                    System.out.println("Введите длину списка: ");
                    int length = sc.nextInt();
                    iDNumber.add(LabClass.set_array(length));
                    break;
                case 2:
                    System.out.println("Введите номер сортируемого списка: ");
                    i = sc.nextInt();
                    LabClass.quick_sort(iDNumber.get(i),0,iDNumber.get(i).length - 1);
                    System.out.println("Сортировка успешна! ");
                    break;
                case 3:
                    System.out.println("Введите номер списка для вывода:");
                    i = sc.nextInt();
                    LabClass.array_out(iDNumber.get(i));
                    break;
                case 4:
                    System.out.println("Введите номер поля сравниения: \n" +
                            "1. По имени\n" +
                            "2. По курсу\n" +
                            "3. По баллам\n");
                    int s = sc.nextInt();
                    Comparator<Student> comp = LabClass.choice_comp(s);
                    System.out.println("Введите номера списков для объеденения");
                    i = sc.nextInt();
                    int j = sc.nextInt();
                    System.out.println("Списки объединены:\n" + Arrays.toString(LabClass.merge_sort(iDNumber.get(i), iDNumber.get(j), comp)));
                    break;
                case 5:
                    System.out.println("Введите имя и фамилию искомого студента");
                    String firstName = sc.next();
                    String lastName = sc.next();
                    LabClass.FindStudent(iDNumber, firstName, lastName);
                    break;
            }
        }

    }

}
