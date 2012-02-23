package wednesday;

public class Dog {

	private String name;
	private int age;
	private String breed;

	public static void main(String[] args) {
		Dog myDog = new Dog();
		System.out.println(myDog);
		Dog myOtherDog = new Dog("Rover", "Labrador", 2);
		System.out.println(myOtherDog);

		String equalText = (myDog.equals(myOtherDog)) ? " " : " not ";
		System.out
				.println("myDog and myOtherDog are" + equalText + "the same.");

		myDog.setBreed(myOtherDog.getBreed());
		myDog.setName(myOtherDog.getName());
		equalText = (myDog.equals(myOtherDog)) ? " " : " not ";
		System.out
				.println("myDog and myOtherDog are" + equalText + "the same.");
	}

	public Dog() {
		this("Spot", "Labrador", 1);
	}	

	public Dog(String _name, String _breed, int _age) {
		super();
		this.setName(_name);
		this.setBreed(_breed);
		this.setAge(_age);
		System.out.println("And God said let there be a dog! And it's name is "
				+ this.getName() + " and it's breed is " + this.getBreed() + ".");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (breed == null) {
			if (other.breed != null)
				return false;
		} else if (!breed.equals(other.breed))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}
}
