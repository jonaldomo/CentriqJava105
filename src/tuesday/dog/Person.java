/**
 * 
 */
package tuesday.dog;

/**
 * @author Student
 *
 */
public class Person {
	
	private String name;
	private String address;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age
				+ "]";
	}

	public static void main(String[] args) {
		Person me = new	Person("John");
		me.setAddress("123 S Main");
		me.setAge(27);
		System.out.println(me);
		me.printProfile();
	}

	private void printProfile() {
		System.out.println(this.name + " is " + this.age + " years old and lives at " + this.address);
		
	}

}
