package employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connection {
	private static EntityManagerFactory emf;
	static {
		emf=Persistence.createEntityManagerFactory("employeeUnit");
	}
	public static EntityManager ProvideConnection() {
		EntityManager em=emf.createEntityManager();
		return em;
	}
	
}
