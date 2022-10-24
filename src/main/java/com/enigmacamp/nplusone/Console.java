package com.enigmacamp.nplusone;

import com.enigmacamp.nplusone.entity.Course;
import com.enigmacamp.nplusone.entity.CourseInfo;
import com.enigmacamp.nplusone.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Console implements CommandLineRunner {
    private CourseRepository courseRepository;

    public Console(@Autowired CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        CourseInfo info1 = new CourseInfo("3", "Advanced");
        Course course1 = new Course("Tax", "Accounting", "https://enigmacamp.com");
        course1.setCourseInfo(info1);
        courseRepository.save(course1);
    }
}
