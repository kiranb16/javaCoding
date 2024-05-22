package test;

import java.util.stream.IntStream;

public class InStreamExample {
 public static void main(String[] args) {
    IntStream.range(2, 100).filter(s->isPrimeNumber(s)).forEach(System.out::println);
}

private static Boolean isPrimeNumber(int s) {
	for( int i=2; i<s;i++) {
		if(s%i==0) {
			return false;
		}
	}
	return true;
}
}
