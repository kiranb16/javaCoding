package Java8Example;

import java.util.Arrays;

public class SortArrayExample {
 public static void main(String[] args) {
	int arr[]= {99,4,5,66,23,12};
	Arrays.parallelSort(arr);
	Arrays.stream(arr).forEach(e->System.out.println(e+" "));
}
}