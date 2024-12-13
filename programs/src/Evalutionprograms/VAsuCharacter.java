package Evalutionprograms;

public class VAsuCharacter {
public static void main(String[] args) {
	String s=new String("Hello World 1239");
	int vowels=0,consonants=0,digits=0,specialcharaters=0;
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(Character.isLetter(ch))
		if((ch =='a') || (ch =='e') || (ch =='i') || (ch =='o')|| (ch =='u'))
		{
			vowels++;
		}
		else
		{
			consonants++;
		}
		 if(Character.isDigit(ch))
		{
			digits++;
		}
		 else
		 {
			 specialcharaters++;
		}
	}
	System.out.println("Vowels in a given string is :"+vowels);
	System.out.println("consonants in a given string is :"+consonants);
	System.out.println("Digits in a given string is : " +digits);
	System.out.println("Special characters in given string is :"+specialcharaters);
}
}
