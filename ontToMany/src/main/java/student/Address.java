package student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	@Id
	private int AId;
	private String city;
	private String zipcode;
	public Address(int aId, String city, String zipcode) {
		super();
		AId = aId;
		this.city = city;
		this.zipcode = zipcode;
	}
	public Address(String city, String zipcode) {
		super();
		this.city = city;
		this.zipcode = zipcode;
	}
	public Address() {
		super();
	}
	public int getAId() {
		return AId;
	}
	public void setAId(int aId) {
		AId = aId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [AId=" + AId + ", city=" + city + ", zipcode=" + zipcode + "]";
	}
}
