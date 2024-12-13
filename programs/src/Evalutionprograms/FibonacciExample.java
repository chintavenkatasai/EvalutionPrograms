package Evalutionprograms;

import java.util.Scanner;

public class FibonacciExample 
{
	public static void main(String[]ars) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n value :");
	int n=sc.nextInt();
	if(n<=0)
	{
		System.out.println("Please enter postive value..");
	}
	int a=0,b=1;
	System.out.print("Fibonacci series :" +a);
	if(n>1)
		
	{
		System.out.print(" , " +b);
	}
	for(int i=2;i<n;i++)
	{
	    int next=a+b;
	   	a=b;
		b=next;
		System.out.print(", " +next);	
	}	
	}
}
