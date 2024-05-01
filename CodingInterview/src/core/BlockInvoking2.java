package core;

public class BlockInvoking2 {

	static {
		System.out.println("static block");
	}
	{
		System.out.println("instance");
	}

	BlockInvoking2() {
		System.out.println("constructor");
	}

	BlockInvoking2(int a) {
		System.out.println(" 1 arg constructor" + a);
	}

	public static void main(String[] args) {
		System.out.println("main method");
		new BlockInvoking2();
		new BlockInvoking2(12);
	}
}
