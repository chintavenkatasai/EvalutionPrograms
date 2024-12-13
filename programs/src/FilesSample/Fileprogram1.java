package FilesSample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Fileprogram1 
{
public static void main(String[] args) throws Throwable 
{
	File f=new File("./sai.txt");
	if(!f.exists())
	{
		f.createNewFile();
	}
	FileOutputStream fos=new FileOutputStream(f);
	String s=new  String("Hello world ");
	String s1 = "SaiNaidu ";
	String s2 = "Chinta";
	byte[] b=s.getBytes();
	byte[] b1=s1.getBytes();
	byte[] b2=s2.getBytes();
	fos.write(b);
	fos.write(b1);
	fos.write(b2);
	fos.close();
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
//	fr.read();
	int i;
	while((i=br.read())!=-1)
	{
		System.out.print((char)i);
	}
	fr.close();
	br.close();
}
}
