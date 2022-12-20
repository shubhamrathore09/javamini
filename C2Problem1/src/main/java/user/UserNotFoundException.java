package user;

public class UserNotFoundException extends Exception{
	public UserNotFoundException() {
		
	}
	public UserNotFoundException(String name) {
		System.out.println(name);
	}
}
