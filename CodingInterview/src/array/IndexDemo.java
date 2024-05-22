package array;

public class IndexDemo {
  public static void main(String[] args) {
	String colour[]= {"Red","green","white", "blue"};
	int index=0;
	for(int i=0; i<colour.length; i++) {
		if(colour[i]=="blue") {
			index=i;
		}
	}
	System.out.println(" index :"+index);
}
}
