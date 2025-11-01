package com.school;

import java.util.List;

public class Main {
    public static void displaySchoolDirectory(RegistrationService regService) {
        System.out.println("\n=== School Directory ===");
        for (Person person : regService.getAllPeople()) {
            person.displayDetails();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // --- Initialize Services ---
        FileStorageService fileStorageService = new FileStorageService();
        RegistrationService registrationService = new RegistrationService(fileStorageService);
        AttendanceService attendanceService = new AttendanceService(registrationService, fileStorageService);

        // --- Register Students ---
        registrationService.registerStudent("Madhu", "10th");
        registrationService.registerStudent("Hari", "9th");
        registrationService.registerStudent("John", "11th");

        // --- Register Teachers ---
        registrationService.registerTeacher("Dr. Smith", "Mathematics");
        registrationService.registerTeacher("Ms. Johnson", "Physics");

        // --- Register Staff ---
        registrationService.registerStaff("Mr. Brown", "Administrator");
        registrationService.registerStaff("Ms. Davis", "Librarian");

        // --- Create Courses ---
        registrationService.createCourse("Mathematics");
        registrationService.createCourse("Physics");
        registrationService.createCourse("Chemistry");

        // --- Mark Attendance ---
        attendanceService.markAttendance(0, 0, "Present");
        attendanceService.markAttendance(1, 1, "Absent");
        attendanceService.markAttendance(2, 2, "Present");

        // --- Display School Directory (Polymorphism) ---
        displaySchoolDirectory(registrationService);

        // --- Display Courses ---
        System.out.println("\nCourses:");
        for (Course course : registrationService.getCourses()) {
            course.displayDetails();
        }

        // --- Display Attendance Log ---
        attendanceService.displayAttendanceLog();

        // --- Save All Data ---
        registrationService.saveAllRegistrations();
        attendanceService.saveAttendanceData();
    }
}
