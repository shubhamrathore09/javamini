package mapPackage;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(query = "select e from FullTimeInstructor e where e.InstructorId=:id", name="full")
public class FullTimeInstructor extends Instructor{
	private int salary;
	private String email;
	public FullTimeInstructor(int instructorId, String instructorName, int salary, String email) {
		super(instructorId, instructorName);
		this.salary = salary;
		this.email = email;
	}
	public FullTimeInstructor( String instructorName, int salary, String email) {
		super( instructorName);
		this.salary = salary;
		this.email = email;
	}
	
	
	
	public FullTimeInstructor() {
		
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "FullTimeInstructor [salary=" + salary + ", email=" + email + ", getInstructorId()=" + getInstructorId()
				+ ", getInstructorName()=" + getInstructorName() + "]";
	}
	
	
}
