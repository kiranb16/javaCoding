package core;

public class BlockInvoking {
static {
	System.out.println("static block innvoked");
}
public BlockInvoking() {
	// TODO Auto-generated constructor stub
	System.out.println("constructor");
}
void display() {
	System.out.println("instance created");
}
public static void main(String[] args) {
	System.out.println("main method");
	BlockInvoking  b=new BlockInvoking();
	b.display();
	
	
}
}
