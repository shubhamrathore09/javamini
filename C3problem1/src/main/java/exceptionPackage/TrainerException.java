package exceptionPackage;

public class TrainerException extends Exception{
	public TrainerException() {
		
	}
	public TrainerException(String name) {
		System.out.println(name);
	}
}
