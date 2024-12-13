package Evalutionprograms;

public class Numberformateexception {
public static void main(String[] args) {
	try 
	{
		int n= Integer.parseInt("1234abc");
		System.out.println(n);
	}
	catch( NumberFormatException nfe) 
	{
		System.out.println((nfe));
	}
}
}
