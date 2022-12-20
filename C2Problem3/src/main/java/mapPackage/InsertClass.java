package mapPackage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertClass {
	//insert four data into partimeinstructor
	public static void PartTime() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("userUnit");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Instructor obj=new PartTimeInstructor("rajendar", 32, 100, "9685769524");
		Instructor obj1=new PartTimeInstructor("banti", 15, 2000, "69524");
		Instructor obj2=new PartTimeInstructor("vijay", 10, 2500, "769524");
		Instructor obj3=new PartTimeInstructor("rajat", 2, 21000, "85769");
		em.persist(obj);
		em.persist(obj1);
		em.persist(obj2);
		em.persist(obj3);
		em.getTransaction().commit();
		em.close();
		System.out.println("added succefully");
	}
	
	public static void FullTime() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("userUnit");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Instructor obj1=new FullTimeInstructor("aman", 320000, "aman@123");
		Instructor obj2=new FullTimeInstructor("albart", 400000, "albart@123");
		Instructor obj3=new FullTimeInstructor("nrupul", 600000, "nrupul@123");
		Instructor obj4=new FullTimeInstructor("zakir", 50000, "zakir@123");
		
		em.persist(obj1);
		em.persist(obj2);
		em.persist(obj3);
		em.persist(obj4);
		em.getTransaction().commit();
		em.close();
		System.out.println("added succefully");
	}
	public static void main(String[] args) {
		FullTime();
		PartTime();
		
	}
}
