package com.nit;

import java.util.Scanner;

public class Tasks {
	public static int countVowels(String msg)
	{
		char ch;
		int count=0;
		for(int i=0;i<msg.length();i++)
		{
			ch=msg.charAt(i);
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
				{
					count++;
				}
			}
		return count;
		}
	public static int countUpperCase(String msg)
	{
		char ch;
		int count=0;
		for(int i=0;i<msg.length();i++)
		{
			ch=msg.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				count++;
			}
		}
		return count;
	}
	public static int countLowerCase(String msg)
	{
		char ch;
		int count=0;
		for(int i=0;i<msg.length();i++)
		{
			ch=msg.charAt(i);
			if(ch>='a' && ch<='z')
			{
				count++;
			}
		}
		return count;
	}
	public static int countEachVowel(String msg)
	{
		char ch;
		int a=0,e=0,i=0,o=0,u=0,A=0,E=0,I=0,O=0,U=0;
		for(int j=0;j<msg.length();j++)
		{
			ch=msg.charAt(j);
			switch(ch)
			{
			case 'a' :
				a++;
			case 'A' :
				A++;
				break;
			case 'e' :
				e++;
			case 'E' :
				E++;
				break;
			case 'i' :
				i++;
			case 'I' :
				I++;
				break;
			case 'o' :
				o++;
			case 'O' :
				O++;
				break;
			case 'u' :
				u++;
			case 'U' :
				U++;
				break;
			}
		}
		System.out.println("Each vowel count:");
		System.out.println("a: " + a);
		System.out.println("e: " + e);
		System.out.println("i: " + i);
		System.out.println("o: " + o);
		System.out.println("u: " + u);
		return a;
		
	}
	public static int countDigits(String msg)
	{
		char ch;
		int count=0;
		for(int i=0;i<msg.length();i++)
		{
			ch=msg.charAt(i);
			if(ch>='0' && ch<='9')
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String msg=sc.nextLine();
		System.out.println("Total vowel count:"+countVowels(msg));
		System.out.println("Total Upper case letters count:"+countUpperCase(msg));
		System.out.println("Total lower case letters count:"+countLowerCase(msg));
		countEachVowel(msg);
		
		System.out.println("digits count:"+countDigits(msg));
	}

}
