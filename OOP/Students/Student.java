package Desafios.POO.Students;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    String grade;
    ArrayList<String> courses = new ArrayList<>();

    public Student() {}

    public Student(String name, String grade, ArrayList<String> courses) {
        this.name = name;
        this.grade = grade;
        this.courses = courses;
    }

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
    public void addCourse(String course) {
        courses.add(course);
    }
    public void removeCourse(String course) {
        courses.remove(course);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", courses=" + courses +
                '}';
    }
}
