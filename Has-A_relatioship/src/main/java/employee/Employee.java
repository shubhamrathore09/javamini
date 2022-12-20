package employee;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ad.Add;
import address.Address;
import home_address.HomeAddress;
@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="salary")
	private int salary;
	
	
	@Embedded
	@ElementCollection
	private Set<Add> set;


	public Employee(int id, String name, int salary, Set<Add> set) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.set = set;
	}


	public Employee(String name, int salary, Set<Add> set) {
		super();
		this.name = name;
		this.salary = salary;
		this.set = set;
	}


	public Employee() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public Set<Add> getSet() {
		return set;
	}


	public void setSet(Set<Add> set) {
		this.set = set;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", set=" + set + "]";
	}
}
