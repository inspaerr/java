import java.util.*;

public class LabClass {
    public static void FindStudent(ArrayList<Student[]> iDNumber, String firstName, String lastName) throws StudentNotFoundException{
        Student FoundStudent = null;
        int num = 0;
        for (int i = 0; i < iDNumber.size(); i++){
            for (int j = 0; j < iDNumber.get(i).length; j++) {
                if (Objects.equals(iDNumber.get(i)[j].getName(), firstName) && Objects.equals(iDNumber.get(i)[j].getSurname(), lastName)){
                    FoundStudent = iDNumber.get(i)[j];
                    num = i;
                }
            }
        }
        if (FoundStudent != null){
            System.out.println("Студент найдет в списке номер " + num + ", " + FoundStudent.toString());
        }
        else throw new StudentNotFoundException("Student is not found");
    }

    public static Student[] merge_sort(Student[] a1, Student[] a2, Comparator<Student> comp) {
        Student[] input = new Student[a1.length + a2.length];
        System.arraycopy(a1, 0, input, 0, a1.length);
        System.arraycopy(a2, 0, input, a1.length, a2.length);
        m_Sort(input, 0, input.length - 1, comp);
        return input;
    }


    private static void m_Sort(Student[] a, int from, int to, Comparator<Student> comp) {
        if (from == to)
            return;
        int mid = (from + to) / 2;

        m_Sort(a, from, mid, comp);
        m_Sort(a, mid + 1, to, comp);
        merge(a, from, mid, to, comp);
    }

    private static void merge(Student[] a, int from, int mid, int to, Comparator<Student> comp) {
        int n = to - from + 1;
        Object[] values = new Object[n];

        int fromValue = from;

        int middleValue = mid + 1;

        int index = 0;

        while (fromValue <= mid && middleValue <= to) {
            if (comp.compare(a[fromValue], a[middleValue]) < 0) {
                values[index] = a[fromValue];
                fromValue++;
            } else {
                values[index] = a[middleValue];
                middleValue++;
            }
            index++;
        }

        while (fromValue <= mid) {
            values[index] = a[fromValue];
            fromValue++;
            index++;
        }
        while (middleValue <= to) {
            values[index] = a[middleValue];
            middleValue++;
            index++;
        }

        for (index = 0; index < n; index++)
            a[from + index] = (Student) values[index];
    }

    private static int qui_sort(Student[] a, int begin, int end, Comparator<Student> comp) {
        Student pivot = a[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (comp.compare(a[j], pivot) > -1) {
                i++;

                Student swapTemp = a[i];
                a[i] = a[j];
                a[j] = swapTemp;
            }
        }

        Student swapTemp = a[i + 1];
        a[i + 1] = a[end];
        a[end] = swapTemp;
        return i + 1;

    }

    public static void quick_sort(Student[] a, int begin, int end) {
        Comparator<Student> comp = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                if (s1.getGPA() > s2.getGPA()) {
                    return 1;
                } else if (s1.getGPA() < s2.getGPA()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        if (begin < end) {
            int partInd = qui_sort(a, begin, end, comp);
            quick_sort(a, begin, partInd - 1);
            quick_sort(a, partInd + 1, end);
        }

    }

    public static void array_out(Student[] a) {
        for (Student s :
                a) {
            System.out.println(s.toString());
        }
    }

    public static Student[] set_array(int length) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Введите имя, фамилию, специальность, группу, курс, баллы: ");
            String name = sc.next();
            String surname = sc.next();
            String specialize = sc.next();
            String group = sc.next();
            int curse = sc.nextInt();
            int gpa = sc.nextInt();
            students[i] = new Student(name, surname, specialize, group, curse, gpa);
        }
        return students;
    }

    public static Comparator<Student> choice_comp(int a) {
        switch (a) {
            case 1:
                Comparator<Student> comp = new Comparator<Student>() {
                    public int compare(Student s1, Student s2) {
                        int res = s1.getName().compareTo(s2.getName());
                        return res;
                    }
                };
                return comp;
            case 2:
                Comparator<Student> comp1 = new Comparator<Student>() {
                    public int compare(Student s1, Student s2) {
                        if (s1.getCurse() > s2.getCurse()) {
                            return 1;
                        } else if (s1.getCurse() < s2.getCurse()) {
                            return -1;
                        } else {
                            return 0;
                        }
                    }
                };
        }
        Comparator<Student> comp = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                if (s1.getGPA() > s2.getGPA()) {
                    return 1;
                } else if (s1.getGPA() < s2.getGPA()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        return comp;
    }
}
