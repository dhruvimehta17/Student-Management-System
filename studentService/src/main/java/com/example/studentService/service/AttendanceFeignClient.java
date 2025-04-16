package com.example.studentService.service;

import com.example.studentService.dto.AttendanceDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@FeignClient(name = "attendanceService") // Service Name in Eureka
public interface AttendanceFeignClient {
    @GetMapping("/attendance/student/{studentId}")
    List<AttendanceDTO> getAttendanceForStudent(@PathVariable Long studentId);
}
