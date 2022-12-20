package animal;

import javax.persistence.*;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GeneratorType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="Animal",discriminatorType = DiscriminatorType.STRING)
public class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String name;
	public Animal(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	public Animal(String name) {
		super();
		this.name = name;
	}
	public Animal() {
		super();
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Animal [Id=" + Id + ", name=" + name + "]";
	}
}
