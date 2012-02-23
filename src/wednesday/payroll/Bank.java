package wednesday.payroll;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class Bank {
	private String name;
	private String address;
	private String city;
	private String state;
	private int zipcode;
	private BigDecimal balance;

	public Bank() {

	}

	public Bank(String name, String address, String city, String state,
			int zipcode) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		balance = new BigDecimal(0);

		System.out.println("Created new bank " + this);
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

	public void deposit(BigDecimal amountToDeposit) {
		this.setBalance(this.balance.add(amountToDeposit));
		System.out.println("Made deposit of "
				+ Bank.formatBalance(amountToDeposit) + ". Current balance is "
				+ Bank.formatBalance(this.getBalance()));
	}

	public boolean withdrawal(BigDecimal amountToWithdrawal) {
		boolean hasMoney = this.getBalance().subtract(amountToWithdrawal).intValue() > 0;
		if(hasMoney) {
			this.setBalance(this.balance.subtract(amountToWithdrawal));
			System.out.println("Made withdrawal of "
					+ Bank.formatBalance(amountToWithdrawal)
					+ ". Current balance is "
					+ Bank.formatBalance(this.getBalance()));
			return true;
		}
		return false;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public static String formatBalance(BigDecimal amountToFormat) {
		BigDecimal displayFormat = amountToFormat.setScale(2,
				RoundingMode.HALF_EVEN);
		NumberFormat usdCostFormat = NumberFormat
				.getCurrencyInstance(Locale.US);
		usdCostFormat.setMinimumFractionDigits(2);
		usdCostFormat.setMaximumFractionDigits(2);
		return usdCostFormat.format(displayFormat.doubleValue());
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zipcode=" + zipcode + "]";
	}
}
