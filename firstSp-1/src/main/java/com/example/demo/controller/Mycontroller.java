package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Mycontroller {
	@GetMapping("/shubham")
	public String method() {
	
		return "shubham rathore is full in love matter";
		
	}
	
	@GetMapping(value="/student" , produces = MediaType.APPLICATION_JSON_VALUE)
	public Student getStudent() {
		Student obj=new Student();
		obj.setMarks(541);
		obj.setName("shubham");
		obj.setRoll(45);
		return obj;
	}
	@GetMapping(value = "/List",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Student> GetList(){
		Student s=new Student(2, "shubham", 7800);
		Student s1=new Student(4, "raghu", 700);
		Student s2=new Student(3, "rajendar", 800);
		Student s3=new Student(7, "raghu", 770);
		Student s4=new Student(9, "vijay", 900);

		List<Student> list=new ArrayList<>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		return list;
	}
}
