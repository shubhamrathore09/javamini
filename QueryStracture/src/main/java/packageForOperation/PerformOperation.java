package packageForOperation;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import employee.Employee;

import java.util.*;



public class PerformOperation {
	public static void main(String[] args) {
		EntityManager em=ProvideConnection.Provided();
		
		Query query =em.createQuery("insert into employee");
		
		query.executeUpdate();
	}
}
