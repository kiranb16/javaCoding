package InterviewProgramm;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxAndMinArray2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 4, 5, 6);
		int min = list.stream().min((x, y) -> x.compareTo(y)).get();
		System.out.println("minimum " + min);
		int max= list.stream().max((x, y) -> x.compareTo(y)).get();
		System.out.println(max);
	}
}
