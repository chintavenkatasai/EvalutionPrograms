package Evalutionprograms;

class X
{
	void dis() {
		System.out.print("i ");
		
	}
}
class Y extends X{
	void dis() {
		System.out.print("am ");
	}
}
class Z extends Y{
	void dis() {
		System.out.print("sai ");
	}
}
class D extends Z{
	void dis() {
		System.out.println("naidu. ");
	}
}
public class MethodoverridingExample {
     public static void main(String[] args) {
		X x=new X();
		X y=new Y();
		X z=new Z();
		X d=new D();
		x.dis();
		y.dis();
		z.dis();
		d.dis();
	}
}
