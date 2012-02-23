package thursday;

public class Polymorphism {

	public static void main(String[] args) {
		Object[] objectArray = { new Object(),
				new thursday.inheritance.Doctor(),
				new thursday.inheritance.Person(),
				new thursday.HuntingDog(),
				new wednesday.Dog()};
		printObjects(objectArray);
	}
	
	public static void printObjects(Object[] objectsToBePrinted) {
		for(Object object : objectsToBePrinted) {
			System.out.println(object);
		}
	}

}
