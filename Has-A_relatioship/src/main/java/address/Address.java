package address;

import javax.persistence.Column;
import javax.persistence.Embeddable;


public class Address {
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="pi")
	private String pincode;
	public Address(String city, String state, String pincode) {
		super();
		this.city = city;
		this.state = state;
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
//		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((pincode == null) ? 0 : pincode.hashCode());
//		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
	Address a1=(Address) obj;
	Address a2=this;
	return a1.pincode==a2.pincode;
	}
	
	
	
}
