package com.example.demo.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roll;
	@Email(regexp = "@gmail.com")
	@Size(min = 3 ,max = 30)
	private String name;
	private Integer marks;
	
	public Student(@Email String name, Integer marks) {
		super();
		this.name = name;
		this.marks = marks;
		
	}
	public Student(Integer roll, @Email String name,
			Integer marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		
	}
	public Student() {
		super();
	}
	
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
}
