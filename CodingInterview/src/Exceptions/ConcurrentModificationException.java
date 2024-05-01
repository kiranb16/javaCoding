package Exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			Integer value=itr.next();
			System.out.println("list value "+value);
			if(value.equals(15)) {
				list.remove(value);
			}
		}
	}
}


