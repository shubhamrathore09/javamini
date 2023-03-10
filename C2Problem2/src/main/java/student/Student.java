package student;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import course.Course;
@Entity
public class Student {
	@Id
	private int rollNo;
	private String name;
	private String email;
	private String mobile;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Course course;

	public Student(int rollNo, String name, String email, String mobile, Course course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.course = course;
	}
	
	

	public Student(String name, String email, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}



	public Student(String name, String email, String mobile, Course course) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.course = course;
	}

	public Student() {
		super();
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", course="
				+ course + "]";
	}
	
	
	
}
