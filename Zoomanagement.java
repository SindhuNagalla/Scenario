package com.nit;

class Animal1
{
	private String name;
	private int age;
	
	Animal1(String name,int age)
	{
		if(age<=0)
		{
			System.out.println("Error invalid input");
		}
		this.name=name;
		this.age=age;
	}
	public void makeSound()
	{
		System.out.println("The animal makes a generic sound");
	}
	public void displayInfo()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}

class Lion extends Animal1
{
	private int maneLength;
	
	Lion(String name,int age,int maneLength)
	{
		super(name,age);
		if(age<=0 || maneLength<=0)
		{
			System.out.println("Error Invalid Input");
		}
		this.maneLength=maneLength;
	}
	@Override
	public void makeSound()
	{
		System.out.println("The Lion roars loudly");
	}
	
	public void displaymaneLength()
	{
		System.out.println("maneLength:"+maneLength+"cm"+"\n");
	}
}
class Elephant extends Animal1
{
	private float tuskLength;
	
	Elephant(String name,int age,float tuskLength)
	{
		super(name,age);
		if(age<=0 || tuskLength<=0)
		{
			System.out.println("Error Invalid Input");
		}
		this.tuskLength=tuskLength;
	}
	@Override
	public void makeSound()
	{
		System.out.println("The Elephant trumpets");
	}
	
	public void displayTuskLength()
	{
		System.out.println("tuskLength:"+tuskLength+"m");
	}
}
public class Zoomanagement {

	public static void main(String[] args) {
		Lion l=new Lion("Sindhu",22,4);
		System.out.println("Lion Details:");
		l.displayInfo();
		l.makeSound();
		l.displaymaneLength();
		
		Elephant e=new Elephant("Priyaaa",23,4.5f);
		System.out.println("Elephant Details:");
		e.displayInfo();
		e.makeSound();
		e.displayTuskLength();
		
	}

}
