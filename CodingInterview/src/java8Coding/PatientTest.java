package java8Coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java8NewExample.Employee;

public class PatientTest {
	public static void main(String[] args) {
		List<Patient> list = new ArrayList<>();
		list.add(new Patient("ABC", 23, "CORONA", 23000));
		list.add(new Patient("EFG", 24, "CORONA", 27000));
		list.add(new Patient("MNP", 27, "FEVER", 20000));
		list.add(new Patient("XVB", 26, "CORONA", 26000));
		
	// corona list;
		list.stream().filter(e->e.getDisease().equals("CORONA")).forEach(System.out::println);
		System.out.println("================================================================");
		
		// patient age less than 25 and corona;
		list.stream().filter(p->p.getAge()>25  &&  p.getDisease().equals("CORONA")).forEach(System.out::println);
		
		Double re=list.stream().filter(p->p.getDisease().equals("CORONA"))
		.collect(Collectors.averagingDouble(Patient::getBill));
		System.out.println("averge bill of corona :"+re);

		
	}
}
