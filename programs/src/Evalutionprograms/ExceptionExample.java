package Evalutionprograms;

public class ExceptionExample 
{
public static void main(String[] args) 
{
 
   try
   {
	   int fnumber=10;
	   int snumber=0;
	   int result;
  result=fnumber%snumber;
  System.out.println(+result);
   }
   catch(Exception ae)
   {
	   System.out.println(ae);
   }
	finally
	{
		int a=8;
		int b=6;
		int c;
		c=a+b;
		System.out.println(c);
	}
}
}
