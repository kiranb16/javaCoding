import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class practice {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("mango");
		list.add("lemon");
		list.add(null);
		list.add(null);
		list.add("MLO");
		//list.remove("mango");
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(" big one "+list.get(list.size()-1));

		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(0);
		set.add(3);
		set.add(null);
		set.add(null);
		set.remove(1);
		System.out.println(set);
	}
}