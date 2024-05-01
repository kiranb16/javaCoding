package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(23);
		list.add(34);

		Object[] arr = list.toArray();

		for (Object obj : arr) {
			System.out.print(obj + " ");

		}
		System.out.println("+++++++++++++++++++++++++++");

		String[] list2 = { "Kiran", "Ravi", "Sunita" };
		List al = Arrays.asList(list2);
		System.out.println("array to arrayList"+al);
	}
}