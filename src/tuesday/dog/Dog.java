/**
 * 
 */
package tuesday.dog;


/**
 * @author Student
 * 
 */
public class Dog {
	// data
	private String name;
	private double weightInKilograms;
	private int heightInCentimeters;
	private int age;
	private String color;
	private boolean rabiesVaccination;
	private DogBreed breed;
	private Person owner;
	private Person trainer;
	public static final String SPECIES = "Canis lupus";
	
	public Dog() {
		this("Rover", 15.0, 22, 1, "Brown", true, new DogBreed("Labrador"), new Person(), new Person());
	}
	
	public Dog(String _name, double _weightInKilograms,
			int _heightInCentimeters, int _age, String _color,
			boolean _rabiesVaccination, DogBreed _breed, Person _owner,
			Person _trainer) {
		super();
		this.setName(_name);
		this.setWeightInKilograms(_weightInKilograms);
		this.setHeightInCentimeters(_heightInCentimeters);
		this.setAge(_age);
		this.setColor(_color);
		this.setRabiesVaccination(_rabiesVaccination);
		this.setBreed(_breed);
		this.setOwner(_owner);
		this.setTrainer(trainer);
	}



	public void bark(){
		System.out.print("Bark! ");
	}
	
	public void bark(int howManyTimes){
		System.out.println(this.getName() + ", I command you to bark " + howManyTimes + " times!");
		for(int i = 0; i < howManyTimes; i++){
			bark();
		}
		System.out.println();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DogBreed getBreed() {
		return breed;
	}
	public void setBreed(DogBreed breed) {
		this.breed = breed;
	}
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	public double getWeightInKilograms() {
		return weightInKilograms;
	}
	public void setWeightInKilograms(double weight) {
		this.weightInKilograms = weight;
	}
	public int getHeightInCentimeters() {
		return heightInCentimeters;
	}
	public void setHeightInCentimeters(int heightInCentimeters) {
		this.heightInCentimeters = heightInCentimeters;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isRabiesVaccination() {
		return rabiesVaccination;
	}
	public void setRabiesVaccination(boolean rabiesVaccination) {
		this.rabiesVaccination = rabiesVaccination;
	}
	public Person getTrainer() {
		return trainer;
	}
	public void setTrainer(Person trainer) {
		this.trainer = trainer;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Dog [name=" + name + ", weight=" + weightInKilograms
				+ ", heightInCentimeters=" + heightInCentimeters + ", age="
				+ age + ", color=" + color + ", rabiesVaccination="
				+ rabiesVaccination + ", breed=" + breed + ", owner=" + owner
				+ ", trainer=" + trainer + "]";
	}

}
