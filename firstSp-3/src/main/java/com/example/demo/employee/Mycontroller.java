package com.example.demo.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.emitter.ScalarAnalysis;

@RestController
public class Mycontroller {
	
	@GetMapping(value="/employee",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee generateEmployee() {
		Employee obj=new Employee(1, "shubham", 45200, "bhopal");
		return obj;
	}
	@GetMapping(value="/employees",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> employeesList(){
		List<Employee> list=new ArrayList<>();
		Employee e1=new Employee(5,"rajat",45444,"sehore");
		Employee e2=new Employee(6,"kanti",75444,"rahore");
		Employee e3=new Employee(5,"kajat",55444,"dahore");
		Employee e4=new Employee(5,"bajat",65444,"kahore");
		Employee e5=new Employee(5,"sajat",48444,"nahore");
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		return list;
	}
	
	@GetMapping(value="/hello")
	public String hello() {
		return "welcome to spring boot";
	}
}
