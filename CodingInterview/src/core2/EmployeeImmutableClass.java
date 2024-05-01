package core2;

public final class EmployeeImmutableClass {

	final String panCard;

	public EmployeeImmutableClass(String panCard) {

		this.panCard = panCard;
	}

	public String getPanCard() {
		return panCard;
	}

	public static void main(String[] args) {
    EmployeeImmutableClass e= new EmployeeImmutableClass("ABC123");
    String s=e.getPanCard();
    System.out.println("pancard number "+s);
	}

}
