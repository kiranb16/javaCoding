package practice;

interface Calculator {
	// void Switch();
	// void input( int input);
	int substract(int a, int b);
}

public class LambadaExpression {
	public static void main(String[] args) {

		Calculator c = (a, b) -> {
			if(b>a) {
				throw new RuntimeException(b+" is greater than "+a);
			}else {
				return a-b;
			}
		};
		System.out.println(c.substract(2, 8));

	}
}
