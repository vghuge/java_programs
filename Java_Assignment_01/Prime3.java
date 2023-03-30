package com.java.javaas1;

import java.util.Scanner;

public class Prime3 {
	public static void main(String[] args) 

		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your number");
			int a=sc.nextInt();
			int count=0;
			for (int i=2;i<a;i++)
			{
				if(a%i==0)
				{
					count++;
					break;
				}
			}
		
			if(count==0)
			{
				System.out.println("Your no is prime ");
			}
			else
			{
				System.out.println("your no is not prime");
			}
		}
	}

