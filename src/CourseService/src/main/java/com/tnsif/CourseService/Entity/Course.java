package com.tnsif.CourseService.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String description;
	private String instructor;
	private double price;
	
	//Getter and Setter
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String descripation) {
		this.description = descripation;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instruction) {
		this.instructor = instruction;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
// to string 
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", description=" + description + ", instructor=" + instructor
				+ ", price=" + price + "]";
	}
	
	

}
