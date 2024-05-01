package core;

public class Sequence{
	static {
		System.out.println("static block");
	}
	{
		System.out.println("non static block");
	}
	public Sequence() {
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		System.out.println("main");
		Sequence s1= new Sequence();
		
	}
}
