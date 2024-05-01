package basic;

@FunctionalInterface
interface EvenOdd {
	void check(int a);
}

public class EvenOddByJava8 {

	public static void main(String[] args) {
		/*
		EvenOdd evenOdd = new EvenOdd() {

			@Override
			public void check(int a) {
				if (a % 2 == 0) {
					System.out.println(a + "even number");
				} else {
					System.out.println(a + " not even number");
				}

			}
		};
		evenOdd.check(12);
		*/
		//by using lambada expression
		
		EvenOdd evenOdd = (a)-> {
				if (a % 2 == 0) {
					System.out.println(a + "  even number");
				} else {
					System.out.println(a + " not even number");
				}

			
		};
		evenOdd.check(1);
	}
}
