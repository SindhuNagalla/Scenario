package com.nit;

class Product
{
	protected String name;
	protected double price;
	
	Product(String name,double price)
	{
		if(price<=0)
		{
			System.out.println("Error Invalid input");
		}
		this.name=name;
		this.price=price;
	}
	public void displayInfo()
	{
		System.out.println("Name:"+name);
		System.out.println("Price:"+price);
	}
	
	public double calculateTotalCost(int quantity)
	{
		if(quantity<=0)
		{
			System.out.println("Error Invalid input");
		}
		return price*quantity;
	}
	public String toString()
	{
		return "name:"+name+"price:"+price;
	}
}
class Electronics extends Product
{
	private String brand;
	Electronics(String name,double price,String brand)
	{
		super(name,price);
		if(price<=0)
		{
			System.out.println("Error Invalid input");
		}
		this.brand=brand;
	}
	@Override
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Brand:"+brand);
	}
	@Override
    public String toString() {
        return "name=" + name + ", price=" + price + ", brand=" + brand;
    }
}

class Clothing extends Product
{
	private String size;
	Clothing(String name,double price,String size)
	{
		super(name,price);
		if(price<=0)
		{
			System.out.println("Error Invalid input");
		}
		this.size=size;
	}
	@Override
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Size:"+size);
	}
	
	@Override
    public String toString() {
        return "name=" + name + ", price=" + price + ", Size=" + size;
    }
	
}
public class OnlineShopping {

	public static void main(String[] args) {
		Electronics e1=new Electronics("Fridge",30000.0,"Samsung");
		System.out.println("Electronics Details:");
		e1.displayInfo();
		System.out.println("Total Cost:"+e1.calculateTotalCost(2)+"\n");
		
		Clothing c=new Clothing("T-shirt",1200.0,"XL");
		System.out.println("Clothing Details:");
		c.displayInfo();
		System.out.println("Total cost:"+c.calculateTotalCost(3));
	}

}
