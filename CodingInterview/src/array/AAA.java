package array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;

public class AAA {
	public static void main(String[] args) {
		String str="Kirran Batwaal";
		//char[] ch=str.toCharArray();
		
		str.chars().distinct().forEach(e->System.out.print((char)e));

	}
}
