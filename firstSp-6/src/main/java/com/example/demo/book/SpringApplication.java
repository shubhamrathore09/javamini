package com.example.demo.book;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/bookservice")
public class SpringApplication {
	
	private List<Book> books=new ArrayList<>();
	
	@PostConstruct
	public String AddBookInList() {
		books.add(new Book(4, "ragu", "raghu", "g32", "3g",74 , 784));
		books.add(new Book(5, "ragu", "raghu", "g32", "3g",74 , 784));
		books.add(new Book(6, "ragu", "raghu", "g32", "3g",74 , 784));
		books.add(new Book(7, "ragu", "raghu", "g32", "3g",74 , 784));
		books.add(new Book(8, "ragu", "raghu", "g32", "3g",74 , 784));
		
		return "added";
	}
	@GetMapping("/books")
	public List<Book> GetAllBook(){
		return books;
	}
	@GetMapping("/books/{id}")
	public Book GetById(@PathVariable("id") Integer id) {
		Book obj=new Book();
		for(Book i:books) {
			if(i.getId()==id) {
				obj=i;
			}
		}
		return obj;
	}
	@PostMapping("/books")
	public List<Book> CreateNewBook( @RequestBody Book book) {
		books.add(book);
		return books;
	}

	@PutMapping("/books/{id}/{name}")
	public List<Book> update(@PathVariable("id") Integer id, @PathVariable("name") String name) {
		Book obj=new Book();
		for(Book i:books) {
			if(i.getId()==id) {
				i.setName(name);
			}
		}
		return books;
	}
	
	@DeleteMapping("/books/{id}")
	public String deleteById(@PathVariable("id") Integer id) {
		String na="";
		for(Book i: books) {
			if(i.getId()==id) {
				na=i.getName()+" delete";
				books.remove(i);
			}
		}
		
		return na;
	}
	
	
	
}
