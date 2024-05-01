package array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {
   public static void main(String[] args) {
	int a[]= {1,2,3,4,5,2,3,5};
	Set<Integer> set= new HashSet<>();
	for(int i=0; i<a.length; i++) {
		if(set.add(a[i])) {
			System.out.println(a[i]);
		}
	}
}
}
