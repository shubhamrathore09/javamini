package course;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import exception.StudentException;
import student.Student;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courseId;
	private String name;
	private int duration;
	private int fee;
	public Course(int courseId, String name, int duration, int fee) {
		super();
		this.courseId = courseId;
		this.name = name;
		this.duration = duration;
		this.fee = fee;
	}
	public Course(String name, int duration, int fee) {
		super();
		this.name = name;
		this.duration = duration;
		this.fee = fee;
	}
	public Course() {
		super();
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", name=" + name + ", duration=" + duration + ", fee=" + fee + "]";
	}
	
	
	
		
	
	
	
}
