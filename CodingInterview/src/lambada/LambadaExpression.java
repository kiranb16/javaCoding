package lambada;

@FunctionalInterface
interface OddEven {
	public void evenOdd(int a);
}

public class LambadaExpression {

	public static void main(String[] args) {
       
		

		OddEven oddEven = (a) -> {
			if (a % 2 == 0) {
				System.out.println("Even Number");
			} else
				System.out.println("odd");

		};
		oddEven.evenOdd(1);
	}

}
