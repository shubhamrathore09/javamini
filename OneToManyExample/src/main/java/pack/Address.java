package pack;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Aid;
	private String city;
	private int zipcode;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Student> list;

	public Address(int aid, String city, int zipcode, List<Student> list) {
		super();
		Aid = aid;
		this.city = city;
		this.zipcode = zipcode;
		this.list = list;
	}

	public Address(String city, int zipcode, List<Student> list) {
		super();
		this.city = city;
		this.zipcode = zipcode;
		this.list = list;
	}

	public Address() {
		super();
	}

	public int getAid() {
		return Aid;
	}

	public void setAid(int aid) {
		Aid = aid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}
	
	
	
}
