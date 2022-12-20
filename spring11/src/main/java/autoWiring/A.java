package autoWiring;

public class A {
	private String msg;
	
	public A(String msg) {
		super();
		this.msg = msg;
	}
	
	public void Mysetup() {
		System.out.println("inside the initialization method");
//		System.out.println(msg);
	}

	public void funA() {
		System.out.println("inside class A");
	}

	public A() {
		super();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
