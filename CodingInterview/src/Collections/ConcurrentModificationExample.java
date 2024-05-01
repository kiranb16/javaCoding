package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationExample {
	public static void main(String[] args) {
		List<String> list= new CopyOnWriteArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
//		try {
//		Iterator<String> itr=list.iterator();
//		while(itr.hasNext()) {
//			list.add("six");
//			System.out.println(itr.next());
//		}
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		
		Iterator<String> l=list.iterator();
		while(l.hasNext()) {
			list.add("five");
			System.out.println(l.next());
		}
}
}
