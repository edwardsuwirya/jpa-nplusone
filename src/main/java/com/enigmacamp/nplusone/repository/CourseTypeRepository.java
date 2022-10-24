package com.enigmacamp.nplusone.repository;

import com.enigmacamp.nplusone.entity.CourseType;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseTypeRepository extends JpaRepository<CourseType, String> {
    // Kalau pake join biasa, butuh return menjadi List, dan result nya akan aneh, ada 2 data
    @Query("from CourseType c join fetch c.courseList where c.courseTypeId=:id")
    Optional<CourseType> findByIdWithCourseList(String id);

        @Query("from CourseType c join fetch c.courseList")
//    @EntityGraph(attributePaths = {"courseList"}, type = EntityGraph.EntityGraphType.LOAD)
    List<CourseType> findAll();
}
