package Evalutionprograms;

import java.util.Scanner;

public class ArrayEvenplacedelements 
{
public static void main(String[] args) 
{
	int a[]= {12,23,43,56,3,43,56,232,56,234};
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n Value :");
	int count=0;
	int n=sc.nextInt();
	for(int i=0;i<a.length;i++)
	{
	if(a[i]==n)
	{
		System.out.println("\"Given element is  found\"");
		count++;
	}
	else if(a[i]!=n)
	{
		  System.out.println("\"Given element is not found\"");
	}
	}
	System.out.println(count);
	//	System.out.println("Printing even placed elements in an array");
////	System.out.println("printing odd placed elements in an array");
//	for(int i=0;i<a.length;i+=2)
////		for(int i=1;i<a.length;i+=2)
////		for(int i=1;i<a.length;i+=2)
//	{
//		System.out.println(a[i]);
//	}
}
}
