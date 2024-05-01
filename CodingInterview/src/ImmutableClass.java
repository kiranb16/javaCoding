
final public class ImmutableClass {
   
	final String pancard;
	public ImmutableClass(String pancard) {
		this.pancard= pancard;
		
	}
	public String getPancard() {
		return pancard;
	}
	// only getter provided to  access not setter
	void show() {
		System.out.println(pancard);
	}
	public static void main(String[] args) {
		ImmutableClass i= new ImmutableClass("PBCI5784J");
		i.getPancard();
		i.show();
	}
	
}
