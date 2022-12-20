package student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("employeeUnit");
		EntityManager em=emf.createEntityManager();
		
		course course=new course("java");
		
		Student student=new Student("shubham", course);
		em.getTransaction().begin();
		
		em.persist(student);
		
		em.getTransaction().commit();
		
		em.clear();
		
		
		
	}
}
