package lambada;

interface Calculator {
	int substract(int a, int b);
	
	// ()-> {};
}

public class LambadaExpressionSubstract {
	public static void main(String[] args) {
		Calculator calculator = (a, b) -> {
			if( b>a) {
				throw new  RuntimeException(" sorry !!!!substraction not posible");
			}else return a-b;
		};
		System.out.println(calculator.substract(12, 18));
	}
}
