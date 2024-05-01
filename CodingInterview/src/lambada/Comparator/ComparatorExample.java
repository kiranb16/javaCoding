package lambada.Comparator;

import java.util.Comparator;

public class ComparatorExample {
	public static void main(String[] args) {

		Comparator<Integer> comp= new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		};
		System.out.println(comp.compare(32, 23));
	
	}
}
