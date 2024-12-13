package Evalution3;

public class ReplceVowelsinaString {
public static void main(String[] args) {
	String s="sainaidu";
	StringBuilder s1=new StringBuilder(s);
	
	for(int i=0;i<s1.length();i++)
	{
		char ch=s1.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			s1.setCharAt(i,s1.charAt(i-1));
//			if (i > 0) {
//                s1.setCharAt(i, s1.charAt(i - 1));
//			}
	}
}
	System.out.println(s1);
}
}
