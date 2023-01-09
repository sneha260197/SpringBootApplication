package com.springboot.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.sample.dto.Courses;
import com.springboot.sample.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/courses")
	public List<Courses> getCourses() {
		return courseService.getCourses();
	}
	
	@GetMapping("/course/{id}")
	public Courses getCourseById(@PathVariable(value = "id") Integer id) {
		return courseService.getCourseById(id);
	}
	
	@PutMapping("/editCourse/{id}")
	public Courses editCourse(@PathVariable(value = "id") Integer id) {
		return courseService.editCourse(id);
	}
	
	@PostMapping("/addCourse")
	public Courses editCourse(@RequestBody Courses course) {
		return courseService.addCourse(course);
	}
}
