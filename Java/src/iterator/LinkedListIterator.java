package iterator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListIterator {
	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("D");
		ListIterator<String> itr=list.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("------------------------------------------------");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
}
}