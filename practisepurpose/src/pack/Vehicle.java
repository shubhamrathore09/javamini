package pack;

public interface Vehicle {
	
	public void go();

}

class car implements Vehicle{
	
	public void start() {
		System.out.println("car start");
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		start();
	}
	
}
class bike implements Vehicle{
	public void bikes() {
		System.out.println("bike started");
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		bikes();
		
	}
}
