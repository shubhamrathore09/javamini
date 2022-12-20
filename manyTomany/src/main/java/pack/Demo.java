package pack;

import java.awt.geom.CubicCurve2D;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("employeeUnit");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Student student=new Student();
		student.setAddress("bhopal");
		student.setName("shubham");
		
		
		Student student1=new Student();
		student1.setAddress("swhorw");
		student1.setName("banti");
		
		Student student2=new Student();
		student2.setAddress("doraha");
		student2.setName("rahul");
		
		Course course =new Course();
		course.setCourseName("java");
		course.setDay(5);
		course.setFee(45500);
		
		Course course1 =new Course();
		course1.setCourseName("python");
		course1.setDay(4);
		course1.setFee(4500);
		
		Course course2 =new Course();
		course2.setCourseName("react");
		course2.setDay(9);
		course2.setFee(500);
		
		
		
		
		List<Student> s=new ArrayList<Student>();
		s.add(student);
		s.add(student1);
		s.add(student2);
		
		List<Course> c=new ArrayList<Course>();
		c.add(course2);
		c.add(course);
		c.add(course1);
		
		course.setList(s);
		course1.setList(s);
		course2.setList(s);
		
		student.setList(c);
		student1.setList(c);
		student2.setList(c);
		
		em.persist(student);
		em.persist(student1);
		em.persist(student2);
		em.getTransaction().commit();
		em.close();
	}
}
