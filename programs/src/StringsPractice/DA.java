package StringsPractice;

import java.util.HashSet;
import java.util.Scanner;

public class DA {
private static final String HasSet = null;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements:");
	int n=sc.nextInt();
	sc.nextLine();
	String [] ar= new String[n];
	System.out.println("Enter "+n+ " Strings");
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextLine();
	}
	findDuplicates(ar);
	
	sc.close();
	
}
public static void findDuplicates(String[]ar)
{
	HashSet<String> seen =new HashSet<>();
	HashSet<String> duplicates =new HashSet<>();
	
	for(String Elements:ar)
	{
		if(!seen.add(Elements))
		{
			duplicates.add(Elements);
		}
	}
	if(duplicates.isEmpty()) {
		
		System.out.println("No Duplicates");
	}
	else
	{
		System.out.println("Duplicates elements : "+duplicates);
	}
}

}
