package friday;

import java.util.Arrays;
import java.util.Comparator;
import thursday.inheritance.Person;

public class PersonSortReverse implements Comparator<Person> {

	@Override
	public int compare(Person personOne, Person personTwo) {
		return -personOne.getName().compareToIgnoreCase(personTwo.getName());
	}
	
	public static void main(String[] args) {
		System.out.println("Unsorted: " + Arrays.toString(Person.people));
		Arrays.sort(Person.people, new PersonSortReverse());
		System.out.println("Reverse sorted: " + Arrays.toString(Person.people));
		
	}

}
