package Evalution4;

import java.util.HashSet;

public class OccurrenceOfCharCount {
    public static void main(String[] args) {
        String s = "Miracle Software Systems pvt ltd";
        HashSet<Character> oc=new HashSet<>();
        s = s.toLowerCase();
        
        for(int i=0;i<s.length();i++)
        {
        	int count=1;
        	if(oc.contains(s.charAt(i)))
        	{
        		continue;
        	}
        	for(int j=0;j<s.length();j++)
        	{
        		if(s.charAt(i)==s.charAt(j))
        		{
        			if(i!=j)
        			{
        			count++;
        			}
        			}
        		oc.add(s.charAt(i));
        	}
        	System.out.println(s.charAt(i)+"  Occurence is "+count);
        }
    }
}