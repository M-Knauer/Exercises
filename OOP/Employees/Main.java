package Desafios.POO.Employees;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Bob", "Engineer", 5000);

        System.out.println(employee);
        employee.raiseSalary(10);
        System.out.println(employee);
        employee.calculateSalary(44);
        System.out.println(employee);
        employee.raiseSalary(10);
        System.out.println(employee);

    }
}
