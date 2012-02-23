/**
 * 
 */
package wednesday.payroll;

/**
 * @author Student
 *
 */
public class Employee {
	private long id;
	private String name;
	private double hoursWorked;
	private int payGrade;

	public Employee(String name) {
		super();
		this.setName(name);
		this.setId(Math.round(Math.random() * 100000));
		System.out.println("Created new employee " + this);
	}
	
	public double calcPayrollAmount() {
		double hourlyWage = PayRate.findHourlyWageForPayGrade(this.getPayGrade());		
		return hourlyWage * this.getHoursWorked();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long l) {
		this.id = l;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getPayGrade() {
		return payGrade;
	}

	public void setPayGrade(int payGrade) {
		this.payGrade = payGrade;
	}
	
	public static Employee findEmployeeById(int employeeId) {
		return null;		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", hoursWorked="
				+ hoursWorked + "]";
	}
}
