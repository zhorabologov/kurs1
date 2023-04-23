import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee ("Петров Петр Петрович" , 1 , 10000);
        employees[1] = new Employee ("Иванов Иван Иванович" , 3 , 20000);
        employees[2] = new Employee ("Сидоров Сидор Сидорович" , 4 , 30000);
        employees[3] = new Employee ("Николаев Николай Николаевич" , 5 , 40000);
        employees[4] = new Employee ("Пупкин Степан Аркадьевич" , 2 , 50000);
        employees[5] = new Employee ("Евдокимов Евдоким Евдокимович" , 3, 60000);
        employees[6] = new Employee ("Захаров Захар Закорович" , 4 , 70000);
        employees[7] = new Employee ("Никитин Никита Никитович" , 1 , 80000);
        employees[8] = new Employee ("Кривошеев Сергей Анатольевич" , 2 , 90000 );
        employees[9] = new Employee ("Петровский Александр Владимирович" , 2 , 220000);


        for (Employee i : employees){
            System.out.println (i);

}
        printEmployees (employees);

        int totalSalary = calculateTotalSalary (employees);
        System.out.println ("Сумма затрат на зарплату = " + calculateTotalSalary (employees));

        Employee employeeWithMinSalary = getEmployeeWithMinSalary (employees);
        System.out.println ("Сотрудник с минимальной зарплатой = " + employeeWithMinSalary);

        Employee employeeWithMaxSalary = getEmployeeWithMaxSalary (employees);
        System.out.println ("Сотрудник с максимальной зарплатой = " + employeeWithMaxSalary);

        double averageSalary = calculateAverageSalary (employees);
        System.out.println ("Средняя зарплата = " + averageSalary);

        System.out.println ("ФИО сотрудников: ");
        printFullNameEmployees (employees);



        for (int i = 0; i < employees.length; i++) {
            System.out.println (employees[i]);
        }

    }

    private static void printFullNameEmployees(Employee[] employees) {
    }

    private static void printEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i ++) {
            System.out.println(employees[i]);
        }
    }

    private static int calculateTotalSalary(Employee[] employees) {
        int totalSalary = 0;
        for (int i = 0; i < employees.length; i ++) {
            totalSalary += employees[i].getSalary();
        }

        return totalSalary;

    }

    private static Employee getEmployeeWithMinSalary(Employee[] employees) {
        Employee result = employees[0];

        for (Employee employee : employees) {
            if (employee.getSalary () < result.getSalary()) {
                result = employee;
            }
        }

        return result;
    }

    private static Employee getEmployeeWithMaxSalary(Employee[] employees) {
        Employee result = employees[9];

        for (Employee employee : employees) {
            if (employee.getSalary () > result.getSalary ()) {
                result = employee;
            }
        }

        return result;
    }

    private static double calculateAverageSalary(Employee[] employees) {
        int totalSalary = calculateTotalSalary (employees);
        return (double) totalSalary / employees.length;
    }

}