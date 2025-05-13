package com.nit;

class Student {
	protected String name;
	protected int rollNumber;
	
	Student(String name,int rollNumber)
	{
		this.name=name;
		this.rollNumber=rollNumber;
	}
	public void displayDetails()
	{
		System.out.println("Name:"+name);
		System.out.println("roll number:"+rollNumber);
	}
	public double calculatePercentage()
	{
		return 0;
	}
}
class ScienceStudent extends Student
{
	private int physicsMarks;
	private int chemistryMarks;
	private int MathMarks;
	
	ScienceStudent(String name,int rollNumber,int physicsMarks,int chemistryMarks,int MathMarks)
	{
		super(name,rollNumber);
		this.physicsMarks=physicsMarks;
		this.chemistryMarks=chemistryMarks;
		this.MathMarks=MathMarks;
	}
	
	@Override
	public void displayDetails()
	{
		System.out.println("Science Student Marks:");
		System.out.println("Name:"+name);
		System.out.println("Roll Number:"+rollNumber);
		System.out.println("Physics Marks:"+physicsMarks);
		System.out.println("chemistry Marks:"+chemistryMarks);
		System.out.println("MathMarks:"+MathMarks);
	}
	
	@Override
	public double calculatePercentage()
	{
		if(physicsMarks<=0|| chemistryMarks<0|| MathMarks<=0)
		{
			System.out.println("Error Invalid input");
		}
		int total=physicsMarks+chemistryMarks+MathMarks;
		return (total/3.0);
	}
}

class ArtsStudent extends Student
{
	private int historyMarks;
	private int geographyMarks;
	private int englishMarks;
	
	ArtsStudent(String name,int rollNumber,int historyMarks,int geographyMarks,int englishMarks)
	{
		super(name,rollNumber);
		this.historyMarks=historyMarks;
		this.geographyMarks=geographyMarks;
		this.englishMarks=englishMarks;
	}
	
	@Override
	public void displayDetails()
	{
		System.out.println();
		System.out.println("Arts Student Marks:");
		System.out.println("Name:"+name);
		System.out.println("Roll Number:"+rollNumber);
		System.out.println("History Marks:"+historyMarks);
		System.out.println("Geography Marks:"+geographyMarks);
		System.out.println("english Marks:"+englishMarks);
	}
	
	public double calculatePercentage()
	{
		if(historyMarks<=0|| geographyMarks<0|| englishMarks<=0)
		{
			System.out.println("Error Invalid input");
		}
		int total=historyMarks+geographyMarks+englishMarks;
		return (total/3.0);
	}
}

public class Test2
{
	public static void main(String[] args)
	{
		ScienceStudent ss=new ScienceStudent("Sindhu",526,77,78,80);
		ss.displayDetails();
		double sspercentage=ss.calculatePercentage();
		System.out.println("Science student percentage:"+sspercentage);
		
		ArtsStudent as=new ArtsStudent("Sindhu",501,80,87,97);
		as.displayDetails();
		double aspercentage=as.calculatePercentage();
		System.out.println("Arts Student Percentage:"+aspercentage);
		
	}
}

