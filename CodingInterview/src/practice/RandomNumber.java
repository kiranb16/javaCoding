package practice;

import java.util.Random;

public class RandomNumber {
 public static void main(String[] args) {
	Random random= new Random();
	random.ints(1, 100).limit(5).forEach(System.out::println);
}
}
