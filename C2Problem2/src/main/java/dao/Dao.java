package dao;

import exception.CourseException;
import exception.StudentException;

public interface Dao {
	public void addCourse();
	
	public void getStudent(int rollNo) throws StudentException;
	public void getCourse(int course) throws CourseException;
	
	
}
