import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee ("Петров Петр Петрович" + i, 1+ (i % 5), 10000 * (i + 1));
        }
        System.out.println ("Сотрудники компании");
        printEmployees (employees);

        int totalSalary = calculateTotalSalary (employees);
        System.out.println ("Сумма затрат на зарплату = " + calculateTotalSalary (employees));

        Employee employeeWithMinSalary = getEmployeeWithMinSalary (employees);
        System.out.println ("Сотрудник с минимальной зарплатой = " + employeeWithMinSalary());

        Employee employeeWithMaxSalary = getEmployeeWithMaxSalary (employees);
        System.out.println ("Сотрудник с максимальной зарплатой = " + employeeWithMaxSalary());

        for (int i = 0; i < employees.length; i++) {
            System.out.println (employees[i]);
        }

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
        Employee result = employees[0];

        for (Employee employee : employees) {
            if (employee.getSalary () > result.getSalary ()) {
                result = employee;
            }
        }

        return result;
    }


}