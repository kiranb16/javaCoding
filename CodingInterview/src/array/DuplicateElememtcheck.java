package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElememtcheck {
public static void main(String[] args) {
	Integer arr[]= {1,2,3,4,2,3};
//	List<Integer> list= new ArrayList<>();
//	Collections.addAll(list, arr);
	
	List<Integer> list=  Arrays.asList(arr);
	
	Set<Integer> set= new HashSet<>(list);
	
	if(list.size()!=set.size()) {
		System.out.println(" array contains duplicate");
	}else {
		System.out.println(" not having duplicate");
	}
	
}
}
