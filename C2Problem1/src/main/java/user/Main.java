package user;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {
	public static void inserMethod() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("userUnit");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		Set<PhoneNumber> set=new HashSet<PhoneNumber>();
		set.add(new PhoneNumber(1, "45444554545", "office"));
		set.add(new PhoneNumber(2, "45455545", "home"));
		set.add(new PhoneNumber(3, "4855555545", "lendline"));
		User user=new User("prateek", "prateek@123", set);
		
		Set<PhoneNumber> set1=new HashSet<PhoneNumber>();
		set1.add(new PhoneNumber(4, "858585858", "office"));
		set1.add(new PhoneNumber(5, "696858585858", "home"));
		set1.add(new PhoneNumber(6, "88998585858", "lendline"));
//		
		User user2=new User("nrupul", "nrupul@123", set1);
		
		em.persist(user);
		em.persist(user2);
		
		em.getTransaction().commit();
		
		em.clear();
		
		//data add as per mention in question
	}
	
	public static void gettingByName(String name) throws UserNotFoundException {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("userUnit");
		EntityManager em=emf.createEntityManager();
		
//		Query query=em.createQuery("select u from User u " + "where u.name " + "?1");
		
		Query query=em.createNamedQuery("idd");
	   	query.setParameter("id", name); 
		List< User> list=query.getResultList();
		if(list.size()==0) {
			throw new UserNotFoundException("userNotFound");
		}
		
		else {	
for(User i: list) {
	System.out.println(i);
     }
   }	
}
	public static void main(String[] args) {
	
//		try {
//			gettingByName("alber");
//		} catch (UserNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
		inserMethod();
	}
}
