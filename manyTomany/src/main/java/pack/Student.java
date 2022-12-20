package pack;

import java.util.List;

import javax.persistence.*;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String name;
	private String address;
	
	@ManyToMany(cascade =  CascadeType.ALL)
	private List<Course> list;

	public Student(int id, String name, String address, List<Course> list) {
		super();
		Id = id;
		this.name = name;
		this.address = address;
		this.list = list;
	}

	public Student(String name, String address, List<Course> list) {
		super();
		this.name = name;
		this.address = address;
		this.list = list;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Course> getList() {
		return list;
	}

	public void setList(List<Course> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", address=" + address + ", list=" + list + "]";
	}
}
