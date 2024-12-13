package Practice;

public class StringsComparison {
public static void main(String[] args) {
	String s="naidu";
	String s1="naido";
	int count=0;
	if(s.length()!=s1.length())
	{
		System.out.println("Strings are not Same");
	}
	else
	{
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)==s1.charAt(i))
			{
				count++;
			}
			else
			{
				System.out.println("Strigs are Different");
				break;
			}
		}
		if(count==s.length())
		{
			System.out.println("String are Equal");
		}
	}
}
}
