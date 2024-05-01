import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

		Patient p1 = new Patient("p1", 20, "corona", 18000);
		Patient p2 = new Patient("p2", 26, "fever", 6000);
		Patient p4 = new Patient("p4", 29, "corona", 8000);
		Patient p3 = new Patient("p4", 23, "corona", 12000);
		List<Patient> patients = Arrays.asList(p1, p2, p3, p4);

		patients.stream().filter(p -> p.getDisease().equals("corona")).forEach(System.out::println);
		patients.stream().filter(p -> p.getBill() < 10000 && p.getDisease().equals("fever"))
				.forEach(System.out::println);
		Double averagebill = patients.stream().filter(p -> p.getDisease().equals("corona"))
				.collect(Collectors.averagingDouble(Patient::getBill));
		System.out.println("Average bill of corona patient is :" + averagebill);

	}
}