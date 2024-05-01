package java8Coding;
class Book{
	Book(){
		System.out.println("10% off on Every Book");
	}
}
interface Comma{
	void show();
}

public class ConstructorRefMethod {
 public static void main(String[] args) {
	
	 Comma c= Book:: new;
	 c.show();
}
}
