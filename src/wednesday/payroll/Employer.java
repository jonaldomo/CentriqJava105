package wednesday.payroll;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Employer {
	private String name;
	private String address;
	private String city;
	private String state;
	private int zipcode;
	private HashMap<Long, Employee> employees;
	private long routingNumber;
	private long accountNumber;

	public Employer() {
		employees = new HashMap<Long, Employee>();
	}

	public Employer(String name, String address, String city, String state,
			int zipcode) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;

		employees = new HashMap<Long, Employee>();

		System.out.println("Created new employer " + this);
	}

	public void hire(Employee employee) {
		if (!employees.containsKey(employee.getId())) {
			this.employees.put(employee.getId(), employee);
			System.out.println("Employed " + employee.getName());
		} else {
			System.out.println(employee.getName() + " is already employed.");
		}

	}

	public void fire(Employee employee) {
		if (employees.containsKey(employee.getId())) {
			this.employees.remove(employee.getId());
			System.out.println("Fired " + employee.getName());
		} else {
			System.out.println(employee.getName()
					+ " is not currently employed.");
		}
		System.out.println(this.employees);
	}

	public Employee findEmployeeById(int employeeId) {
		return this.employees.get(employeeId);
	}

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public long getRoutingNumber() {
		return routingNumber;
	}

	public void setRoutingNumber(long routingNumber) {
		this.routingNumber = routingNumber;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void listEmployees() {
		System.out.println("Found " + employees.size() + " employees for "
				+ this.getName());
		for (Employee employee : employees.values()) {
			System.out.println(employee);
		}
	}

	public HashMap<Long, Employee> getEmployees() {
		return employees;
	}

	public void bankrupt() {
		Collection<Employee> employees = this.getEmployees().values();
		Iterator<Employee> employeeIterator = employees.iterator();
		System.out
				.println(this.getName()
						+ " has no more money and has to declare bankruptcy. All employees will be let go.");
		while(employeeIterator.hasNext()) {
			System.out.println("Laid off " + employeeIterator.next().getName());
			employeeIterator.remove();
		}
	}

	@Override
	public String toString() {
		return "Employer [name=" + name + ", address=" + address + ", city="
				+ city + ", state=" + state + ", zipcode=" + zipcode + "]";
	}

}
