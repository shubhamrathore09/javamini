package exceptionPackage;

public class GymException extends Exception{
	public GymException() {
		
	}
	public GymException(String name) {
		System.out.println(name);
	}
}
