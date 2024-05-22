package test;

import java.util.Arrays;
import java.util.List;

// 1-100;
public class Main {
	
public static void main(String[] args) {
	int a=15;
	if(a%3==0) {
		System.out.println("divisible 3");
	}else if( a%5==0 && a%3!=0) {
		 System.out.println("divisible by 5");
	}else if(a%15==0 && a%5!=0 && a%3!=0) {
		System.out.println("divisible by 15");
	}
}
}
