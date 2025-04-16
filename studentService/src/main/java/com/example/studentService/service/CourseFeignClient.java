package com.example.studentService.service;

import com.example.studentService.dto.CourseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@FeignClient(name = "courseService")
public interface CourseFeignClient {
    @GetMapping("/courses/student/{studentId}")
    List<CourseDTO> getCoursesForStudent(@PathVariable Long studentId);
}
