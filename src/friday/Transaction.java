package friday;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

import thursday.inheritance.Person;

public class Transaction {
	private Person buyer;
	private BigDecimal amount;
	private String creditCardNumber;

	public Transaction() {
		this(new Person("John"), new BigDecimal(12.25), "4445000288829993");
	}

	public Transaction(Person _buyer, BigDecimal _amount,
			String _creditCardNumber) {
		super();
		buyer = _buyer;
		amount = _amount;
		creditCardNumber = _creditCardNumber;
	}

	public void setBuyer(Person _buyer) {
		buyer = _buyer;
	}

	public Person getBuyer() {
		return buyer;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal _amount) {
		amount = _amount;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String _creditCardNumber) {
		creditCardNumber = _creditCardNumber;
	}

	@Override
	public String toString() {
		return "Transaction [buyer=" + buyer + ", amount=" + amount
				+ ", creditCardNumber=" + creditCardNumber + "]";
	}

	public static void main(String[] args) {
		Person buyer = new Person("John");
		BigDecimal amount = new BigDecimal(45.99);
		BigDecimal tax = new BigDecimal(.0065);
		amount = amount.multiply(tax);
		System.out.println(amount);
		BigDecimal displayFormat = amount.setScale(2, RoundingMode.HALF_EVEN);
		NumberFormat usdCostFormat = NumberFormat.getCurrencyInstance(Locale.US);
		usdCostFormat.setMinimumFractionDigits(2);
		usdCostFormat.setMaximumFractionDigits(2);
		System.out.println(usdCostFormat.format(displayFormat.doubleValue()));
		
		Transaction sale = new Transaction();
		sale.setBuyer(buyer);
		sale.setCreditCardNumber("445000288929993");
		sale.setAmount(amount);
		
		try {
			sale.process();
		} catch (Exception e) {
			System.err.println(e);
		}

	}
	
	private void process() throws CreditCardException {
		if(this.getCreditCardNumber().trim().length() != 16) {
			throw new CreditCardException(this);
		}
	}
}
