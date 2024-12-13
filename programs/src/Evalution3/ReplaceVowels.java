package Evalution3;

public class ReplaceVowels  {
public static void main(String[] args) {
	String s="venkateswara";
	StringBuilder result=new StringBuilder(s);
	
	for(int i=0;i<result.length();i++)
	{
		char ch=result.charAt(i);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			result.setCharAt(i, result.charAt(i-1));
		}
	}
	System.out.println(result);
}
}
