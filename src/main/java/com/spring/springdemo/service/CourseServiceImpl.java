package com.spring.springdemo.service;

import com.spring.springdemo.dao.CourseDao;
import com.spring.springdemo.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class CourseServiceImpl implements CourseService {

    List<Course> list;

    @Autowired
    private CourseDao courseDao;

    public CourseServiceImpl() {

        list = new ArrayList<>();
        list.add(new Course(10L, "Sunil", "TReact Application"));
        list.add(new Course(11L, "Yogendra", "TReact Application"));
        list.add(new Course(10L, "Vishnu", "TReact Application"));

    }

    @Override
    public List<Course> getCourse() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long id) {
        Course course = null;

        for (Course c : list) {
            if (c.getId() == id) {
                course = c;
                break;
            }
        }
        return course;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        Course course2=Course.builder()
                .id(10L)
                .title("java")
                .description("jaav tutorial")
                .build();
               return course;
    }

    @Override
    public Course updateCourse(Course course) {
        return null;
    }


    @Override
    public Course deleteCourse(long id) {
        Course course = null;
        course=courseDao.findById(id).orElse(null);

        for (Course cour : list) {
            if (cour.getId() == id) {
                list.remove(cour);
            }

        }

        return course;
    }
}
