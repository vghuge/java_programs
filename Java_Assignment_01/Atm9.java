package com.java.javaas1;

import java.util.Scanner;

public class Atm9 {
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your PIN ");
	int pin=sc.nextInt();
	int p=1234;
	boolean abc=true;
	int b=10000;
	if(pin==p)
	{
	while(abc)
	{
	//System.out.println("Your A/c balance is "+b);//
	System.out.println("1=Money Withdrow");
	System.out.println("2=Money Deposite");
	System.out.println("3=Money Trasfer");
	System.out.println("4=Balance check");
	System.out.println("Enter choise number");
	int amount=sc.nextInt();
	switch(amount)
	{
	case 1:
	System.out.println("Enter money Withdrow");
	int w=sc.nextInt();
	int w1=b-w;
	if(w>b)
	{
	System.out.println("Your enter money is Larger than Bank Balance");
	}
	else 
	{
	System.out.println("Your updated Balance is "+w1);
	break;
	}
	case 2:
	System.out.println("Enter Money Deposite");
	int d=sc.nextInt();
	int d1=b+d;
	if(d>b)
	{
	System.out.println("Your enter money is Larger than Bank Balance");
	}
	else 
	{
	System.out.println("Your updated Balance is "+d1);
	break;
	}
	case 3:
	System.out.println("Enter Money Trasfer ");
	int t=sc.nextInt();
	int t1=b-t;
	if(t>b)
	{
	System.out.println("Your enter money is Larger than Bank Balance");
	}
	else 
	{
	System.out.println("Your updated Balance is "+t1);
	break;
	}
	case 4:
	System.out.println("Your Balance is \n"+b);
	break;
	case 5:
	System.out.println("Your have Enter Wrong Choise");
	abc=false;
	break;
	}
	}
	}
	else
	{
	System.out.println("You have wrong Entered Pin");
	}
	}
	}
