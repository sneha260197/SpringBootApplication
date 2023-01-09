package com.springboot.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.sample.dto.Courses;

public interface CourseRepository extends JpaRepository<Courses, Integer> {	

}
