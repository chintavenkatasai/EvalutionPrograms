package Evalutionprograms;

import java.util.Arrays;

public class Arraysmallbigequal {
public static void main(String[] args) {
	
	int a[]= {1,34,5,66,77,66,45,76,77};
	int largest=a[0];
	int smallest=a[0];
	int equals=a[0];
	
	for(int i=0;i<a.length;i++)
	{
		if(largest<a[i])
		{
			largest=a[i];
		}
		else if(smallest>a[i])
		{
			smallest=a[i];
		}
	
	}
	for( int i=0;i<a.length;i++)
	{
	for (int j=1;j<a.length;j++)
	{
		if(a[i]==a[j]) 
		{
			equals=a[i];
		}
	}
	}
	System.out.println("Printing an array in ascending order :");
	for(int i=0;i<a.length;i++)
	{
		Arrays.sort(a);
		
		System.out.print(a[i] +" ");	
		}
	System.out.println();
	System.out.println("Printing an array in descending order :");
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i] + " ");
	}
	System.out.println();
	System.out.println("largest "   +largest);
	System.out.println("smallest "   +smallest);
	System.out.println("equals "    +equals);
	
}
}
