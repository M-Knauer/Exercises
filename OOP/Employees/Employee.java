package Desafios.POO.Employees;

public class Employee {
    private String name;
    private String job;
    private double salary;

    public Employee(){}

    public Employee(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public void calculateSalary(double hours) {
        salary = 100*hours;
    }

    public void raiseSalary(double percentage) {
        salary = salary * ((percentage / 100) + 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + String.format("%.2f", salary) +
                '}';
    }
}
