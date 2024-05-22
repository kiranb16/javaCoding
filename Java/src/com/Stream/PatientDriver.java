package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PatientDriver {
 public static void main(String[] args) {
	Patient p1= new Patient("A", 33, "CORONA", 930000);
	Patient p2= new Patient("B", 32, "CORONA", 430000);
	Patient p3= new Patient("C", 34, "FEVER", 3000);
	Patient p4= new Patient("D", 31, "CORONA", 320000);
	Patient p5= new Patient("E", 30, "FEVER", 30000);
	List<Patient> list= Arrays.asList(p1,p2,p3,p4,p5);
	   list.stream().filter(e->e.getDisease().equals("CORONA")).forEach(e->System.out.println(e));
	   
	   System.out.println("corona patient & age less than 31");
	   
	   list.stream().filter(e->e.getDisease()
			   .equals("CORONA") && e.getAge()>31).forEach(e->System.out.println(e));
	   
	   System.out.println("average bill of patient");
	  Double avgbill= list.stream().filter(e->e.getDisease().equals("CORONA"))
	   .collect(Collectors.averagingInt(Patient::getBill));
	  System.out.println(avgbill);
}
}
