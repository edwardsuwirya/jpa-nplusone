package com.enigmacamp.nplusone.repository;

import com.enigmacamp.nplusone.entity.CourseType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseTypeRepository extends JpaRepository<CourseType, String> {
    @Query("from CourseType c join fetch c.courseList where c.courseTypeId=:id")
    Optional<CourseType> findByIdWithCourseList(String id);

}
