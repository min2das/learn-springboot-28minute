package com.springboot.learn_springboot_28minute.repository;

import com.springboot.learn_springboot_28minute.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseSpringDataJPA extends JpaRepository<Course,Long> {

    Course findByName(String name);
}
