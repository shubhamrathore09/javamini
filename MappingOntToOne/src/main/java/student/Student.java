package student;

import javax.persistence.*;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String name;
	
	@Embedded
	private course course;
	
	public Student(int id, String name, course course) {
		super();
		Id = id;
		this.name = name;
		this.course = course;
	}

	public Student(String name, course course) {
		super();
		this.name = name;
		this.course = course;
	}
	
	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", course=" + course + "]";
	}
		
}
