package com.java.javaas1;

import com.java.heirarchicalinheritance.Child1;

public class Child41 extends Parent4
{

	public void Riya() 
	{
		System.out.println("I am Riya method from Child class 41");
		
	}
	public static void main(String[] args) 
	{
		 Child41 n=new Child41();
         n.Riya();
         Parent4 p=new Parent4();
         p.Rahul();
         p.Ankita();
         p.Archana();
         p.Gaurav();
         p.Vishal();
	}
}
