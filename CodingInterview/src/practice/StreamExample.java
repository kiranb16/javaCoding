package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java8NewExample.Employee;

public class StreamExample {
  public static void main(String[] args) {
	List<core2.Employee> list= new ArrayList<>();
	list.add(new core2.Employee("AA", "IT", 12345));
	list.add(new core2.Employee("BB", "MECH", 212345));
	list.add(new core2.Employee("CC", "MECH", 312345));
	list.add(new core2.Employee("DD", "IT", 412345));
	list.add(new core2.Employee("EE", "IT", 612345));
	
	long t1=System.currentTimeMillis();
	list.stream().filter(e->e.getSal()>200000).collect(Collectors.toList());
	long t2= System.currentTimeMillis();
	System.out.println("time taken by simple stream "+(t2-t1));
	
	long t3= System.currentTimeMillis();
	list.parallelStream().filter(e->e.getSal()>200000).collect(Collectors.toList());
	long t4=System.currentTimeMillis();
	System.out.println("time taken by parallel stream "+(t4-t3));
	
}
}
