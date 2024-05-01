package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BiggestOfThreeUsingList {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(16);
		list.add(34);
		list.add(56);
		System.out.println(Collections.max(list));
		System.out.println("minimum integer :"+Collections.min(list));
	}
}

