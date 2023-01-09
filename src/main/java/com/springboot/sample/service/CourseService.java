package com.springboot.sample.service;

import java.util.List;

import com.springboot.sample.dto.Courses;

public interface CourseService {
	public List<Courses> getCourses();

	public Courses getCourseById(Integer id);

	public Courses editCourse(Integer id);

	public Courses addCourse(Courses course);
}
