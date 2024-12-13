package Evalutionprograms;

public class Largestandsmallest {
public static void main(String[] args) {
	int a[]= {2,3,5,9,5,10};
	int largest=a[0];
	int smallest=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>largest)
		{
			largest=a[i];
		}
		if(a[i]<smallest)
		{
			smallest=a[i];		
		}
	}
	System.out.println("largest number in the array is "+largest);
	System.out.println("smallest number in the array is "+smallest);
}
}
