package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteratorExample {
 public static void main(String[] args) {
	ArrayList<String> list= new ArrayList<>();
	list.add("A");
	list.add("C");
	list.add("B");
	list.add("D");
	System.out.println(list);
	Iterator<String> itr=list.listIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
}
}
