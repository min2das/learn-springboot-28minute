package com.springboot.learn_springboot_28minute.controller;

import com.springboot.learn_springboot_28minute.model.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class CourseControler {

    @RequestMapping("/courses")
    public List<Course> getAllCourses() {
      return Arrays.asList(
        new Course(1L, "Learn Full stack with Spring Boot and Angular", "Ranga"),
        new Course(2L, "Learn Full stack with Spring Boot and React", "Ranga"),
        new Course(3L, "Master Microservices with Spring Boot and Spring Cloud", "Ranga"),
        new Course(4L, "Deploy Spring Boot Microservices to Cloud with Docker and Kubernetes", "Ranga")
            );
    }
}
