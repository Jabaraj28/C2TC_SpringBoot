package com.tnsif.CourseService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.CourseService.Entity.Course;

public interface CourseRepository extends JpaRepository <Course , Long> {
	

}
