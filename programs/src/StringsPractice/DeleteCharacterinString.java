package StringsPractice;

import java.util.Scanner;

public class DeleteCharacterinString {
public static void main(String[] args) {
	String s="guriji";
	String s1="";
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Delete Character:");
	char ch=sc.next().charAt(0);
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!=ch)
		{
			s1=s1+s.charAt(i);
		}
	}
	System.out.println(s1);
}
}
