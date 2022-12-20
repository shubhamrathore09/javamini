package myProduct;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import net.bytebuddy.implementation.bind.annotation.Super;

@Entity
@DiscriminatorValue("book")
public class Book extends MyProduct{
	
	public Book(int id, String name, String author) {
		super(id, name);
		this.author = author;
	}
	private String author;
	public Book(int id, String name) {
		super(id, name);
	}
	public Book() {
		
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [author=" + author + "]";
	}
	
	
	
}
