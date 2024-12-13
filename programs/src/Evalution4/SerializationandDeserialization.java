package Evalution4;

import java.io.*;
import java.util.*;
class Demo implements Serializable
{
	int id;
	String name;
	
	Demo(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}

public class SerializationandDeserialization {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	ArrayList<Demo> al=new ArrayList<>();
	al.add(new Demo(1,"sai"));
	al.add(new Demo(2,"naidu"));
	
	FileOutputStream fo=new FileOutputStream("./vasu.txt");
	ObjectOutputStream oo=new ObjectOutputStream(fo);
	oo.writeObject(al);
	fo.close();
	oo.close();
	
	FileInputStream fi=new FileInputStream("./vasu.txt");
	ObjectInputStream oi=new ObjectInputStream(fi);
	
	List<Demo> d=(ArrayList<Demo>)oi.readObject();
	
	Iterator itr=d.iterator();
	while(itr.hasNext())
	{
		Demo dd=(Demo)itr.next();
		System.out.println(dd.id+" "+dd.name);
	}
}
}
