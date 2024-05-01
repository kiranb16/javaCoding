package StringExample;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AAA {
	public static void main(String[] args) {
		String s1="Ram";
		String s2="Shyam";
		s1=s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println(s2);
	}
}
/*
String str1 = "Kiran";
String str2= "Batawl";
System.out.println("before swap str1:"+str1);
System.out.println("before swap str2:"+str2);
str1=str1+str2;
str2=str1.substring(0, str1.length()-str2.length());
str1=str1.substring(str2.length());
System.out.println("after swap str1:"+str1);
System.out.println("after swap str2:"+str2);
*/