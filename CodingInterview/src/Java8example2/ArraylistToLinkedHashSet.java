package Java8example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class ArraylistToLinkedHashSet {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 6, 4, 5));

		HashSet<Integer> linkedhashHashSet = new LinkedHashSet<>(numbers);

		List<Integer> list = new ArrayList<>(linkedhashHashSet);
		System.out.println(list);

	}
}
