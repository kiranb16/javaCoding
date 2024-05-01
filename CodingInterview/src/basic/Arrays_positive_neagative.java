package basic;

public class Arrays_positive_neagative {
 public static void main(String[] args) {
	int array[]= {-2,-3,-4,5,3,2,-7,-8,9};
	int positive[]= new int[10];
	int negative[]= new int[10];
	int positiveNumber=0, negativeNumber=0;
	for(int i=0; i<array.length;i++) {
		if(array[i]<0) {
			negative[negativeNumber]= array[i];
			negativeNumber++;
			
			
		}else {
			positive[positiveNumber]=array[i];
			positiveNumber++;
			
		}
	}
	System.out.println("positive number "+positiveNumber);
	System.out.println("negative number "+negativeNumber);
}
}
