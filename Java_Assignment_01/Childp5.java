package com.java.javaas1;

public class Childp5 extends Parentp5
{
	public void Manisha() 
	{
		System.out.println("I am Manisha method from Child Class");
		
	}
	public static void main(String[] args)
	{  
		Parentp5 obj=new Parentp5();
		obj.Mangesh();
		obj.Varsha();
		obj.Sakshi();
		obj.Mangal();
		obj.Vaishali();
		obj.Sarika();
		Childp5 l=new Childp5();
	     l.Manisha();		
		
	}
}
 