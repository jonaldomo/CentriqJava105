package wednesday.payroll;

import java.text.SimpleDateFormat;

public class PrintLayout {

	private String display;

	private PrintLayout() {

	}

	public static PrintLayout createCheckLayout(Bank bank, Employer employer, Employee employee,
			SimpleDateFormat date, String amount, long checkNumber) {
		PrintLayout checkLayout = new PrintLayout();
		checkLayout.setDisplay(
				"-------------------------------------------------------------" +
				"\n-\t"+employer.getName()+"\t\t\t\t\t"+checkNumber+
				"\n-\t"+employer.getAddress()+"" +
				"\n-\t"+employer.getCity()+", "+employer.getState()+" "+employer.getZipcode()+"" +
				"\n-                                                           " +
				"\n-\tPay to the order of:\t"+employee.getName()+"\t\t"+amount+
				"\n"+
				"\n-\t"+bank.getName()+
				"\n-\t"+bank.getAddress()+
				"\n-\t"+bank.getCity()+", "+bank.getState()+" "+bank.getZipcode()+
				"\n-"+
				"\n-\t"+employer.getRoutingNumber()+"\t"+employer.getAccountNumber()+
				"\n-------------------------------------------------------------"		
		);
		return checkLayout;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}
	
	public String toString() {
		return this.getDisplay();
	}

}
