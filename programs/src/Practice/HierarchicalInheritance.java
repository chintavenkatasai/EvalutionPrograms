package Practice;
class bike
{
	void Honda()
	{
		System.out.println("Splender");
	}
}
class Palsur extends bike
{
	void Ns()
	{
		System.out.println("220cc");
	}
}
class Duke extends bike
{
	void Ktm()
	{
		System.out.println("550cc");
	}
}
public class HierarchicalInheritance {
	public static void main(String[] args) {
		
	Duke d =new Duke();
	d.Honda();
	d.Ktm();
//	d.Ns();
	

}
}
