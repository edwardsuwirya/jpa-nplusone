package com.enigmacamp.nplusone;

import com.enigmacamp.nplusone.entity.Course;
import com.enigmacamp.nplusone.entity.CourseType;
import com.enigmacamp.nplusone.repository.CourseRepository;
import com.enigmacamp.nplusone.repository.CourseTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

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
//        CourseType courseType = new CourseType("Accounting");
//        CourseType newCourseType = courseTypeRepository.save(courseType);
//        Course course1 = new Course("Golang", "Golang fundamental", "https://enigmacamp.com");
//        course1.setCourseType(newCourseType);
//        courseRepository.save(course1);


//        Optional<Course> result = courseRepository.findById("64563118-0593-4c7f-8357-6286ebb5fda4");
//        if (result.isEmpty()) {
//            throw new RuntimeException("Data not found");
//        }
//
//        Course course = result.get();
//        System.out.println(course);

//        N+1 problem
        List result = courseRepository.findAll();
        if (result.isEmpty()) {
            throw new RuntimeException("Data not found");
        }

        System.out.println(result.size());

//        List<CourseType> resultType = courseTypeRepository.findAll();
//        if (resultType.isEmpty()) {
//            throw new RuntimeException("Data not found");
//        }
//        System.out.println(resultType);
//
//        CourseType courseType = resultType.get();
//        System.out.println(courseType);
    }
}
