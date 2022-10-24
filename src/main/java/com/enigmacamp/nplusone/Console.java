package com.enigmacamp.nplusone;

import com.enigmacamp.nplusone.entity.Course;
import com.enigmacamp.nplusone.entity.CourseType;
import com.enigmacamp.nplusone.repository.CourseRepository;
import com.enigmacamp.nplusone.repository.CourseTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Console implements CommandLineRunner {
    private CourseRepository courseRepository;
    private CourseTypeRepository courseTypeRepository;

    public Console(@Autowired CourseRepository courseRepository, @Autowired CourseTypeRepository courseTypeRepository) {
        this.courseRepository = courseRepository;
        this.courseTypeRepository = courseTypeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        CourseType courseType = new CourseType("IT");
        Course course1 = new Course("Tax", "Accounting", "https://enigmacamp.com");
        course1.setCourseType(courseType);
        courseRepository.save(course1);
    }
}
