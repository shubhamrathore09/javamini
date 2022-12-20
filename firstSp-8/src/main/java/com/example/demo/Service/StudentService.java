package com.example.demo.Service;

import com.example.demo.exception.StudentException;
import com.example.demo.model.Student;

public interface StudentService {
	public Student Update(Student student);
	public Student geById(Integer roll) throws StudentException;
	
}
