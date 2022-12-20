package com.example.demo.book;

public class Book {
	private Integer Id;
	private String name;
	private String author;
	private String publication;
	private String autor_no;
	private Integer pages;
	private Integer price;
	public Book(Integer id, String name, String author, String publication, String autor_no, Integer pages,
			Integer price) {
		super();
		Id = id;
		this.name = name;
		this.author = author;
		this.publication = publication;
		this.autor_no = autor_no;
		this.pages = pages;
		this.price = price;
	}
	public Book() {
		super();
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getAutor_no() {
		return autor_no;
	}
	public void setAutor_no(String autor_no) {
		this.autor_no = autor_no;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [Id=" + Id + ", name=" + name + ", author=" + author + ", publication=" + publication
				+ ", autor_no=" + autor_no + ", pages=" + pages + ", price=" + price + "]";
	}
	
	
	
}
