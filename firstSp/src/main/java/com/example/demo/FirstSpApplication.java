package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import pack.*;

@SpringBootApplication
@ComponentScan(basePackages = "pack")
public class FirstSpApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(FirstSpApplication.class, args);
	
	A obj=ctx.getBean("a",A.class);

	obj.result();
	
	}

}
