package employee;

import javax.persistence.*;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@Column(name="EmpID")
	private int Id;
	private String name;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="AddID")
	private Address address;

	public Employee(int id, String name, Address address) {
		super();
		Id = id;
		this.name = name;
		this.address = address;
	}

	public Employee(String name, Address address) {
		super();
		this.name = name;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
