package employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("employeeUnit");
	EntityManager em=emf.createEntityManager();
	em.getTransaction().begin();
	
	
	Address address=new Address(3,2,"adsf");
	
	Employee employee=new Employee("shubham", address);

	em.persist(employee);
	em.getTransaction().commit();
	em.close();
}
}
