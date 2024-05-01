package Java8Example;

import java.util.Arrays;
import java.util.List;

public class Cube{
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(3,4,5,6,7,8,9);
		list.stream().map(i->i*i*i).filter(i->i>50).forEach(System.out:: println);
	}
}
