package employee;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;

@Entity
public class Address {
	@Id
	private int AddID;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Employee employee;


	

	public Address(int addID, String name) {
		super();
		AddID = addID;
		this.name = name;
	}


	public Address(String name, Employee employee) {
		super();
		this.name = name;
		this.employee = employee;
	}

	public int getAddID() {
		return AddID;
	}

	public void setAddID(int addID) {
		AddID = addID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Address [AddID=" + AddID + ", name=" + name + ", employee=" + employee + "]";
	}
	
	
	
}
