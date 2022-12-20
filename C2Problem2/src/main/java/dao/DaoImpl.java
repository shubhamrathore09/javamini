package dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import course.Course;
import exception.CourseException;
import exception.StudentException;
import student.Student;

public class DaoImpl implements Dao{

	public void addCourse() {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("userUnit");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Course course1=new Course("java", 4894, 5454);
		Course course2=new Course("java", 4894, 5454);
		em.persist(course1);
		em.persist(course2);
		
		em.getTransaction().commit();
		em.close();
	}

	public void getStudent(int rollNo) throws StudentException {
		// TODO Auto-generated method stub
		
	}

	public void getCourse(int course) throws CourseException {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		Dao obj=new DaoImpl();
		obj.addCourse();
	}

}
