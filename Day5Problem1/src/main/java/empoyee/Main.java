package empoyee;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void method() {
		Scanner sc=new Scanner(System.in);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("employeeUnit");
		EntityManager em=emf.createEntityManager();
		System.out.println("Please enter name");
		String name=sc.next();
		System.out.println("please enter gender");
		String gender=sc.next();
		System.out.println("please enter salary");
		int salary=sc.nextInt();
		System.out.println("please enter temprary Address");
		System.out.println("please enter state");
		String state=sc.next();
		System.out.println("please enter city");
		String city=sc.next();
		System.out.println("please enter pincode");
		String pincode =sc.next();
		System.out.println("please enter address type");
		String type=sc.next();
		
		
		System.out.println("please enter parmanent Address");
		System.out.println("please enter state");
		String state2=sc.next();
		System.out.println("please enter city");
		String city2=sc.next();
		System.out.println("please enter pincode");
		String pincode2 =sc.next();
		System.out.println("please enter address type");
		String type2=sc.next();
		
		Set<Address> set=new HashSet<Address>();
		set.add(new Address(state, city, pincode, type));
		set.add(new Address(state2, city2, pincode2, type2));
		
		Employee employee=new Employee(name, gender, salary, set);

		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		em.clear();
	}
	public static void main(String[] args) {
		method();
		System.out.println("Succefully ragistration done");
	}
}
