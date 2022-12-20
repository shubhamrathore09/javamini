package employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class Demo {
	
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("employeeUnit");
	EntityManager em=emf.createEntityManager();
	
	int query=em.createNativeQuery("insert into Employee(name, salary, address) value(?,?,?)",Employee.class)
			.setParameter(1, "shubham")
			.setParameter(2,300)
			.setParameter(3, "bhopal")
			.executeUpdate();
//	List<Employee >list=query.getResultList();
//	System.out.println(list);

}
}
