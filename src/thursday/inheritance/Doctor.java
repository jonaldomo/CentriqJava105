package thursday.inheritance;

public class Doctor extends Employee{
	public void practiceMedicine() {
		System.out.println("I'm a doctor practicing medicine!");
	}
	
	@Override
	public void talk() {
		super.talk();
		System.out.println("But talking like a Doctor!");
	}
	
	public static void main(String[] args) {
		Doctor doctor = new Doctor();
		doctor.talk();
		doctor.work();
		doctor.practiceMedicine();
		
		Person person = (Person)doctor;
		person.talk();
	}
}
