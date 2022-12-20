package employee;

import java.util.Set;

import javax.persistence.*;

@Entity
@NamedQuery(query = "select e from Employee e where e.address=:add",name="id")
@NamedQuery(query = "select e from Employee e where e.Id=:id",name="empId")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String name;
	private int salary;
	private String address;
	public Employee(int id, String name, int salary, String address) {
		super();
		Id = id;
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
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
		return "Employee [Id=" + Id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

}
