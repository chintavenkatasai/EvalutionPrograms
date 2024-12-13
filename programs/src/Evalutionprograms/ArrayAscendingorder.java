package Evalutionprograms;

import java.util.Arrays;

public class ArrayAscendingorder 
{
public static void main(String[] args) 
{
	int a[]= {4,2,9,11,3,0};
//	int temp=0;
	System.out.println("Printing an array before applying ascending order :");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+ " ");
	}
	Arrays.sort(a);
//	for(int i=0;i<a.length;i++)
//	{
//		for(int j=i+1;j<a.length;j++)
//		{
//			if(a[i]>a[j])
//			{
//				temp=a[i];
//				a[i]=a[j];
//				a[j]=temp;
//	     	}
//		}
//	}
	System.out.println();
	System.out.println("Printing an array after applying ascending order : ");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+ " ");
	}

}
}
