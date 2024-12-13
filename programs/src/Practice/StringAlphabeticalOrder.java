package Practice;

import java.util.Arrays;

public class StringAlphabeticalOrder {
public static void main(String[] args) {
	String s="zyxvajhghjuiyhambdfg";
	char a[]=s.toCharArray();
	Arrays.sort(a);
	System.out.println(a);
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]);
	}
}
}
