package basic;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BiFunctionExample{
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> multi=(a,b)->a*b;
		System.out.println(multi.apply(23, 23));
//		
//		BiFunction<Integer, Integer, Integer> re=(a,b)->a/b;
//		System.out.println(re.apply(32, 16));
		
		BiFunction<Integer, Integer, Integer> re=(a,b)->a/b;
		System.out.println(re.apply(15, 5));
	}
}