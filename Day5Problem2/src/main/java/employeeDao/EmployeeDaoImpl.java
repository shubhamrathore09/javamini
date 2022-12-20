package employeeDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import employee.Connection;
import employee.Employee;
import employee.EmployeeException;

public class EmployeeDaoImpl implements EmployeeDao{

	public List<Employee> getAllEmployee() throws EmployeeException {
		EntityManager em=Connection.ProvideConnection();
		Query query=em.createQuery("select e from Employee e");
		if(query==null) {
			throw new EmployeeException("no data found");
		}
		else {
			List<Employee> list=query.getResultList();
			return list;
		}
		
	}

	public List<Employee> getEmployeeByAddress(String name) throws EmployeeException {
		
		EntityManager em=Connection.ProvideConnection();
		Query query=em.createNamedQuery("id");
		query.setParameter("add", name);
		List<Employee> list=query.getResultList();
		if(list.size()==0) {
			throw new EmployeeException("no address by that place "+name);
		}
		else {
			return list;
		}
		
	}

	public List<Employee> getEmployeeRangeSalary(int startSalary, int EndSalary) throws EmployeeException {
		EntityManager em=Connection.ProvideConnection();
		
		Query query=em.createQuery("select e from Employee e " + "where e.salary " + "BETWEEN ?1 AND ?2");
		query.setParameter(1, startSalary);
		query.setParameter(2, EndSalary);
		List<Employee> list=query.getResultList();
		
		if(list.size()==0) {
			throw new EmployeeException("No employee available in that amount of salary "+ startSalary +" And "+ EndSalary);
		}
		else
		return list;
	}

	public Object[] getEmployeeNameAndSalary(int empId) throws EmployeeException {
		EntityManager em=Connection.ProvideConnection();
		Query query=em.createNativeQuery("select e from Employee e " + "where e.id " + "?1");
		query.setParameter(1, empId);
//		List<Employee> list=query.getResultList();
//		System.out.println(query.getSingleResult());
		
		
		
//		System.out.println(list);
		return null;
	}

	public int getEmployeeSalary(int empId) throws EmployeeException {
		EntityManager em=Connection.ProvideConnection();
		Query query=em.createNamedQuery("empId");
		query.setParameter("id", empId);
		List<Employee>list=query.getResultList();
//		List<Employee> list=query.getResultList();
		Employee employee=list.get(0);
		return employee.getSalary();
	}
	

}
