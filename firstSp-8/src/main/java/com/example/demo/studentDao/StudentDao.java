package com.example.demo.studentDao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Student;


public interface StudentDao extends JpaRepository<Student, Integer>{
	public  List<Student> findByName(String name);
	public List<Student> findByMarksAndName(Integer marks, String name);
	public List<Student> findByMarksLessThan(Integer marks);
	public List<Student> findByMarksGreaterThan(Integer marks);
	public List<Student> findByMarksBetween(Integer s, Integer e);
	public List<Student> findByMarksLessThanEqual(Integer marks);
	public List<Student> findTop2ByMarks(Integer marks);
	
	@Query("select s.name from Student s where s.roll=:roll")
	public String getStudentNameByRoll(@Param("roll") int roll);
	
	
}
