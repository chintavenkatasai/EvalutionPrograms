package Practice;

public class CaptalizeString {
public static void main(String[] args) {
	String word="naidu ranga naveen";
	String w="";
	String a[]=word.split(" ");
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
