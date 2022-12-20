package pack;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Did;
	private String Dname;
	
	@OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
	private  List<Employee> list;

	public Department(int did, String dname, List<Employee> list) {
		super();
		Did = did;
		Dname = dname;
		this.list = list;
	}

	public Department(String dname, List<Employee> list) {
		super();
		Dname = dname;
		this.list = list;
	}

	public Department() {
		super();
	}

	public int getDid() {
		return Did;
	}

	public void setDid(int did) {
		Did = did;
	}

	public String getDname() {
		return Dname;
	}

	public void setDname(String dname) {
		Dname = dname;
	}

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}
}
