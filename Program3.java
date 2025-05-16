package com.nit.FunctionalInterfaces;

import java.util.Scanner;

@FunctionalInterface
interface DiscountPolicy
{
	double applyDiscount(double totalAmount,boolean hasHighSpending);
}

@FunctionalInterface
interface CustomerSpendingHabitChecker
{
	boolean hasHighSpending(double totalPurchaseAmount);
}
public class Program3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total order amount");
		double totalOrderAmount=sc.nextDouble();
		
		System.out.println("Whether they have high spending or not.say(Yes/No)");
		String input = sc.nextLine().trim().toLowerCase();
        boolean hasHighSpending = input.equals("yes");
        
        DiscountPolicy dp=(amount,spending)->{
        	double discount=0.0;
        	if(amount>1000)
        	{
        		discount += 0.10;
        	}
        	if(spending)
        	{
        		discount +=0.5;
        	}
			return amount*(1-discount);	
        };
        
        double finalAmount = dp.applyDiscount(totalOrderAmount, hasHighSpending);

        // Print the final amount
        System.out.printf("%nTotal cost after discount: %.2f%n", finalAmount);
		
		

	}

}
