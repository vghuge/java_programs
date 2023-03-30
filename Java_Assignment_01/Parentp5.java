package com.java.javaas1;

import com.java.oopsinheritance.Childclass1;

public class Parentp5 extends Grandp5
{
	public void Vaishali() 
	{
		System.out.println("I am Vaishali method from parent class");
		
	}
	public void Mangal()
	{
		System.out.println("I am Mangal method from parent class");
	}
	public void Sarika()
	{
		System.out.println("I am Sarika method from parent class");
	}
	public static void main(String[] args) 
	{
		Parentp5 j=new Parentp5();
		j.Mangal();
		j.Sarika();
		j.Vaishali();
	}
}
