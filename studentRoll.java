package com.nit.Arrays;

import java.util.Scanner;

class Workshop
{
	int rollNo[]=new int[10];
	public void takeAttendence(int rollNo[])
	{
		for(int i=0;i<rollNo.length;i++)
		{
			this.rollNo[i]=rollNo[i];
		}
	}
	public void findStudent(int key)
	{
		boolean isPresent=false;
		for(int i=0;i<rollNo.length;i++)
		{
			if(key==rollNo[i])
			{
				isPresent=true;
				break;
			}
		}
		if(isPresent==true)
		{
			System.out.println("Student with rollnumber "+key+" is present");
		}
		else
		{
			System.err.println("Student is not present");
		}
	}
}
public class studentRoll {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student attendence:");
		int[] rollnumbers=new int[10];
		for(int i=0;i<rollnumbers.length;i++)
		{
			rollnumbers[i]=sc.nextInt();
		}
		
		Workshop w=new Workshop();
		w.takeAttendence(rollnumbers);
		
		System.out.println("Enter the roll no to search:");
		int key=sc.nextInt();
		w.findStudent(key);

		

	}

}
