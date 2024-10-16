package com.mycompany.association_aggregation_1;

public class Association_aggregation_1 {

    public static void main(String[] args) {
         Course course1 = new Course("CS101", "Computer Science", "4");
        Course course2 = new Course("DS102", "Data Structures", "3");

        Faculty faculty1 = new Faculty("Aymen", "Professor", "aymen@gmail.com", "123-456-7890", 80000, 1);
        Faculty faculty2 = new Faculty("Bisma", "Associate Professor", "bisma@gmail.com", "098-765-4321", 70000, 2);
        Faculty faculty3 = new Faculty("Zain", "Assistant Professor", "zain@gmail.com", "555-555-5555", 60000, 3);

        faculty1.assignCourse(course1);
        faculty2.assignCourse(course2);
        faculty3.assignCourse(course1);
        faculty3.assignCourse(course2);

        Department department1 = new Department("Computer Science Department");
        department1.addFaculty(faculty1);
        department1.addFaculty(faculty2);
        department1.addCourse(course1);
        department1.addCourse(course2);

        Department department2 = new Department("Information Technology Department");
        department2.addFaculty(faculty3);
        department2.addCourse(course1);
        department2.addCourse(course2);

        Department department3 = new Department("Mathematics Department");

        System.out.println(department1);
        System.out.println(department2);
        System.out.println(department3);
    }
}
