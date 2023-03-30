package com.java.javaas1;

import com.java.oopsinheritance.Childclass1;

public class Grandp5 
{
	public void Varsha() 
	{
		System.out.println("I am Varsha method from Grandparent class");
		
	}
	public void Mangesh()
	{
		System.out.println("I am Mangesh method from Grandparent class");
	}
	public void Sakshi()
	{
		System.out.println("I am Sakshi method from Grandparent class");
	}
	public static void main(String[] args) 
	{
		Childclass1 obj=new Childclass1();
		obj.Varsha();  
		obj.Mangesh();
		obj.Sakshi();
}
}
