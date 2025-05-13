package com.nit;

class Student1
{
	int studentId;
	String name;
	double examFee;
	public String displayDetails()
	{
		return "studentId:"+studentId+"\nName:"+name+"\nexamFee:"+examFee;
	}
	double payFee(double amount)
	{
		return examFee-amount;
	}
	Student1(int studentId,String name,double examFee)
	{
		if(studentId<=0 || examFee<=0)
		{
			System.out.println("error invalid input");
		}
		this.studentId=studentId;
		this.name=name;
		this.examFee=examFee;
	}
	public String toString()
	{
		return displayDetails();
	}
}

class DayScholar extends Student1
{
	double transportFee;
	
	DayScholar(int studentId,String name,double examFee,double transportFee)
	{
		super(studentId,name,examFee);
		if(transportFee<=0)
		{
			System.out.println("Error invalid input");
		}
		this.transportFee=transportFee;
	}
	
	@Override
	double payFee(double amount)
	{
		double totalFee=examFee+transportFee;
		return totalFee-amount;
	}
	
	@Override
	public String displayDetails()
	{
		return "studentId:"+studentId+"\nName:"+name+"\nexamFee:"+examFee+"\ntransportFee:"+transportFee;
	}
	
	public String toString() {
		return displayDetails();
	}
}

class Hosteller extends Student1
{
	double hostelFee;
	
	Hosteller(int studentId,String name,double examFee,double hostelFee)
	{
		super(studentId,name,examFee);
		if(examFee<=0 || hostelFee<=0)
		{
			System.out.println("Error Invalid input");
		}
		this.hostelFee=hostelFee;
	}
	
	@Override
	double payFee(double amount)
	{
		double totalFee=examFee+hostelFee;
		return totalFee-amount;
	}
	
	@Override
	public String displayDetails()
	{
		return "studentId:"+studentId+"\nName:"+name+"\nexamFee:"+examFee+"\nhostelFee:"+hostelFee;
	}
	
	public String toString() {
		return displayDetails();
	}
}
public class FeesTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1(1,"Sindhu",3000.0);
		System.out.println("Student Fees Details:");
		System.out.println(s1.displayDetails());
		System.out.println("Remaining:"+s1.payFee(500)+"\n");
		
		DayScholar ds=new DayScholar(1,"Sindhu",3000.0,10000.0);
		System.out.println("DayScholar Student Fees Details:");
		System.out.println(ds.displayDetails());
		System.out.println("Total Fees:"+ds.payFee(10000)+"\n");
		
		
		Hosteller h=new Hosteller(1,"Indhu",3000.0,30000.0);
		System.out.println("Hosteller Student Fees Details:");
		System.out.println(h.displayDetails());
		System.out.println("Total Fees:"+h.payFee(2000)+"\n");
	}
}
