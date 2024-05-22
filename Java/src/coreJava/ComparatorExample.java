package coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Employe{
	double salary;
	String name;
	public Employe(double salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}
	
}
class SalaryComaparator implements Comparator<Employe>{

	@Override
	public int compare(Employe o1, Employe o2) {
		Employe e1= (Employe) o1;
		Employe e2= (Employe) o2;
		if(e1.salary==e2.salary) {
			return 0;
		} else if(e1.salary> e2.salary) {
			return  1;
		}else
		
		return -1;
	}
	
}
class NameComparator1 implements Comparator<Employe>{

	@Override
	public int compare(Employe o1, Employe o2) {
		Employe e1= (Employe)o1;
		Employe e2= (Employe)o2;
		
		return e1.name.compareTo(e2.name);
	}
	
}
public class ComparatorExample {
public static void main(String[] args) {
	List<Employe> list= new ArrayList<>();
	list.add(new Employe(25000, "babu"));
	list.add(new Employe(125000, "kiran"));
	list.add(new Employe(2000, "jangam"));
	list.add(new Employe(325000, "ganpa"));
	
	Collections.sort(list, new SalaryComaparator());
	 Iterator<Employe> itr=list.iterator();
	 while(itr.hasNext()) {
		 Employe e1= (Employe)itr.next();
		 System.out.println(e1.salary+" "+e1.name);
	 }
	 Collections.sort(list, new NameComparator1());
	 for(Employe e1 :list) {
		 System.out.println(e1.name+" "+e1.salary);
	 }
	 
}
}




















