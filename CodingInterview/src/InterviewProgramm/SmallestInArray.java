package InterviewProgramm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestInArray {

	public static int getSmallestInteger( Integer a[], int total) {
		List<Integer> list= Arrays.asList(a);
		Collections.sort(list);
		int element= list.get(0);
		return element;
	}
	public static void main(String[] args) {
		Integer a[]= {1,2,3,4,5};
		System.out.println("smallest :"+getSmallestInteger(a, 5));
	}
}
 