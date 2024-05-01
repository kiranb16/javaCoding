package java8Coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SupplierInterfaceExample {
	public static void main(String[] args) {
		
		Supplier<Double> sqrt= ()->Math.sqrt(12.0);
		System.out.println(sqrt.get());
		  
	}
}