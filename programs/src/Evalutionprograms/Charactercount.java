package Evalutionprograms;

public class Charactercount
{
private static final String Charecter = null;

public static void main(String[] args) 
{
	String s=new String("Hello sainaidu@#$ 9875");
	int vowels=0,consonants=0,digits=0,specialcharacters=0;
         for(int i=0;i<s.length();i++) 
         {
	     char ch=s.charAt(i);
	     if(Character.isLetter(ch))
	    	 if((ch =='a') || (ch =='e') || (ch =='i') || (ch =='o')|| (ch =='u'))
	     {
		  
		   vowels++;
	   }
	    	 else 
	    	 {
	    		 consonants++;
	    		 
	    	 }
	     if(Character.isDigit(ch)) 
	     {
	    	digits++; 
	     }
	     else if(!Character.isDigit(ch)&&!Character.isLetter(ch)&&(ch != ' ')
)
	     {
	    	 specialcharacters++;
	     }
   }
         System.out.println("vowels :" +vowels );
         System.out.println("consonants :" +consonants);
         System.out.println("digits :" +digits);
         System.out.println("specialcharacter :" +specialcharacters);
}
}
