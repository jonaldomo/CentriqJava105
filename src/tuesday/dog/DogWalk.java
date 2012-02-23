package tuesday.dog;

public class DogWalk {
	private static DogBreed breed;
	private static Person owner;
	private static Person trainer;
	
	static{
		breed = new DogBreed("Labrador");		
		owner = new Person("John");
		trainer = new Person("Rachel");
	}
	
	public static void main(String[] args) {
		
		Dog myDog = new Dog();
		System.out.println(myDog);
		myDog.setName("Rover");
		myDog.setColor("Brown");
		myDog.setOwner(owner);
		myDog.setAge(2);
		myDog.setTrainer(trainer);
		myDog.setHeightInCentimeters(100);
		myDog.setWeightInKilograms(52.2);
		myDog.setRabiesVaccination(true);
		myDog.setBreed(breed);
		System.out.println(myDog);
		
		System.out.println("The owner and the trainer are " + (owner.equals(trainer) ? "" : "not ") + "the same person.");
		
		myDog.bark(8);
	}

}
