package Desafios.POO.Students;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Marcelo", "Médio");

        System.out.println(s);
        s.addCourse("Lógica");
        s.addCourse("Matemática");
        s.addCourse("Inglês");
        System.out.println(s);
        s.removeCourse("Inglês");
        System.out.println(s);

    }
}
