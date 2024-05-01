package optional;

import java.util.Optional;

public class OptionalClassTest {
public static void main(String[] args) {
	String str= null;
	Optional<String> optional= Optional.ofNullable(str);
	System.out.println(optional.orElse("lifeline"));
	
}
}
