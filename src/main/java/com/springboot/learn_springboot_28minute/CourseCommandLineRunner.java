package com.springboot.learn_springboot_28minute;

import com.springboot.learn_springboot_28minute.model.Course;
import com.springboot.learn_springboot_28minute.repository.CourseJDBCRepository;
import com.springboot.learn_springboot_28minute.repository.CourseJPARepository;
import com.springboot.learn_springboot_28minute.repository.CourseSpringDataJPA;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    private final CourseJDBCRepository courseJDBCRepository;
//    private final CourseJPARepository courseJPARepository;

    private final CourseSpringDataJPA courseSpringDataJPA;

    public CourseCommandLineRunner(
//                                   CourseJDBCRepository courseJDBCRepository,
//                                   CourseJPARepository courseJPARepository,
                                   CourseSpringDataJPA courseSpringDataJPA
    ) {
//        this.courseJDBCRepository = courseJDBCRepository;
//        this.courseJPARepository = courseJPARepository;
        this.courseSpringDataJPA = courseSpringDataJPA;
    }

    @Override
    public void run(String... args) throws Exception {
//        courseJDBCRepository.insert();
//        System.out.println(courseJPARepository.findById(1));
//        courseJPARepository.deleteById(1);
        courseSpringDataJPA.save(new Course(1L,"Microservices in 100 Steps", "Ranga Karanam"));
        courseSpringDataJPA.findByName("Microservices in 100 Steps");
    }
}
