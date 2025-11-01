# Akhil_s89_Attendance_Management_Project

## Overview

This repository contains the Attendance Management Project created as part of the Object-Oriented Programming (SPE 2025) course.

The project demonstrates:
- Setting up a Java development environment
- Modeling real-world entities using Object-Oriented Programming
- Using inheritance, constructors, auto-ID generation, and interfaces
- Managing attendance records with proper validation
- Implementing polymorphism and advanced OOP concepts

---

## Project Structure
```
AttendanceSystem/
├── README.md                                     # Project documentation
├── src/
    ├── com/
        ├── school/
            ├── Main.java
            ├── Person.java
            ├── Student.java
            ├── Teacher.java
            ├── Staff.java
            ├── Course.java
            ├── AttendanceRecord.java
            ├── AttendanceService.java
            ├── RegistrationService.java
            ├── Storable.java
            └── FileStorageService.java
```

---

## Features by Part

### Part 1: Setup & Hello World
- Initialized project folder structure
- Created `Main.java` with a simple welcome message
- Pushed initial code to GitHub branch `part-01`

### Part 2: Core Domain Modeling
- Defined `Student` class:
  - `studentId`, `name`
  - `setDetails()` and `displayDetails()` methods
- Defined `Course` class:
  - `courseId`, `courseName`
  - `setDetails()` and `displayDetails()` methods
- Used arrays of objects in `Main.java` to manage multiple students and courses
- Introduced the use of `this` keyword

### Part 3: Constructor Initialization & Auto-ID Generation
- Implemented parameterized constructors in `Student` and `Course` for object initialization
- Used `private static` member variables for automatic and unique ID generation
- Updated `Main.java` to demonstrate ID progression for multiple objects

### Part 4: Attendance Tracking
- Added `AttendanceRecord` class with validation for attendance status (`Present` / `Absent`)
- Used `ArrayList` in `Main.java` to manage attendance records dynamically
- Demonstrated handling of valid and invalid statuses
- Integrated `student.getId()` to track attendance accurately
- Example includes both valid and invalid attendance statuses

### Part 5: Polymorphism and Interfaces
- Introduced `Person` superclass with common attributes: `id`, `name`
- Extended `Student`, `Teacher`, and `Staff` from `Person`
- Implemented `Storable` interface for consistent data serialization
- Updated `FileStorageService` to handle storage of all person types

### Part 6: File Storage and Data Export
- Introduced the `Storable` interface for consistent data serialization
- Updated `Student`, `Course`, and `AttendanceRecord` classes to implement `Storable`
- Created `FileStorageService` to save data to text files
- Updated `Main.java` to:
  - Populate `ArrayList` objects for students, courses, and attendance records
  - Save data to `students.txt`, `courses.txt`, and `attendance_log.txt`

### Part 7: Enhanced Polymorphism and Object Relationships
- **Updated `AttendanceRecord` class:**
  - Changed `studentId` (int) field to `private Student student`
  - Changed `courseId` (int) field to `private Course course`
  - Updated constructor to accept `Student` and `Course` objects
  - Added `getStudent()` and `getCourse()` getters
  - Enhanced `displayRecord()` to show student names and course names for richer display
  - Maintained `toDataString()` compatibility for file saving
- **Enhanced `Main.java` with polymorphism:**
  - Added `displaySchoolDirectory(List<Person> people)` method
  - Created `Teacher` and `Staff` objects alongside students
  - Used polymorphic calls through `Person` references
  - Demonstrated runtime method resolution with `displayDetails()`
  - Updated attendance record creation to use actual objects instead of IDs

### Part 9: SOLID Service Layer - RegistrationService & AttendanceService Separation
- **Applied Single Responsibility Principle (SRP):**
  - Created `RegistrationService` to manage all registration operations
  - Created `AttendanceService` to handle attendance-specific operations
  - Separated concerns for better maintainability and testability
- **Updated `Teacher.java` and `Staff.java`:**
  - Implemented `Storable` interface
  - Added `toDataString()` method for file serialization
- **Created `RegistrationService.java`:**
  - Manages lists of Student, Teacher, Staff, and Course objects
  - Provides methods: `registerStudent()`, `registerTeacher()`, `registerStaff()`, `createCourse()`
  - Includes lookup methods: `findStudentById()`, `findCourseById()`
  - Handles saving all registrations to respective files
- **Created `AttendanceService.java`:**
  - Depends on `RegistrationService` for student/course lookups
  - Manages attendance records with `markAttendance()` method
  - Provides `displayAttendanceLog()` and `saveAttendanceData()` methods
- **Refactored `Main.java`:**
  - Uses dependency injection pattern with service classes
  - Demonstrates clean separation of concerns
  - Updated `displaySchoolDirectory()` to accept `RegistrationService`

---

## Output Files

After running the program, the following files will be generated in the project root:
- `students.txt`: Contains student details in the format `id,name,gradeLevel`
- `teachers.txt`: Contains teacher details in the format `id,name,subjectTaught`
- `staff.txt`: Contains staff details in the format `id,name,role`
- `courses.txt`: Contains course details in the format `courseId,courseName`
- `attendance_log.txt`: Contains attendance records in the format `studentId,courseId,status`

Verify the content of these files to ensure correctness.

---

## How to Run

1. **Navigate to Project Root**
   ```bash
   cd C:\projects\AttendanceSystem
   ```

2. **Compile All Java Files**
   ```bash
   javac src/com/school/*.java
   ```
   *Make sure all `.java` files have the correct package declaration:*
   ```java
   package com.school;
   ```

3. **Run the Program**
   ```bash
   java -cp src com.school.Main
   ```

   You should see:
   - School Directory with polymorphic display of all person types
   - Course details
   - Enhanced attendance log with student and course names

---

## Notes / Tips

- Always compile all dependent files together; do not compile `Main.java` alone
- The `AttendanceRecord` class validates the status and ignores invalid values
- IDs for students and courses are auto-generated to ensure uniqueness
- The project follows OOP principles like inheritance, polymorphism, and encapsulation
- Part 7 demonstrates advanced object relationships and polymorphic behavior

---

## Next Steps / Future Enhancements

- Add GUI interface for easier attendance management
- Extend attendance validation with more statuses (`Late`, `Excused`)
- Implement reporting: percentage attendance, top attendees
- Integrate file I/O or database to store attendance records persistently

---

## Screenshots

### Example Output (Part 7)
```
=== School Directory ===
ID: 0, Name: Madhu
Grade Level: 10th
Role: Student

ID: 3, Name: Dr. Smith
Subject Taught: Mathematics
Role: Teacher

ID: 5, Name: Mr. Brown
Role: Administrator

--- Attendance Log ---
Student: Madhu (ID: 0), Course: Mathematics (ID: C101), Status: Present
Student: Hari (ID: 1), Course: Physics (ID: C102), Status: Absent
```

### Command-Line Execution
```bash
> javac src/com/school/*.java
> java -cp src com.school.Main
```

---