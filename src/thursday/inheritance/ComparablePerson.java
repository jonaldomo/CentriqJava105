package thursday.inheritance;

import java.util.Arrays;

public class ComparablePerson extends Person implements
		Comparable<ComparablePerson> {

	public static ComparablePerson[] people = { new ComparablePerson(),
			new ComparablePerson("Tom"), new ComparablePerson("Sam"),
			new ComparablePerson("Sally"), new ComparablePerson("Alice") };

	public ComparablePerson() {
		this("Bob");
	}

	public ComparablePerson(String _name) {
		super(_name);
	}

	@Override
	public int compareTo(ComparablePerson _otherPerson) {
		return this.getName().compareToIgnoreCase(_otherPerson.getName());
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(people));
		Arrays.sort(people);
		System.out.println(Arrays.toString(people));
	}

}
