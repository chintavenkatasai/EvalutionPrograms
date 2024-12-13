package Practice;

import java.util.Scanner;

public class DeleteCharacter {
public static void main(String[] args) {
	String s="kagjhfgaslh";
    String D="";
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Delete Character:");
    char ch=sc.next().charAt(0);
    for(int i=0;i<=s.length()-1;i++)
    {
    	if(s.charAt(i)!=ch)
    	{
    		D=D+s.charAt(i);
    	}
    }
    System.out.println(D);
}
}
