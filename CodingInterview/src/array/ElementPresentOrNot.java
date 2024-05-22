package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElementPresentOrNot {
  public static void main(String[] args) throws IOException  {
	  int arr[]= {1,2,3,4,5};
	  Integer index=null;
	  System.out.println("enter element");
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	String input =br.readLine();
	Integer number= Integer.valueOf(input);
	
	for(int i=0; i<arr.length; i++) {
		if(arr[i]==number) {
			index=i;
		}
	}
	if(null!= index) {
		System.out.println("element Present at index:"+index);
	}else {
		System.out.println("element Not Present ");
	}
	
	
}
}
