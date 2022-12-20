package exception;

public class CourseException extends Exception{
	public CourseException() {
		
	}
	public CourseException(String name) {
		System.out.println(name);
	}
}
