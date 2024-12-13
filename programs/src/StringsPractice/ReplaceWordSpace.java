package StringsPractice;

public class ReplaceWordSpace {
public static void main(String[] args) {
	String s="Naidu gari abbailu";
	String temp="";
	String temp1;
	String s1[]=s.split(" ");
	System.out.println(s1[0]);
	for(int i=0;i<s1.length-1;i++)
	{
		temp=s1[i];
		temp1=s1[i+1];
		int len=temp.length();
		char ch=temp.charAt(len-1);
		char ch1=temp1.charAt(0);
		String r=temp1.replace(ch1, ch);
		
		System.out.println(r);
	}
}
}
