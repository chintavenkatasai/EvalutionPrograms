package Evalution3;

import java.util.ArrayList;
import java.util.Scanner;

class EH extends Exception
{
	public EH(String s)
	{
		super(s);
	}
}
public class CustomException1 {
public static void main(String[] args) {
	try
	{
		ArrayList<Integer> id=new ArrayList<>();
		id.add(101);
		id.add(102);
		
		ArrayList<String> name =new ArrayList<>();
		name.add("sai");
		name.add("vasu");
		
		
		ArrayList<String> password=new ArrayList<>();
		password.add("sai@123");
		password.add("vasu@123");
		
		System.out.println("Enter 1 for Register or 2 for Login");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		
		
		if(n==1)
		{
			System.out.println("Enter your id ");
			int ID=sc.nextInt();
			id.add(ID);
			
			System.out.println("Enter your name ");
			String nam=sc.nextLine();
			name.add(nam);
			sc.next();
			
			System.out.println("Enter your Password ");
			String pass=sc.nextLine();
			password.add(pass);
			sc.next();
			System.out.println("Registrtion Successfully");
		}
		else if(n==2)
		{
			System.out.println("Enter your id ");
			int id1=sc.nextInt();
			if(id.contains(id1))
			{
				int index = id.indexOf(id1);
				
				System.out.println("Enter your name ");
				String na=sc.nextLine();
				if(name.get(index).equals(na))
				{
					System.out.println("Enter you password ");
					String pa=sc.nextLine();
					if(password.get(index).equals(pa))
					{
						System.out.println("Successfully Login");
					}
					else
					{
						throw new EH("Incorrect password");
					}
				}
				else
				{
					throw new EH("Incorrect name ");
				}
			}
			else
			{
				throw new EH("ID not found please register");
			}
		}
	}
	catch(EH e)
	{
		System.out.println(e);
	}
}
}
