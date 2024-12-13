package Evalutionprograms;

public class arrayReverse {
public static void main(String[] args) {
	int a[]= {9,2,3,4,5,6,7};
//	int smallest=a[6];
//	for(int i=0;i<a.length;i++)
//	{
//		if(a[i]<smallest)
//		{
//			smallest=a[i];
//		}
//	}
//	System.out.println(+smallest+ "  it is the smallest element");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(+a[i]+ " ");
	}
	System.out.println();
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]+ " ");
	}
}

}
