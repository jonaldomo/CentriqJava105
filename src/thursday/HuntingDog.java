package thursday;

import tuesday.dog.Dog;
import tuesday.dog.DogBreed;
import tuesday.dog.Person;

public class HuntingDog extends Dog {
	private String speciality;
	private static final String BIRD = "Bird";
	private static final String CAT = "Cat";

	public static void main(String[] args) {
		HuntingDog myHuntingDog = new HuntingDog();
		myHuntingDog.setName("Rover");
		myHuntingDog.bark(4);
		myHuntingDog.setSpeciality(HuntingDog.BIRD);
		System.out.println(myHuntingDog);
		System.out.println(new HuntingDog());
		HuntingDog spot = new HuntingDog("Spot", 12.1, 1, 1, "Brown", true,
				new DogBreed("Rotweiler"), new Person(), new Person(),
				HuntingDog.CAT);
		System.out.println(spot);
	}

	public HuntingDog() {
		super();
		this.setSpeciality(HuntingDog.CAT);
	}

	public HuntingDog(String _name, double _weightInKilograms,
			int _heightInCentimeters, int _age, String _color,
			boolean _rabiesVaccination, DogBreed _breed, Person _owner,
			Person _trainer, String _speciality) {
		super(_name, _weightInKilograms, _heightInCentimeters, _age, _color,
				_rabiesVaccination, _breed, _owner, _trainer);
		this.setSpeciality(_speciality);

	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String _speciality) {
		speciality = _speciality;
	}

	@Override
	public String toString() {
		return "HuntingDog [speciality=" + speciality + ", getName()="
				+ getName() + ", getBreed()=" + getBreed() + ", getOwner()="
				+ getOwner() + ", getWeight()=" + getWeightInKilograms()
				+ ", getHeightInCentimeters()=" + getHeightInCentimeters()
				+ ", getColor()=" + getColor() + ", isRabiesVaccination()="
				+ isRabiesVaccination() + ", getTrainer()=" + getTrainer()
				+ ", getAge()=" + getAge() + "]";
	}
}
