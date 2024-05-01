package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class XX {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(111, "Kiran", 34));
		list.add(new Student(1114, "Sai", 35));
		list.add(new Student(1117, "SHIv", 30));
		list.add(new Student(1112, "usha", 38));
		list.add(new Student(1110, "namu", 12));
		
//	       Comparator<Student> comp=Comparator.comparing(Student:: getName);
//	       Collections.sort(list, comp);
		list.stream().sorted(Comparator.comparing(Student:: getAge).reversed()).forEach(e->System.out.println(e));
	}

}