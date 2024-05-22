package coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student {
	int rollNo;
	String name;
	int age;

	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	/*
	 * @Override public String toString() { return "Student [rollNo=" + rollNo +
	 * ", name=" + name + ", age=" + age + "]"; }
	 */

}

class AgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		if (s1.age == s2.age) {
			return 0;
		} else if (s1.age > s2.age) {
			return 1;
		} else
			return -1;

	}

}

class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;

		return s1.name.compareTo(s2.name);
	}

}

public class ComparatorTest {
	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		list.add(new Student(55, "Kiran", 32));
		list.add(new Student(33, "Shilpa", 30));
		list.add(new Student(44, "Ravindra", 39));
		list.add(new Student(22, "Shailla", 33));
		Collections.sort(list, new AgeComparator());
		for(Student st: list) {
			System.out.println(st.age+" "+st.name+" "+st.rollNo);
		}
		System.out.println("--------------------------------------------------------------");
		Collections.sort(list,new NameComparator());
		Iterator<Student> itr=list.iterator();
		while(itr.hasNext()) {
			Student st=(Student)itr.next();
			System.out.println(st.name+" "+st.age+" "+st.rollNo);
		}
	}
}














