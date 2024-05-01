package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// comparable
public class Student implements Comparable<Student> {
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		return this.id-o.id;
//	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}
	
	public static void main(String[] args) {
	  List<Student> list= new ArrayList<>();
	  list.add(new Student(2, "b"));
	  list.add(new Student(4, "f"));
	  list.add(new Student(6, "e"));
	  list.add(new Student(5, "g"));
	  
	 System.out.println(list);
	 Collections.sort(list);
	 System.out.println(list);
	  
	  
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

	
	
}
