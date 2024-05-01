package StringExample;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NoOfOccurance {
	public static void main(String[] args) {
		String str = "i am happy confident successfull i am happy";

		List<String> list = Arrays.asList(str.split(" "));
		Map<String, Long> occ = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(occ);

//		Map<String, Long> re = Arrays.stream(str.split(" "))
//				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
//		System.out.println(re);
//
//		String doub = re.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey)
//				.findFirst().get();
//				
//		System.out.println(doub);

	}
}
