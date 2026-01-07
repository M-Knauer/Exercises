package Desafios.LambdaExpression.SortByAttribute;

import Desafios.LambdaExpression.SortByAttribute.Models.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(List.of(
                new Person("Adriana Jamie", 15, "Female"),
                new Person("adriana Jamie", 15, "Female"),
                new Person("Micaela Rosana", 15, "Female"),
                new Person("Jair Camila", 14, "Male"),
                new Person("Conceicao Palmira", 14, "Female"),
                new Person("Felix Uisdean", 15, "Male")
        ));

        System.out.println("""
                Sort by:
                1 - Name
                2 - Age
                3 - Gender
                4 - Age in descending order
                5 - Gender and filter by a string
                """);
        Scanner sc = new Scanner(System.in);

        System.out.print("Option: ");
        int opt = sc.nextInt();



        List<Person> personsCopy = new ArrayList<>(List.copyOf(persons));

        switch (opt) {
            case 1:
                personsCopy.sort(Comparator.comparing(Person::getName, String.CASE_INSENSITIVE_ORDER));
                System.out.println("\n- Sorted by name -");
                break;
            case 2:
                personsCopy.sort(Comparator.comparingInt(Person::getAge)
                        .thenComparing(Person::getName, String.CASE_INSENSITIVE_ORDER));
                System.out.println("\n- Sorted by age -");
                break;
            case 3:
                personsCopy.sort(Comparator.comparing(Person::getGender));
                System.out.println("\n- Sorted by gender -");
                break;
            case 4:
                personsCopy.sort(Comparator.comparingInt(Person::getAge).reversed());
                System.out.println("\n- Sorted by age in descending order -");
                break;
            case 5:
                System.out.print("\nType a string: ");
                String string = sc.next();
                personsCopy = List.copyOf(persons.stream().sorted(Comparator.comparing(Person::getGender))
                        .filter(p -> p.getName().contains(string)).toList());
                break;
            default:
                System.out.println("Invalid option.");
                return;
        }
        sc.close();

        personsCopy.forEach(p ->
                System.out.printf("%s - %d - %s%n", p.getName(), p.getAge(), p.getGender()));
    }
}
