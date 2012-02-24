package friday;

public class CreditCardException extends Exception {

	private static final long serialVersionUID = 1L;
	private Transaction transaction;

	public CreditCardException(Transaction _transaction, String _string) {
		super(_transaction.getBuyer().getName()
				+ " has an invalid credit card number of : "
				+ _transaction.getCreditCardNumber());
		this.setTransaction(_transaction);
	}
	
	public CreditCardException(Transaction _transaction) {
		super(_transaction.getBuyer().getName()
				+ " has an invalid credit card number of "
				+ _transaction.getCreditCardNumber());
		this.setTransaction(_transaction);
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	@Override
	public String toString() {
		return super.toString() + "CreditCardException [transaction=" + transaction + "]";
	}
}
