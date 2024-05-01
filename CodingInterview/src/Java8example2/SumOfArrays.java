package Java8example2;

import java.util.Arrays;
import java.util.OptionalDouble;

public class SumOfArrays {
 public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6};
	   // average
	   OptionalDouble avg=Arrays.stream(arr).average();
	   System.out.println(avg);
	   //sum
	   Integer sum=Arrays.stream(arr).sum();
	   System.out.println(sum);
	   
}
}
