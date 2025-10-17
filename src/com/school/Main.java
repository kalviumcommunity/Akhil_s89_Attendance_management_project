package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void displaySchoolDirectory(List<Person> people) {
        System.out.println("\n=== School Directory ===");
        for (Person person : people) {
            person.displayDetails();
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // --- Create Students ---
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Madhu", "10th"));
        students.add(new Student("Hari", "9th"));
        students.add(new Student("John", "11th"));

        // --- Create Teachers ---
        Teacher teacher1 = new Teacher("Dr. Smith", "Mathematics");
        Teacher teacher2 = new Teacher("Ms. Johnson", "Physics");

        // --- Create Staff ---
        Staff staff1 = new Staff("Mr. Brown", "Administrator");
        Staff staff2 = new Staff("Ms. Davis", "Librarian");

        // --- Create School People List ---
        ArrayList<Person> schoolPeople = new ArrayList<>();
        schoolPeople.addAll(students);
        schoolPeople.add(teacher1);
        schoolPeople.add(teacher2);
        schoolPeople.add(staff1);
        schoolPeople.add(staff2);

        // --- Create Courses ---
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Mathematics"));
        courses.add(new Course("Physics"));
        courses.add(new Course("Chemistry"));

        // --- Create Attendance Records ---
        ArrayList<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(students.get(0), courses.get(0), "Present"));
        attendanceLog.add(new AttendanceRecord(students.get(1), courses.get(1), "Absent"));
        attendanceLog.add(new AttendanceRecord(students.get(2), courses.get(2), "Present"));

        // --- Display School Directory (Polymorphism) ---
        displaySchoolDirectory(schoolPeople);

        // --- Save Data to Files ---
        FileStorageService fileStorageService = new FileStorageService();
        fileStorageService.saveData(students, "students.txt");
        fileStorageService.saveData(courses, "courses.txt");
        fileStorageService.saveData(attendanceLog, "attendance_log.txt");

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
