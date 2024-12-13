package StringsPractice;

public class StringCapitalized {
public static void main(String[] args) {
	String words="naidu gari abbailu";
	String w="";
	String a[]=words.split(" ");
	String result="";
	for(String s:a)
	{
		char ch=s.charAt(0);
		ch=Character.toUpperCase(ch);
		w=s.substring(1);
		result=result+ch+w+" ";
//		System.out.println(ch);
	}
	System.out.println(result);
}
}
