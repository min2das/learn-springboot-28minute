package com.springboot.learn_springboot_28minute;

import com.springboot.learn_springboot_28minute.repository.CourseJDBCRepository;
import com.springboot.learn_springboot_28minute.repository.CourseJPARepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
    private final CourseJDBCRepository courseJDBCRepository;
    private final CourseJPARepository courseJPARepository;

    public CourseCommandLineRunner(CourseJDBCRepository courseJDBCRepository, CourseJPARepository courseJPARepository) {
        this.courseJDBCRepository = courseJDBCRepository;
        this.courseJPARepository = courseJPARepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        courseJDBCRepository.insert();
        System.out.println(courseJPARepository.findById(1));
        courseJPARepository.deleteById(1);

    }
}
