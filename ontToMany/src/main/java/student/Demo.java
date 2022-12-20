package student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("employeeUnit");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		Address address=new Address(1, "bhopal", "5454");
		
		Student student=new Student("shubham", address);
		
		em.persist(student);
		
		em.getTransaction().commit();
		
		em.close();
		
		
		
	}
}
