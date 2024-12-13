package StringsPractice;

public class MaxMinOccurringCharacterinString {
	public static void main(String[] args) {
		String s="ghjhjhhhh";
		String s1[]=s.split("");
		String Maxchar="",Minchar="";
		int Max=1,Min=Integer.MAX_VALUE;
		for(String w:s1)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(w.charAt(0)==s.charAt(i))
				{
					count++;
				}
			}
			if(Max<count)
			{
				Max=count;
				Maxchar=w;
			}
			else if(Min>count)
			{
				Min=count;
				Minchar=w;
			}
		}
		System.out.println(Max+" "+Maxchar);
		System.out.println(Min+" "+Minchar);
	}

}
