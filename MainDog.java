package com.nit;

class Animal
{
	private String name;
	
	Animal(String name)
	{
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayDetails()
	{
		System.out.println("Name:"+name);
	}
}

class Mammal extends Animal
{
	private boolean hasFur;
	
	Mammal(String name,boolean hasFur)
	{
		super(name);
		this.hasFur=hasFur;
	}
	
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("hasFur:"+hasFur);
	}

	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}
}

class Dog extends Mammal
{
	private String breed;
	
	Dog(String name,boolean hasFur,String breed)
	{
		super(name,hasFur);
		this.breed=breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("breed:"+breed);
	}
}
public class MainDog {
	public static void main(String[] args)
	{
	Dog d=new Dog("Tommy",true,"Golden");
	d.displayDetails();
	}
}
