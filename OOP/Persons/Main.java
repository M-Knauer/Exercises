package Desafios.POO.Persons;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Marcelo", 26);
        System.out.printf("""
                Name: %s
                Age: %d
                """, person.getName(), person.getAge());
    }
}
