package com.nit;

class Book
{
	private String title;
	private String author;
	private String ISBN;
	private double price;
	private double discountPercentage;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	public double getFinalPrice()
	{
		return price-(price*discountPercentage/100);
		
	}
}
public class BookTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book bt=new Book();
		bt.setTitle("Attitude");
		bt.setAuthor("beller");
		bt.setISBN("asdf");
		bt.setPrice(9876);
		bt.setDiscountPercentage(70);
		
		
		System.out.println("Book Title:"+bt.getTitle());
		System.out.println("Author:"+bt.getAuthor());
		System.out.println("ISBN:"+bt.getISBN());
		System.out.println("Price:"+bt.getPrice());
		System.out.println("Discount Percentage:"+bt.getDiscountPercentage()+"%");
		System.out.println("Final price:"+bt.getFinalPrice());
		
		

	}

}
