package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// comparator
public class Emp {
	String name;
	int id;

	public Emp(String name, int id) {
		this.name = name;
		this.id = id;
	}
	

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	public static void main(String[] args) {
		List<Emp> list= new ArrayList<>();
		list.add(new Emp("a", 5));
		list.add(new Emp("v", 7));
		list.add(new Emp("r", 3));
		list.add(new Emp("i", 8));
		list.add(new Emp("l", 9));
		System.out.println(list);
		Collections.sort(list, new IdComparator());
		System.out.println(" id : "+list);
		
		Collections.sort(list, new NameComparator());
		System.out.println("name "+list);
	}

}

class IdComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}
	
}

class NameComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}























