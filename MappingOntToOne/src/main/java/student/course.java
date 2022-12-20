package student;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
@Embeddable
public class course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CourseId;
	
	private String courseName;

	public course(int courseId, String courseName) {
		super();
		CourseId = courseId;
		this.courseName = courseName;
	}

	
	
	public course(String courseName) {
		super();
		this.courseName = courseName;
	}



	public course() {
		super();
	}

	public int getCourseId() {
		return CourseId;
	}

	public void setCourseId(int courseId) {
		CourseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "course [CourseId=" + CourseId + ", courseName=" + courseName + "]";
	}
	
	
	
}
