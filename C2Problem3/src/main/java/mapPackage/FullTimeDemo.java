package mapPackage;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FullTimeDemo {
	
	public static void getAllFullTime() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("userUnit");
		EntityManager em=emf.createEntityManager();
		Query query=em.createQuery("select e from FullTimeInstructor e");
		List<Instructor> list=query.getResultList();
		for(Instructor i:list) {
			System.out.println(i);
		}
	}
	
	public static void getFullTimeInstructorById(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("userUnit");
		EntityManager em=emf.createEntityManager();
		Query query=em.createNamedQuery("full");
		query.setParameter("id", id);
		List<Instructor>list=query.getResultList();
		for(Instructor i:list) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
	getFullTimeInstructorById(2);
	}
}
