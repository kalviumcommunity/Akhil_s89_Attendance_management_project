package com.school;

import java.util.ArrayList;

public class AttendanceService {
    private ArrayList<AttendanceRecord> attendanceRecords;
    private RegistrationService registrationService;
    private FileStorageService fileStorageService;

    public AttendanceService(RegistrationService registrationService, FileStorageService fileStorageService) {
        this.registrationService = registrationService;
        this.fileStorageService = fileStorageService;
        this.attendanceRecords = new ArrayList<>();
    }

    public void markAttendance(int studentId, int courseId, String status) {
        Student student = registrationService.findStudentById(studentId);
        Course course = registrationService.findCourseById(courseId);
        
        if (student != null && course != null) {
            attendanceRecords.add(new AttendanceRecord(student, course, status));
        }
    }

    public void displayAttendanceLog() {
        System.out.println("\n--- Attendance Log ---");
        for (AttendanceRecord record : attendanceRecords) {
            record.displayRecord();
        }
    }

    public void saveAttendanceData() {
        fileStorageService.saveData(attendanceRecords, "attendance_log.txt");
    }
}