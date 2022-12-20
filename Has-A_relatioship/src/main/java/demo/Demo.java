package demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import ad.Add;
import address.Address;
import employee.Employee;
import enUTI.Connection;
import home_address.HomeAddress; 

public class Demo {
	public static void method() {
		EntityManager em=Connection.ProvideConnection();
		String str="select e from Employee e where name='gopi'";
		Query query=em.createQuery(str);
		List<Employee> list=query.getResultList();
		for(Employee i:list) {
			Set<Add> ad=i.getSet();
			for(Add j: ad) {
				System.out.println(j.getAddressName());
			}
		}
	}
	public static void main(String[] args) {
//		EntityManager em=Connection.ProvideConnection();
//		em.getTransaction().begin();
//		Add add1=new Add("doraha", "mp", 46661,"home");
//		Add add2=new Add("bhopal", "mp", 4661, "firstWork");
//		Add add3=new Add("pune", "maha", 6661,"secondWork");
//		Add add4=new Add("delhi", "delhi", 66661,"thirdWork");
//		Add add5=new Add("patan", "bihar", 61,"office");
//		Set<Add> set=new HashSet<Add>();
//		set.add(add1);
//		set.add(add2);
//		set.add(add3);
//		set.add(add4);
//		set.add(add5);
//		Employee employee=new Employee("pune", 4554545, set);
//		em.persist(employee);
//		em.getTransaction().commit();
//		em.clear();
		method();
		
	}
}
