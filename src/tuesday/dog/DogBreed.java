package tuesday.dog;

public class DogBreed {
	public DogBreed(String name) {
		super();
		this.name = name;
	}

	private String name;

	@Override
	public String toString() {
		return "DogBreed [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
