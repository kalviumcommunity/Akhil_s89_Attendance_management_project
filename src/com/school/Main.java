package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main { 
    public static void main(String[] args) {

        // --- Create Students ---
        Student student1 = new Student("Madhu", "10th");
        Student student2 = new Student("Hari", "9th");
        Student student3 = new Student("John", "11th");

        // --- Create Teachers ---
        Teacher teacher1 = new Teacher("Alice", "Mathematics");
        Teacher teacher2 = new Teacher("Bob", "Physics");

        // --- Create Staff ---
        Staff staff1 = new Staff("Catherine", "Administrator");

        // --- Display all details ---
        System.out.println("Students:");
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();

        System.out.println("\nTeachers:");
        teacher1.displayDetails();
        teacher2.displayDetails();

        System.out.println("\nStaff:");
        staff1.displayDetails();

        // --- Attendance log ---
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        // Add attendance records for students
        attendanceLog.add(new AttendanceRecord(student1.getId(), 101, "Present"));
        attendanceLog.add(new AttendanceRecord(student2.getId(), 102, "Absent"));
        attendanceLog.add(new AttendanceRecord(student3.getId(), 103, "Present"));
        attendanceLog.add(new AttendanceRecord(student1.getId(), 102, "Present"));

        System.out.println("\n--- Attendance Log ---");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}
