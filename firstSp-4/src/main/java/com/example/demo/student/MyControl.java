package com.example.demo.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControl {
	@GetMapping(value="/hi",produces = MediaType.APPLICATION_JSON_VALUE)
	public Student addstudent() {
		Student obj=new Student();
		obj.setAddress(new Address(466661, "bhopal", "doraha"));
		obj.setMarks(784);
		obj.setName("shubham");
		obj.setRoll(74);
		return obj;
	}
	@GetMapping(value = "/hh")
	public List<Student> students(){
		List<Student> list=new ArrayList<>();
		
		list.add(new Student(8, "banti", 70, new Address(78222, "wehore", "popal")));
		list.add(new Student(7, "raghu", 80, new Address(8122, "qehore", "hopal")));
		list.add(new Student(4, "nikky", 980, new Address(2, "dehore", "kopal")));
		list.add(new Student(1, "rajendar", 480, new Address(222, "hehore", "dhopal")));
		list.add(new Student(9, "dheeraj", 600, new Address(8222, "lehore", "gopal")));
		return list;
	}
}
