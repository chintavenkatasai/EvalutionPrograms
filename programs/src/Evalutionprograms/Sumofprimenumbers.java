package Evalutionprograms;

public class Sumofprimenumbers
{
	
public static void main(String[] args)
{
	int sum=0;
	for(int n=1;n<100;n++)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
			if((count==2) &&(n<=50))
			{
				System.out.println(n);
				sum=sum+n;
			}
		
	}
	System.out.println("printing sum of 50 prime numbers :" +sum);
}
}
