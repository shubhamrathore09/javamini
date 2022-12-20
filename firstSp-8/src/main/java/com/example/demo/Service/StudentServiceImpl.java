package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.StudentException;
import com.example.demo.model.Student;
import com.example.demo.studentDao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao dao;
	
	@Override
	public Student Update(Student student) {
		
		return null;
	}

	@Override
	public Student geById(Integer roll) throws StudentException {
		Optional<Student> opt=dao.findById(roll);
		if(opt.isPresent()) {
		Student student=opt.get();
		return student;
		}
		else {
		throw new StudentException("student not found by that roll");	
		}
		
	}
	

}
