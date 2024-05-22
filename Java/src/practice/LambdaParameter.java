package practice;
interface Addable{
	int Addition(int a, int b);
	
}
class AddableImpl implements Addable{

	@Override
	public int Addition(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}
public class LambdaParameter {
 public static void main(String[] args) {
	 Addable Addition = (a,b)->(a+b);
	int result= Addition.Addition(12,12);
	System.out.println(result);
}
}
