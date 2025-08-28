package com.school;

public class Main { 
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("madhu");
        students[1] = new Student("hari");
        students[2] = new Student("john");

        Course[] courses = new Course[3];
        courses[0] = new Course("java");
        courses[1] = new Course("python");
        courses[2] = new Course("c++");

        System.out.println("Students:");
        for (Student s : students) {
            s.displayDetails();
        }

        System.out.println("Courses:");
        for (Course c : courses) {
            c.displayDetails();
        }
    }
}

