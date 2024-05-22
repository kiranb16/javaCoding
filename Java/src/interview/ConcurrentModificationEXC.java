package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationEXC {
 public static void main(String[] args) {
	ArrayList<String> list= new ArrayList<>();
	list.add("apple");
	list.add("samsung");
	System.out.println(list);
	Iterator<String> itr=list.iterator();
	while(itr.hasNext()) {
		if(list.contains("apple")) {
			list.remove("apple");
		}
		System.out.println(itr.next());
	}
}
}
