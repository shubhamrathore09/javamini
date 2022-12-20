package mapPackage;

import javax.persistence.Entity;

@Entity
public class PartTimeInstructor extends Instructor{
	
	
	int NoOfSession;
	int CostPerSession;
	String number;
	public PartTimeInstructor(int instructorId, String instructorName, int noOfSession, int costPerSession,
			String number) {
		super(instructorId, instructorName);
		NoOfSession = noOfSession;
		CostPerSession = costPerSession;
		this.number = number;
	}
	public PartTimeInstructor( String instructorName, int noOfSession, int costPerSession,
			String number) {
		super( instructorName);
		NoOfSession = noOfSession;
		CostPerSession = costPerSession;
		this.number = number;
	}
	public PartTimeInstructor() {
		
	}
	public int getNoOfSession() {
		return NoOfSession;
	}
	public void setNoOfSession(int noOfSession) {
		NoOfSession = noOfSession;
	}
	public int getCostPerSession() {
		return CostPerSession;
	}
	public void setCostPerSession(int costPerSession) {
		CostPerSession = costPerSession;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "PartTimeInstructor [NoOfSession=" + NoOfSession + ", CostPerSession=" + CostPerSession + ", number="
				+ number + ", getInstructorId()=" + getInstructorId() + ", getInstructorName()=" + getInstructorName()
				+ "]";
	}
		
}
