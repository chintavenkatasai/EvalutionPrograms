package Evalutionprograms;

import java.util.Arrays;

public class sainaiduascending 
{
	public static void main(String[] args) {
		
	
int a[]= {3,44,77,98,45,35};
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i] +" ");
}
Arrays.sort(a);
System.out.println();
System.out.println("After ascending order in array");
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
	
}
System.out.println();
for(int i=a.length-1;i>=0;i--)
{
	System.out.print(a[i]+ " ");
}
	}
	
}

