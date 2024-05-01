package Java8example2;

import java.time.LocalDate;
import java.time.LocalTime;

import Java8Example.LocalDateTime;

public class DateTimeApi{
	 public static void main(String[] args) {
		System.out.println("curent local date "+LocalDate.now());
		
		System.out.println("current local time "+LocalTime.now());
		
		System.out.println("time and date "+java.time.LocalDateTime.now());
	}
}