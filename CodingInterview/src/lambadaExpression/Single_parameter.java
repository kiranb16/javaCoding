package lambadaExpression;

import java.util.Arrays;
import java.util.List;

public class Single_parameter {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		list.forEach(System.out::println);

		System.out.println("even number");
		list.forEach(n -> {
			if (n % 2 == 0)
				System.out.println(n);
		});
	}
}
