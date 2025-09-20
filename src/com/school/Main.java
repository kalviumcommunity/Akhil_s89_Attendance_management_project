package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main { 
    public static void main(String[] args) {

        // --- Create Students ---
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Madhu", "10th"));
        students.add(new Student("Hari", "9th"));
        students.add(new Student("John", "11th"));

        // --- Create Courses ---
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Mathematics"));
        courses.add(new Course("Physics"));
        courses.add(new Course("Chemistry"));

        // --- Create Attendance Records ---
        ArrayList<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(students.get(0).getId(), courses.get(0).getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(students.get(1).getId(), courses.get(1).getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(students.get(2).getId(), courses.get(2).getCourseId(), "Present"));

        // --- Save Data to Files ---
        FileStorageService fileStorageService = new FileStorageService();
        fileStorageService.saveData(students, "students.txt");
        fileStorageService.saveData(courses, "courses.txt");
        fileStorageService.saveData(attendanceLog, "attendance_log.txt");

        // --- Display all details ---
        System.out.println("Students:");
        for (Student student : students) {
            student.displayDetails();
        }

        System.out.println("\nCourses:");
        for (Course course : courses) {
            course.displayDetails();
        }

        System.out.println("\n--- Attendance Log ---");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}
