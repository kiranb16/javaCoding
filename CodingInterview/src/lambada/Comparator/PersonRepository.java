package lambada.Comparator;

import java.util.Arrays;
import java.util.List;

public class PersonRepository {

	public static List<Person> getAllPerson(){
		Person p1= new Person("abc", 6, "male", 12000, 2, Arrays.asList("kabaddi","khokho"));
		Person p2= new Person("mno", 5, "male", 1000, 5, Arrays.asList("cricket","shuting"));
		Person p3= new Person("pqr", 6, "female", 1244,3, Arrays.asList("hockey","cycle"));
		Person p6= new Person("kjh", 6, "female", 8000, 2, Arrays.asList("chess","car"));
		
		return Arrays.asList(p1,p2,p3,p6);
		
	}
}
