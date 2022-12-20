package mapPackage;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PartTimeDemo {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("userUnit");
		EntityManager em=emf.createEntityManager();
		Query query=em.createQuery("select e from PartTimeInstructor e");
		List<Instructor> list=query.getResultList();
		for(Instructor i:list) {
			System.out.println(i);
		}
	}
}
