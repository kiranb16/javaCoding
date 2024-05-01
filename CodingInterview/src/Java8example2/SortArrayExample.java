package Java8example2;

import java.util.Arrays;

public class SortArrayExample {
 public static void main(String[] args) {
	int arr[]= {2,3,1,5,6,7,8,13,14,11};
	Arrays.parallelSort(arr);
	Arrays.stream(arr).forEach(System.out::println);
}
}
