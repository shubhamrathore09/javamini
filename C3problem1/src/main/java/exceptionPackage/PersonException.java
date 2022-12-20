package exceptionPackage;

public class PersonException extends Exception{
	public PersonException() {
		
	}
	public PersonException(String name) {
		System.out.println(name);
	}
}
