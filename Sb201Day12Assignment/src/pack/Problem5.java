package pack;

import java.util.*;
import java.util.Stack;

//Q5/ What do you mean by Webservices, Explain the similarities and differences between a
//Web application and Webservices.

/*
 * Ans: WS is also  a type  of Web application that can generate dynamic result as raw data(json,xml,text)
 *      webapplication generate view page where web server generate raw data
 *      webserver contained web and only servelt container it can be used servlet jsp struts jsf
 *      webapplication contained both web application and EJB container.
 */

public class Problem5 {
public static void main(String[] args) {
B obj=new B();
obj.setA(new A());

}
}

class A{
	public void funa() {
		System.out.println("asdf");
	}
}
class B{
	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}
	
}