package application;

import java.util.List;

import javax.persistence.*;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int P_id;
	private String P_name;
	private String P_email;
	private String P_mobile;
	
	
	@ManyToMany( cascade = CascadeType.ALL)
	private List<Gym> glist;

	public Person(int p_id, String p_name, String p_email, String p_mobile, List<Gym> glist) {
		super();
		P_id = p_id;
		P_name = p_name;
		P_email = p_email;
		P_mobile = p_mobile;
		this.glist = glist;
	}

	public Person(String p_name, String p_email, String p_mobile, List<Gym> glist) {
		super();
		P_name = p_name;
		P_email = p_email;
		P_mobile = p_mobile;
		this.glist = glist;
	}
	
	

	public Person(String p_name, String p_email, String p_mobile) {
		super();
		P_name = p_name;
		P_email = p_email;
		P_mobile = p_mobile;
	}

	public Person() {
		super();
	}

	public int getP_id() {
		return P_id;
	}

	public void setP_id(int p_id) {
		P_id = p_id;
	}

	public String getP_name() {
		return P_name;
	}

	public void setP_name(String p_name) {
		P_name = p_name;
	}

	public String getP_email() {
		return P_email;
	}

	public void setP_email(String p_email) {
		P_email = p_email;
	}

	public String getP_mobile() {
		return P_mobile;
	}

	public void setP_mobile(String p_mobile) {
		P_mobile = p_mobile;
	}

	public List<Gym> getGlist() {
		return glist;
	}

	public void setGlist(List<Gym> glist) {
		this.glist = glist;
	}

	@Override
	public String toString() {
		return "Person [P_id=" + P_id + ", P_name=" + P_name + ", P_email=" + P_email + ", P_mobile=" + P_mobile
				+ ", glist=" + glist + "]";
	}
	
	
	
}
