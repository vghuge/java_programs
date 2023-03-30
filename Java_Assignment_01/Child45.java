package com.java.javaas1;

public class Child45 extends Parent4
{
	public void Sita()
	{
		System.out.println("I am Sita method from child class 45");
	}
	public static void main(String[] args)
	{
		Child45 n=new Child45();
        n.Sita();
        Parent4 p=new Parent4();
        p.Rahul();
        p.Ankita();
        p.Archana();
        p.Gaurav();
        p.Vishal();
	}
}
