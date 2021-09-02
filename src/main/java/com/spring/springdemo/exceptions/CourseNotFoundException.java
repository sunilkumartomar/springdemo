package com.spring.springdemo.exceptions;

import java.rmi.server.ExportException;

public class CourseNotFoundException extends ExportException {

    public CourseNotFoundException(String s) {
        super(s);
    }
}
