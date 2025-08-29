package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main { 
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Madhu");
        students[1] = new Student("Hari");
        students[2] = new Student("John");

        Course[] courses = new Course[3];
        courses[0] = new Course("Java");
        courses[1] = new Course("Python");
        courses[2] = new Course("C++");

        System.out.println("Students:");
        for (Student s : students) {
            s.displayDetails();
        }

        System.out.println("\nCourses:");
        for (Course c : courses) {
            c.displayDetails();
        }

        // Attendance log
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        // Add some attendance records (including invalid one)
        attendanceLog.add(new AttendanceRecord(students[0].getStudentId(), courses[0].getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(students[1].getStudentId(), courses[1].getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(students[2].getStudentId(), courses[2].getCourseId(), "Late")); // Invalid
        attendanceLog.add(new AttendanceRecord(students[0].getStudentId(), courses[1].getCourseId(), "present"));

        System.out.println("\n--- Attendance Log ---");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}
