package employee;

import javax.persistence.Embeddable;

public class Address {
	private String city;
	private String state;
	private String type;
	private int pincode;
	public Address(String city, String state, String type, int pincode) {
		super();
		this.city = city;
		this.state = state;
		this.type = type;
		this.pincode = pincode;
	}
	public Address() {
		super();
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", type=" + type + ", pincode=" + pincode + "]";
	}
	
}
