package InterviewProgramm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestAndSmallestInArrays2 {
	public static int getThirdLargest(Integer[] a, int total) {
		List<Integer> list = Arrays.asList(a);
		Collections.sort(list);
		int element = list.get(total - 3);
		return element;
	}
	public static void main(String[] args) {
		Integer a[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("thirdLargest :"+getThirdLargest(a, 9));
	}
}
