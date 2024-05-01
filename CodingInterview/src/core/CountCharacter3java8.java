package core;

public class CountCharacter3java8 {
 public static void main(String[] args) {
	String str="kiran batwal";
	long res=str.chars().filter(s->s!=' ').count();
	System.out.println("character are "+res);
}
}
