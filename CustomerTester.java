package com.nit;

class Customer{
	private String customerName;
	private double monthlySpending;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getMonthlySpending() {
		return monthlySpending;
	}
	public void setMonthlySpending(double monthlySpending) {
		this.monthlySpending = monthlySpending;
	}
	
	public String displayDetails()
	{
		System.out.println("customer name:"+getCustomerName());
		System.out.println("Monthly Spending:"+getMonthlySpending());
		return customerName;
	}
}
	
class CardType extends Customer
	{
		private String cardName;
		
		public String getCardName()
		{
			return cardName;
		}
		
		public static CardType getCardTypes(Customer customer)
		{
			CardType ct=new CardType();
			
			double spending=customer.getMonthlySpending();
			
			if(spending<=10000)
			{
				ct.cardName="silver";
			}
			else if(spending>10000 && spending<50000)
			{
				ct.cardName="Gold";
			}
			else
			{
				ct.cardName="Platinum";
			}
			return ct;
		}
	}
public class CustomerTester {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setCustomerName("Sindhu");
		c1.setMonthlySpending(10000);
		c1.displayDetails();
		
		CardType  card1=CardType.getCardTypes(c1);
		System.out.println("card name:"+card1.getCardName());
		
		Customer c2=new Customer();
		c1.setCustomerName("Sindhu");
		c1.setMonthlySpending(12000);
		c1.displayDetails();
		
		CardType  card2=CardType.getCardTypes(c1);
		System.out.println("card name:"+card2.getCardName());
		
		
		
		
	}

}
