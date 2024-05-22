package methodRef;

import java.util.Optional;

public class OptionalDemo {
public static void main(String[] args) {
	String email= null;
	
	Optional<String> stringoptOptional=Optional.ofNullable(email);
   String defaultOptional = stringoptOptional.orElse("default@gmail.com");
   System.out.println(defaultOptional);
}
}
