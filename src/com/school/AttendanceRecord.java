package com.school;

public class AttendanceRecord {
    private int StudentId;
    private int courseId;
    private String status;

    public AttendanceRecord(int studentId, int courseId, String status){
        this.StudentId=studentId;
        this.courseId=courseId;
        
        if (status.equalsIgnoreCase("Present") || status.equalsIgnoreCase("Absent")) {
            this.status = status.substring(0, 1).toUpperCase() + status.substring(1).toLowerCase(); 
        } else {
            this.status = "Invalid";
            System.out.println("⚠️ Warning: Invalid status provided. Defaulting to 'Invalid'.");
        }
    }

    public int getStudentId() {
        return StudentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getStatus() {
        return status;
    }

    public void displayRecord() {
        System.out.println("Student ID: " + StudentId + 
                           ", Course ID: C" + courseId + 
                           ", Status: " + status);
    }
}
