package pack;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Sid;
	private String name;
	public Student(int sid, String name) {
		super();
		Sid = sid;
		this.name = name;
	}

	
	public Student( String name) {
		super();
		
		this.name = name;
	}

	public Student() {
		
	}


	public int getSid() {
		return Sid;
	}


	public void setSid(int sid) {
		Sid = sid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", name=" + name + "]";
	}
	

}
