import java.util.Arrays;

public class Test{
	
	public static boolean areEqual( int [] arr1, int [] arr2) {
		int m = arr1.length;
		int n= arr2.length;
		if(m!=n) {
			return false;
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0; i<arr1.length;i++) {
			
			if(arr1[i]!= arr2[2]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5};
		int [] arr2={1,2,3,4,5};
		if(areEqual(arr1, arr2)== true) {
			System.out.println(" are equal arrays");
		}else System.out.println(" not equal");
		
	}
}