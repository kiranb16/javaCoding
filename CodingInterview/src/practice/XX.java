package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class XX {
	public static void main(String[] args) {
		/*
		 * List<String> names = new LinkedList<>(); names.add("learn");
		 * names.add("from"); names.add("Geeksforgeeks");
		 * 
		 * // Getting ListIterator ListIterator<String> listIterator =
		 * names.listIterator();
		 * 
		 * 
		 * 
		 * // Traversing elements, the iterator is at the end // at this point
		 * System.out.println("Backward Direction Iteration:"); while
		 * (listIterator.hasPrevious()) { System.out.println(listIterator.previous());
		 */
		
		LinkedList<String> list= new LinkedList<>();
		list.add("kiran");
		list.add("snehal");
		list.add("ankita");
		list.add("shaila");
		list.add("shilpa");
		list.add("sharda");
		list.add("abhilasha");
		list.add("sneha");
		list.add("jyoti");
		
		
		ListIterator<String> love=list.listIterator();
		while(love.hasNext()) {
			System.out.println(love.next());
		}
		System.out.println("------------------------------------------");
		while(love.hasPrevious()) {
			System.out.println(love.previous());
		}
		
		

	}
}












