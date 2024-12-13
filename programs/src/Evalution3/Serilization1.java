package Evalution3;

import java.io.*;
import java.util.*;
class Student  implements Serializable
{
	int id;
	String name;
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
public class Serilization1{
public static void main(String[] args) throws Exception {
	ArrayList<Student> st=new ArrayList<>();
	st.add(new Student(21,"sai"));
	st.add(new Student(23,"vasu"));
	FileOutputStream fo=new FileOutputStream("./data");
	ObjectOutputStream oo=new ObjectOutputStream(fo);
	oo.writeObject(st);
	fo.close();
	FileInputStream fi=new FileInputStream("./data");
	ObjectInputStream oi=new ObjectInputStream(fi);
	
	List<Student> s=(ArrayList<Student>)oi.readObject();
    Iterator itr=s.iterator();
    while(itr.hasNext())
    {
    	Student d=(Student)itr.next();
    	System.out.println(d.id+" "+d.name);
    }
  fo.close();
}
}
