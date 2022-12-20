package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.StudentException;
import com.example.demo.model.Student;
import com.example.demo.studentDao.StudentDao;

import jakarta.validation.Valid;

@RestController
public class StudentController {
	@Autowired
	private StudentDao dao;
	
	@PostMapping("/insert")
	public ResponseEntity<Student> update(@Valid @RequestBody Student student) {
			Student student2=dao.save(student);
			return new ResponseEntity<Student>(student2,HttpStatus.CREATED);
	}
	@GetMapping("/getById/{roll}")
	public Student getById(@PathVariable("roll") Integer roll) throws StudentException{
		Optional<Student> opt=dao.findById(roll);
		if(opt.isPresent()) {
			Student student=opt.get();
			return student;
		}
	
		else {
			throw new StudentException("student not found by that roll");
		}
	}
	@GetMapping("/gets")
	public ResponseEntity<List<Student>> AllStudent() throws StudentException{
		List<Student> list=dao.findAll();
		if(list.size()==0) {
			throw new StudentException("no student available");
		}
		
		else {
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
		}
	}
	
	@DeleteMapping("/delete/{roll}")
	public Student delete(@PathVariable("roll") Integer roll){
//		Optional<Student> opt=dao.findById(roll);
//		if(opt.isPresent()) {
//			
//		Student student=opt.get();
//		dao.deleteById(roll);
//		return student;
//		}
//		else {
//			throw new StudentException("not found by that roll number");
//		}
		Student student=dao.findById(roll).orElseThrow(()->new StudentException("not found that roll: "+roll));
		dao.delete(student);
		return student;
	}
	
	@GetMapping("/getByName/{name}")
	public ResponseEntity<List<Student>> getByName(@PathVariable("name") String name){
		List<Student> list=dao.findByName(name);
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<Student> updateExistStudent(@RequestBody Student student){
		Optional<Student> opt=dao.findById(student.getRoll());
		if(opt.isPresent()) {
		Student student2=	dao.save(student);
			return new ResponseEntity<>(student2,HttpStatus.OK);
		}
		else {
			throw new StudentException("student not found");
		}
	}
	
	@PutMapping("/updateMark/{roll}/{grace}")
	public ResponseEntity<Student> UpdateMark(@PathVariable("roll") Integer roll, @PathVariable("grace") Integer marks){
//		Student student=dao.findById(roll).orElseThrow(()-> new StudentException("student not found"));
		Optional<Student> opt=dao.findById(roll);
		if(opt.isPresent()) {
		Student student=opt.get();
		student.setMarks(student.getMarks()+marks);
		dao.save(student);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
		}
		else {
		throw new StudentException("student not found by that Id");	
		}
	}
	@GetMapping("/getBymark/{marks}/{name}")
	public ResponseEntity<List<Student>> ByNameAndMarks(@PathVariable("marks") Integer marks,@PathVariable("name") String name){
		List<Student> list=dao.findByMarksAndName(marks, name);
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
	}

	@GetMapping("/Lessmarks/{marks}")
	public ResponseEntity<List<Student>> LessMarks(@PathVariable("marks") Integer marks){
		List<Student> list=dao.findByMarksLessThan(1000);
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/LessmarksEqual/{marks}")
	public ResponseEntity<List<Student>> LessMarksEqual(@PathVariable("marks") Integer marks){
		List<Student> list=dao.findByMarksLessThanEqual(marks);
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/Greatermarks/{marks}")
	public ResponseEntity<List<Student>> GreaterMarks(@PathVariable("marks") Integer marks){
		List<Student> list=dao.findByMarksGreaterThan(marks);
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/betweenmarks/{first}/{last}")
	public ResponseEntity<List<Student>> Between(@PathVariable("first") Integer f, @PathVariable("last") Integer l){
		List<Student> list=dao.findByMarksBetween(f, l);
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
	}
	@GetMapping("/TopFive/{m}")
	public ResponseEntity<List<Student>> TopFive(@PathVariable("m") Integer marks){
		List<Student> list=dao.findTop2ByMarks(marks);
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
	}
	
}
