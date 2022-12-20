package vehicle;

public class Travel {
	private int numberOfPassengers;
	private Vehicle type;
	
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}
	
	public void journey() {
		type.go();
		System.out.println(numberOfPassengers);
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	public Vehicle getType() {
		return type;
	}

	public void setType(Vehicle type) {
		this.type = type;
	}

	public Travel() {
		super();
	}

	public Travel(int numberOfPassengers, Vehicle type) {
		super();
		this.numberOfPassengers = numberOfPassengers;
		this.type = type;
	}	
}
