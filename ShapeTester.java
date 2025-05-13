package com.nit;

class Circle
{
	double radius;
	
	Circle()
	{
		radius=0.0;
	}
	
	Circle(double radius)
	{
		this.radius=radius;
	}
	
	double getArea()
	{
		if(radius<=0)
		{
			System.out.println("Error Invalid input");
			return -1;
		}
		radius=3.14*radius*radius;
		return radius;
	}
}

class Cylinder extends Circle
{
	double height;
	
	Cylinder()
	{
		height=0.0;
	}
	
	Cylinder(double radius,double height)
	{
		super(radius);
		this.height=height;
	}
	
	double getVolume()
	{
		if(radius<=0 || height<=0)
		{
			System.out.println("Error invalid input");
			return -1;
		}
		height=3.14*radius*radius*height;
		return height;
	}
}
public class ShapeTester {
	
	public static void main(String[] args)
	{
		Circle c=new Circle(54);
		System.out.println("Area of Circle:"+c.getArea());
		
		Cylinder cl=new Cylinder(5,8);
		System.out.println("Volume of Cylinder:"+cl.getVolume());
	}
}
