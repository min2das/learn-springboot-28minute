package com.springboot.learn_springboot_28minute.repository;

import com.springboot.learn_springboot_28minute.model.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJPARepository {
    @PersistenceContext
    private EntityManager entityManager;

   public Course findById(int id) {
        return entityManager.find(Course.class, id);
    }
    public void deleteById(int id) {
        Course course = findById(id);
        entityManager.remove(course);
    }
}
