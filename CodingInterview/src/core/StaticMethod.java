package core;

public class StaticMethod {
	static int cube(int a) {
		return a * a * a;
	}

	static boolean areEqual(int a, int b) {

		if (a==b) {
			System.out.println("integer are  same");
			return true;
			
		} else {
			System.out.println("integer are not same");
			return false;
		}
	}
	public static void main(String[] args) {
	 int result	=StaticMethod.cube(4);
	 System.out.println(result);
		boolean x=StaticMethod.areEqual(1, 12);
		System.out.println(x);
	}
}
