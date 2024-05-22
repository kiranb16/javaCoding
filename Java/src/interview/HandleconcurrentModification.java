package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class HandleconcurrentModification {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// 1st way to handled concurrentModification
		// List<String> synList= new Collections.synchronizedList(list);

		// 2 explicite lock
		synchronized (list) {
			list.add("A");
			list.add("B");
			list.add("C");
			list.add("D");
		}
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			if (list.contains("A")) {
				list.remove("A");
				System.out.println(itr.next());
			}
		}

	}

}
