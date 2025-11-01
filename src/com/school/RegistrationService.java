package com.school;

import java.util.ArrayList;
import java.util.List;

public class RegistrationService {
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    private ArrayList<Staff> staffMembers;
    private ArrayList<Course> courses;
    private FileStorageService fileStorageService;

    public RegistrationService(FileStorageService fileStorageService) {
        this.fileStorageService = fileStorageService;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.staffMembers = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void registerStudent(String name, String gradeLevel) {
        students.add(new Student(name, gradeLevel));
    }

    public void registerTeacher(String name, String subjectTaught) {
        teachers.add(new Teacher(name, subjectTaught));
    }

    public void registerStaff(String name, String role) {
        staffMembers.add(new Staff(name, role));
    }

    public void createCourse(String courseName) {
        courses.add(new Course(courseName));
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Staff> getStaffMembers() {
        return staffMembers;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public Course findCourseById(int id) {
        for (Course course : courses) {
            if (course.getCourseId() == id) {
                return course;
            }
        }
        return null;
    }

    public List<Person> getAllPeople() {
        List<Person> allPeople = new ArrayList<>();
        allPeople.addAll(students);
        allPeople.addAll(teachers);
        allPeople.addAll(staffMembers);
        return allPeople;
    }

    public void saveAllRegistrations() {
        fileStorageService.saveData(students, "students.txt");
        fileStorageService.saveData(teachers, "teachers.txt");
        fileStorageService.saveData(staffMembers, "staff.txt");
        fileStorageService.saveData(courses, "courses.txt");
    }
}