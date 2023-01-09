package com.springboot.sample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.sample.dto.Courses;
import com.springboot.sample.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository courseRepo;

	@Override
	public List<Courses> getCourses() {
		return courseRepo.findAll();
	}

	@Override
	public Courses getCourseById(Integer id) {
		Optional<Courses> c = null;
		c = courseRepo.findById(id);
//		for(Courses c1 : courses) {
//			if(c1.getId() == id) {
//				c = c1;
//				break;
//			}
//		}
		return c.get();
	}

	@Override
	public Courses editCourse(Integer id) {
		Courses c = courseRepo.getOne(id);
		c.setName("Azure Learning");
		courseRepo.save(c);
		return c;
	}

	@Override
	public Courses addCourse(Courses course) {
		Courses c = new Courses();
		c.setId(course.getId());
		c.setName(course.getName());
		//courses.add(c);
		courseRepo.save(c);
		
		return c;
	}

}
