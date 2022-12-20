package pack;

public class Person {
	private int P_id;
	private String P_name;

	private int p_age;

	public Person(int p_id, String p_name, int p_age) {
		super();
		P_id = p_id;
		P_name = p_name;
		this.p_age = p_age;
	}


	public Person() {
		super();
	}


	public int getP_id() {
		return P_id;
	}


	public void setP_id(int p_id) {
		P_id = p_id;
	}


	public String getP_name() {
		return P_name;
	}


	public void setP_name(String p_name) {
		P_name = p_name;
	}


	public int getP_age() {
		return p_age;
	}


	public void setP_age(int p_age) {
		this.p_age = p_age;
	}


	@Override
	public String toString() {
		return "Person [P_id=" + P_id + ", P_name=" + P_name + ", p_age=" + p_age + "]";
	}
	

}
