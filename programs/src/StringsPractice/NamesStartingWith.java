package StringsPractice;

public class NamesStartingWith {
public static void main(String[] args) {
	String s[]= {"ranga","ravi","rahul","chanti","chandhan"};
	String s1[]= {"r"};
	for(String a:s1)
	{
		System.out.println("I want this Character words :"+a);
		
		for(String name:s)
		{
			if(name.startsWith(a))
			{
				System.out.println(name);
			}
		}
	}
}
}
