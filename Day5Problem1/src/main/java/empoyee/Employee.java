package empoyee;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String name;
	private String gender;
	private int salary;
	@ElementCollection
	@Embedded
	private Set<Address> addresses=new HashSet<Address>();

	public Employee(int empId, String name, String gender, int salary, Set<Address> addresses) {
		super();
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.addresses = addresses;
	}

	public Employee(String name, String gender, int salary, Set<Address> addresses) {
		super();
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.addresses = addresses;
	}
	

	public Employee() {
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", gender=" + gender + ", salary=" + salary
				+ ", addresses=" + addresses + "]";
	}
}
