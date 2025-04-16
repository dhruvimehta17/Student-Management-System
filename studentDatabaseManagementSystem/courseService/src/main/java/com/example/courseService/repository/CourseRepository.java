package com.example.courseService.repository;

import com.example.courseService.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findAll(); // Fetch all courses instead
}
