package com.school;

public class Student {
    private static int nextStudentIdCounter = 1;
    private int StudentId;
    private String name;

    public Student(String name) {
        this.StudentId = nextStudentIdCounter++;
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + this.StudentId + ", Name: " + this.name);
    }
}
