package StringsPractice;

public class Individual {
public static void main(String[] args) {
	String Word="naidu gari abbailu";
	String w="";
	String a[]=Word.split(" ");
	String result="";
	for(String s:a)
	{
		char ch=s.charAt(0);
		ch=Character.toUpperCase(ch);
		w=s.substring(1);
		result=result+ch+w+" ";
	}
	System.out.println(result);
}
}
