package com.nit;

import java.util.Scanner;

class InvalidCredentialsException extends Exception
{
	public InvalidCredentialsException(String msg)
	{
		super(msg);
	}
}
public class Irctc {
	
	private String uid,pwd,destination,source,date;
	int noOfPassengers;
	public String getUid()
	{
		return uid;
	}
	public void setUid(String uid)
	{
		this.uid=uid;
	}
	public String getPwd()
	{
		return pwd;
	}
	public void setPwd(String pwd)
	{
		this.pwd=pwd;
	}
	public String getDestination()
	{
		return destination;
	}
	public void setDestination(String destination)
	{
		this.destination=destination;
	}
	public String getSource()
	{
		return source;
	}
	public void setSource(String source)
	{
		this.source=source;
	}
	public String getDate()
	{
		return date;
	}
	public void setDate(String date)
	{
		this.date=date;
	}
	public int getNoOfPassengers()
	{
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers)
	{
		this.noOfPassengers=noOfPassengers;
	}
	public void login(String uid,String pwd,Scanner sc) throws InvalidCredentialsException
	{
		if(uid.equals("user123")&&pwd.equals("asdfqwer"))
		{
			System.out.println("Login successful");
			System.out.println("Enter the source:");
			setSource(sc.nextLine());
			System.out.println("Enter the destination:");
			setDestination(sc.nextLine());
			System.out.println("Enter the date:");
			setDate(sc.nextLine());
			System.out.println("Enter no.of passengers:");
			setNoOfPassengers(sc.nextInt());
			sc.nextLine();
			
		}
		else
		{
			throw new InvalidCredentialsException("you have entered wrong uid"+" or pwd!Try Again");
		}
	}
	public void bookTicket()
	{
		System.out.println("Booking successfully");
	
	}
}
class MainClass
{
	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		Irctc i1=new Irctc();
		while(true)
		{
			System.out.println("Enter user id:");
			i1.setUid(sc.nextLine());
			System.out.println("Enter the password:");
			i1.setPwd(sc.nextLine());
			try
			{
				i1.login(i1.getUid(), i1.getPwd(), sc);
				break;
			}
			catch(InvalidCredentialsException e)
			{
				System.out.println(e.getMessage());
			}
		}
		i1.bookTicket();
		System.out.println("User ID: " + i1.getUid());
		System.out.println("source: " + i1.getSource());
		System.out.println("Destination: " + i1.getDestination());
		System.out.println("Date: " + i1.getDate());
		System.out.println("No of passengers: " + i1.getNoOfPassengers());
		System.out.println("Ticket booked successfully");
	}

}
