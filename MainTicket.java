package com.nit;

class Ticket
{
	private String eventName;
	private int seatNumber;
	private double price;
	
	Ticket(String eventName,int seatNumber,double price)
	{
	    if (seatNumber <= 0 || price <= 0) {
            System.out.println("Error Invalid Input");
            System.exit(0);
        }
		this.eventName=eventName;
		this.seatNumber=seatNumber;
		this.price=price;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}

class VIPTicket extends Ticket
{
	private String SpecialAccess;
	
	VIPTicket(String eventName,int seatNumber,double price,String SpecialAccess)
	{
		super(eventName,seatNumber,price);
		this.SpecialAccess=SpecialAccess;
		
	}

	public String getSpecialAccess() {
		return SpecialAccess;
	}

	public void setSpecialAccess(String specialAccess) {
		SpecialAccess = specialAccess;
	}
}

class StudentTicket extends Ticket
{
	private boolean studentDiscount;
	
	
	public boolean isStudentDiscount() {
		return studentDiscount;
	}


	public void setStudentDiscount(boolean studentDiscount) {
		this.studentDiscount = studentDiscount;
	}


	StudentTicket(String eventName,int seatNumber,double price,boolean studentDiscount)
	{
		super(eventName,seatNumber,price);
		this.studentDiscount=studentDiscount;
	}
}
public class MainTicket {

	public static void main(String[] args) {
		Ticket tk=new Ticket("Sindhu",12,23.0);
		
		System.out.println("Regular Ticket:");
		System.out.println("eventName:"+tk.getEventName()+",\nseatNumber:"+tk.getSeatNumber()+",\nPrice:"+tk.getPrice()+"\n");
		
		VIPTicket vt = new VIPTicket("VIP Concert", 201, 100.0, "Backstage Access");
		
		System.out.println("VIP Ticket:");
		System.out.println("eventName:"+vt.getEventName()+",\nseatNumber:"+vt.getSeatNumber()+",\nPrice:"+vt.getPrice()+",\nSpecialAccess:"+vt.getSpecialAccess()+"\n");
		
		StudentTicket st=new StudentTicket("Student Event",301,300.0,true);
		
		System.out.println("Student Ticket:");
		System.out.println("eventName:"+st.getEventName()+",\nseatNumber:"+st.getSeatNumber()+",\nPrice:"+st.getPrice()+",\ndiscount:"+st.isStudentDiscount()+"\n");
	}

}
