package java8NewExample;

import java.util.stream.IntStream;

public class primeNumber {
	public static void main(String[] args) {
		
		IntStream.rangeClosed(2, 100).filter(x->isprime(x)).forEach(System.out::println);
	}
	public static boolean isprime( int n) {
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	
	}
}