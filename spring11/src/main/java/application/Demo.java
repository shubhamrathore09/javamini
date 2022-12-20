package application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		PresentationBean ps=ctx.getBean(PresentationBean.class,"ps");
		
		ps.present();
		
		
	}
}
