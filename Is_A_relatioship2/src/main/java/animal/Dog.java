package animal;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="petId")
public class Dog extends Animal{
	private String spicial;
	public Dog(int id, String name, String spicial) {
		super(id, name);
		this.spicial = spicial;
	}
	public Dog( String name, String spicial) {
		super( name);
		this.spicial = spicial;
	}
	public Dog() {
	
	}
	public String getSpicial() {
		return spicial;
	}
	public void setSpicial(String spicial) {
		this.spicial = spicial;
	}
	@Override
	public String toString() {
		return "Dog [spicial=" + spicial + "]";
	}
	
}
