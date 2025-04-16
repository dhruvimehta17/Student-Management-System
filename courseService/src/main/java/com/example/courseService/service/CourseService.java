package com.example.courseService.service;

import com.example.courseService.entity.Course;
import com.example.courseService.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }


    public Course getCourseById(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course updateCourse(Long id, Course updatedCourse) {
        Course existingCourse = courseRepository.findById(id).orElse(null);
        if (existingCourse != null) {
            existingCourse.setName(updatedCourse.getName());
            existingCourse.setDescription(updatedCourse.getDescription());
            return courseRepository.save(existingCourse);
        }
        return null;
    }

    public List<Course> getCoursesForStudent(Long studentId) {
        return courseRepository.findAll(); // This will return all courses (for now)
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}
