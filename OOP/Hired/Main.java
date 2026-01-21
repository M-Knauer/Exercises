package Desafios.POO.Hired;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Marcelo", 9950.00,
                LocalDate.of(1998, 9, 9));

        System.out.println("Anos de serviço: "+employee.getYearOfService());

    }
}

