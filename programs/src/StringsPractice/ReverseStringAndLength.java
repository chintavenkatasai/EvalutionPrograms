package StringsPractice;

public class ReverseStringAndLength {
public static void main(String[] args) {
	String s="naiduGaru";
	int length=0;
	for(int i=0;i<s.length();i++)
	{
		length++;
	}
	System.out.println("String of the length "+length);
	for(int i=s.length()-1;i>=0;i--)
	{
		System.out.print(s.charAt(i));
	}
}
}
