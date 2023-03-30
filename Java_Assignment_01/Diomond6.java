package com.java.javaas1;

public class Diomond6
{
	
		public static void main(String[] args) 
		{
			for (int i=1;i<=6;i++)
			{
				for (int j=1;j<=6;j++)
				{ 
					if((i+j==4)||(i==5&&j==3)||(i==4&&j==4)||(i==3&&j==5)||(i==2&&j==4)||(i==2&&j==3)||(i==3&&j==2)||(i==3&&j==3)||(i==3&&j==4)||(i==4&&j==2) ||(i==4&&j==3))
							{
						System.out.print(" *");
							}
					else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		
}
}
