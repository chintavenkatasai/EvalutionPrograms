package Practice;

public class ToremoveVowelsinString {
public static void main(String[] args) {
	String s="aeiojhdsgjgkgf";
	String s1="";
	for(int i=0;i<=s.length()-1;i++)
	{
		char ch=s.charAt(i);
		if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
		{
			s1=s1+s.charAt(i);
		}
	}
	System.out.println(s1);
}
}
