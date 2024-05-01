package singleton;

class D {
	D d = new D();
	// it will create loooping and posibility of stack over flow
}

public class TrickyQuestion2 {
	public static void main(String[] args) {
		D new_d= new D();
	}
}
