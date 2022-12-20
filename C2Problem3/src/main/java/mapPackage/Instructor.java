package mapPackage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
abstract class Instructor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int InstructorId;
	private String InstructorName;
	public Instructor(int instructorId, String instructorName) {
		super();
		InstructorId = instructorId;
		InstructorName = instructorName;
	}
	public Instructor(String instructorName) {
		super();
		InstructorName = instructorName;
	}
	
	public Instructor() {
		super();
	}
	public int getInstructorId() {
		return InstructorId;
	}
	public void setInstructorId(int instructorId) {
		InstructorId = instructorId;
	}
	public String getInstructorName() {
		return InstructorName;
	}
	public void setInstructorName(String instructorName) {
		InstructorName = instructorName;
	}
	@Override
	public String toString() {
		return "Instructor [InstructorId=" + InstructorId + ", InstructorName=" + InstructorName + "]";
	}
}




