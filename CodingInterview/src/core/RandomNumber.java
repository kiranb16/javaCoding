package core;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	public static void main(String[] args) {

		/*
		 * System.out.println("enter the number");
		 *  Scanner sc = new Scanner(System.in);
		 * int n = sc.nextInt();
		 * 
		 * Random random = new Random(); random.ints(1,
		 * 100).limit(n).forEach(System.out::println);
		 */
		Random random= new Random();
		 random.ints(1,100).limit(5).forEach(System.out::println);
	}

}
