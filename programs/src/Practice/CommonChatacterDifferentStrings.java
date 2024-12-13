package Practice;

public class CommonChatacterDifferentStrings {
	public static void main(String[] args) {
		String s="hello";
		String s1="hilo";
		String s2="";
		for(int i=0;i<=s.length()-1;i++)
		{
			for(int j=0;j<=s1.length()-1;j++)
			{
				if(s.charAt(i)==s1.charAt(j))
				{
					s2=s2+s.charAt(i);
				}
			}
		}
		System.out.println(s2);
	}

}
