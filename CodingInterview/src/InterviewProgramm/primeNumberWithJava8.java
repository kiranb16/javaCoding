package InterviewProgramm;

import java.util.stream.IntStream;

public class primeNumberWithJava8 {
	public static void main(String[] args) {
IntStream.rangeClosed(1, 100).filter(e->primeNumber(e)).forEach(System.out::println);
		
	}

	private static boolean primeNumber(int a) {
		for(int i=2; i<=a/2; i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
}