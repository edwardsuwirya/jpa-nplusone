package com.enigmacamp.nplusone.repository;

import com.enigmacamp.nplusone.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {
    @Query("from Course c join c.courseType")
    List<Course> findAllByCourseType();
}
