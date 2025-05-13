package com.nit;

class Vehicle {
	String make;
	String model;
	int year;
	
	Vehicle(String make,String model,int year)
	{
		this.make=make;
		this.model=model;
		this.year=year;
	}
	
	void displayDetails()
	{
		System.out.println("make"+make);
		System.out.println("model"+model);
		System.out.println("year"+year);
	}
}

class Car extends Vehicle
{
	int numberOfDoors;
	
	Car(String make,String model,int year,int numberOfDoors)
	{
		super(make,model,year);
		this.numberOfDoors=numberOfDoors;
	}
	
	@Override
	void displayDetails()
	{
		System.out.println("Car Details:");
		System.out.println("make:"+make);
		System.out.println("model:"+model);
		System.out.println("year:"+year);
		System.out.println("number of doors:"+numberOfDoors);
		System.out.println("");
	}
}

class Bike extends Vehicle
{
	String type;
	
	Bike(String make,String model,int year,String type)
	{
		super(make,model,year);
		this.type=type;
	}
	
	void displayDetails()
	{
		System.out.println("Bike Details:");
		System.out.println("make:"+make);
		System.out.println("model:"+model);
		System.out.println("year:"+year);
		System.out.println("Type:"+type);
	}
}

public class Test
{
	public static void main(String[] args)
	{
		Vehicle c=new Car("iron","honda",2020,4);
		c.displayDetails();
		
		
		Vehicle b=new Bike("metal","honda",2021,"bullet");
		b.displayDetails();
		
		
		
	}
}
