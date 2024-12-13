package Evalutionprograms;


class A {
	void dis() {
		System.out.println("Hello");
	}
}
class B extends A{
	void dis() {
		System.out.println("world");
	}
}
public class Methodoverriding{
	public static void main(String args[]) {
		A a=new A();
		A b=new B();
		a.dis();
		b.dis();
	}
}

