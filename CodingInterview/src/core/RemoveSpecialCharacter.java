package core;

public class RemoveSpecialCharacter {
 public static void main(String[] args) {
	String str="@#$% Kiran@  Batwal#";
	String plain=str.replaceAll(  "[^a-zA-Z0-9]", "");
	System.out.println(plain);
}
}
