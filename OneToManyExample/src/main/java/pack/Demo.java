package pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.internal.build.AllowSysOut;

public class Demo {	
	public static void insert() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("employeeUnit");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		Department department=new Department();
		Department dep1=new Department();
		dep1.setDname("medical");
		department.setDname("engineering");
		
		Employee employee=new Employee();
		employee.setName("shubham");
		employee.setSalary(8555);
		employee.setDepartment(department);
		
		Employee employee2=new Employee();
		employee2.setDepartment(department);
		employee2.setName("sahul");
		employee2.setSalary(78555);
		
		
		Employee employee3=new Employee();
		employee3.setDepartment(department);
		employee3.setName("raghu");
		employee3.setSalary(7855);
		
		Employee employee4=new Employee();
		employee4.setDepartment(dep1);
		employee4.setName("ravi");
		employee4.setSalary(78055);
		
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(employee);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		
		department.setList(list);
		dep1.setList(list);
		
		
		em.persist(department);
		em.persist(dep1);
		
		em.getTransaction().commit();
		
		em.clear();
	}
	public static void find(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("employeeUnit");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Employee employee=em.find(Employee.class, id);
		System.out.println(employee.getDepartment().getDname());
	}
public static void main(String[] args) {
	
//	find(7);
	insert();
   }

}
