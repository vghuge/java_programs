package com.java.javaas1;

import java.util.Scanner;

public class Calculator10 {
	
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Type on ");//on
			String s=sc.nextLine();
			while(s.equals("on"))
			{
				while(true)
				{
					System.out.println("Enter your choise");
					System.out.println("1 = Additon");
					System.out.println("2 = Substraction ");
					System.out.println("3 = Multiplication ");
					System.out.println("4 = division");
					int choise=sc.nextInt();
					if (choise==1)
					{
						System.out.println("Enter number 1  ");
						int n1=sc.nextInt();
						System.out.println("Enter number 2 ");
						int n2=sc.nextInt();
						int a=n1+n2;
						System.out.println(a);
//						int n3=sc.nextInt();
//						a+=n3;
//						System.out.println(a+"\n");
					}
					else if(choise==2)
					{
						System.out.println("Enter number 1 ");
						int n1=sc.nextInt();
						System.out.println("Enter number 2 ");
						int n2=sc.nextInt();
						int a=n1-n2;
						System.out.println(n1+"-"+n2+"="+a+"\n");
					}
					else if(choise==3)
					{
						System.out.println("Enter number 1 ");
						int n1=sc.nextInt();
						System.out.println("Enter number 2 ");
						int n2=sc.nextInt();
						int a=n1*n2;
						System.out.println(n1+"*"+n2+"="+a+"\n");
					}
					else if(choise==4)
					{
						System.out.println("Enter number 1 ");
						int n1=sc.nextInt();
						System.out.println("Enter number 2 ");
						int n2=sc.nextInt();
						int a=n1/n2;
						System.out.println(n1+"/"+n2+"="+a+"\n");
					}
				}
			}
//			System.out.println("Please First on the calculator Type on");
		}
	}

