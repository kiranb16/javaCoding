package array;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateElememt2 {
	public static void main(String[] args) {
		
	
	int a[]= new int[] {1,2,3,4,5,6,4,5,6,3};
	Set<Integer> set= new TreeSet<>();
	for(int i=0; i<a.length; i++) {
		if(!set.add(a[i])) {
			System.out.println(" duplicate Element "+a[i]);
		}
	}
}
}