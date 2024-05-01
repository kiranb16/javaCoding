package array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArray2 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,2,3,5};
		
//		Arrays.stream(a).distinct().forEach(System.out::println);
//		
//		System.out.println("-------------------------------------------");
//		int re[]=Arrays.stream(a).distinct().toArray();
//		System.out.println(Arrays.toString(re));
		
	int redup[]	=Arrays.stream(a).distinct().toArray();
	System.out.println(Arrays.toString(redup));
}}
