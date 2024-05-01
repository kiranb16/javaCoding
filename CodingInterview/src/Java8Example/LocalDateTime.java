package Java8Example;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateTime {
 public static void main(String[] args) {
	System.out.println("LocalDate "+LocalDate.now());
	System.out.println("localtime "+LocalTime.now());
	System.out.println("local date time"+LocalDate.of(2013, 12, 5));
}
}

