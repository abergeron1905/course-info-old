package com.pluralsight.courseinfo.repository;

import java.util.List;

import com.pluralsight.courseinfo.domain.Course;

public interface CourseRepository {

    void saveCourse(Course course);

    List<Course> getAllCourses();
    
}
