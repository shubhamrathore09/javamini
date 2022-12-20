package myProduct;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("pen")
public class Pen extends MyProduct{
	
	private String color;

	public Pen(int id, String name, String color) {
		super(id, name);
		this.color = color;
	}

	public Pen() {
		
	}
	
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Pen [color=" + color + "]";
	}
	
	
	
}
