package myProduct;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("employeeUnit");
		EntityManager em=emf.createEntityManager();
//		Book myProduct=new Book(3, "lion", "shubham");
		Pen myProduct=new Pen(2, "cello", "white");
		em.getTransaction().begin();
		em.persist(myProduct);
		em.getTransaction().commit();
		em.close();
	}
}
