package employee;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	@Column(name="name")
	private String name;
	@Column(name="salary")
	private int salary;
	@Column(name="address")
	private String address;
	public Employee(int id, String name, int salary, String address) {
		super();
		this.empId = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	public Employee(String name, int salary, String address) {
		super();
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	
	public Employee() {
		super();
	}
	public int getId() {
		return empId;
	}
	public void setId(int id) {
		empId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + empId + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

	
}
