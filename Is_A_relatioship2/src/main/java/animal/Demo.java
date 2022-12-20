package animal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("employeeUnit");
		EntityManager em=emf.createEntityManager();
		Animal animal=new Dog("jurman", "black");
		em.getTransaction().begin();
		em.persist(animal);
		em.getTransaction().commit();
		em.clear();
	}
}
