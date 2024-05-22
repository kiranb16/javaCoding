package coreJava;

import java.util.Arrays;
import java.util.List;

public class Stream1Example{
	/*
	 * List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk"); long count = strList.stream() 
	 * .filter(x -> x.isEmpty()) .count();

Read more: https://www.java67.com/2014/04/java-8-stream-examples-and-tutorial.html#ixzz7wKTey6hT
	 */
	public static void main(String[] args) {
		List<String> list= Arrays.asList("abc","","cvb","bnj");
		list.stream().filter(x->x.startsWith("a")).forEach(System.out::print);
		
	}
}