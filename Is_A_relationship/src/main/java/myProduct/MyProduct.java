package myProduct;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name="product")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="product_type",discriminatorType = DiscriminatorType.STRING)
public class MyProduct {
	@Id
	private int Id;
	private String name;
	public MyProduct(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	public MyProduct() {
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
		return "MyProduct [Id=" + Id + ", name=" + name + "]";
	}
}
