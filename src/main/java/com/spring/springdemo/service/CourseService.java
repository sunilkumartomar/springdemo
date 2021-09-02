package com.spring.springdemo.service;

import com.spring.springdemo.entities.Course;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CourseService {

    List<Course> getCourse();

    Course getCourse(long id);

    Course addCourse(Course course);

    Course updateCourse(Course course);

    Course deleteCourse(long id);
}
