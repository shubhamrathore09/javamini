package pack;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Cid;
	private String courseName;
	private int Day;
	private int fee;
	
	@ManyToMany
	private List<Student> list;

	public Course(int cid, String courseName, int day, int fee, List<Student> list) {
		super();
		Cid = cid;
		this.courseName = courseName;
		Day = day;
		this.fee = fee;
		this.list = list;
	}

	public Course(String courseName, int day, int fee, List<Student> list) {
		super();
		this.courseName = courseName;
		Day = day;
		this.fee = fee;
		this.list = list;
	}
	public Course() {
		super();
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDay() {
		return Day;
	}
	public void setDay(int day) {
		Day = day;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public List<Student> getList() {
		return list;
	}
	public void setList(List<Student> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Course [Cid=" + Cid + ", courseName=" + courseName + ", Day=" + Day + ", fee=" + fee + ", list=" + list
				+ "]";
	}	
}
