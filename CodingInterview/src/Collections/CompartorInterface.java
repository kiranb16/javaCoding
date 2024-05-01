package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	int id;
	String name;
	int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

public class CompartorInterface {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(111, "Kiran", 34));
		list.add(new Student(1114, "Sai", 35));
		list.add(new Student(1117, "SHIv", 30));
		list.add(new Student(1112, "usha", 38));
		list.add(new Student(1110, "namu", 12));

		Comparator<Student> comp = Comparator.comparing(Student::getName);
		Collections.sort(list, comp);
		for (Student st : list) {
			System.out.println(st);
		}

		System.out.println("------------------------------------------------------------------");
		Comparator<Student> comp2 = Comparator.comparing(Student::getAge);
		Collections.sort(list, comp2);
		for (Student st1 : list) {
			System.out.println(st1);
		}

		// by java8
//		Comparator<Student> comp = Comparator.comparing(Student::getName);
//
//		Collections.sort(list, comp);
//		list.stream().forEach(e -> System.out.println(e));
//		System.out.println("--------------------------------------------------------------------");
//		Comparator<Student> comp1 = Comparator.comparing(Student::getAge);
//		Collections.sort(list, comp1);
//		list.stream().forEach(e -> System.out.println(e));

		list.stream().sorted(Comparator.comparing(Student::getAge).reversed()).forEach(e -> System.out.println(e));
	}
}
