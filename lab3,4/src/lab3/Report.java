package lab3;

import java.util.Scanner;

public class Report {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество работников");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите имя работника и его зарплату");
            String name = sc.next();
            Double salary = sc.nextDouble();
            Employee employee = new Employee();
            employee.setFullName(name);
            employee.setSalary(salary);
            employees[i] = employee;
        }
        generateReport(employees);
    }
    public static void generateReport(Employee[] employees){
        System.out.printf("%-40s%s\n","Работник","Зарплата");
        for (int i = 0; i < employees.length; i++) {
            System.out.printf("%-40s%.2f\n",employees[i].getFullName(), employees[i].getSalary());
        }
    }
}
