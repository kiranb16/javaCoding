package array;

import java.util.HashMap;
import java.util.Map;

public class FrequencyinArray {
  public static void main(String[] args) {
	int arr[]= new int[] {1,2,3,3,3,4,5,6,2,3,5};
	 countFrequency(arr);
}

private static void countFrequency(int[] arr) {
	
	Map<Integer, Integer> map= new HashMap<>();
	
	for(int i=0; i<arr.length; i++) {
		
		Integer value=map.get(arr[i]);
		if(map.containsKey(arr[i])) {
			map.put(arr[i], value+1);
		}else {
			map.put(arr[i], 1);
		}
	}
	System.out.println(map);
	
}
}
