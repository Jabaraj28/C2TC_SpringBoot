package com.tnsif.CourseService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.CourseService.Entity.Course;
import com.tnsif.CourseService.Repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	//to save the record(inserting)
	public Course saveCourse(Course course) {
		return courseRepository.save(course);
	}
	
	//to retrive all records
	public List<Course>getAllCourse(){
		return courseRepository.findAll();
	}
	
	//to get specific record
	public Course getCourseById(Long id) {
		return courseRepository.findById(id).orElse(null);
	}
	
	//to update record
	public Course updateCourse(Long id,Course course) {
		//to fetch existing record by id 
		Course existingCourse = courseRepository.findById(id).orElse(null);
		
		//if course exists, update its field
		if(existingCourse != null) {
			existingCourse.setName(course.getName());
			existingCourse.setDescription(course.getDescription());
			existingCourse.setInstructor(course.getInstructor());
			existingCourse.setPrice(course.getPrice());
			return courseRepository.save(existingCourse);
		}
		
		//if course didn't exits, return null
		return null;
	}
	
	//to delete course by id
	public void deleteCourse( long id) {
		courseRepository.deleteById(id);
	}
}
