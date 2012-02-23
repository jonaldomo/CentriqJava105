package wednesday.payroll;

import java.math.BigDecimal;
import java.util.Collection;

/**
 * 
 * @author Student
 *
 */
public class Comptroller {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employer myCompany = new Employer("Google Inc.", "1600 Amphitheatre Parkway", "Mountain View", "CA", 94093);
		myCompany.setAccountNumber(181848482);
		myCompany.setRoutingNumber(234828822);
		
		Bank myBank = new Bank("US Bancorp", "800 Nicollet Mall", "Minneapolis", "MN", 55402);
		myBank.deposit(new BigDecimal(200.00));
		myBank.deposit(new BigDecimal(300.42));
		
		Employee john = new Employee("John Moses");
		john.setHoursWorked(PayRate.FULL_WORK_WEEK);
		
		Employee nathan = new Employee("Nathan Gourley");
		nathan.setHoursWorked(PayRate.FULL_WORK_WEEK);
		
		myCompany.hire(john);
		myCompany.hire(nathan);
		
		myCompany.listEmployees();
		boolean bankrupt = false;
		Collection<Employee> employees = myCompany.getEmployees().values();
		for(Employee employee : employees) {			
			Check check = new Check(myCompany, myBank, employee);
			if(!check.printForEmployee(employee)) {
				bankrupt = true;
				break;
			}
		}
		
		if(bankrupt) {
			myCompany.bankrupt();
		}

	}

}
