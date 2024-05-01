package Java8Example;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestEmployee {
 public static void main(String[] args) {
  
	 	List<Employee> list = new ArrayList<>();
		list.add(new Employee("abc", 22, "male", "mech"));
		list.add(new Employee("mno", 31, "male", "mech"));
		list.add(new Employee("cdo", 35, "female", "civil"));
		list.add(new Employee("pqr", 30, "female", "It"));
		list.add(new Employee("wxv", 32, "male", "mech"));
		
		Map m = list.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.toMap(Employee::getName, e -> e.getGender().toUpperCase())));
		
		System.out.println(m);
		
		int maxAge = list.stream().min((o1,o2) -> o1.getAge() - o2.getAge()).get().getAge();
		System.out.println(maxAge);
		
		//int sm= list.stream().map(Employee::getAge).reduce(0, Integer::sum);
		//int sm= list.stream().map(Employee::getAge).reduce(0, (a,b) -> a+b);
		int sm= list.stream().map(Employee::getAge).collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sm);
		
		Optional.ofNullable(null);
		
		System.out.println(ZoneId.getAvailableZoneIds());
		
		
		LocalDateTime ldt = LocalDateTime.now();			
		ZoneId preZone = ZoneId.of("Europe/Prague");		
		ZonedDateTime zdt = ZonedDateTime.of(ldt, preZone);
		
		ZoneId americaZone = ZoneId.of("America/Cuiaba");
		ZonedDateTime zdtam = zdt.withZoneSameInstant(americaZone);
		
		System.out.println(zdt);
		System.out.println(zdtam);

		
		
		
}
}
