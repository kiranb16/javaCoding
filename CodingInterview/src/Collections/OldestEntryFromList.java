package Collections;

import java.util.Arrays;
import java.util.List;

public class OldestEntryFromList {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 6);

		System.out.println("first index :" + list.get(0));
		
		System.out.println("last Index :"+list.get(list.size()-1));

	}

}
