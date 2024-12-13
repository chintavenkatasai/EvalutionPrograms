package Evalution3;

import java.util.*;
import java.util.Scanner;

class CustomException extends Exception
{
	public CustomException(String s)
	{
		super(s);
	}
}
public class ExceptionEmployee {
	
	public static void main(String[] args) {
		
		try
		{
			Scanner sc=new Scanner(System.in);
			
			ArrayList<String> username=new ArrayList<>();
			username.add("sai");
			username.add("vasu");
			ArrayList<String> password=new ArrayList<>();
			password.add("sai@123");
			password.add("vasu@123");
			
			ArrayList<String>Depart=new ArrayList<>();
			Depart.add("HR");
			Depart.add("Dev");
			
			System.out.println("Enter 1 for register or 2 for login");
			int n =sc.nextInt();
			sc.nextLine();
			
			if(n==1)
			{
				System.out.println("Enter your username");
				String user=sc.nextLine();
				username.add(user);
				
				System.out.println("Enter your Password");
				String pass=sc.nextLine();
				password.add(pass);
				
				
				System.out.println("Enter your Department");
				String Dep =sc.nextLine();
				Depart.add(Dep);
				
				
				System.out.println("Registration successful!");
			}
			else if(n==2)
			{
				System.out.println("Enter Username");
				String usr =sc.nextLine();
				
				if(username.contains(usr))
				{
					int index = username.indexOf(usr);
					
					
					System.out.println("Enter your Password");
					String ps=sc.nextLine();
					if(password.get(index).equals(ps))
					{
						System.out.println("Enter your department:");
						String dpm = sc.nextLine();
						
						if(Depart.get(index).equals(dpm))
						{
							System.out.println("Successful login!");
						}
						else
						{
							throw new CustomException("Irrelevant Department");
						}
					}
					else
					{
						throw new CustomException("Incorrect password");
					}
				}
				else
				{
				throw new CustomException("User not found,please register");
				}
		    }
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
