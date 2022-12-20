package pack;

public class Travel {
	Vehicle v;
	public Travel(Vehicle v) {
		this.v=v;
	}
	public Travel() {
		
	}
	public Vehicle getV() {
		return v;
	}
	public void setV(Vehicle v) {
		this.v = v;
	}
	public void journey() {
		v.go();
		System.out.println("journey started");
	}
}
