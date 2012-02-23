package wednesday;

public class NumberPair {
	private int firstNumber;
	private int secondNumber;
	
	public static void main(String[] args) {
		NumberPair numbers = new NumberPair();
		numbers.setFirstNumber(10);
		numbers.setSecondNumber(20);
		numbers.add();
		numbers.subtract();
		numbers.multiply();
		numbers.divide();
	}

	public NumberPair() {
		this(1, 2);
	}
	
	public NumberPair(int _firstNumber, int _secondNumber) {
	}
	
	public void add() {
		System.out.println(this.getFirstNumber() + this.getSecondNumber());
	}
	
	public void subtract() {
		System.out.println(this.getFirstNumber() - this.getSecondNumber());
	}
	
	public void multiply() {
		System.out.println(this.getFirstNumber() * this.getSecondNumber());
	}
	
	public void divide() {
		System.out.println(this.getFirstNumber() / this.getSecondNumber());
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int _firstNumber) {
		firstNumber = _firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int _secondNumber) {
		secondNumber = _secondNumber;
	}

	@Override
	public String toString() {
		return "NumberPair [firstNumber=" + firstNumber + ", secondNumber="
				+ secondNumber + "]";
	}	

}
