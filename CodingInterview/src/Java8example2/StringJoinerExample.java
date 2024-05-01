package Java8example2;

import java.util.StringJoiner;

public class StringJoinerExample {
public static void main(String[] args) {
	StringJoiner js= new StringJoiner(",");
	js.add("A").add("b").add("c");
	System.out.println(js);
	StringJoiner js2= new StringJoiner(":");
	js2.add("A").add("b").add("c");
	System.out.println(js2);
	
	js.merge(js2);
	System.out.println("merged  "+js);
}
}
