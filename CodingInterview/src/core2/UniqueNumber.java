package core2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNumber {
	public static void main(String[] args) {
   
		List<Integer> list=Arrays.asList(10,20,30,40,50,50,40,30);
		Set<Integer> unique= new HashSet<>();
		
		for(Integer num:list) {
			if(!unique.add(num)) {
				System.out.println(num);
			}
		}
		
		
	}
}
