import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface Nothing{}
class Student {
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}

class ID1comparator implements Comparator<Student> {

	@Override
	public int compare(Student st1, Student st2) {
		if (st1.id == st2.id) {
			return 0;

		}
		if (st1.id > st2.id) {
			return 1;
		} else
			return -1;
	}

}
class Name1Comparator implements Comparator<Student>{

	@Override
	public int compare(Student st1, Student st2) {
	
		return st1.name.compareTo(st2.name);
	}
	
} 

public class ComparatorExample {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(33, "yash"));
		list.add(new Student(111, "swap"));
		list.add(new Student(1, "swap"));
		list.add(new Student(98, "Ajinjya333"));

		Collections.sort(list, new Name1Comparator());
		for(Student st:list) {
			System.out.println(st.name+" "+st.id);
		}
		System.out.println("sorting with id");
		Collections.sort(list,new ID1comparator());
		for(Student st:list) {
			System.out.println(st.id+" "+st.name);
		}

	}
}







