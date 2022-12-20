package employeeDao;

import java.util.List;

import employee.Employee;
import employee.EmployeeException;

public interface EmployeeDao {
	public List<Employee> getAllEmployee() throws EmployeeException;
	public List<Employee> getEmployeeByAddress(String name) throws EmployeeException;
	public List<Employee> getEmployeeRangeSalary(int startSalary, int EndSalary) throws EmployeeException;
	public Object[] getEmployeeNameAndSalary(int empId) throws EmployeeException;
	public int getEmployeeSalary(int empId) throws EmployeeException;
	
}
