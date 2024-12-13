package Evalution4;

public class FindPrimeNumbersGivenNumber {
public static void main(String[] args) {
	
	int number=8459713;
	int count1=0;
	int re=0;
	
	while(number!=0)
	{
		int count=0;
		re=number%10;
		for(int i=1;i<=re;i++)
		{
			if(re%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			count1++;
		}
		number=number/10;
	}
	System.out.println("Prime numbers count in Given number "+count1);
}
}
