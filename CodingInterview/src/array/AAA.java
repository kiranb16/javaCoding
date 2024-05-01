package array;

import java.util.Arrays;

public class AAA{
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,2,3,5};
		int[] nonre=Arrays.stream(a).distinct().toArray();
		System.out.println(Arrays.toString(nonre));
	}
}
