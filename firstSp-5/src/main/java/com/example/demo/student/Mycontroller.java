package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
	
	@GetMapping(value = "/ss")
	public Student stud() {
		Student obj=new Student(2, "shuhhhhh", 433);
		return obj;
	}
	
	@GetMapping(value="/xx")
	public Student method() {
		return new Student(784, "dsffas", 23323);
	}
	
	@GetMapping(value = "/hellow/{roll}/{name}/{marks}")
	public Student getStudent(@PathVariable("roll") Integer roll,@PathVariable("name") String name,@PathVariable("marks") Integer marks) {
		Student obj=new Student();
		obj.setMarks(marks);
		obj.setName(name);
		obj.setRoll(roll);
		return obj;
	}
	
	@GetMapping("/re")
	public Student getSt(@RequestParam Integer roll,@RequestParam String name, @RequestParam(required = false) Integer marks)
	{
		return new Student(roll, name, marks);
	}
	
	@PostMapping(value="st",consumes = "application/json")
	public String SaveSt(@RequestBody Student student ) {
		return "student stored "+student.getName() +" "+student.getRoll()+" "+student.getMarks();
	}
	
	@PutMapping(value="/update/{surname}")
	public Student update(@RequestBody Student student, @PathVariable String surname) {
		student.setName(student.getName()+" "+surname);
		return student;
	}

}
