package packageForOperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProvideConnection {
private static EntityManagerFactory emf;
static {
	emf=Persistence.createEntityManagerFactory("employeeUnit");
	
}
public static EntityManager Provided() {
	return emf.createEntityManager();
}
}
