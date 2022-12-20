package pack;

import javax.persistence.*;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="EmpId")
	private int eId;
	@Column(name="name")
	private String name;
	@Column(name="salary")
	private int salary;
	
	@ManyToOne
	private Department department;

	public Employee(int eId, String name, int salary, Department department) {
		super();
		this.eId = eId;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public Employee(String name, int salary, Department department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public Employee() {
		super();
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
}
