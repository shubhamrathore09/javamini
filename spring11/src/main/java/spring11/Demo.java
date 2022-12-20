package spring11;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("userUnit");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Student s1=ctx.getBean(Student.class,"oo");
		s1.setName("shubham");
		s1.setAddress("bhopal");
		System.out.println(s1.getName());
		em.persist(s1);
		em.getTransaction().commit();
		em.clear();
		System.out.println("succefully add student table and data");
	}
}
