package practice;

import java.util.function.Function;

class FunctionalImplements implements Function<String, Integer>{

	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		return t.length();
	}
}
public class FunctionDemo{
	public static void main(String[] args) {
		Function<String, Integer> function= new FunctionalImplements();
		System.out.println(function.apply("kiran"));
	}
}