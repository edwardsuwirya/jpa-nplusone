package com.enigmacamp.nplusone;

import com.enigmacamp.nplusone.entity.Course;
import com.enigmacamp.nplusone.entity.CourseType;
import com.enigmacamp.nplusone.repository.CourseRepository;
import com.enigmacamp.nplusone.repository.CourseTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Component
@Transactional
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

//        System.out.println("");
//        System.out.println("============= Find By Id ==============");
//        System.out.println("Using Inner Join -> No Problem");
//        Optional<Course> result = courseRepository.findById("64563118-0593-4c7f-8357-6286ebb5fda4");
//        if (result.isEmpty()) {
//            throw new RuntimeException("Data not found");
//        }
//
//        Course course = result.get();
//        System.out.println(course);
////
//        System.out.println("");
//        System.out.println("============= N+1 ==============");
////        N+1 problem
//        List<Course> results = courseRepository.findAll();
//        for (Course course1 : results) {
//            System.out.println(course1);
//        }
//
//        System.out.println("");
//        System.out.println("============= N+1 Solution ==============");
//        List<Course> resultSolution = courseRepository.findAllByCourseType();
//        if (resultSolution.isEmpty()) {
//            throw new RuntimeException("Data not found");
//        }
//
//        for (Course course1 : resultSolution) {
//            System.out.println(course1);
//        }

//        System.out.println("");
//        System.out.println("============= Find By Id ==============");
//        System.out.println("2 query from Course Type and from Course");
//        Optional<CourseType> result = courseTypeRepository.findById("164e7828-28d3-47b5-aadb-3b9964b7de35");
//        if (result.isEmpty()) {
//            throw new RuntimeException("Data not found");
//        }
//        CourseType courseType = result.get();
//        System.out.println(courseType);
//        for (Course c : courseType.getCourseList()) {
//            System.out.println(c);
//        }
//
//        System.out.println("");
//        System.out.println("============= N+1 Solution ==============");
//        Optional<CourseType> result1 = courseTypeRepository.findByIdWithCourseList("164e7828-28d3-47b5-aadb-3b9964b7de35");
//        if (result1.isEmpty()) {
//            throw new RuntimeException("Data not found");
//        }
//
//        CourseType courseType1 = result1.get();
//        System.out.println(courseType1);

        System.out.println("");
        System.out.println("============= Find All ==============");
        List<CourseType> result = courseTypeRepository.findAll();
        if (result.isEmpty()) {
            throw new RuntimeException("Data not found");
        }
        for (CourseType c : result) {
            System.out.println(c.getCourseList());
        }

        System.out.println("");
        System.out.println("============= Find All Solution ==============");
        List<CourseType> result1 = courseTypeRepository.findAll();
        if (result1.isEmpty()) {
            throw new RuntimeException("Data not found");
        }
        for (CourseType c : result1) {
            System.out.println(c.getCourseList());
        }
    }
}
