package basic;

class Iam {
	static String makeItUppercase(String message) {
		return message != null ? message.toUpperCase() : null;
	}
}

@FunctionalInterface
interface Foo {
	String doOperation(String message);
}

public class StaticRefMethod {
	public static void main(String[] args) {
		
		//logic one
		
		/*
		 * Foo foo = message -> message != null ? message.toUpperCase() : null;
		 * System.out.println(foo.doOperation("Kirhan Batwal"));
		 */
		
		//logic two
		
		Foo foo= Iam:: makeItUppercase;
		System.out.println(foo.doOperation("ShreeRam"));
		
	}

}