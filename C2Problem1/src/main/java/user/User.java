package user;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(query = "select u from User u where u.name=:id",name = "idd")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	
	@ElementCollection
	@Embedded
	private Set<PhoneNumber> numbers;

	public User(int userId, String name, String email, Set<PhoneNumber> numbers) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.numbers = numbers;
	}

	public User(String name, String email, Set<PhoneNumber> numbers) {
		super();
		this.name = name;
		this.email = email;
		this.numbers = numbers;
	}

	public User() {
		super();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public Set<PhoneNumber> getNumbers() {
		return numbers;
	}

	public void setNumbers(Set<PhoneNumber> numbers) {
		this.numbers = numbers;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", numbers=" + numbers + "]";
	}
	
	
	
	
}
