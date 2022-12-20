package exception;

public class StudentException extends Exception{
	public StudentException() {
		
	}
	public StudentException(String name) {
		System.out.println(name);
	}
}
