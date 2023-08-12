package com.wipro.org.encapsulation;
public class Book {
	     /**4/2/2022
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
	private String name;
	public Book(String name, Author author1, double price, int qtyInStock) {
	this.setName(name);
	this.setAuthor(author1);
	this.setPrice(price);
	this.setQtyInStock(qtyInStock);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	private Author author;
	private double price;
	private int qtyInStock;
	public static void main(String[] args) {
	  Author author1 = new Author("Martin Luthar" ,"marin@gmail.com", 'M');
      Book book1 = new Book("Martin Luthar", author1, 234.4, 12);
      System.out.println("Author Name "+
      book1.getAuthor().getName()+"\nBook Name"+
      book1.getName()+" \nEmail"+book1.getAuthor().getEmail()+"\nGeneder"+
      book1.getAuthor().getGender()+"\nBook price "+book1.getPrice()+"\nQtyInStock"+
      book1.getQtyInStock());
	}
}
class Author {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	private String name, email;
	private char gender;
	public Author(String name ,String email, char gender) {
		this.setName(name);
		this.setEmail(email);
		this.setGender(gender);;
	}
}