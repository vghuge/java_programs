package com.java.javaas1;

public class Child42 extends Parent4 
{
	public void Neha() 
	{
		System.out.println("I am Neha method from Child class 42");
		
	}
	public static void main(String[] args) 
	{
		 Child42 n=new Child42();
         n.Neha();
         Parent4 p=new Parent4();
         p.Rahul();
         p.Ankita();
         p.Archana();
         p.Gaurav();
         p.Vishal();
	}
}
