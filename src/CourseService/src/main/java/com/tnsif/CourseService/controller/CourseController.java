package com.tnsif.CourseService.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.CourseService.Entity.Course;
import com.tnsif.CourseService.Service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/Course")
	public Course createCourse(@RequestBody Course course) {
		return courseService.saveCourse(course);
	}
	@GetMapping("/Course")
	public List<Course> getAllCourses(){
		return courseService.getAllCourse();
	}
	
	@GetMapping("/Course/{id}")
	public Course getCourseById(@PathVariable Long id) {
		return courseService.getCourseById(id);
	}
	
	@PutMapping("/Course/{id}")
	public Course updateCourse(@PathVariable Long id, @RequestBody Course course) {
		return courseService.updateCourse(id, course);
	}
	
	@DeleteMapping("/Course/{id}")
	public void deleteCourse(@PathVariable Long id) {
		courseService.deleteCourse(id);
	}

}
