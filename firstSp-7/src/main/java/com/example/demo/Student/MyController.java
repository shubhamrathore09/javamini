package com.example.demo.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.management.relation.InvalidRoleInfoException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.*;


import jakarta.annotation.PostConstruct;
import jakarta.validation.Valid;

@RestController
@RequestMapping("StudentApp")
public class MyController {
	private List<Student> students=new ArrayList<>();
	
	@PostConstruct
	public void add() {
		students.add(new Student(2, "shubham", 48));
		students.add(new Student(3, "raghu",45));
		students.add(new Student(5, "vijay", 74));
		students.add(new Student(6, "dinesh", 478));
		students.add(new Student(7, "rahul", 4858));
		students.add(new Student(9, "vijay", 9548));
		students.add(new Student(8, "rajendar", 4748));
	}
	
	@GetMapping("/get/{roll}")
	public Student getStudent(@PathVariable("roll") Integer roll) throws InvalidRoleInfoException {
		if(10>roll)
			throw new InvalidRoleInfoException("juihiuhuihuih");
		
		Integer x=roll/0;
		
		return new Student(roll,"shubham",7840);
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAll(){
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK); 	
	}
	
	

	@PostMapping("/st")
	public String update (@Valid @RequestBody Student student) {
		students.add(student);
//		
//		HttpHeaders hh=new HttpHeaders();
//		hh.add("abc", "xyz");
//		hh.add("qwe", "tyu");
//		hh.add("opl", "ppp");
//		hh.add("ooo","lll");
		
//		return new ResponseEntity<Student>(student,hh,HttpStatus.OK);
		return student.getName();
		
	}
	

}



















