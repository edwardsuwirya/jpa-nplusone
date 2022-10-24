package com.enigmacamp.nplusone.repository;

import com.enigmacamp.nplusone.entity.CourseType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseTypeRepository extends JpaRepository<CourseType, String> {
}
