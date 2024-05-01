package core;

public class ReverseSentenceInfosys2 {
	public static void main(String[] args) {
		String str = "Kiran Vasant Batwal";
		String st[] = str.split(" ");
		String res = "";
		for (int i = st.length - 1; i >= 0; i--) {
			res=res+ st[i] + " ";// other way=    res+=st[i]+" ";
		}
		System.out.println(res);
	}
}
