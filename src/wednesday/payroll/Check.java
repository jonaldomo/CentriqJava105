package wednesday.payroll;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

public class Check {
	private Employer employer;
	private Bank bank;
	private PrintLayout printLayout;
	private SimpleDateFormat date;
	private long checkNumber;
	private double amount;

	public Check(Employer employer, Bank bank, Employee employee) {
		super();
		this.setEmployer(employer);
		this.setBank(bank);
		this.setDate(new SimpleDateFormat());
	}

	public boolean printForEmployee(Employee employee) {
		this.setAmount(employee.getHoursWorked() * employee.getPayGrade());
		this.setCheckNumber(Math.round(Math.random() * 100000));
		this.setPrintLayout(PrintLayout.createCheckLayout(this.getBank(),
				this.getEmployer(), employee, this.getDate(),
				Bank.formatBalance(new BigDecimal(employee.calcPayrollAmount())), this.getCheckNumber()));
		if(this.getBank().withdrawal(new BigDecimal(employee.calcPayrollAmount()))) {
			System.out.println(this.getPrintLayout());
			return true;
		}else {
			System.out.println("Account is negative.  Unable to print check.");
			return false;
		}
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public SimpleDateFormat getDate() {
		return date;
	}

	public void setDate(SimpleDateFormat date) {
		this.date = date;
	}

	public long getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(long checkNumber) {
		this.checkNumber = checkNumber;
	}

	public PrintLayout getPrintLayout() {
		return printLayout;
	}

	public void setPrintLayout(PrintLayout printLayout) {
		this.printLayout = printLayout;
	}

	@Override
	public String toString() {
		return "Check [employer=" + employer + ", bank=" + bank + ", date="
				+ date + ", routingNumber="
				+ this.getEmployer().getRoutingNumber() + ", accountNumber="
				+ this.getEmployer().getAccountNumber() + ", checkNumber="
				+ checkNumber + "]";
	}

}
