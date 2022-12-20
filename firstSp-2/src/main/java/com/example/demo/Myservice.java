package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class Myservice {
	public void sayHello(String name) {
		System.out.println("welcome "+name);
	}
}
