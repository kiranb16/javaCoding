import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EqualAndHashcodeExample {

	int id;
	String name;

	public EqualAndHashcodeExample(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {

		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof EqualAndHashcodeExample)) {
			return false;
		}
		EqualAndHashcodeExample x = (EqualAndHashcodeExample) o;
		return id == x.id && Objects.equals(name, x.name);
	}

	public static void main(String[] args) {

		EqualAndHashcodeExample x = new EqualAndHashcodeExample(1, "kiran");
		EqualAndHashcodeExample x1 = new EqualAndHashcodeExample(1, "kiran");
		System.out.println(x.equals(x1));
		System.out.println(x.hashCode());
		System.out.println(x1.hashCode());
	}

}
