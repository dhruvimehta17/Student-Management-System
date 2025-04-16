package com.example.studentService.service;

import com.example.assignmentService.entity.Assignment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@FeignClient(name = "assignmentService") // Service Name in Eureka
public interface AssignmentFeignClient {
    @GetMapping("/assignments/student/{studentId}")
    List<Assignment> getAssignmentsForStudent(@PathVariable Long studentId);
}
