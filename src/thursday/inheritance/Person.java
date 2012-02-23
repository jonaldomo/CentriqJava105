package thursday.inheritance;

import java.util.Arrays;

public class Person {

	private String name;
	
	public static Person[] people = { new Person(), new Person("Tom"), new Person("Sam"),
		new Person("Sally"), new Person("Alice") };

	public static void main(String[] args) {
		System.out.println(Arrays.toString(people));
	}

	public Person() {
		this("Bob");
	}

	public Person(String _name) {
		this.setName(_name);
	}

	public void talk() {
		System.out.println("I'm a person talking!");
	}

	public String getName() {
		return name;
	}

	public void setName(String _name) {
		this.name = _name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}
