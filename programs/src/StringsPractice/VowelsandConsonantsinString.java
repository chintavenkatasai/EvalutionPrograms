package StringsPractice;

public class VowelsandConsonantsinString {
public static void main(String[] args) {
	int vowels=0,Consonants=0;
	String s="naidugariabbailu";
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(Character.isAlphabetic(ch))
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels++;
			}
			else
			{
				Consonants++;
			}
		}
	}
	System.out.println("Vowels in a String "+vowels);
	System.out.println("Consonants in a String "+Consonants);
}
}
