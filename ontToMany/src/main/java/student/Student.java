package student;

import javax.persistence.*;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Address address;

	public Student(int id, String name, Address address) {
		super();
		Id = id;
		this.name = name;
		this.address = address;
	}
	
	public Student() {
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

	public Student(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
