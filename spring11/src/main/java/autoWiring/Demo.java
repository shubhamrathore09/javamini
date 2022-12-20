package autoWiring;

public class Demo {
	private A a1;
	private A a2;
	private B b1;
	public Demo() {
		super();
		System.out.println("inside zero argument cons");
	}
	public Demo(A a1, A a2, B b1) {
		super();
		this.a1 = a1;
		this.a2 = a2;
		this.b1 = b1;
		System.out.println("inside three argument cons");
	}
	public Demo(A a2, B b1) {
		super();
		this.a2 = a2;
		this.b1 = b1;
		System.out.println("inside two argument cons");
	}
	
	public Demo(B b1) {
		super();
		this.b1 = b1;
		System.out.println("inside one argument cons");
	}
	
	public void showDetails() {
		System.out.println("inside the show details");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(b1);
	}
	
}
