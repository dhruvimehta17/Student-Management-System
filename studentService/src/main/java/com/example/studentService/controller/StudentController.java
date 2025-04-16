package com.example.studentService.controller;

import com.example.studentService.dto.AssignmentDTO;
import com.example.studentService.dto.AttendanceDTO;
import com.example.studentService.entity.Student;
import com.example.studentService.service.StudentService;
import com.example.studentService.service.CourseFeignClient;
import com.example.studentService.service.AttendanceFeignClient;
import com.example.studentService.service.AssignmentFeignClient;
import com.example.studentService.dto.CourseDTO;
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

    @GetMapping("/{id}/courses")
    public List<CourseDTO> getStudentCourses(@PathVariable Long id) {
        return courseFeignClient.getCoursesForStudent(id);
    }

    @GetMapping("/{id}/attendance")
    public List<AttendanceDTO> getStudentAttendance(@PathVariable Long id) {
        return attendanceFeignClient.getAttendanceForStudent(id);
    }

    @GetMapping("/{id}/assignments")
    public List<AssignmentDTO> getStudentAssignments(@PathVariable Long id) {
        return assignmentFeignClient.getAssignmentsForStudent(id);
    }

}
