package Practice;
class animal
{
	void eat()
	{
		System.out.println("Eating...");
	}
}
class dog extends animal
{
	void bark()
	{
		System.out.println("barking..");
	}
}
class babyDog extends dog
{
	void wep()
	{
	  System.out.println("Weaping...");
	}
}
public class MultilevelInheritance {
public static void main(String[] args) {
	babyDog b=new babyDog();
	b.bark();
	b.eat();
	b.wep();
}
}
