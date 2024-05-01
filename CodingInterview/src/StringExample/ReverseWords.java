package StringExample;

public class ReverseWords {
	public static void main(String[] args) {

		String str=" Kiran Batwal";
		String [] split= str.split(" ");
		String res="";
		for(int i= split.length-1; i>0;i--) {
			res=res+ split[i]+" ";
		}
		System.out.println(res);
	}
}
