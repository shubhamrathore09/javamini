package ad;

import javax.persistence.Embeddable;
import javax.persistence.Table;

import address.Address;
@Embeddable
@Table(name="Employee_address")
public class Add {
	private String city;
	private String state;
	private int pincode;
	private String AddressName;
	
	public Add(String city, String state, int pincode,String AddressName) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.AddressName=AddressName;
	}
	public Add() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
//		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + pincode;
//		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		Add a1=this;
		Add a2=(Add)obj;
		return a1.pincode==a2.pincode;
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
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public String getAddressName() {
		return AddressName;
	}
	public void setAddressName(String addressName) {
		AddressName = addressName;
	}
	@Override
	public String toString() {
		return "Add [city=" + city + ", state=" + state + ", pincode=" + pincode + ", AddressName=" + AddressName + "]";
	}
	
	
	
	
}
