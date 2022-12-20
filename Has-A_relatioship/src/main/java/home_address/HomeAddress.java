package home_address;

import javax.persistence.Embeddable;


public class HomeAddress {
	private String home_city;
	private String home_state;
	private String home_pincode;
	public HomeAddress(String home_city, String home_state, String home_pincode) {
		super();
		this.home_city = home_city;
		this.home_state = home_state;
		this.home_pincode = home_pincode;
	}
	public HomeAddress() {
		super();
	}
	public String getHome_city() {
		return home_city;
	}
	public void setHome_city(String home_city) {
		this.home_city = home_city;
	}
	public String getHome_state() {
		return home_state;
	}
	public void setHome_state(String home_state) {
		this.home_state = home_state;
	}
	public String getHome_pincode() {
		return home_pincode;
	}
	public void setHome_pincode(String home_pincode) {
		this.home_pincode = home_pincode;
	}
	@Override
	public String toString() {
		return "HomeAddress [home_city=" + home_city + ", home_state=" + home_state + ", home_pincode=" + home_pincode
				+ "]";
	}
	
}
