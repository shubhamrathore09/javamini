package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSp2Application {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(FirstSp2Application.class, args);
	Myservice obj=ctx.getBean(Myservice.class,"myservice");
	
	obj.sayHello("shubham");
	
	}

}
