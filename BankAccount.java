package com.nit;
class InvalidAmountException extends Exception{
	public InvalidAmountException(String string) {
		super(string);
	}
	
}

class InsufficientFundException extends Exception
{
	public InsufficientFundException(String string) {
		super(string);
	}
}
public class BankAccount {
	
	private int accountNumber;
	private double balance;
	
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void deposit(double amount)
	{
		this.setBalance(getBalance()+amount);
		System.out.print("deposit successfully:");
		checkbalance();
	}
	
	public void withdraw(double amount)throws InvalidAmountException
	{
		if(amount>0 && amount<=balance)
		{
			this.setBalance(getBalance()-amount);
			System.out.print("withdraw successfully:");
			checkbalance();
		}
		else
		{
			throw new InvalidAmountException("Invalid Amount");
		}
	}
	
	public void checkbalance()
	{
		System.out.println(getBalance());
	}
	
	public static  void transfer(BankAccount srcAccount,BankAccount destinationAccount,double amount) throws Exception

	{
		if(srcAccount.getBalance()>=amount)
		{
			srcAccount.withdraw(amount);
			destinationAccount.deposit(amount);
			System.out.println("transfer success");
		}
		else
		{
			throw new InsufficientFundException("There is no sufficient amount");
		}
	}
	

	
	public static void main(String[] args)throws Exception
	{
		BankAccount b1=new BankAccount();
		BankAccount b2=new BankAccount();
		
		b1.setAccountNumber(1234567890);
		b1.setBalance(3000);
		
		b2.setAccountNumber(987654321);
		b2.setBalance(10000);
		
		b1.deposit(3000);
		
		b2.withdraw(1000);
		
		transfer(b1,b2,3000);
		
		
	}

}
