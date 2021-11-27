package com.spring.springdemo.controller;

import com.spring.springdemo.entities.Course;
import com.spring.springdemo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public String home() {
           //sunil git 
        return "Welcome to rest Application";
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {

        return this.courseService.getCourse();
    }

    @GetMapping("/course/{id}")
    public Course getCourse(@PathVariable String id) {
        long courseid = Long.parseLong(id);
        return this.courseService.getCourse(courseid);
    }

    @PostMapping("/course")
    public Course addCourse(@RequestBody Course course) {
        return this.courseService.addCourse(course);
    }

    @PutMapping("/course")
    public Course updateCourse(@RequestBody Course course) {
        return this.updateCourse(course);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String id) {
        try {
            this.courseService.deleteCourse(Long.parseLong(id));
            return new ResponseEntity<>(HttpStatus.OK);

        } catch (Exception es) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
