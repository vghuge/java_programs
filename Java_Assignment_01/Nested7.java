package com.java.javaas1;

import java.util.Scanner;

public class Nested7 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Age ");
	int age=sc.nextInt();
	if(age>=18)
	{
		if(age<=30)
		{
			System.out.println("you are eligible to vottting and shadi.com");
		}
		else
		{
	        System.out.println("you are only eligible for only votting");
		
		}
	}
	else
		
	{
		System.out.println("you are not applicable ");
    }
}
}
