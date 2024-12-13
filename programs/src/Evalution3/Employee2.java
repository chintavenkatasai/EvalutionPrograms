package Evalution3;

import java.util.ArrayList;
import java.util.Scanner;

class ExceptionH extends Exception
{
	public ExceptionH(String s)
	{
		super(s);
	}
}
public class Employee2 {
public static void main(String[] args) {
	
	try
	{
		ArrayList<String> names =new ArrayList<>();
		names.add("ranga");
		names.add("naveen");
		
		
		ArrayList<String> ids =new ArrayList<>();
		ids.add("M@123");
		ids.add("M@234");
		
		ArrayList<String> passwords= new ArrayList<>();
		passwords.add("R1234");
		passwords.add("N1234");
		
		Scanner sc = new Scanner(System.in);
	    System.out.println(" Enter 1 for registration 2 for login");
	    int n=sc.nextInt();
	    sc.nextLine();
	    
	    if(n==1)
	    {
	    	System.out.println("Enter your name: ");
	    	String neme =sc.nextLine();
	    	names.add(neme);
	    	
	    	System.out.println("Enter your id");
	    	String id=sc.nextLine();
	    	ids.add(id);
	    	
	    	
	    	System.out.println("Enter your passsword ");
	    	String pass=sc.nextLine();
	    	passwords.add(pass);
	    	
	    	System.out.println("Registration Successfully");
	    }
	    	else if(n==2)
	    	{
	              System.out.println("Enter your name ");
	              String Name=sc.nextLine();
	            if(names.contains(Name))
	            {
	            	int index=names.indexOf(Name);
	            	
	            	System.out.println("Enter your Id");
	            	String ID=sc.nextLine();
	            	if(ids.get(index).equals(ID))
	            			{
	            		System.out.println("Enter your Password:");
	            		String pas=sc.nextLine();
	            		if(passwords.get(index).equals(pas))
	            		{
	            			System.out.println("Successfully Login");
	            		}
	            		else
	            		{
	            			throw new ExceptionH("Incorrect password");
	            		}
	           	}
	            	else
	            	{
	            		throw new ExceptionH("Incorrect Id");
	            	}
	    	}
	            else
	            {
	            	throw new ExceptionH("Incorrect name");
	            }
	    }
	   
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
