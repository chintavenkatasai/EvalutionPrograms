package FilesSample;

import java.io.*;

public class Filepractice {
private static final String Charecter = null;

public static void main(String[] args) throws Exception {
	int vowels=0,consonents=0,digits=0;
	File f=new File("./Sai1.tst");
	f.createNewFile();
	
	FileOutputStream fo=new FileOutputStream(f);
	String s="sai naidu123 chintaa";
	byte b[]=s.getBytes();
	fo.write(b);
	System.out.println("Sucess");
	fo.close();
	
	FileInputStream fi=new FileInputStream(f);
	int i;
	while((i=fi.read())!=-1)
	{
		char ch =(char)i;
		if (Character.isAlphabetic(ch)) 
		{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			vowels++;
		}
		else
		{
			consonents++;
		}
		}
		if(Character.isDigit(ch))
		{
			digits++;
		}		
}
	System.out.println("The number of Vowels: "+vowels);
	System.out.println("The number of consonents: "+consonents);
	System.out.println("The number of Digits: "+digits);
}
}