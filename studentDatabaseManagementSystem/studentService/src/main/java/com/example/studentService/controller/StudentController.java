package com.example.studentService.controller;

import com.example.studentService.entity.Student;
import com.example.studentService.service.StudentService;
import com.example.studentService.service.CourseFeignClient;
import com.example.studentService.service.AttendanceFeignClient;
import com.example.studentService.service.AssignmentFeignClient;
import com.example.courseService.entity.Course;
import com.example.attendanceService.entity.Attendance;
import com.example.assignmentService.entity.Assignment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;
    private final CourseFeignClient courseFeignClient;
    private final AttendanceFeignClient attendanceFeignClient;
    private final AssignmentFeignClient assignmentFeignClient;

    public StudentController(StudentService studentService, CourseFeignClient courseFeignClient,
                             AttendanceFeignClient attendanceFeignClient, AssignmentFeignClient assignmentFeignClient) {
        this.studentService = studentService;
        this.courseFeignClient = courseFeignClient;
        this.attendanceFeignClient = attendanceFeignClient;
        this.assignmentFeignClient = assignmentFeignClient;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "Student deleted successfully!";
    }

    // Fetch Courses for Student
    @GetMapping("/{id}/courses")
    public List<Course> getStudentCourses(@PathVariable Long id) {
        return courseFeignClient.getCoursesForStudent(id);
    }

    // Fetch Attendance for Student
    @GetMapping("/{id}/attendance")
    public List<Attendance> getStudentAttendance(@PathVariable Long id) {
        return attendanceFeignClient.getAttendanceForStudent(id);
    }

    // Fetch Assignments for Student
    @GetMapping("/{id}/assignments")
    public List<Assignment> getStudentAssignments(@PathVariable Long id) {
        return assignmentFeignClient.getAssignmentsForStudent(id);
    }
}
